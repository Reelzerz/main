package reelz.mod.objects.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;
import reelz.mod.Main;
import reelz.mod.init.BlockInit;
import reelz.mod.init.ItemInit;
import reelz.mod.objects.blocks.item.ItemBlockVariants;
import reelz.mod.util.handlers.EnumHandler;
import reelz.mod.util.handlers.EnumHandlerTwo;
import reelz.mod.util.interfaces.IHasModel;
import reelz.mod.util.interfaces.IMetaName;

public class BlockOres extends Block implements IHasModel, IMetaName {

	public static final PropertyEnum<EnumHandlerTwo.EnumTypeTwo> VARIANT = PropertyEnum.<EnumHandlerTwo.EnumTypeTwo>create("variant", EnumHandlerTwo.EnumTypeTwo.class);
	
	private String name, dimension;
	
	public BlockOres(String name, String dimension) 
	{
		super(Material.ROCK);
		setUnlocalizedName(name);
		setRegistryName(name);
		setHardness(3.0F);
		setResistance(5.0F);
		setCreativeTab(Main.REELZB);
		setDefaultState(this.blockState.getBaseState().withProperty(VARIANT, EnumHandlerTwo.EnumTypeTwo.COPPER));
		
		this.name = name;
		this.dimension = dimension;
		
		BlockInit.BLOCKS.add(this);
		ItemInit.ITEMS.add(new ItemBlockVariants(this).setRegistryName(this.getRegistryName()));
	}
	
	@Override
	public int damageDropped(IBlockState state) 
	{
		return ((EnumHandlerTwo.EnumTypeTwo)state.getValue(VARIANT)).getMeta();
	}
	
	@Override
	public int getMetaFromState(IBlockState state) 
	{
		return ((EnumHandlerTwo.EnumTypeTwo)state.getValue(VARIANT)).getMeta();
	}
	
	@Override
	public IBlockState getStateFromMeta(int meta) 
	{
		return this.getDefaultState().withProperty(VARIANT, EnumHandlerTwo.EnumTypeTwo.byMetadata(meta));
	}
	
	@Override
	public ItemStack getPickBlock(IBlockState state, RayTraceResult target, World world, BlockPos pos, EntityPlayer player) 
	{
		return new ItemStack(Item.getItemFromBlock(this), 1, getMetaFromState(world.getBlockState(pos)));
	}
	
	@Override
	public void getSubBlocks(CreativeTabs itemIn, NonNullList<ItemStack> items)
	{
		for(EnumHandler.EnumType variant : EnumHandler.EnumType.values())
		{
			items.add(new ItemStack(this, 1, variant.getMeta()));
		}
	}
	
	@Override
	protected BlockStateContainer createBlockState()
	{
		return new BlockStateContainer(this, new IProperty[] {VARIANT});
	}
	
	@Override
	public String getSpecialName(ItemStack stack) 
	{
		return EnumHandler.EnumType.values()[stack.getItemDamage()].getName();
	}
	
	@Override
	public void registerModels() 
	{
		for(int i = 0; i < EnumHandler.EnumType.values().length; i++)
		{
			Main.proxy.registerVariantRenderer(Item.getItemFromBlock(this), i, "ore_" + this.dimension + "_" + EnumHandler.EnumType.values()[i].getName(), "inventory");
		}
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
