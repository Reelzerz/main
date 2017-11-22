package reelz.mod.objects.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.BlockRenderLayer;
import reelz.mod.Main;
import reelz.mod.init.BlockInit;
import reelz.mod.init.BlockInit2;
import reelz.mod.init.ItemInit;
import reelz.mod.init.ItemInit2;
import reelz.mod.util.interfaces.IHasModel;

public class BlockBaseCheat extends Block implements IHasModel {

	public BlockBaseCheat(String name, Material material) 
	{
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setSoundType(SoundType.GLASS);
		setHardness(1.0F);
		setResistance(0.1F);
		setCreativeTab(Main.REELZB);
		
		BlockInit.BLOCKS.add(this);
		ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}
	
	@Override
	public BlockRenderLayer getBlockLayer() 
	{
		return BlockRenderLayer.TRANSLUCENT;
	}	
	
	@Override
	public void registerModels() 
	{
		Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
	}
}