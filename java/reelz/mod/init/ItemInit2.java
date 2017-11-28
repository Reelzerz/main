package reelz.mod.init;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import reelz.mod.objects.armor.ArmorBase;
import reelz.mod.objects.items.ItemBase;
import reelz.mod.objects.tools.ToolAxe;
import reelz.mod.objects.tools.ToolHoe;
import reelz.mod.objects.tools.ToolPickaxe;
import reelz.mod.objects.tools.ToolShovel;
import reelz.mod.objects.tools.ToolSword;
import reelz.mod.util.Reference;
import net.minecraftforge.common.util.EnumHelper;

public class ItemInit2 {

	public static final List<Item> ITEMS = new ArrayList<Item>();
	//Example
	//EnumHelper.addToolMaterial(name, harvestLevel, maxUses, efficiency, damage, enchantability)
	
	//Material
	//**static final ToolMaterial  DOKU_TOOL_GOLD = EnumHelper.addToolMaterial("doku_tool_gold", 0, 32, 12.0F, 0.0F, 22);
	//**public static final ArmorMaterial DOKU_ARMOR_GOLD = EnumHelper.addArmorMaterial("doku_armor_gold", Reference.MODID + ":doku_Gold", 7, new int[]{1, 3, 5, 2}, 25, SoundEvents.ITEM_ARMOR_EQUIP_GOLD, 0.0F);
	
	
	//Items
	//**public static final Item INGOT_COPPER = new ItemBase("ingot_copper");
	

	//Tools
	//**public static final Item DOKU_GOLD_AXE = new ToolAxe("doku_gold_axe", DOKU_TOOL_GOLD);
	//**public static final Item DOKU_GOLD_PICKAXE = new ToolPickaxe("doku_gold_pickaxe", DOKU_TOOL_GOLD);
	//**public static final Item DOKU_GOLD_HOE = new ToolHoe("doku_gold_hoe", DOKU_TOOL_GOLD);
	//**public static final Item DOKU_GOLD_SHOVEL = new ToolShovel("doku_gold_shovel", DOKU_TOOL_GOLD);
	//**public static final Item DOKU_GOLD_SWORD = new ToolSword("doku_gold_sword", DOKU_TOOL_GOLD);
	
	
	//Armor
	//**public static final Item DOKU_GOLD_HELMET = new ArmorBase("doku_gold_helmet", DOKU_ARMOR_GOLD, 1, EntityEquipmentSlot.HEAD);
	//**public static final Item DOKU_GOLD_CHESTPLATE = new ArmorBase("doku_gold_chestplate", DOKU_ARMOR_GOLD, 1, EntityEquipmentSlot.CHEST);
	//**public static final Item DOKU_GOLD_LEGGINGS = new ArmorBase("doku_gold_leggings", DOKU_ARMOR_GOLD, 2, EntityEquipmentSlot.LEGS);
	//**public static final Item DOKU_GOLD_BOOTS = new ArmorBase("doku_gold_boots", DOKU_ARMOR_GOLD, 1, EntityEquipmentSlot.FEET);
	

}