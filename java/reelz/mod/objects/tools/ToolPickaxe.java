package reelz.mod.objects.tools;

import reelz.mod.Main;
import reelz.mod.init.ItemInit;
import reelz.mod.util.interfaces.IHasModel;

import java.util.Set;

import com.google.common.collect.Sets;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemTool;
import net.minecraft.item.Item.ToolMaterial;

public class ToolPickaxe extends ItemPickaxe implements IHasModel
{
	//private static final Set<Block> EFFECTIVE_ON = Sets.newHashSet(Blocks.SANDSTONE, Blocks.STICKY_PISTON, Blocks.STONE, Blocks.STONE_BRICK_STAIRS, Blocks.STONE_BUTTON, Blocks.STONE_PRESSURE_PLATE, Blocks.STONE_SLAB, Blocks.STONE_SLAB2, Blocks.STONE_STAIRS, Blocks.STONEBRICK, Blocks.LIT_REDSTONE_LAMP, Blocks.LIT_REDSTONE_ORE, Blocks.MOSSY_COBBLESTONE, Blocks.COAL_ORE, Blocks.DIAMOND_ORE, Blocks.EMERALD_ORE, Blocks.GOLD_ORE, Blocks.IRON_ORE, Blocks.LAPIS_ORE, Blocks.QUARTZ_ORE, Blocks.REDSTONE_ORE, Blocks.CONCRETE, Blocks.PISTON_EXTENSION, Blocks.PISTON, Blocks.PISTON_HEAD, Blocks.PINK_SHULKER_BOX, Blocks.PRISMARINE, Blocks.BEACON, Blocks.OBSIDIAN, Blocks.COBBLESTONE, Blocks.COBBLESTONE_WALL, Blocks.QUARTZ_STAIRS, Blocks.NETHER_BRICK_STAIRS, Blocks.RED_SANDSTONE_STAIRS);
			
	public ToolPickaxe(String name, ToolMaterial material) 
	{
		super(material);
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