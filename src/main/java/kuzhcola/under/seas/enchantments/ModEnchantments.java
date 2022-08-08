package kuzhcola.under.seas.enchantments;

import java.rmi.registry.Registry;

import kuzhcola.under.seas.UnderSeas;
import net.minecraft.util.Identifier;

public class ModEnchantments {

    private static Enchantment register(String name, Enchantment enchantment) {
        return Registry.register(Registry.ENCHANTMENT, new Identifier(Underseas.LOGGER.getName(), name), enchantment);
    }

    public static void registerModEnchantments() {
        System.out.println("Registering enchantments for " + UnderSeas.LOGGER.getName());
    }
}
