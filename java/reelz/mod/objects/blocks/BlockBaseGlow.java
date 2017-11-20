package reelz.mod.objects.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import reelz.mod.Main;
import reelz.mod.init.BlockInit;
import reelz.mod.init.ItemInit;
import reelz.mod.util.interfaces.IHasModel;

public class BlockBaseGlow extends Block implements IHasModel {

	public BlockBaseGlow(String name, Material material) 
	{
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setSoundType(SoundType.GLASS);
		setHardness(1.5F);
		setLightLevel(1.0F);
		setResistance(0.5F);
		setCreativeTab(Main.REELZB);
		
		BlockInit.BLOCKS.add(this);
		ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}
	@Override
	public void registerModels() 
	{
		Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
	}
}