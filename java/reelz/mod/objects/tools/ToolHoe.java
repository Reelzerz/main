package reelz.mod.objects.tools;

import reelz.mod.Main;
import reelz.mod.init.ItemInit;
import reelz.mod.util.interfaces.IHasModel;

import java.util.Set;

import com.google.common.collect.Sets;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemTool;


public class ToolHoe extends ItemTool implements IHasModel 
{
	
	private static final Set<Block> EFFECTIVE_ON = Sets.newHashSet(Blocks.GRASS, Blocks.DIRT);
	public ToolHoe(String name, ToolMaterial material) 
	{
		super(material, EFFECTIVE_ON);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.REELZT);
		
		ItemInit.ITEMS.add(this);
	}

	@Override
	public void registerModels() 
	{
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}
}