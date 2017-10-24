package reelz.mod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import reelz.mod.init.BlockInit;
import reelz.mod.init.ItemInit;

public class ReelzTabArmor extends CreativeTabs {
	public ReelzTabArmor(String label) { super("reelztabarmor"); }
	public ItemStack getTabIconItem() { return new ItemStack(ItemInit.DOKU_GOLD_Helmet);}
}