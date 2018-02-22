package reelz.mod.init;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import reelz.mod.objects.armor.ArmorBase;
import reelz.mod.objects.armor.ArmorBase2;
import reelz.mod.objects.items.ItemBase;
import reelz.mod.objects.tools.ToolAxe;
import reelz.mod.objects.tools.ToolHoe;
import reelz.mod.objects.tools.ToolKnife;
import reelz.mod.objects.tools.ToolPickaxe;
import reelz.mod.objects.tools.ToolShovel;
import reelz.mod.objects.tools.ToolSword;
import reelz.mod.util.Reference;
import net.minecraftforge.common.util.EnumHelper;

public class ItemInit2 {

	public static final List<Item> ITEMS = new ArrayList<Item>();
	//Example
	//EnumHelper.addToolMaterial(name, harvestLevel, maxUses, efficiency, damage, enchantability)
	
	//Material Tool
	static final ToolMaterial  IRON_TOOL_TIER = EnumHelper.addToolMaterial("iron_tool_tier", 0, 32, 12.0F, 0.0F, 22);
	static final ToolMaterial  STEEL_TOOL_TIER = EnumHelper.addToolMaterial("steel_tool_tier", 0, 32, 12.0F, 0.0F, 22);
	static final ToolMaterial  ADAMANTITE_TOOL_TIER = EnumHelper.addToolMaterial("adamantite_tool_tier", 0, 32, 12.0F, 0.0F, 22);
	//Material Armor
	public static final ArmorMaterial IRON_ARMOR_TIER = EnumHelper.addArmorMaterial("iron_armor_tier", Reference.MODID + ":iron_armor_tier", 7, new int[]{1, 3, 5, 2}, 25, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial STEEL_ARMOR_TIER = EnumHelper.addArmorMaterial("steel_armor_tier", Reference.MODID + ":steel_armor_tier", 7, new int[]{1, 3, 5, 2}, 25, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	
	
	//Items
	public static final Item IRON_INGOT_TIER = new ItemBase("iron_ingot_tier");
	public static final Item ADAMANTITE_INGOT = new ItemBase("adamantite_ingot");
	

	//Tools
	public static final Item IRON_AXE_TIER = new ToolAxe("iron_axe_tier", IRON_TOOL_TIER);
	public static final Item IRON_PICKAXE_TIER = new ToolPickaxe("iron_pickaxe_tier", IRON_TOOL_TIER);
	public static final Item IRON_HOE_TIER = new ToolHoe("iron_hoe_tier", IRON_TOOL_TIER);
	public static final Item IRON_SHOVEL_TIER = new ToolShovel("iron_shovel_tier", IRON_TOOL_TIER);
	public static final Item IRON_KNIFE_TIER = new ToolKnife("iron_knife_tier", IRON_TOOL_TIER);
	public static final Item IRON_SPEAR_TIER = new ToolSword("iron_spear_tier", IRON_TOOL_TIER);
	public static final Item IRON_HAMMER_TIER = new ToolSword("iron_hammer_tier", IRON_TOOL_TIER);
	public static final Item IRON_SWORD_TIER = new ToolSword("iron_sword_tier", IRON_TOOL_TIER);
	public static final Item IRON_MACE_TIER = new ToolSword("iron_mace_tier", IRON_TOOL_TIER);
	public static final Item STEEL_AXE_TIER = new ToolAxe("steel_axe_tier", STEEL_TOOL_TIER);
	public static final Item STEEL_PICKAXE_TIER = new ToolPickaxe("steel_pickaxe_tier", STEEL_TOOL_TIER);
	public static final Item STEEL_HOE_TIER = new ToolHoe("steel_hoe_tier", STEEL_TOOL_TIER);
	public static final Item STEEL_SHOVEL_TIER = new ToolShovel("steel_shovel_tier", STEEL_TOOL_TIER);
	public static final Item STEEL_HAMMER_TIER = new ToolSword("steel_hammer_tier", STEEL_TOOL_TIER);
	public static final Item STEEL_KNIFE_TIER = new ToolSword("steel_knife_tier", STEEL_TOOL_TIER);
	public static final Item STEEL_MACE_TIER = new ToolSword("steel_mace_tier", STEEL_TOOL_TIER);
	public static final Item STEEL_SPEAR_TIER = new ToolSword("steel_spear_tier", STEEL_TOOL_TIER);
	public static final Item STEEL_SWORD_TIER = new ToolSword("steel_sword_tier", STEEL_TOOL_TIER);
	public static final Item ADAMANTITE_AXE_TIER = new ToolAxe("adamantite_axe_tier", ADAMANTITE_TOOL_TIER);
	public static final Item ADAMANTITE_HOE_TIER = new ToolHoe("adamantite_hoe_tier", ADAMANTITE_TOOL_TIER);
	public static final Item ADAMANTITE_PICKAXE_TIER = new ToolPickaxe("adamantite_pickaxe_tier", ADAMANTITE_TOOL_TIER);
	public static final Item ADAMANTITE_SHOVEL_TIER = new ToolShovel("adamantite_shovel_tier", ADAMANTITE_TOOL_TIER);
	public static final Item ADAMANTITE_SPEAR_TIER = new ToolSword("adamantite_spear_tier", ADAMANTITE_TOOL_TIER);
	public static final Item ADAMANTITE_HAMMER_TIER = new ToolSword("adamantite_hammer_tier", ADAMANTITE_TOOL_TIER);
	public static final Item ADAMANTITE_KNIFE_TIER = new ToolSword("adamantite_knife_tier", ADAMANTITE_TOOL_TIER);
	public static final Item ADAMANTITE_MACE_TIER = new ToolSword("adamantite_mace_tier", ADAMANTITE_TOOL_TIER);
	public static final Item ADAMANTITE_SWORD_TIER = new ToolSword("adamantite_sword_tier", ADAMANTITE_TOOL_TIER);
	
	
	//Armor
	public static final Item IRON_HELMET_TIER = new ArmorBase2("iron_helmet_tier", IRON_ARMOR_TIER, 1, EntityEquipmentSlot.HEAD);
	public static final Item IRON_CHESTPLATE_TIER = new ArmorBase2("iron_chestplate_tier", IRON_ARMOR_TIER, 1, EntityEquipmentSlot.CHEST);
	public static final Item IRON_LEGGINGS_TIER = new ArmorBase2("iron_leggings_tier", IRON_ARMOR_TIER, 2, EntityEquipmentSlot.LEGS);
	public static final Item IRON_BOOTS_TIER = new ArmorBase2("iron_boots_tier", IRON_ARMOR_TIER, 1, EntityEquipmentSlot.FEET);
	
}