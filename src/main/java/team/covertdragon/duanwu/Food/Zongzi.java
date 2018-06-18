package team.covertdragon.duanwu.Food;

import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.StatList;
import net.minecraft.util.SoundCategory;
import net.minecraft.world.World;
import team.covertdragon.duanwu.DuanwuConst;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.List;

public final class Zongzi extends ItemFood {

    public Zongzi() {
        super(0, 0, false);
        this.setMaxStackSize(16);
        this.setCreativeTab(DuanwuConst.DuanwuCreativeTab);
    }

    @Nonnull
    @Override
    public ItemStack onItemUseFinish(ItemStack stack, World worldIn, EntityLivingBase entity) {
        if (entity instanceof EntityPlayer) {
            EntityPlayer player = (EntityPlayer)entity;
            if (stack.getTagCompound() != null) {
                ZongziFlavor flavor = ZongziMaster.INSTANCE.lookup(stack.getTagCompound().getString("flavor"));
                player.getFoodStats().addStats(0, 0F);
                flavor.onEaten(stack, worldIn, player);
            }
            worldIn.playSound(null, player.posX, player.posY, player.posZ, SoundEvents.ENTITY_PLAYER_BURP, SoundCategory.PLAYERS, 0.5F, worldIn.rand.nextFloat() * 0.1F + 0.9F);
            player.addStat(StatList.getObjectUseStats(this)); // TODO Keep or not

            if (player instanceof EntityPlayerMP) {
                CriteriaTriggers.CONSUME_ITEM.trigger((EntityPlayerMP)player, stack);
            }
        }

        stack.shrink(1);
        return stack;
    }

    @Override
    public void addInformation(ItemStack stack, @Nullable World worldIn, List<String> tooltip, ITooltipFlag flag) {
        if (flag.isAdvanced()) {
            if (stack.getTagCompound() != null) {
                tooltip.add("Flavor: " + stack.getTagCompound().getString("flavor"));
            } else {
                tooltip.add("This zongzi is rotten");
            }
        } else {
            tooltip.add("Press F3 + H to show flavor");
        }
    }

    @Override
    protected final void onFoodEaten(ItemStack stack, World worldIn, EntityPlayer player) {
        // Do nothing
    }
}
