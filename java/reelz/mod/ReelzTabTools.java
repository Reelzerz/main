package reelz.mod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import reelz.mod.init.BlockInit;
import reelz.mod.init.ItemInit;

public class ReelzTabTools extends CreativeTabs {
	public ReelzTabTools(String label) { super("reelztabtools"); }
	public ItemStack getTabIconItem() { return new ItemStack(ItemInit.DOKU_GOLD_AXE);}
}