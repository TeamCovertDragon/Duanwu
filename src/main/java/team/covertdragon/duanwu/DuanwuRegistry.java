package team.covertdragon.duanwu;

import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber(modid = "duanwu")
public final class DuanwuRegistry {

    @SubscribeEvent
    public static void onItemRegister(RegistryEvent.Register<Item> event) {
        event.getRegistry().register(new Zongzi().setRegistryName("duanwu:zongzi").setUnlocalizedName("duanwu.zongzi"));
    }
}
