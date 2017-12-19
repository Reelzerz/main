package reelz.mod.test;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import reelz.mod.Main;
import reelz.mod.init.BlockInit;
import reelz.mod.init.ItemInit;
import reelz.mod.util.interfaces.IHasModel;

public class TestBaseTools extends Block implements IHasModel {

	public TestBaseTools(String name, Material material) 
	{
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.REELZR);
		
		BlockInit.BLOCKS.add(this);
		ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}
	
	@Override
	public void registerModels() 
	{
		Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
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