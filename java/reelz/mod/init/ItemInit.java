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

public class ItemInit {

	public static final List<Item> ITEMS = new ArrayList<Item>();
	//Example
	//EnumHelper.addToolMaterial(name, harvestLevel, maxUses, efficiency, damage, enchantability)
	
	//Material
	static final ToolMaterial  DOKU_TOOL_GOLD = EnumHelper.addToolMaterial("doku_tool_gold", 0, 32, 12.0F, 0.0F, 22);
	public static final ArmorMaterial DOKU_ARMOR_GOLD = EnumHelper.addArmorMaterial("doku_armor_gold", Reference.MODID + ":doku_Gold", 7, new int[]{1, 3, 5, 2}, 25, SoundEvents.ITEM_ARMOR_EQUIP_GOLD, 0.0F);
	
	//Items
	public static final Item INGOT_COPPER = new ItemBase("ingot_copper");
	public static final Item DOKU_GOLD_INGOT = new ItemBase("doku_gold_ingot");
	public static final Item DOKU_GOLD_NUGGET = new ItemBase("doku_gold_nugget");
	
	//League Items
	public static final Item ABYSSALMASK = new ItemBase("abyssalmask");
	public static final Item BLADEOFTHERUINKING = new ItemBase("bladeoftheruinedking");
	public static final Item ADAPTIVEHELM = new ItemBase("adaptivehelm");
	public static final Item AEGISOFTHELEGION = new ItemBase("aegisofthelegion");
	public static final Item AETHERWISP = new ItemBase("aetherwisp");
	public static final Item AMPLIFYINGTOME = new ItemBase("amplifyingtome");
	public static final Item ANCIENTCOIN = new ItemBase("ancientcoin");
	public static final Item ARCHANGELSSTAFF = new ItemBase("archangelsstaff");
	public static final Item ARDENTCENSER = new ItemBase("ardentcenser");
	public static final Item ATHENESUNHOLYGRAIL = new ItemBase("athenesunholygrail");
	public static final Item BAMISCINDER = new ItemBase("bamiscinder");
	public static final Item BANSHEESVEIL = new ItemBase("bansheesveil");
	public static final Item BFSWORD = new ItemBase("bfsword");
	public static final Item BILGEWATERCUTLASS = new ItemBase("bilgewatercutlass");
	public static final Item BLASTINGWAND = new ItemBase("blastingwand");
	public static final Item BRAMBLEVEST = new ItemBase("bramblevest");
	public static final Item CATALYSTOFAEONS = new ItemBase("catalystofaeons");
	public static final Item CHAINVEST = new ItemBase("chainvest");
	public static final Item CHALICEOFHARMONY = new ItemBase("chaliceofharmony");
	public static final Item CLOTHARMOR = new ItemBase("clotharmor");
	public static final Item DAGGER = new ItemBase("dagger");
	public static final Item DEADMANSPLATE = new ItemBase("deadmansplate");
	public static final Item FAERIECHARM = new ItemBase("faeriecharm");
	public static final Item FLENDISHCODEX = new ItemBase("flendishcodex");
	public static final Item LONGSWORD = new ItemBase("longsword");
	public static final Item NEEDLESSLYLARGEROD = new ItemBase("needlesslylargerod");
	public static final Item NEGATRONCLOAK = new ItemBase("negatroncloak");
	public static final Item NULLMAGICMANTLE = new ItemBase("nullmagicmantle");
	public static final Item PHAGE = new ItemBase("phage");
	public static final Item PICKAXE = new ItemBase("pickaxe");
	public static final Item QUICKSILVERSASH = new ItemBase("quicksilversash");
	public static final Item RECURVEBOW = new ItemBase("recurvebow");
	public static final Item REJUVENATEDBEAD = new ItemBase("rejuvenationbead");
	public static final Item RUBYCRYSTAL = new ItemBase("rubycrystal");
	public static final Item SAPHIRECRYSTAL = new ItemBase("saphirecrystal");
	public static final Item SHEEN = new ItemBase("sheen");
	public static final Item SPECTRESCOWL = new ItemBase("spectrescowl");
	public static final Item STINGER = new ItemBase("stinger");
	public static final Item TEAROFTHEGODDESS = new ItemBase("tearofthegoddess");
	public static final Item VAMPIRICSCEPTER = new ItemBase("vampiricscepter");
	public static final Item REPLACEDSCEPTER = new ItemBase("replacedscepter");
	public static final Item FORBIDDENIDOL = new ItemBase("forbiddenidol");
	public static final Item GIANTSBELT = new ItemBase("giantsbelt");
	public static final Item KINDLEGEM = new ItemBase("kindlegem");
	public static final Item WARDENSMAIL = new ItemBase("wardensmail");
	public static final Item FROZENHEART = new ItemBase("frozenheart");
	public static final Item GLACIALSHROUD = new ItemBase("glacialshroud");
	public static final Item FROZENMALLET = new ItemBase("frozenmallet");
	public static final Item JAURIMSFIST = new ItemBase("jaurimsfist");
	public static final Item GARGOYLESTONEPLATE = new ItemBase("gargoylestoneplate");
	public static final Item STOPWATCH = new ItemBase("stopwatch");
	public static final Item GUARDIANSANGEL = new ItemBase("guardianangel");
	public static final Item GUINSOOSRAGEBLADE = new ItemBase("guinsoosrageblade");
	public static final Item HAUNTINGGUISE = new ItemBase("hauntingguise");
	public static final Item ICEBORNGAUNNTLET = new ItemBase("iceborngauntlet");
	public static final Item KNIGHTSVOW = new ItemBase("knightsvow");
	public static final Item LIANDRYSTORMENT = new ItemBase("liandrystorment");
	public static final Item LICHBANE = new ItemBase("lichbane");
	public static final Item LOCKETOFTHEIRONSOLARI = new ItemBase("locketoftheironsolari");
	public static final Item MAWOFMALMORTIUS = new ItemBase("mawofmalmortius");
	public static final Item HEXDRINKER = new ItemBase("hexdrinker");
	public static final Item CAULFIELDSWARHAMMER = new ItemBase("caulfieldswarhammer");
	
	//Tools
	public static final Item DOKU_GOLD_AXE = new ToolAxe("doku_gold_axe", DOKU_TOOL_GOLD);
	public static final Item DOKU_GOLD_PICKAXE = new ToolPickaxe("doku_gold_pickaxe", DOKU_TOOL_GOLD);
	public static final Item DOKU_GOLD_HOE = new ToolHoe("doku_gold_hoe", DOKU_TOOL_GOLD);
	public static final Item DOKU_GOLD_SHOVEL = new ToolShovel("doku_gold_shovel", DOKU_TOOL_GOLD);
	public static final Item DOKU_GOLD_SWORD = new ToolSword("doku_gold_sword", DOKU_TOOL_GOLD);
	
	//Armor
	public static final Item DOKU_GOLD_HELMET = new ArmorBase("doku_gold_helmet", DOKU_ARMOR_GOLD, 1, EntityEquipmentSlot.HEAD);
	public static final Item DOKU_GOLD_CHESTPLATE = new ArmorBase("doku_gold_chestplate", DOKU_ARMOR_GOLD, 1, EntityEquipmentSlot.CHEST);
	public static final Item DOKU_GOLD_LEGGINGS = new ArmorBase("doku_gold_leggings", DOKU_ARMOR_GOLD, 2, EntityEquipmentSlot.LEGS);
	public static final Item DOKU_GOLD_BOOTS = new ArmorBase("doku_gold_boots", DOKU_ARMOR_GOLD, 1, EntityEquipmentSlot.FEET);
	

}