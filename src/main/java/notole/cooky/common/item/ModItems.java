package notole.cooky.common.item;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import notole.cooky.common.block.ModBlocks;
import notole.cooky.core.ModCreativeModeTab;

public class ModItems {

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }


    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, notole.cooky.Cooky.MODID);


    public static final RegistryObject<Item> CHASAND_PLATE = ITEMS.register("chasand_plate",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MOD_TAB)));

    public static final RegistryObject<Item> CHARCOAL_SAND = ITEMS.register("charcoal_sand",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MOD_TAB)));
}
