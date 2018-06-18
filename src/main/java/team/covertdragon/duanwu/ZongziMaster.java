package team.covertdragon.duanwu;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import javax.annotation.Nonnull;
import java.util.HashMap;
import java.util.Map;

/**
 * Central manager of all zongzi-related objects.
 */
public final class ZongziMaster {

    public static final ZongziMaster INSTANCE = new ZongziMaster();

    private final Map<String, ZongziFlavor> flavorRegistry;

    private ZongziMaster() {
        flavorRegistry = new HashMap<>();
    }

    public void registerNewFlavor(final String id, final ZongziFlavor flavor) {
        this.flavorRegistry.putIfAbsent(id, flavor);
    }

    @Nonnull
    public ZongziFlavor lookup(final String id) {
        return this.flavorRegistry.getOrDefault(id, DummyFlavor.INSTANCE);
    }

    static final class DummyFlavor implements ZongziFlavor {

        static final DummyFlavor INSTANCE = new DummyFlavor();

        private DummyFlavor() {
            // Do nothing
        }

        @Override
        public void onEaten(ItemStack stack, World worldIn, EntityPlayer player) {
            // Do nothing
        }
    }
}
