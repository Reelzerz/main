package reelz.mod.test;

import net.minecraft.item.Item;
import reelz.mod.Main;
import reelz.mod.init.ItemInit;
import reelz.mod.init.ItemInit2;
import reelz.mod.util.interfaces.IHasModel;

public class TestBaseItem extends Item implements IHasModel {

	public TestBaseItem(String name) 
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

	@Override
	public double attackSpeed() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public float damagePotential() {
		// TODO Auto-generated method stub
		return 0;
	}
}