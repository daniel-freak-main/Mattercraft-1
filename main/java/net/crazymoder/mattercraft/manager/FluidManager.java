package net.crazymoder.mattercraft.manager;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.crazymoder.mattercraft.blocks.BasicFluidBlock;
import net.crazymoder.mattercraft.fluids.IonizedPlasma;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBucket;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidContainerRegistry;
import net.minecraftforge.fluids.FluidRegistry;

public class FluidManager {
	public FluidManager(){
		IonizedPlasma ionizedPlasma = new IonizedPlasma();
		MinecraftForge.EVENT_BUS.register(BucketManager.INSTANCE);
	}
}
