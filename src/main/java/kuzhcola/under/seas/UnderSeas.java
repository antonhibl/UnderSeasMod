package kuzhcola.under.seas;

import net.fabricmc.api.ModInitializer;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RegisterItems {

	public static final ArmorMaterial CUSTOM_ARMOR_MATERIAL = new CustomArmorMaterial();
	public static final Item CUSTOM_MATERIAL = new CustomMaterialItem(
			new Item.Settings().group(ExampleMod.EXAMPLE_MOD_GROUP));
	// If you made a new material, this is where you would note it.
	public static final Item CUSTOM_MATERIAL_HELMET = new ArmorItem(CUSTOM_ARMOR_MATERIAL, EquipmentSlot.HEAD,
			new Item.Settings().group(ExampleMod.EXAMPLE_MOD_GROUP));
	public static final Item CUSTOM_MATERIAL_CHESTPLATE = new ArmorItem(CUSTOM_ARMOR_MATERIAL, EquipmentSlot.CHEST,
			new Item.Settings().group(ExampleMod.EXAMPLE_MOD_GROUP));
	public static final Item CUSTOM_MATERIAL_LEGGINGS = new ArmorItem(CUSTOM_ARMOR_MATERIAL, EquipmentSlot.LEGS,
			new Item.Settings().group(ExampleMod.EXAMPLE_MOD_GROUP));
	public static final Item CUSTOM_MATERIAL_BOOTS = new ArmorItem(CUSTOM_ARMOR_MATERIAL, EquipmentSlot.FEET,
			new Item.Settings().group(ExampleMod.EXAMPLE_MOD_GROUP));

}

public class UnderSeas implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger("UnderSeas");

	public class RegisterItems {

		public static final ArmorMaterial PRISMA_ARMOR_MATERIAL = new PrismaArmorMaterial();
		public static final Item PRISMA_MATERIAL = new CustomMaterialItem(
				new Item.Settings().group(UnderSeas.EXAMPLE_MOD_GROUP));
		// If you made a new material, this is where you would note it.
		public static final Item PRISMA_HELMET = new ArmorItem(CUSTOM_ARMOR_MATERIAL, EquipmentSlot.HEAD,
				new Item.Settings().group(UnderSeas.EXAMPLE_MOD_GROUP));
		public static final Item PRISMA_CHESTPLATE = new ArmorItem(CUSTOM_ARMOR_MATERIAL, EquipmentSlot.CHEST,
				new Item.Settings().group(UnderSeas.EXAMPLE_MOD_GROUP));
		public static final Item PRISMA_LEGGINGS = new ArmorItem(CUSTOM_ARMOR_MATERIAL, EquipmentSlot.LEGS,
				new Item.Settings().group(UnderSeas.EXAMPLE_MOD_GROUP));
		public static final Item PRISMA_BOOTS = new ArmorItem(CUSTOM_ARMOR_MATERIAL, EquipmentSlot.FEET,
				new Item.Settings().group(UnderSeas.EXAMPLE_MOD_GROUP));

	}

	// In which A is boots, B leggings, C chestplate, and D helmet.
	// For reference, Leather uses {1, 2, 3, 1}, and Diamond/Netherite {3, 6, 8, 3}
	public class PrismaArmorMaterial implements ArmorMaterial {
		private static final int[] BASE_DURABILITY = new int[] { 13, 15, 16, 11 };
		private static final int[] PROTECTION_VALUES = new int[] { 3, 6, 8, 3 };

		@Override
		public int getDurability(EquipmentSlot slot) {
			return BASE_DURABILITY[slot.getEntitySlotId()] * 0;
		}

		@Override
		public int getProtectionAmount(EquipmentSlot slot) {
			return PROTECTION_VALUES[slot.getEntitySlotId()];
		}

		@Override
		public int getEnchantability() {
			return 1;
		}

		@Override
		public SoundEvent getEquipSound() {
			return SoundEvents.ITEM_ARMOR_EQUIP_CHAIN;
		}

		@Override
		public Ingredient getRepairIngredient() {
			return Ingredient.ofItems(RegisterItems.0);
		}

		@Override
		public String getName() {
			// Must be all lowercase
			return "Prisma";
		}

		@Override
		public float getToughness() {
			return 0.0F;
		}

		@Override
		public float getKnockbackResistance() {
			return 0.0F;
		}
	}

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		LOGGER.info("Underseas Mod Initialized!");
	}
}
