package team.covertdragon.duanwu.Ferment;

import jline.internal.Nullable;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;
import team.covertdragon.duanwu.DuanwuConst;


public class Barrel extends Block {
    public Barrel(){
        super(Material.WOOD);
        this.setCreativeTab(DuanwuConst.DuanwuCreativeTab);
    }
    @Override
    public boolean hasTileEntity(IBlockState state) {
        return true;
    }
    @Nullable
    @Override
    public TileEntity createTileEntity(World world, IBlockState state) {
        return new TileEntityBarrel();
    }
    @Override
    public void onBlockPlacedBy(World worldIn, BlockPos pos, IBlockState state, EntityLivingBase placer, ItemStack stack)
    {
        TileEntity te = worldIn.getTileEntity(pos);
        NBTTagCompound nbt = new NBTTagCompound();
        nbt.setString("pos", pos.toString());
        te.writeToNBT(nbt);
    }
    @Override
    public boolean onBlockActivated(World world, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
        TileEntity te = world.getTileEntity(pos);
        playerIn.sendMessage(new TextComponentString(te.getTileData().getString("pos")));
        return true;
    }
}
