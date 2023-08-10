package fr.xenohart.xeno.items;

import fr.xenohart.xeno.XenoMod;
import fr.xenohart.xeno.blocks.ModBlocks;
import net.fabricmc.fabric.api.item.v1.EquipmentSlotProvider;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.Block;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item OBSIDIAN_INGOT = registerItem("obsidian_ingot", new Item(new FabricItemSettings()));
    public static final Item SILVER_INGOT = registerItem("silver_ingot", new Item(new FabricItemSettings()));
    public static final Item STEEL_INGOT = registerItem("steel_ingot", new Item(new FabricItemSettings()));
    public static final Item RUBY = registerItem("ruby", new Item(new FabricItemSettings()));
    public static final Item SAPHIRRE = registerItem("saphirre", new Item(new FabricItemSettings()));

    //public static final Item EMERALD_HELMET = registerItem("emerald_helmet", new ArmorItem(ModArmorMaterial.EMERALD, ArmorItem.Type.HELMET, new FabricItemSettings()));

    //FOOD
    public static final Item BANANA = registerItem("banana", new Item(new FabricItemSettings().food(FoodComponents.APPLE)));
    public static final Item PEAR = registerItem("pear", new Item(new FabricItemSettings().food(FoodComponents.APPLE)));
    public static final Item STRAWBERRY = registerItem("strawberry", new Item(new FabricItemSettings().food(FoodComponents.APPLE)));
    public static final Item PEACH = registerItem("peach", new Item(new FabricItemSettings().food(FoodComponents.APPLE)));
    public static final Item MANGO = registerItem("mango", new Item(new FabricItemSettings().food(FoodComponents.APPLE)));
    public static final Item ORANGE = registerItem("orange", new Item(new FabricItemSettings().food(FoodComponents.APPLE)));
    public static final Item SANDWICH = registerItem("sandwich", new Item(new FabricItemSettings().food(FoodComponents.BREAD)));
    public static final Item COCONUT = registerItem("coconut", new Item(new FabricItemSettings().food(FoodComponents.APPLE)));

    //public static final Item QUICKSAND_BUCKET = new PowderSnowBucketItem(ModBlocks.QUICKSAND, SoundEvents.BLOCK_SAND_PLACE, new FabricItemSettings().maxCount(1));
    //public static final Item RED_QUICKSAND_BUCKET = new PowderSnowBucketItem(ModBlocks.RED_QUICKSAND, SoundEvents.BLOCK_SAND_PLACE, new FabricItemSettings().maxCount(1));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(XenoMod.MOD_ID, name), item);
    }

    public static void addItemsToItemGroup(){
        addToItemGroup(ItemGroups.INGREDIENTS, OBSIDIAN_INGOT);
        addToItemGroup(ItemGroups.INGREDIENTS, SILVER_INGOT);
        addToItemGroup(ItemGroups.INGREDIENTS, STEEL_INGOT);
        addToItemGroup(ItemGroups.INGREDIENTS, RUBY);
        addToItemGroup(ItemGroups.INGREDIENTS, SAPHIRRE);

        addToItemGroup(ItemGroups.FOOD_AND_DRINK, BANANA);
        addToItemGroup(ItemGroups.FOOD_AND_DRINK, PEAR);
        addToItemGroup(ItemGroups.FOOD_AND_DRINK, STRAWBERRY);
        addToItemGroup(ItemGroups.FOOD_AND_DRINK, PEACH);
        addToItemGroup(ItemGroups.FOOD_AND_DRINK, MANGO);
        addToItemGroup(ItemGroups.FOOD_AND_DRINK, ORANGE);
        addToItemGroup(ItemGroups.FOOD_AND_DRINK, SANDWICH);
        addToItemGroup(ItemGroups.FOOD_AND_DRINK, COCONUT);

        //addToItemGroup(ItemGroups.COMBAT, EMERALD_HELMET);

        //addToItemGroup(ItemGroups.TOOLS, QUICKSAND_BUCKET);
        //addToItemGroup(ItemGroups.TOOLS, RED_QUICKSAND_BUCKET);

    }

    private static void addToItemGroup(RegistryKey<ItemGroup> group, Item item){
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
    }
    public static void registerModItems(){
        XenoMod.LOGGER.info("Registering Mod Items for " + XenoMod.MOD_ID);

        addItemsToItemGroup();
    }
}
