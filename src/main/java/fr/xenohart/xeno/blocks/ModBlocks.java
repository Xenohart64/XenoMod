package fr.xenohart.xeno.blocks;

import fr.xenohart.xeno.XenoMod;
import fr.xenohart.xeno.world.trees.*;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;

public class ModBlocks {

    public static final Block RUBY_BLOCK = registerBlock("ruby_block", new Block(FabricBlockSettings.copyOf(Blocks.DIAMOND_BLOCK).strength(4.0f).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block RUBY_ORE = registerBlock("ruby_ore", new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.STONE).strength(4.0f).requiresTool()), ItemGroups.NATURAL);

    public static final Block STEEL_BLOCK = registerBlock("steel_block", new Block(FabricBlockSettings.copyOf(Blocks.DIAMOND_BLOCK).strength(4.0f).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    //public static final Block STEEL_ORE = registerBlock("steel_ore", new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(4.0f).requiresTool()), ItemGroups.NATURAL);

    public static final Block SAPHIRRE_BLOCK = registerBlock("saphirre_block", new Block(FabricBlockSettings.copyOf(Blocks.DIAMOND_BLOCK).strength(4.0f).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block SAPHIRRE_ORE = registerBlock("saphirre_ore", new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.STONE).strength(4.0f).requiresTool()), ItemGroups.NATURAL);

    public static final Block SILVER_BLOCK = registerBlock("silver_block", new Block(FabricBlockSettings.copyOf(Blocks.DIAMOND_BLOCK).strength(4.0f).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block SILVER_ORE = registerBlock("silver_ore", new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.STONE).strength(4.0f).requiresTool()), ItemGroups.NATURAL);

    //TREES
    //PALM_TREE
    public static final Block PALM_TREE_LOG = registerBlock("palm_tree_log", new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_LOG)), ItemGroups.NATURAL);
    public static final Block PALM_TREE_WOOD = registerBlock("palm_tree_wood", new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_WOOD)), ItemGroups.NATURAL);
    public static final Block STRIPPED_PALM_TREE_LOG = registerBlock("stripped_palm_tree_log", new PillarBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_LOG)), ItemGroups.NATURAL);
    public static final Block STRIPPED_PALM_TREE_WOOD = registerBlock("stripped_palm_tree_wood", new PillarBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD)), ItemGroups.NATURAL);
    public static final Block PALM_TREE_PLANKS = registerBlock("palm_tree_planks", new Block(FabricBlockSettings.copy(Blocks.OAK_PLANKS)), ItemGroups.NATURAL);
    public static final Block PALM_TREE_LEAVES = registerBlock("palm_tree_leaves", new LeavesBlock(FabricBlockSettings.copy(Blocks.OAK_LEAVES)), ItemGroups.NATURAL);
    public static final Block PALM_TREE_SAPLING = registerBlock("palm_tree_sapling", new SaplingBlock(new PalmSaplingGenerator(), FabricBlockSettings.copyOf(Blocks.OAK_SAPLING)), ItemGroups.NATURAL);
    //public static final Block PALM_TREE_STAIRS = registerBlock("palm_tree_stairs", new Block(FabricBlockSettings.copy(Blocks.OAK_STAIRS)), ItemGroups.NATURAL);

    //END_TREE
    public static final Block END_TREE_LOG = registerBlock("end_tree_log", new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_LOG)), ItemGroups.NATURAL);
    public static final Block END_TREE_WOOD = registerBlock("end_tree_wood", new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_WOOD)), ItemGroups.NATURAL);
    public static final Block STRIPPED_END_TREE_LOG = registerBlock("stripped_end_tree_log", new PillarBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_LOG)), ItemGroups.NATURAL);
    public static final Block STRIPPED_END_TREE_WOOD = registerBlock("stripped_end_tree_wood", new PillarBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD)), ItemGroups.NATURAL);
    public static final Block END_TREE_PLANKS = registerBlock("end_tree_planks", new Block(FabricBlockSettings.copy(Blocks.OAK_PLANKS)), ItemGroups.NATURAL);
    public static final Block END_TREE_LEAVES = registerBlock("end_tree_leaves", new LeavesBlock(FabricBlockSettings.copy(Blocks.OAK_LEAVES)), ItemGroups.NATURAL);
    public static final Block END_TREE_SAPLING = registerBlock("end_tree_sapling", new SaplingBlock(new PalmSaplingGenerator(), FabricBlockSettings.copyOf(Blocks.OAK_SAPLING)), ItemGroups.NATURAL);


    //AUTUMNAL
    public static final Block RED_AUTUMNAL_LEAVES = registerBlock("red_autumnal_leaves", new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES)), ItemGroups.NATURAL);
    public static final Block RED_AUTUMNAL_SAPLING = registerBlock("red_autumnal_sapling", new SaplingBlock(new RedAutumnalSaplingGenerator(), FabricBlockSettings.copyOf(Blocks.OAK_SAPLING)), ItemGroups.NATURAL);

    public static final Block ORANGE_AUTUMNAL_LEAVES = registerBlock("orange_autumnal_leaves", new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES)), ItemGroups.NATURAL);
    public static final Block ORANGE_AUTUMNAL_SAPLING = registerBlock("orange_autumnal_sapling", new SaplingBlock(new OrangeAutumnalSaplingGenerator(), FabricBlockSettings.copyOf(Blocks.OAK_SAPLING)), ItemGroups.NATURAL);

    public static final Block YELLOW_AUTUMNAL_LEAVES = registerBlock("yellow_autumnal_leaves", new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES)), ItemGroups.NATURAL);
    public static final Block YELLOW_AUTUMNAL_SAPLING = registerBlock("yellow_autumnal_sapling", new SaplingBlock(new YellowAutumnalSaplingGenerator(), FabricBlockSettings.copyOf(Blocks.OAK_SAPLING)), ItemGroups.NATURAL);

    public static final Block BROWN_AUTUMNAL_LEAVES = registerBlock("brown_autumnal_leaves", new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES)), ItemGroups.NATURAL);
    public static final Block BROWN_AUTUMNAL_SAPLING = registerBlock("brown_autumnal_sapling", new SaplingBlock(new BrownAutumnalSaplingGenerator(), FabricBlockSettings.copyOf(Blocks.OAK_SAPLING)), ItemGroups.NATURAL);

    //public static final Block BLUE_MUSHROOM = registerBlock("blue_mushroom", new MushroomPlantBlock();
    public static final Block BLUE_MUSHROOM_BLOCK = registerBlock("blue_mushroom_block", new MushroomBlock(FabricBlockSettings.copy(Blocks.RED_MUSHROOM_BLOCK)), ItemGroups.NATURAL);


