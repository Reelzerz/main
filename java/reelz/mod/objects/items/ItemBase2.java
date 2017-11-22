package reelz.mod.objects.items;

import reelz.mod.Main;
import reelz.mod.init.ItemInit;
import reelz.mod.init.ItemInit2;
import reelz.mod.util.interfaces.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase2 extends Item implements IHasModel {

	public ItemBase2(String name) 
	{
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.REELZR);
		
		ItemInit.ITEMS.add(this);
		ItemInit2.ITEMS.add(this);
	}

	@Override
	public void registerModels() 
	{
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}
}