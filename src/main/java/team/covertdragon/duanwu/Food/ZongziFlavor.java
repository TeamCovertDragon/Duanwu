package team.covertdragon.duanwu.Food;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public interface ZongziFlavor {

    void onEaten(ItemStack stack, World worldIn, EntityPlayer player);

}