//    public static final Block RAINBOW_WOOL = registerBlock("rainbow_wool", new Block(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)), ItemGroups.COLORED_BLOCKS);
//    public static final Block RAINBOW_CARPET = registerBlock("rainbow_carpet", new Block(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)), ItemGroups.COLORED_BLOCKS);

    //public static final Block QUICKSAND = new QuicksandBlock();
    //public static final Block QUICKSAND_CAULDRON =  new FullCauldronBlock(FabricBlockSettings.copyOf(Blocks.CAULDRON), ModCauldronBehavior.QUICKSAND_CAULDRON_BEHAVIOR);

    //public static final Block RED_QUICKSAND = new QuicksandBlock(FabricBlockSettings.copyOf(Blocks.RED_SAND), 11098145, () -> ModItems.RED_QUICKSAND_BUCKET);
//    public static final Block RED_QUICKSAND_CAULDRON =  new FullCauldronBlock(FabricBlockSettings.copyOf(Blocks.CAULDRON), ModCauldronBehavior.RED_QUICKSAND_CAULDRON_BEHAVIOR);

    public static final Block REDSTONE_BLOCK_BLUE = registerBlock("redstone_block_blue", new RedstoneBlock(FabricBlockSettings.copyOf(Blocks.REDSTONE_BLOCK).strength(4.0f).requiresTool()), ItemGroups.REDSTONE);
    public static final Block REDSTONE_BLOCK_BLACK = registerBlock("redstone_block_black", new RedstoneBlock(FabricBlockSettings.copyOf(Blocks.REDSTONE_BLOCK).strength(4.0f).requiresTool()), ItemGroups.REDSTONE);
    public static final Block REDSTONE_BLOCK_BROWN = registerBlock("redstone_block_brown", new RedstoneBlock(FabricBlockSettings.copyOf(Blocks.REDSTONE_BLOCK).strength(4.0f).requiresTool()), ItemGroups.REDSTONE);
    public static final Block REDSTONE_BLOCK_CYAN = registerBlock("redstone_block_cyan", new RedstoneBlock(FabricBlockSettings.copyOf(Blocks.REDSTONE_BLOCK).strength(4.0f).requiresTool()), ItemGroups.REDSTONE);
    public static final Block REDSTONE_BLOCK_GRAY = registerBlock("redstone_block_gray", new RedstoneBlock(FabricBlockSettings.copyOf(Blocks.REDSTONE_BLOCK).strength(4.0f).requiresTool()), ItemGroups.REDSTONE);
    public static final Block REDSTONE_BLOCK_GREEN = registerBlock("redstone_block_green", new RedstoneBlock(FabricBlockSettings.copyOf(Blocks.REDSTONE_BLOCK).strength(4.0f).requiresTool()), ItemGroups.REDSTONE);
    public static final Block REDSTONE_BLOCK_LIGHT_BLUE = registerBlock("redstone_block_light_blue", new RedstoneBlock(FabricBlockSettings.copyOf(Blocks.REDSTONE_BLOCK).strength(4.0f).requiresTool()), ItemGroups.REDSTONE);
    public static final Block REDSTONE_BLOCK_LIGHT_GRAY = registerBlock("redstone_block_light_gray", new RedstoneBlock(FabricBlockSettings.copyOf(Blocks.REDSTONE_BLOCK).strength(4.0f).requiresTool()), ItemGroups.REDSTONE);
    public static final Block REDSTONE_BLOCK_LIME = registerBlock("redstone_block_lime", new RedstoneBlock(FabricBlockSettings.copyOf(Blocks.REDSTONE_BLOCK).strength(4.0f).requiresTool()), ItemGroups.REDSTONE);
    public static final Block REDSTONE_BLOCK_MAGENTA = registerBlock("redstone_block_magenta", new RedstoneBlock(FabricBlockSettings.copyOf(Blocks.REDSTONE_BLOCK).strength(4.0f).requiresTool()), ItemGroups.REDSTONE);
    public static final Block REDSTONE_BLOCK_ORANGE = registerBlock("redstone_block_orange", new RedstoneBlock(FabricBlockSettings.copyOf(Blocks.REDSTONE_BLOCK).strength(4.0f).requiresTool()), ItemGroups.REDSTONE);
    public static final Block REDSTONE_BLOCK_PINK = registerBlock("redstone_block_pink", new RedstoneBlock(FabricBlockSettings.copyOf(Blocks.REDSTONE_BLOCK).strength(4.0f).requiresTool()), ItemGroups.REDSTONE);
    public static final Block REDSTONE_BLOCK_PURPLE = registerBlock("redstone_block_purple", new RedstoneBlock(FabricBlockSettings.copyOf(Blocks.REDSTONE_BLOCK).strength(4.0f).requiresTool()), ItemGroups.REDSTONE);
    public static final Block REDSTONE_BLOCK_WHITE = registerBlock("redstone_block_white", new RedstoneBlock(FabricBlockSettings.copyOf(Blocks.REDSTONE_BLOCK).strength(4.0f).requiresTool()), ItemGroups.REDSTONE);
    public static final Block REDSTONE_BLOCK_YELLOW = registerBlock("redstone_block_yellow", new RedstoneBlock(FabricBlockSettings.copyOf(Blocks.REDSTONE_BLOCK).strength(4.0f).requiresTool()), ItemGroups.REDSTONE);

