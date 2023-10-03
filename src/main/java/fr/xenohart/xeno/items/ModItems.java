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

    public static final Item RUBY_PICKAXE = registerItem("ruby_pickaxe", new PickaxeItem(ModToolMaterial.RUBY, 2, 2f, new FabricItemSettings()));
    public static final Item RUBY_AXE = registerItem("ruby_axe", new AxeItem(ModToolMaterial.RUBY, 3, 1f, new FabricItemSettings()));
    public static final Item RUBY_SHOVEL = registerItem("ruby_shovel", new ShovelItem(ModToolMaterial.RUBY, 0, 0f, new FabricItemSettings()));
    public static final Item RUBY_HOE = registerItem("ruby_hoe", new HoeItem(ModToolMaterial.RUBY, 0, 0f, new FabricItemSettings()));

    public static final Item RUBY_SWORD = registerItem("ruby_sword", new SwordItem(ModToolMaterial.RUBY, 5, 3f, new FabricItemSettings()));
    public static final Item RUBY_HELMET = registerItem("ruby_helmet", new ArmorItem(ModArmorMaterial.RUBY, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item RUBY_CHESTPLATE = registerItem("ruby_chestplate", new ArmorItem(ModArmorMaterial.RUBY, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item RUBY_LEGGINGS = registerItem("ruby_leggings", new ArmorItem(ModArmorMaterial.RUBY, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item RUBY_BOOTS = registerItem("ruby_boots", new ArmorItem(ModArmorMaterial.RUBY, ArmorItem.Type.BOOTS, new FabricItemSettings()));

    public static final Item SAPHIRRE_PICKAXE = registerItem("saphirre_pickaxe", new PickaxeItem(ModToolMaterial.SAPHIRRE, 2, 2f, new FabricItemSettings()));
    public static final Item SAPHIRRE_AXE = registerItem("saphirre_axe", new AxeItem(ModToolMaterial.SAPHIRRE, 3, 1f, new FabricItemSettings()));
    public static final Item SAPHIRRE_SHOVEL = registerItem("saphirre_shovel", new ShovelItem(ModToolMaterial.SAPHIRRE, 0, 0f, new FabricItemSettings()));
    public static final Item SAPHIRRE_HOE = registerItem("saphirre_hoe", new HoeItem(ModToolMaterial.SAPHIRRE, 0, 0f, new FabricItemSettings()));

    public static final Item SAPHIRRE_SWORD = registerItem("saphirre_sword", new SwordItem(ModToolMaterial.SAPHIRRE, 5, 3f, new FabricItemSettings()));
    public static final Item SAPHIRRE_HELMET = registerItem("saphirre_helmet", new ArmorItem(ModArmorMaterial.SAPHIRRE, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item SAPHIRRE_CHESTPLATE = registerItem("saphirre_chestplate", new ArmorItem(ModArmorMaterial.SAPHIRRE, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item SAPHIRRE_LEGGINGS = registerItem("saphirre_leggings", new ArmorItem(ModArmorMaterial.SAPHIRRE, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item SAPHIRRE_BOOTS = registerItem("saphirre_boots", new ArmorItem(ModArmorMaterial.SAPHIRRE, ArmorItem.Type.BOOTS, new FabricItemSettings()));

    public static final Item OBSIDIAN_PICKAXE = registerItem("obsidian_pickaxe", new PickaxeItem(ModToolMaterial.OBSIDIAN, 2, 2f, new FabricItemSettings()));
    public static final Item OBSIDIAN_AXE = registerItem("obsidian_axe", new AxeItem(ModToolMaterial.OBSIDIAN, 3, 1f, new FabricItemSettings()));
    public static final Item OBSIDIAN_SHOVEL = registerItem("obsidian_shovel", new ShovelItem(ModToolMaterial.OBSIDIAN, 0, 0f, new FabricItemSettings()));
    public static final Item OBSIDIAN_HOE = registerItem("obsidian_hoe", new HoeItem(ModToolMaterial.OBSIDIAN, 0, 0f, new FabricItemSettings()));

    public static final Item OBSIDIAN_SWORD = registerItem("obsidian_sword", new SwordItem(ModToolMaterial.OBSIDIAN, 5, 3f, new FabricItemSettings()));
    public static final Item OBSIDIAN_HELMET = registerItem("obsidian_helmet", new ArmorItem(ModArmorMaterial.OBSIDIAN, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item OBSIDIAN_CHESTPLATE = registerItem("obsidian_chestplate", new ArmorItem(ModArmorMaterial.OBSIDIAN, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item OBSIDIAN_LEGGINGS = registerItem("obsidian_leggings", new ArmorItem(ModArmorMaterial.OBSIDIAN, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item OBSIDIAN_BOOTS = registerItem("obsidian_boots", new ArmorItem(ModArmorMaterial.OBSIDIAN, ArmorItem.Type.BOOTS, new FabricItemSettings()));

    public static final Item EMERALD_PICKAXE = registerItem("emerald_pickaxe", new PickaxeItem(ModToolMaterial.EMERALD, 2, 2f, new FabricItemSettings()));
    public static final Item EMERALD_AXE = registerItem("emerald_axe", new AxeItem(ModToolMaterial.EMERALD, 3, 1f, new FabricItemSettings()));
    public static final Item EMERALD_SHOVEL = registerItem("emerald_shovel", new ShovelItem(ModToolMaterial.EMERALD, 0, 0f, new FabricItemSettings()));
    public static final Item EMERALD_HOE = registerItem("emerald_hoe", new HoeItem(ModToolMaterial.EMERALD, 0, 0f, new FabricItemSettings()));

    public static final Item EMERALD_SWORD = registerItem("emerald_sword", new SwordItem(ModToolMaterial.EMERALD, 5, 3f, new FabricItemSettings()));
    public static final Item EMERALD_HELMET = registerItem("emerald_helmet", new ArmorItem(ModArmorMaterial.EMERALD, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item EMERALD_CHESTPLATE = registerItem("emerald_chestplate", new ArmorItem(ModArmorMaterial.EMERALD, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item EMERALD_LEGGINGS = registerItem("emerald_leggings", new ArmorItem(ModArmorMaterial.EMERALD, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item EMERALD_BOOTS = registerItem("emerald_boots", new ArmorItem(ModArmorMaterial.EMERALD, ArmorItem.Type.BOOTS, new FabricItemSettings()));

    public static final Item SILVER_PICKAXE = registerItem("silver_pickaxe", new PickaxeItem(ModToolMaterial.SILVER, 2, 2f, new FabricItemSettings()));
    public static final Item SILVER_AXE = registerItem("silver_axe", new AxeItem(ModToolMaterial.SILVER, 3, 1f, new FabricItemSettings()));
    public static final Item SILVER_SHOVEL = registerItem("silver_shovel", new ShovelItem(ModToolMaterial.SILVER, 0, 0f, new FabricItemSettings()));
    public static final Item SILVER_HOE = registerItem("silver_hoe", new HoeItem(ModToolMaterial.SILVER, 0, 0f, new FabricItemSettings()));

    public static final Item SILVER_SWORD = registerItem("silver_sword", new SwordItem(ModToolMaterial.SILVER, 5, 3f, new FabricItemSettings()));

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

        addToItemGroup(ItemGroups.TOOLS, RUBY_AXE);
        addToItemGroup(ItemGroups.TOOLS, RUBY_PICKAXE);
        addToItemGroup(ItemGroups.TOOLS, RUBY_HOE);
        addToItemGroup(ItemGroups.TOOLS, RUBY_SHOVEL);

        addToItemGroup(ItemGroups.COMBAT, RUBY_SWORD);
        addToItemGroup(ItemGroups.COMBAT, RUBY_HELMET);
        addToItemGroup(ItemGroups.COMBAT, RUBY_CHESTPLATE);
        addToItemGroup(ItemGroups.COMBAT, RUBY_LEGGINGS);
        addToItemGroup(ItemGroups.COMBAT, RUBY_BOOTS);

        addToItemGroup(ItemGroups.TOOLS, SAPHIRRE_AXE);
        addToItemGroup(ItemGroups.TOOLS, SAPHIRRE_PICKAXE);
        addToItemGroup(ItemGroups.TOOLS, SAPHIRRE_HOE);
        addToItemGroup(ItemGroups.TOOLS, SAPHIRRE_SHOVEL);

        addToItemGroup(ItemGroups.COMBAT, SAPHIRRE_SWORD);
        addToItemGroup(ItemGroups.COMBAT, SAPHIRRE_HELMET);
        addToItemGroup(ItemGroups.COMBAT, SAPHIRRE_CHESTPLATE);
        addToItemGroup(ItemGroups.COMBAT, SAPHIRRE_LEGGINGS);
        addToItemGroup(ItemGroups.COMBAT, SAPHIRRE_BOOTS);


        addToItemGroup(ItemGroups.TOOLS, OBSIDIAN_AXE);
        addToItemGroup(ItemGroups.TOOLS, OBSIDIAN_PICKAXE);
        addToItemGroup(ItemGroups.TOOLS, OBSIDIAN_HOE);
        addToItemGroup(ItemGroups.TOOLS, OBSIDIAN_SHOVEL);

        addToItemGroup(ItemGroups.COMBAT, OBSIDIAN_SWORD);
        addToItemGroup(ItemGroups.COMBAT, OBSIDIAN_HELMET);
        addToItemGroup(ItemGroups.COMBAT, OBSIDIAN_CHESTPLATE);
        addToItemGroup(ItemGroups.COMBAT, OBSIDIAN_LEGGINGS);
        addToItemGroup(ItemGroups.COMBAT, OBSIDIAN_BOOTS);


        addToItemGroup(ItemGroups.TOOLS, EMERALD_AXE);
        addToItemGroup(ItemGroups.TOOLS, EMERALD_PICKAXE);
        addToItemGroup(ItemGroups.TOOLS, EMERALD_HOE);
        addToItemGroup(ItemGroups.TOOLS, EMERALD_SHOVEL);

        addToItemGroup(ItemGroups.COMBAT, EMERALD_SWORD);
        addToItemGroup(ItemGroups.COMBAT, EMERALD_HELMET);
        addToItemGroup(ItemGroups.COMBAT, EMERALD_CHESTPLATE);
        addToItemGroup(ItemGroups.COMBAT, EMERALD_LEGGINGS);
        addToItemGroup(ItemGroups.COMBAT, EMERALD_BOOTS);


        addToItemGroup(ItemGroups.TOOLS, SILVER_AXE);
        addToItemGroup(ItemGroups.TOOLS, SILVER_PICKAXE);
        addToItemGroup(ItemGroups.TOOLS, SILVER_HOE);
        addToItemGroup(ItemGroups.TOOLS, SILVER_SHOVEL);

        addToItemGroup(ItemGroups.COMBAT, SILVER_SWORD);

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
