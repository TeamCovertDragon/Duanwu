package team.covertdragon.duanwu;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import team.covertdragon.duanwu.Food.TeaEgg;
import team.covertdragon.duanwu.Food.Zongzi;

@Mod.EventBusSubscriber(modid = "duanwu")
public final class DuanwuRegistry {
    @SubscribeEvent
    public static void onItemRegister(RegistryEvent.Register<Item> event) {
        event.getRegistry().register(new Zongzi().setRegistryName("duanwu:zongzi"));
        event.getRegistry().register(new TeaEgg().setRegistryName("duanwu:teaegg"));
    }
    @SubscribeEvent
    public static void onBlockRegister(RegistryEvent.Register<Block> event) {
        //Now Testing...
        //event.getRegistry().register(new Barrel().setRegistryName("duanwu:barrel"));
        //GameRegistry.registerTileEntity(TileEntityBarrel.class, "tile_barrel");
    }
}
