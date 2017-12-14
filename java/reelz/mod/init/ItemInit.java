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
import reelz.mod.objects.items.ItemBase2;
import reelz.mod.objects.tools.ToolAxe;
import reelz.mod.objects.tools.ToolHoe;
import reelz.mod.objects.tools.ToolPickaxe;
import reelz.mod.objects.tools.ToolShovel;
import reelz.mod.objects.tools.ToolSword;
import reelz.mod.test.TestBaseArmor;
import reelz.mod.test.TestBaseItem;
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
	public static final Item DOKU_DYE_POWDER_BLACK = new ItemBase("doku_dye_powder_black");
	public static final Item DOKU_DYE_POWDER_BLUE = new ItemBase("doku_dye_powder_blue");
	public static final Item DOKU_DYE_POWDER_BROWN = new ItemBase("doku_dye_powder_brown");
	
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
	public static final Item MORELLONOMICON = new ItemBase("morellonomicon");
	public static final Item LOSTCHAPTER = new ItemBase("lostchapter");
	public static final Item NASHORSTOOTH = new ItemBase("nashorstooth");
	public static final Item RABADONSDEATHCAP = new ItemBase("rabadonsdeathcap");
	public static final Item RANDUINSOMEN = new ItemBase("randuinsomen");
	public static final Item RODOFAGES = new ItemBase("rodofages");
	public static final Item RYLAISCRYSTALSCEPTER = new ItemBase("rylaiscrystalscepter");
	public static final Item SPIRITVISAGE = new ItemBase("spiritvisage");
	public static final Item SUNFIRECAPE = new ItemBase("sunfirecape");
	public static final Item THEBLACKCLEAVER = new ItemBase("theblackcleaver");
	public static final Item THEBLOODTHIRSTER = new ItemBase("thebloodthirster");
	public static final Item THORNMAIL = new ItemBase("thornmail");
	public static final Item TRINITYFORCE = new ItemBase("trinityforce");
	public static final Item VOIDSTAFF = new ItemBase("voidstaff");
	public static final Item ZEKESCONVERGENCE = new ItemBase("zekesconvergence");
	public static final Item ARCANESWEEPERTRINKET = new ItemBase("arcanesweepertrinket");
	public static final Item TIAMAT = new ItemBase("tiamat");
	public static final Item NOMADSMEDALLION = new ItemBase("nomadsmedallion");
	public static final Item RELICSHIELD = new ItemBase("relicshield");
	public static final Item TARGONBRACE = new ItemBase("targonsbrace");
	public static final Item CRYSTALLINEBRACER = new ItemBase("crystallinebracer");
	public static final Item RAPTORCLOAK = new ItemBase("raptorcloak");
	public static final Item SEEKERSARMGUARD = new ItemBase("seekersarmguard");
	public static final Item BOOTSOFSPEED = new ItemBase("bootsofspeed");
	public static final Item NINJATABI = new ItemBase("ninjatabi");
	public static final Item MERCURYSTREADS = new ItemBase("mercurystreads");
	public static final Item SIGHTSTONE = new ItemBase("sightstone");
	public static final Item RUBYSIGHTSTONE = new ItemBase("rubysightstone");
	public static final Item STERAKSGAGE = new ItemBase("steraksgage");
	public static final Item SERRATEDDIRK = new ItemBase("serrateddirk");
	public static final Item EDGEOFNIGHT = new ItemBase("edgeofnight");
	public static final Item LASTWISPER = new ItemBase("lastwhisper");
	public static final Item EXECUTIONERSCALLING = new ItemBase("executionerscalling");
	public static final Item GIANTSLAYER = new ItemBase("giantslayer");
	public static final Item POACHERSDIRK = new ItemBase("poachersdirk");
	public static final Item CLOAKOFAGILITY = new ItemBase("cloakofagility");
	public static final Item INFINITYEDGE = new ItemBase("infinityedge");
	public static final Item MANAMUNE = new ItemBase("manamune");
	public static final Item MERCURIALSCIMITAR = new ItemBase("mercurialscimitar");
	public static final Item RAVENOUSHYDRA = new ItemBase("ravenoushydra");
	public static final Item DEATHSDANCE = new ItemBase("deathsdance");
	public static final Item HEXTECHREVOLVER = new ItemBase("hextechrevolver");
	public static final Item ENCHANTMENTRUNICECHOES = new ItemBase("enchantmentrunicechoes");
	public static final Item HUNTERSMACHETE = new ItemBase("huntersmachete");
	public static final Item HUNTERSTALISMAN = new ItemBase("hunterstalisman");
	public static final Item TRACKERSKNIFE = new ItemBase("trackersknife");
	public static final Item TRACKERSKNIFERUNICECHOES = new ItemBase("trackerskniferunicechoes");
	public static final Item SKIRMISHERSABRE = new ItemBase("skirmisherssabre");
	public static final Item STALKERSBLADE = new ItemBase("stalkersblade");
	public static final Item SKIRMISHERSABREUNICECHOES = new ItemBase("skirmisherssabrerunicechoes");
	public static final Item STALKERSBLADERUNICECHOES = new ItemBase("stalkersbladerunicechoes");
	public static final Item BERSERKERSGREAVES = new ItemBase("berserkersgreaves");
	public static final Item PHANTOMDANCER = new ItemBase("phantomdancer");
	public static final Item BRAWLERSGLOVES = new ItemBase("brawlersgloves");
	public static final Item ZEAL = new ItemBase("zeal");
	public static final Item RUNAANSHURRICANE = new ItemBase("runaanshurricane");
	public static final Item KIRCHEISSHARD = new ItemBase("kircheisshard");
	public static final Item ESSENCEREAVER = new ItemBase("essencereaver");
	public static final Item ZHONYASHOURGLASS = new ItemBase("zhonyashourglass");
	public static final Item RIGHTEOUSGLORY = new ItemBase("righteousglory");
	public static final Item BOOTSOFMOBILITY = new ItemBase("bootsofmobility");
	public static final Item BOOTSOFSWIFTNESS = new ItemBase("bootsofswiftness");
	public static final Item CONTROLWARD = new ItemBase("controlward");
	public static final Item REFILLABLEPOTION = new ItemBase("refillablepotion");
	public static final Item HUNTERSPOTION = new ItemBase("hunterspotion");
	public static final Item CORRUPTINGPOTION = new ItemBase("corruptingpotion");
	public static final Item CULL = new ItemBase("cull");
	public static final Item DEATHSDAUGHTER = new ItemBase("deathsdaughter");
	public static final Item DORANSBLADE = new ItemBase("doransblade");
	public static final Item DORANSRING = new ItemBase("doransring");
	public static final Item DORANSSHIELD = new ItemBase("doransshield");
	public static final Item DUSKBLADEOFDRAKTHARR = new ItemBase("duskbladeofdraktharr");
	public static final Item YOUMUUSGHOSTBLADE = new ItemBase("youmuusghostblade");
	public static final Item EYEOFTHEEQUINOX = new ItemBase("eyeoftheequinox");
	public static final Item FACEOFTHEMOUTAIN = new ItemBase("faceofthemountain");
	public static final Item EYEOFTHEOASIS = new ItemBase("eyeoftheoasis");
	public static final Item SPELLTHIEFSEDGE = new ItemBase("spellthiefsedge");
	public static final Item FROSTFANG = new ItemBase("frostfang");
	public static final Item EYEOFTHEWATCHERS = new ItemBase("eyeofthewatchers");
	public static final Item WARDINGTOTEM = new ItemBase("wardingtotem");
	public static final Item FARSIGHTALTERATION = new ItemBase("farsightalteration");
	public static final Item FIREATWILL = new ItemBase("fireatwill");
	public static final Item FROSTQUEENSCLAIM = new ItemBase("frostqueensclaim");
	public static final Item GUARDIANSHAMMER = new ItemBase("guardianshammer");
	public static final Item GUARDIANSHORN = new ItemBase("guardianshorn");
	public static final Item GUARDIANSORB = new ItemBase("guardiansorb");
	public static final Item HEALTHPOTION = new ItemBase("healthpotion");
	public static final Item MIKAELSCRUCIBLE = new ItemBase("mikaelscrucible");
	public static final Item REDEMPTION = new ItemBase("redemption");
	public static final Item LORDDOMINIKSREGARDS = new ItemBase("lorddominiksregards");
	public static final Item MORTALREMINDER = new ItemBase("mortalreminder");
	public static final Item TITANICHYDRA = new ItemBase("titanichydra");
	public static final Item HEXTECHGUNBLADE = new ItemBase("hextechgunblade");
	public static final Item LORDVANDAMMSPILLAGER = new ItemBase("lordvandammspillager");
	public static final Item ENCHANTMENTWARRIOR = new ItemBase("enchantmentwarrior");
	public static final Item TALISMANOFASCENSION = new ItemBase("talismanofascension");
	public static final Item BANNEROFCOMMAND = new ItemBase("bannerofcommand");
	public static final Item OHMWRECKER = new ItemBase("ohmwrecker");
	public static final Item ZZROTPORTAL = new ItemBase("zzrotportal");
	public static final Item MOONFLAIRSPELLBLADE = new ItemBase("moonflairspellblade");
	public static final Item WOOGLETSWITCHCAP = new ItemBase("woogletswitchcap");
	public static final Item ELIXEROFSORCERY = new ItemBase("elixirofsorcery");
	public static final Item ELIXEROFIRON = new ItemBase("elixirofiron");
	public static final Item ELIXEROFWRATH = new ItemBase("elixirofwrath");
	public static final Item ENCHANTMENTBLOODRAZOR = new ItemBase("enchantmentbloodrazor");
	public static final Item ENCHANTMENTCINDERHULK = new ItemBase("enchantmentcinderhulk");
	public static final Item HEXTECHGLP800 = new ItemBase("hextechglp800");
	public static final Item HEXTECHPROTOBELT01 = new ItemBase("hextechprotobelt01");
	public static final Item IONIANBOOTSOFLUCIDITY = new ItemBase("ionianbootsoflucidity");
	public static final Item LUDENSECHO = new ItemBase("ludensecho");
	public static final Item WARMOGSARMOR = new ItemBase("warmogsarmor");
	public static final Item THEDARKSEAL = new ItemBase("thedarkseal");
	public static final Item MEJAISSOULSTEALER = new ItemBase("mejaissoulstealer");
	public static final Item MINIONDEMATERIALIZER = new ItemBase("miniondematerializer");
	public static final Item SWEEPINGLENS = new ItemBase("sweepinglens");
	public static final Item ORACLEALTERATION = new ItemBase("oraclealteration");
	public static final Item ORACLESEXTRACT = new ItemBase("oraclesextract");
	public static final Item PROTOTYPEHEXCORE = new ItemBase("prototypehexcore");
	public static final Item THEHEXCOREMK1 = new ItemBase("thehexcoremk1");
	public static final Item THEHEXCOREMK2 = new ItemBase("thehexcoremk2");
	public static final Item PERFECTHEXCORE = new ItemBase("perfecthexcore");
	public static final Item POROSNAX = new ItemBase("porosnax");
	public static final Item RAISEMORALE = new ItemBase("raisemorale");
	public static final Item RAPIDFIRECANNON = new ItemBase("rapidfirecannon");
	public static final Item STATIKKSHIV = new ItemBase("statikkshiv");
	public static final Item THEBLACKSPEAR = new ItemBase("theblackspear");
	public static final Item SKIRMISHERSSABREBLOODRAZOR = new ItemBase("skirmisherssabrebloodrazor");
	public static final Item SKIRMISHERSSABRECINDERHULK = new ItemBase("skirmisherssabrecinderhulk");
	public static final Item SKIRMISHERSSABREWARRIOR = new ItemBase("skirmisherssabrewarrior");
	public static final Item STALKERSBLADEBLOODRAZER = new ItemBase("stalkersbladebloodrazor");
	public static final Item STALKERSBLADECINDERHULK = new ItemBase("stalkersbladecinderhulk");
	public static final Item STALKERSBLADEWARRIOR = new ItemBase("stalkersbladewarrior");
	public static final Item TRACKERSKNIFEBLOODRAZOR = new ItemBase("trackersknifebloodrazor");
	public static final Item TRACKERSKNIFECINDERHULK = new ItemBase("trackersknifecinderhulk");
	public static final Item TRACKERSKNIFEWARRIOR = new ItemBase("trackersknifewarrior");
	public static final Item WITSEND = new ItemBase("witsend");


	
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
	
	//Legendary
	public static final Item LEGENDSWORD1 = new ItemBase("legendsword1");
	
	//GNames These Items are meant for the player to give names too..
	public static final Item GNAME1 = new ItemBase("gname1");
	public static final Item GNAME2 = new ItemBase("gname2");
	public static final Item GNAME3 = new ItemBase("gname3");
	public static final Item GNAME4 = new ItemBase("gname4");
	public static final Item GNAME5 = new ItemBase("gname5");
	public static final Item GNAME6 = new ItemBase("gname6");
	public static final Item GNAME7 = new ItemBase("gname7");
	public static final Item GNAME8 = new ItemBase("gname8");
	
	//Testing
	public static final Item TESTINGGEM = new TestBaseItem("testinggem");
	public static final Item TESTINGINGOT = new TestBaseItem("testingingot");
	public static final ArmorMaterial TESTINGARMOR = EnumHelper.addArmorMaterial("testing", Reference.MODID + ":test", 7, new int[]{3, 6, 6, 4}, 25, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final Item TEST_HELMET = new TestBaseArmor("test_helmet", TESTINGARMOR, 1, EntityEquipmentSlot.HEAD);
	public static final Item TEST_CHESTPLATE = new TestBaseArmor("test_chestplate", TESTINGARMOR, 1, EntityEquipmentSlot.CHEST);
	public static final Item TEST_LEGGINGS = new TestBaseArmor("test_leggings", TESTINGARMOR, 2, EntityEquipmentSlot.LEGS);
	public static final Item TEST_BOOTS = new TestBaseArmor("test_boots", TESTINGARMOR, 1, EntityEquipmentSlot.FEET);
	

}