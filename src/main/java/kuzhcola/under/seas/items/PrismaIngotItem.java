package kuzhcola.under.seas.items;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;

import java.util.List;

public class PrismaIngotItem extends Item {
    public PrismaIngotItem(Settings settings) {
        super(settings);
    }

    @Override
    public void appendTooltip(ItemStack itemStack, World world, List<Text> tooltip, TooltipContext tooltipContext) {

        // default white text
        tooltip.add(Text.translatable("Prisma Ingot"));

        // formatted red text
        tooltip.add(Text.translatable("Prisma Ingot").formatted(Formatting.LIGHT_PURPLE));
    }

}
