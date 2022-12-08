package notole.cooky.core;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import notole.cooky.common.blocks.CharcoalSand;

import java.util.function.Supplier;

public class ModBlocks {

    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, notole.cooky.Cooky.MODID);

    public static final RegistryObject<Block> CHARCOAL_SAND = BLOCKS.register("charcoal_sand",
            () ->  new Block(BlockBehaviour.Properties.copy(Blocks.SAND)));

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }



}
