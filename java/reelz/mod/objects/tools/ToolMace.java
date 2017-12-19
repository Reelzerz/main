package reelz.mod.objects.tools;

import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSword;
import net.minecraft.item.Item.ToolMaterial;
import reelz.mod.Main;
import reelz.mod.init.ItemInit;
import reelz.mod.util.interfaces.IHasModel;

public class ToolMace extends ItemSword implements IHasModel
{
	public ToolMace(String name, ToolMaterial material) 
	{
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.REELZT);
		
		ItemInit.ITEMS.add(this);
	}

	@Override
	public void registerModels() 
	{
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}
	
	@Override
	public float damagePotential() {
		return 1.0f;
	}

	@Override
	public double attackSpeed() {
		return 1.0d; // default vanilla sword speed
	}
}