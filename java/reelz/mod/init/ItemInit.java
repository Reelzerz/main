package reelz.mod.init;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import reelz.mod.objects.items.ItemBase;
import reelz.mod.objects.tools.ToolAxe;
import reelz.mod.objects.tools.ToolHoe;
import reelz.mod.objects.tools.ToolPickaxe;
import reelz.mod.objects.tools.ToolShovel;
import reelz.mod.objects.tools.ToolSword;
import reelz.mod.util.Reference;
import net.minecraftforge.common.util.EnumHelper;

public class ItemInit {

	public static final List<Item> ITEMS = new ArrayList<Item>();
	//Example
	//EnumHelper.addToolMaterial(name, harvestLevel, maxUses, efficiency, damage, enchantability)
	
	//Material
	static final ToolMaterial  DOKU_TOOL_GOLD = EnumHelper.addToolMaterial("doku_tool_gold", 0, 32, 12.0F, 0.0F, 22);
	//public static final ArmorMaterial ARMOR_COPPER = EnumHelper.addArmorMaterial("armor_copper", Reference.MODID + ":copper", 13, new int[]{2, 5, 5, 2}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	
	//Items
	public static final Item INGOT_COPPER = new ItemBase("ingot_copper");
	public static final Item DOKU_GOLD_INGOT = new ItemBase("doku_gold_ingot");
	
	//Tools
	public static final Item DOKU_GOLD_AXE = new ToolAxe("doku_gold_axe", DOKU_TOOL_GOLD);
	public static final Item DOKU_GOLD_PICKAXE = new ToolPickaxe("doku_gold_pickaxe", DOKU_TOOL_GOLD);
	public static final Item DOKU_GOLD_HOE = new ToolHoe("doku_gold_hoe", DOKU_TOOL_GOLD);
	public static final Item DOKU_GOLD_SHOVEL = new ToolShovel("doku_gold_shovel", DOKU_TOOL_GOLD);
	public static final Item DOKU_GOLD_SWORD = new ToolSword("doku_gold_sword", DOKU_TOOL_GOLD);

}