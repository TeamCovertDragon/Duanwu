package team.covertdragon.duanwu;

import net.minecraftforge.common.config.Config;

@Config(modid = "duanwu", name = "Duanwu")
public final class DuanwuConfig {

    @Config.Comment("Set to false to disable statistics stuff.")
    @Config.Name("EnableStatistic")
    public boolean enableStatisticsMechanics = true;
}
