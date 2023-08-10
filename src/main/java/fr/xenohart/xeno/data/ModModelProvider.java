package fr.xenohart.xeno.data;

import fr.xenohart.xeno.blocks.ModBlocks;
import fr.xenohart.xeno.items.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.RUBY_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.RUBY_ORE);

        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.STEEL_BLOCK);

        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.SAPHIRRE_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.SAPHIRRE_ORE);

        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.SILVER_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.SILVER_ORE);


        blockStateModelGenerator.registerLog(ModBlocks.PALM_TREE_LOG).log(ModBlocks.PALM_TREE_LOG).wood(ModBlocks.PALM_TREE_WOOD);
        blockStateModelGenerator.registerLog(ModBlocks.STRIPPED_PALM_TREE_LOG).log(ModBlocks.STRIPPED_PALM_TREE_LOG).wood(ModBlocks.STRIPPED_PALM_TREE_WOOD);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.PALM_TREE_PLANKS);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.PALM_TREE_LEAVES);
        blockStateModelGenerator.registerTintableCrossBlockState(ModBlocks.PALM_TREE_SAPLING, BlockStateModelGenerator.TintType.NOT_TINTED);

        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.RED_AUTUMNAL_LEAVES);
        blockStateModelGenerator.registerTintableCrossBlockState(ModBlocks.RED_AUTUMNAL_SAPLING, BlockStateModelGenerator.TintType.NOT_TINTED);

        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.YELLOW_AUTUMNAL_LEAVES);
        blockStateModelGenerator.registerTintableCrossBlockState(ModBlocks.YELLOW_AUTUMNAL_SAPLING, BlockStateModelGenerator.TintType.NOT_TINTED);

        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.ORANGE_AUTUMNAL_LEAVES);
        blockStateModelGenerator.registerTintableCrossBlockState(ModBlocks.ORANGE_AUTUMNAL_SAPLING, BlockStateModelGenerator.TintType.NOT_TINTED);

        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.BROWN_AUTUMNAL_LEAVES);
        blockStateModelGenerator.registerTintableCrossBlockState(ModBlocks.BROWN_AUTUMNAL_SAPLING, BlockStateModelGenerator.TintType.NOT_TINTED);

        blockStateModelGenerator.registerMushroomBlock(ModBlocks.BLUE_MUSHROOM_BLOCK);


        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.REDSTONE_BLOCK_BLACK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.REDSTONE_BLOCK_BLUE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.REDSTONE_BLOCK_BROWN);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.REDSTONE_BLOCK_CYAN);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.REDSTONE_BLOCK_GRAY);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.REDSTONE_BLOCK_GREEN);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.REDSTONE_BLOCK_LIGHT_BLUE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.REDSTONE_BLOCK_LIGHT_GRAY);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.REDSTONE_BLOCK_LIME);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.REDSTONE_BLOCK_MAGENTA);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.REDSTONE_BLOCK_ORANGE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.REDSTONE_BLOCK_PINK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.REDSTONE_BLOCK_PURPLE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.REDSTONE_BLOCK_WHITE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.REDSTONE_BLOCK_YELLOW);

        //blockStateModelGenerator.registerWoolAndCarpet(ModBlocks.RAINBOW_WOOL, ModBlocks.RAINBOW_CARPET);

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.SAPHIRRE, Models.GENERATED);
        itemModelGenerator.register(ModItems.RUBY, Models.GENERATED);
        itemModelGenerator.register(ModItems.STEEL_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.SILVER_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.OBSIDIAN_INGOT, Models.GENERATED);

        itemModelGenerator.register(ModItems.BANANA, Models.GENERATED);
        itemModelGenerator.register(ModItems.PEAR, Models.GENERATED);
        itemModelGenerator.register(ModItems.STRAWBERRY, Models.GENERATED);
        itemModelGenerator.register(ModItems.PEACH, Models.GENERATED);
        itemModelGenerator.register(ModItems.MANGO, Models.GENERATED);
        itemModelGenerator.register(ModItems.ORANGE, Models.GENERATED);
        itemModelGenerator.register(ModItems.SANDWICH, Models.GENERATED);
        itemModelGenerator.register(ModItems.COCONUT, Models.GENERATED);
    }
}