//    public static final Block REDSTONE_BLUE = registerBlock("redstone_blue", new RedstoneWireBlock(FabricBlockSettings.copyOf(Blocks.REDSTONE_WIRE)), ItemGroups.REDSTONE);
//    public static final Block REDSTONE_BLACK = registerBlock("redstone_black", new RedstoneWireBlock(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ItemGroups.REDSTONE);
//    public static final Block REDSTONE_BROWN = registerBlock("redstone_brown", new RedstoneWireBlock(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ItemGroups.REDSTONE);
//    public static final Block REDSTONE_CYAN = registerBlock("redstone_cyan", new RedstoneWireBlock(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ItemGroups.REDSTONE);
//    public static final Block REDSTONE_GRAY = registerBlock("redstone_gray", new RedstoneWireBlock(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ItemGroups.REDSTONE);
//    public static final Block REDSTONE_GREEN = registerBlock("redstone_green", new RedstoneWireBlock(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ItemGroups.REDSTONE);
//    public static final Block REDSTONE_LIGHT_BLUE = registerBlock("redstone_light_blue", new RedstoneWireBlock(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ItemGroups.REDSTONE);
//    public static final Block REDSTONE_LIGHT_GRAY = registerBlock("redstone_light_gray", new RedstoneWireBlock(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ItemGroups.REDSTONE);
//    public static final Block REDSTONE_LIGHT_LIME = registerBlock("redstone_lime", new RedstoneWireBlock(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ItemGroups.REDSTONE);
//    public static final Block REDSTONE_LIGHT_MAGENTA = registerBlock("redstone_magenta", new RedstoneWireBlock(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ItemGroups.REDSTONE);
//    public static final Block REDSTONE_LIGHT_ORANGE = registerBlock("redstone_orange", new RedstoneWireBlock(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ItemGroups.REDSTONE);
//    public static final Block REDSTONE_LIGHT_PINK = registerBlock("redstone_pink", new RedstoneWireBlock(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ItemGroups.REDSTONE);
//    public static final Block REDSTONE_LIGHT_PURPLE = registerBlock("redstone_purple", new RedstoneWireBlock(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ItemGroups.REDSTONE);
//    public static final Block REDSTONE_LIGHT_WHITE = registerBlock("redstone_white", new RedstoneWireBlock(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ItemGroups.REDSTONE);
//    public static final Block REDSTONE_LIGHT_YELLOW = registerBlock("redstone_yellow", new RedstoneWireBlock(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ItemGroups.REDSTONE);

    private static Block registerBlock(String name, Block block, RegistryKey<ItemGroup> group){
        registerBlockItem(name, block, group);
        return Registry.register(Registries.BLOCK, new Identifier(XenoMod.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, RegistryKey<ItemGroup> group){
        Item item = Registry.register(Registries.ITEM, new Identifier(XenoMod.MOD_ID, name), new BlockItem(block, new FabricItemSettings()));
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
        return item;
    }

    public static void registerModBlocks(){
        XenoMod.LOGGER.info("Registering ModBlocks for " + XenoMod.MOD_ID);
    }
}
