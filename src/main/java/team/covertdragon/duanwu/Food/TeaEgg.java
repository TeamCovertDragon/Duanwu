package team.covertdragon.duanwu.Food;

import net.minecraft.item.ItemFood;
import team.covertdragon.duanwu.DuanwuConst;

public class TeaEgg extends ItemFood {
    public TeaEgg(){
        super(3,3,false);
        this.setCreativeTab(DuanwuConst.DuanwuCreativeTab);
    }
}
