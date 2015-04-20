package net.crazymoder.mattercraft.BlockContainer;

import net.crazymoder.mattercraft.TileEntity.NormalBlockTile;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class NormalBlock extends BlockContainer{

	public NormalBlock(Material material) {
		super(material);
	}
	
	@Override
	public TileEntity createNewTileEntity(World arg0, int arg1) {
		return new NormalBlockTile();
	}
	
}
