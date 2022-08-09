package kuzhcola.under.seas.items;

import kuzhcola.under.seas.UnderSeas;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class RegisterItems {
        public static final ArmorMaterial PrismaArmorMaterial = new kuzhcola.under.seas.materials.PrismaArmorMaterial();
        public static final Item PRISMA_INGOT = new PrismaIngotItem(new Item.Settings().group(UnderSeas.PRISMA_ARMOR));
        public static final Item PRISMA_HELMET = new ArmorItem(PrismaArmorMaterial, EquipmentSlot.HEAD,
                        new Item.Settings().group(UnderSeas.PRISMA_ARMOR).fireproof());
        public static final Item PRISMA_CHESTPLATE = new ArmorItem(PrismaArmorMaterial, EquipmentSlot.CHEST,
                        new Item.Settings().group(UnderSeas.PRISMA_ARMOR).fireproof());
        public static final Item PRISMA_LEGGINGS = new ArmorItem(PrismaArmorMaterial, EquipmentSlot.LEGS,
                        new Item.Settings().group(UnderSeas.PRISMA_ARMOR).fireproof());

        public static final Item PRISMA_BOOTS = new ArmorItem(PrismaArmorMaterial, EquipmentSlot.FEET,
                        new Item.Settings().group(UnderSeas.PRISMA_ARMOR).fireproof());

        public static void register() {
                Registry.register(Registry.ITEM, new Identifier("undersea", "prisma_ingot"), PRISMA_INGOT);
                Registry.register(Registry.ITEM, new Identifier("undersea", "prisma_helmet"), PRISMA_HELMET);
                Registry.register(Registry.ITEM, new Identifier("undersea", "prisma_chestplate"), PRISMA_CHESTPLATE);
                Registry.register(Registry.ITEM, new Identifier("undersea", "prisma_leggings"), PRISMA_LEGGINGS);
                Registry.register(Registry.ITEM, new Identifier("undersea", "prisma_boots"), PRISMA_BOOTS);
        }
}
