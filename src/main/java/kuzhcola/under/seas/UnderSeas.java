package kuzhcola.under.seas;

import net.fabricmc.api.ModInitializer;
import com.google.common.collect.Lists;

import kuzhcola.under.seas.items.RegisterItems;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UnderSeas implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger("UnderSeas");

	public static final ArrayList<DamageSource> DAMAGE_SOURCES = Lists.newArrayList(
			// All the damage sources we should be immune to

			DamageSource.HOT_FLOOR,
			DamageSource.IN_FIRE,
			DamageSource.LAVA,
			DamageSource.LIGHTNING_BOLT,
			DamageSource.ON_FIRE);

	public static final ItemGroup PRISMA_ARMOR = FabricItemGroupBuilder.create(
			new Identifier("underseas", "prisma_armor"))
			.icon(() -> new ItemStack(RegisterItems.PRISMA_INGOT))
			.build();

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.
		RegisterItems.register();

		LOGGER.info("Underseas Mod Initialized!");
	}
}
