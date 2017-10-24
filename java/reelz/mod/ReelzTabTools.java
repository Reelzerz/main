package reelz.mod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import reelz.mod.init.BlockInit;

public class ReelzTabTools extends CreativeTabs {
	public ReelzTabTools(String label) { super("reelztabtools"); }
	public ItemStack getTabIconItem() { return new ItemStack(BlockInit.BLOCK_COPPER);}
}