package reelz.mod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import reelz.mod.init.ItemInit;

public class ReelzTab extends CreativeTabs {
	public ReelzTab(String label) { super("reelztab"); }
	public ItemStack getTabIconItem() { return new ItemStack(ItemInit.INGOT_COPPER);}
}