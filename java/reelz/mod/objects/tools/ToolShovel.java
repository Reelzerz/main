package reelz.mod.objects.tools;

import java.util.Set;

import com.google.common.collect.Sets;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemTool;
import net.minecraft.item.Item.ToolMaterial;
import reelz.mod.Main;
import reelz.mod.init.ItemInit;
import reelz.mod.util.interfaces.IHasModel;

public class ToolShovel extends ItemTool implements IHasModel
{
	private static final Set<Block> EFFECTIVE_ON = Sets.newHashSet(Blocks.DIRT, Blocks.GRASS, Blocks.GRASS_PATH, Blocks.GRAVEL, Blocks.SAND);
	public ToolShovel(String name, ToolMaterial material) 
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