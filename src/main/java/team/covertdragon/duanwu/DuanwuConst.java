package team.covertdragon.duanwu;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public final class DuanwuConst {
    public static final CreativeTabs DuanwuCreativeTab = new CreativeTabs("duanwu"){
        @Override
        public ItemStack getTabIconItem(){
            return new ItemStack(DuanwuObjects.ZONGZI);
        }
    };
}
