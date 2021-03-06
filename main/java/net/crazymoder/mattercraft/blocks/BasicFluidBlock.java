package net.crazymoder.mattercraft.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fluids.BlockFluidClassic;
import net.minecraftforge.fluids.Fluid;

public class BasicFluidBlock extends BlockFluidClassic {

    protected IIcon stillIcon;
    protected IIcon flowingIcon;
    
    private String textureName;
    private Fluid fluid;
   
    public BasicFluidBlock(Fluid fluid, Material material,String texture) {
            super(fluid, material);
            this.fluid = fluid;
            textureName = texture;
    }
   
    @Override
    public IIcon getIcon(int side, int meta) {
            return (side == 0 || side == 1)? stillIcon : flowingIcon;
    }
   
    @Override
    public void registerBlockIcons(IIconRegister register) {
            stillIcon = register.registerIcon(textureName+"_S");
            flowingIcon = register.registerIcon(textureName+"_F");
            fluid.setIcons(flowingIcon);
    }
   
    @Override
    public boolean canDisplace(IBlockAccess world, int x, int y, int z) {
            if (world.getBlock(x,  y,  z).getMaterial().isLiquid()) return false;
            return super.canDisplace(world, x, y, z);
    }
   
    @Override
    public boolean displaceIfPossible(World world, int x, int y, int z) {
            if (world.getBlock(x,  y,  z).getMaterial().isLiquid()) return false;
            return super.displaceIfPossible(world, x, y, z);
    }
    
    public IIcon getIcon1(){
		return stillIcon;
    }
    
    public IIcon getIcon2(){
    	return flowingIcon;
    }
   
}
