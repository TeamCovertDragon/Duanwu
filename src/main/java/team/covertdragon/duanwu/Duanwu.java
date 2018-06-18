package team.covertdragon.duanwu;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import javax.annotation.Nonnull;

@Mod(modid = "duanwu", name = "Duanwu", version = "@VERSION_INJECT@", useMetadata = true)
public final class Duanwu {
    public Duanwu() {
        FluidRegistry.enableUniversalBucket();
    }

    // Notice: we don't need SidedProxy this time.

    public static final CreativeTabs DUANWU_GROUP = new CreativeTabs("duanwu") {
        @Override
        public ItemStack getTabIconItem() {
            return new ItemStack(DuanwuObjects.ZONGZI);
        }
    };

}
