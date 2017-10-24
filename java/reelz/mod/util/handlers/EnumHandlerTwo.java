package reelz.mod.util.handlers;

import net.minecraft.util.IStringSerializable;
import reelz.mod.util.handlers.EnumHandler.EnumType;

public class EnumHandlerTwo {
	public static enum EnumTypeTwo implements IStringSerializable
	{
		COPPER(0, "copper");
		
		private static final EnumTypeTwo[] META_LOOKUP = new EnumTypeTwo[values().length];
		private final int meta;
		private final String name, unlocializedName;
		
		private EnumTypeTwo(int meta, String name) 
		{
			this(meta, name, name);
		}
		
		private EnumTypeTwo(int meta, String name, String unlocializedName) 
		{
			this.meta = meta;
			this.name = name;
			this.unlocializedName = unlocializedName;
		}
		
		@Override
		public String getName() 
		{
			return this.name;
		}
		
		public int getMeta() 
		{
			return this.meta;
		}
		
		public String getUnlocializedName() 
		{
			return this.unlocializedName;
		}
		
		@Override
		public String toString() 
		{
			return this.name;
		}
		
		public static EnumTypeTwo byMetadata(int meta)
		{
			return META_LOOKUP[meta];
		}
		
		static
		{
			for(EnumTypeTwo enumtypetwo : values())
			{
				META_LOOKUP[enumtypetwo.getMeta()] = enumtypetwo;
			}
		}
	}
	
}