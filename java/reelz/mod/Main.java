package reelz.mod;


import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import reelz.mod.proxy.CommonProxy;
import reelz.mod.util.Reference;
import reelz.mod.util.handlers.RegistryHandler;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION)
public class Main {

	@Instance
	public static Main instance;
	
	@SidedProxy(clientSide = Reference.CLIENT, serverSide = Reference.COMMON)
	public static CommonProxy proxy;
	
	public static final CreativeTabs REELZ = new ReelzTab("reelztab");
	public static final CreativeTabs REELZB = new ReelzTabBlocks("reelztabblock");
	public static final CreativeTabs REELZT = new ReelzTabTools("reelztabtools");
	public static final CreativeTabs REELZA = new ReelzTabArmor("reelztabarmor");
	
	public static ModChecker modchecker;
	
	@EventHandler
	public static void preInit(FMLPreInitializationEvent event) {RegistryHandler.otherRegistries();}
	@EventHandler
	public static void init(FMLInitializationEvent event) {}
	@EventHandler
	public static void postInit(FMLPostInitializationEvent event) {}
}