package reelz.mod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import reelz.mod.init.BlockInit;

public class ReelzTabBlocks extends CreativeTabs {
	public ReelzTabBlocks(String label) { super("reelztabblock"); }
	public ItemStack getTabIconItem() { return new ItemStack(BlockInit.DOKU_BLOCK_GOLD);}
}