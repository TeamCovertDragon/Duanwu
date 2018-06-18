package team.covertdragon.duanwu;

import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;

@Mod.EventBusSubscriber(modid = "duanwu", value = Side.CLIENT)
public final class DuanwuClientStuff {

    private DuanwuClientStuff() {
        // Do nothing
    }

    @SubscribeEvent
    public static void modelRegistry(ModelRegistryEvent event) {
        // TODO Do stuff
    }
}
