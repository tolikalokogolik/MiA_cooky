package notole.cooky.common.block;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import notole.cooky.common.item.ModItems;
import notole.cooky.core.ModCreativeModeTab;

import java.util.function.Supplier;

public class ModBlocks {

    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, notole.cooky.Cooky.MODID);

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block,
                                                                             CreativeModeTab tab) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }

    public static final RegistryObject<Block> WET_CHARCOAL_SAND = registerBlock("wet_charcoal_sand",
            () ->  new Block(BlockBehaviour.Properties.of(Material.SAND).strength(6f)),
            ModCreativeModeTab.MOD_TAB);

    public static final RegistryObject<Block> INVERSE_TREE_PLAN = registerBlock("inverse_tree_plan",
            () ->  new Block(BlockBehaviour.Properties.of(Material.WOOD).strength(6f)),
            ModCreativeModeTab.MOD_TAB);

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }



}
