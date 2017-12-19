package reelz.mod.objects.tools;

import java.util.Set;

import com.google.common.collect.Sets;

import reelz.mod.Main;
import reelz.mod.init.ItemInit;
import reelz.mod.util.interfaces.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;

public class ToolAxe extends ItemTool implements IHasModel {

	private static final Set<Block> EFFECTIVE_ON = Sets.newHashSet(Blocks.GRASS);
			
    public ToolAxe(String name, ToolMaterial material)
    {
        super(material, EFFECTIVE_ON);
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(Main.REELZT);
        
        ItemInit.ITEMS.add(this);
    }

  //  public float getStrVsBlock(ItemStack stack, IBlockState state)
  //  {
  //     Material material = state.getMaterial();
  //     return material != Material.WOOD && material != Material.PLANTS && material != Material.VINE ? super.getStrVsBlock(stack, state) : this.efficiencyOnProperMaterial;
  // }

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
		return 1.6d; // default vanilla sword speed
	}
}
