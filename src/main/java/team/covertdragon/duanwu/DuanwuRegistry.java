package team.covertdragon.duanwu;

import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import team.covertdragon.duanwu.Food.TeaEgg;
import team.covertdragon.duanwu.Food.Zongzi;
import team.covertdragon.duanwu.Specials.ColorfulRope;

@Mod.EventBusSubscriber(modid = "duanwu")
public final class DuanwuRegistry {
    @SubscribeEvent
    public static void onItemRegister(RegistryEvent.Register<Item> event) {
        event.getRegistry().register(new Zongzi().setRegistryName("duanwu:zongzi"));
        event.getRegistry().register(new TeaEgg().setRegistryName("duanwu:teaegg"));
        event.getRegistry().register(new ColorfulRope().setRegistryName("duanwu:colorfulrope"));
    }
}
