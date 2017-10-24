package reelz.mod.init;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import reelz.mod.objects.blocks.BlockBase;
import reelz.mod.objects.blocks.BlockLeaf;
import reelz.mod.objects.blocks.BlockOres;
import reelz.mod.objects.blocks.BlockPlank;

public class BlockInit {
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	
	public static final Block BLOCK_COPPER = new BlockBase("block_copper", Material.IRON);
	
	//doku
	public static final Block DOKU_DIRT = new BlockBase("doku_dirt", Material.GRASS);
	public static final Block DOKU_CLAY = new BlockBase("doku_clay", Material.CLAY);
	public static final Block DOKU_COAL_BLOCK = new BlockBase("doku_coal_block", Material.ROCK);
	public static final Block DOKU_COBBLESTONE = new BlockBase("duko_cobblestone", Material.ROCK);
	public static final Block DOKU_ORE_GOLD = new BlockBase("doku_ore_gold", Material.IRON);
	public static final Block DOKU_BLOCK_GOLD = new BlockBase("doku_block_gold", Material.IRON);
	public static final Block DOKU_COBBLESTONE_MOSSY = new BlockBase("doku_cobblestone_mossy", Material.ROCK);
	
	
	
	public static final Block LEAVES = new BlockLeaf("leaves");
	public static final Block PLANKS = new BlockPlank("planks");
	
}