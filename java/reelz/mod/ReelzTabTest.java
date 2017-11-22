package reelz.mod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import reelz.mod.init.ItemInit;

public class ReelzTabTest extends CreativeTabs {
	public ReelzTabTest(String label) { super("reelztabtest"); }
	public ItemStack getTabIconItem() { return new ItemStack(ItemInit.TESTINGGEM);}
}