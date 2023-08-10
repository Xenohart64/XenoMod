package fr.xenohart.xeno;

import fr.xenohart.xeno.blocks.ModBlocks;
import fr.xenohart.xeno.items.ModItems;
import fr.xenohart.xeno.world.gen.ModWorldGeneration;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class XenoMod implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger("xeno");
	public static final String MOD_ID = "xeno";

//	public static final DamageSource QUICKSAND_DAMAGE = new DamageSource("quicksand") {
//		public DamageSource setup() {
//			return this.setBypassesArmor();
//		}
//	}.setup();

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		ModWorldGeneration.generateModWorldGen();
	}


}
