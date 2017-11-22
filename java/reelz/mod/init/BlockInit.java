package reelz.mod.init;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import reelz.mod.objects.blocks.BlockBase;
import reelz.mod.objects.blocks.BlockBase2;
import reelz.mod.objects.blocks.BlockBaseCheat;
import reelz.mod.objects.blocks.BlockBaseDirt;
import reelz.mod.objects.blocks.BlockBaseGlass;
import reelz.mod.objects.blocks.BlockBaseGlow;
import reelz.mod.objects.blocks.BlockBaseStone;
import reelz.mod.objects.blocks.BlockLeaf;
import reelz.mod.objects.blocks.BlockOres;
import reelz.mod.objects.blocks.BlockPlank;

public class BlockInit {
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	
	public static final Block BLOCK_COPPER = new BlockBase("block_copper", Material.IRON);
	
	//doku
	public static final Block DOKU_DIRT = new BlockBaseDirt("doku_dirt", Material.GRASS);
	public static final Block DOKU_CLAY = new BlockBaseDirt("doku_clay", Material.CLAY);
	public static final Block DOKU_COAL_BLOCK = new BlockBase("doku_coal_block", Material.ROCK);
	public static final Block DOKU_COBBLESTONE = new BlockBaseStone("doku_cobblestone", Material.ROCK);
	public static final Block DOKU_ORE_GOLD = new BlockBase("doku_ore_gold", Material.IRON);
	public static final Block DOKU_BLOCK_GOLD = new BlockBase("doku_block_gold", Material.IRON);
	public static final Block DOKU_COBBLESTONE_MOSSY = new BlockBaseStone("doku_cobblestone_mossy", Material.ROCK);
	public static final Block DOKU_STONE = new BlockBaseStone("doku_stone", Material.ROCK);
	public static final Block DOKU_STONEBRICK = new BlockBaseStone("doku_stonebrick", Material.ROCK);
	public static final Block DOKU_STONEBRICK_CARVED = new BlockBaseStone("doku_stonebrick_carved", Material.ROCK);
	public static final Block DOKU_STONEBRICK_CRACKED = new BlockBaseStone("doku_stonebrick_cracked", Material.ROCK);
	public static final Block DOKU_STONEBRICK_MOSSY = new BlockBaseStone("doku_stonebrick_mossy", Material.ROCK);
	public static final Block DOKU_COARSE_DIRT = new BlockBaseDirt("doku_coarse_dirt", Material.ROCK);
	public static final Block DOKU_GLOWSTONE = new BlockBaseGlow("doku_glowstone", Material.GLASS);
	public static final Block DOKU_GLASS = new BlockBaseGlass("doku_glass", Material.GLASS);
	public static final Block DOKU_GLASS_BLACK = new BlockBaseGlass("doku_glass_black", Material.GLASS);
	public static final Block DOKU_GLASS_BLUE = new BlockBaseGlass("doku_glass_blue", Material.GLASS);
	public static final Block DOKU_GLASS_BROWN = new BlockBaseGlass("doku_glass_brown", Material.GLASS);
	public static final Block DOKU_GLASS_CYAN = new BlockBaseGlass("doku_glass_cyan", Material.GLASS);
	
	//Testing
	public static final Block TESTINGCUBE = new BlockBase2("testingcube", Material.GLASS);
	
	//Other
	public static final Block CHEATSKI = new BlockBaseCheat("cheatski", Material.GLASS);
	public static final Block BROKENSTEEL = new BlockBase("brokensteel", Material.IRON);
	
	
	public static final Block LEAVES = new BlockLeaf("leaves");
	public static final Block PLANKS = new BlockPlank("planks");
	
}