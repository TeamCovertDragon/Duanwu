package team.covertdragon.duanwu.Specials;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import team.covertdragon.duanwu.DuanwuConst;

import javax.annotation.Nullable;
import java.util.List;

public class ColorfulRope extends Item {
    public ColorfulRope(){
        this.setCreativeTab(DuanwuConst.DuanwuCreativeTab);
        this.setMaxDamage(20);
    }
    @SideOnly(Side.CLIENT)
    @Override
    public void addInformation(ItemStack stack, @Nullable World worldIn, List<String> tooltip, ITooltipFlag flagIn)
    {
        tooltip.add("Looks beautiful!");
        tooltip.add("It can bring you lucky");
    }
    //SomeThing Wrong
    /*
    @Override
    @SideOnly(Side.SERVER)
    public void onUpdate(ItemStack stack, World worldIn, Entity entityIn, int itemSlot, boolean isSelected)
    {
        if (!stack.hasTagCompound()){
            NBTTagCompound tag = new NBTTagCompound();
            tag.setInteger("timer", 0);
            stack.setTagCompound(tag);
        }
        NBTTagCompound tag = stack.getTagCompound();
        tag.setInteger("timer", tag.getInteger("timer") + 1);
        stack.setTagCompound(tag);
        if (tag.getInteger("timer") > 20){
            tag.setInteger("timer", 0);
            stack.setTagCompound(tag);
            stack.damageItem(1, (EntityPlayer) entityIn);
            //PotionEffect
        }

    }
    */
}
