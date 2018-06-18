package team.covertdragon.duanwu;

import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fml.common.Mod;

@Mod(modid = "duanwu", name = "Duanwu", version = "@VERSION_INJECT@", useMetadata = true)
public final class Duanwu {
    public Duanwu() {
        FluidRegistry.enableUniversalBucket();
    }

    // Notice: we don't need SidedProxy this time.

}
