package fr.xenohart.xeno.world;

import fr.xenohart.xeno.XenoMod;
import fr.xenohart.xeno.blocks.ModBlocks;
//import fr.xenohart.xeno.mixin.FoliagePlacerTypeInvoker;
//import fr.xenohart.xeno.world.trees.foliage.PalmFoliagePlacer;
import net.minecraft.block.Blocks;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.BlobFoliagePlacer;
import net.minecraft.world.gen.foliage.FoliagePlacerType;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.trunk.StraightTrunkPlacer;

import java.util.OptionalInt;

public class ModConfiguredFeatures {
    public static final RegistryKey<ConfiguredFeature<?, ?>> PALM_TREE_KEY = registerKey("palm_tree");
    public static final RegistryKey<ConfiguredFeature<?, ?>> RED_AUTUMNAL_TREE_KEY = registerKey("red_autumnal_tree");
    public static final RegistryKey<ConfiguredFeature<?, ?>> ORANGE_AUTUMNAL_TREE_KEY = registerKey("orange_autumnal_tree");
    public static final RegistryKey<ConfiguredFeature<?, ?>> YELLOW_AUTUMNAL_TREE_KEY = registerKey("yellow_autumnal_tree");
    public static final RegistryKey<ConfiguredFeature<?, ?>> BROWN_AUTUMNAL_TREE_KEY = registerKey("brown_autumnal_tree");
    public static final RegistryKey<ConfiguredFeature<?, ?>> BLUE_MUSHROOM_KEY = registerKey("blue_mushroom_tree");

    //public static final FoliagePlacerType<PalmFoliagePlacer> PALM_FOLIAGE_PLACER = FoliagePlacerTypeInvoker.callRegister("xeno:palm_foliage_placer", PalmFoliagePlacer.CODEC);

    public static void bootstrap(Registerable<ConfiguredFeature<?, ?>> context) {
        register(context, PALM_TREE_KEY, Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(ModBlocks.PALM_TREE_LOG),
                new StraightTrunkPlacer(5, 2, 3),
                BlockStateProvider.of(ModBlocks.PALM_TREE_LEAVES),
                new BlobFoliagePlacer(ConstantIntProvider.create(0), ConstantIntProvider.create(0), 4),
                new TwoLayersFeatureSize(0, 0, 0, OptionalInt.of(4))).build());

        register(context, RED_AUTUMNAL_TREE_KEY, Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(Blocks.OAK_LOG),
                new StraightTrunkPlacer(5, 6, 3),
                BlockStateProvider.of(ModBlocks.RED_AUTUMNAL_LEAVES),
                new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 4),
                new TwoLayersFeatureSize(1, 0, 2)).build());

        register(context, ORANGE_AUTUMNAL_TREE_KEY, Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(Blocks.OAK_LOG),
                new StraightTrunkPlacer(5, 6, 3),
                BlockStateProvider.of(ModBlocks.ORANGE_AUTUMNAL_LEAVES),
                new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 4),
                new TwoLayersFeatureSize(1, 0, 2)).build());

        register(context, YELLOW_AUTUMNAL_TREE_KEY, Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(Blocks.OAK_LOG),
                new StraightTrunkPlacer(5, 6, 3),
                BlockStateProvider.of(ModBlocks.YELLOW_AUTUMNAL_LEAVES),
                new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 4),
                new TwoLayersFeatureSize(1, 0, 2)).build());

        register(context, BROWN_AUTUMNAL_TREE_KEY, Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(Blocks.OAK_LOG),
                new StraightTrunkPlacer(5, 6, 3),
                BlockStateProvider.of(ModBlocks.BROWN_AUTUMNAL_LEAVES),
                new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 4),
                new TwoLayersFeatureSize(1, 0, 2)).build());

        register(context, BLUE_MUSHROOM_KEY, Feature.HUGE_RED_MUSHROOM, new HugeMushroomFeatureConfig(
                BlockStateProvider.of(ModBlocks.BLUE_MUSHROOM_BLOCK), BlockStateProvider.of(Blocks.MUSHROOM_STEM), 5));
    }

    public static RegistryKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, new Identifier(XenoMod.MOD_ID, name));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<ConfiguredFeature<?, ?>> context,
                                                                                   RegistryKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}
