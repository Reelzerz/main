package reelz.mod;

import net.minecraftforge.fml.common.Loader;

public class ModChecker {
	public static boolean isCubicChunksLoaded;
	public static boolean isMalisisCoreLoaded;

	
	
	public ModChecker() {
		this.isCubicChunksLoaded = Loader.isModLoaded("CubicChunks");
		this.isMalisisCoreLoaded = Loader.isModLoaded("MalisisCore");
	}
}
