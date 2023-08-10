package fr.xenohart.xeno.items;

import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;

public enum ModArmorMaterial implements ArmorMaterial {
    EMERALD("emerald", 13, new int[]{2, 3, 5,3}, 21, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.5f, 0.0f, Ingredient.ofItems(Items.EMERALD));

    private static final int[] HEALTH_PER_SLOT = new int[]{13, 15, 16, 11};
    private final String name;
    private final int durabilityMultiplier;
    private final int[] slotProtections;
    private final int enchantmentValue;
    private final SoundEvent sound;
    private final float toughness;
    private final float knockbackResistance;
    private final Ingredient repairIngredient;

    ModArmorMaterial(String name, int durabilityMultiplier, int[] slotProtections, int enchantmentValue, SoundEvent sound, float toughness, float knockbackResistance, Ingredient repairIngredient) {
        this.name = name;
        this.durabilityMultiplier = durabilityMultiplier;
        this.slotProtections = slotProtections;
        this.enchantmentValue = enchantmentValue;
        this.sound = sound;
        this.toughness = toughness;
        this.knockbackResistance = knockbackResistance;
        this.repairIngredient = repairIngredient;
    }

    @Override
    public int getDurability(ArmorItem.Type type) {
        return this.getDurability(type);
    }

    @Override
    public int getProtection(ArmorItem.Type type) {
        return this.getProtection(type);
    }

    @Override
    public int getEnchantability() {
        return this.getEnchantability();
    }

    @Override
    public SoundEvent getEquipSound() {
        return this.getEquipSound();
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.getRepairIngredient();
    }

    @Override
    public String getName() {
        return this.getName();
    }

    @Override
    public float getToughness() {
        return this.getToughness();
    }

    @Override
    public float getKnockbackResistance() {
        return this.getKnockbackResistance();
    }
}