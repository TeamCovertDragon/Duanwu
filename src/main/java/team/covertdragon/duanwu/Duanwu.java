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

}
