package net.crazymoder.mattercraft.blockcontainer;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.crazymoder.mattercraft.tileentity.core.ReactorCoreTile;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.util.ForgeDirection;

public class ReactorCore extends BlockContainer{

	public ReactorCore() {
		super(Material.iron);
	}

	@Override
	public TileEntity createNewTileEntity(World world, int arg1) {
		return new ReactorCoreTile();
	}
	
}
