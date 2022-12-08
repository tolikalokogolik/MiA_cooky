package notole.cooky.core;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import notole.cooky.Cooky;

public class ModItems {

    public static final CreativeModeTab TAB = new CreativeModeTab(notole.cooky.Cooky.MODID) {

        @Override
        public ItemStack makeIcon() {
            return CHARCOAL_SAND.get().getDefaultInstance();
        }
    };

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }


    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, notole.cooky.Cooky.MODID);

    public static final RegistryObject<Item> CHARCOAL_SAND = ITEMS.register("charcoal_sand", () -> new BlockItem(ModBlocks.CHARCOAL_SAND.get(), new Item.Properties().tab(TAB)));


    public static final RegistryObject<Item> CHASAND_PLATE = ITEMS.register("chasand_plate", () -> new Item(new Item.Properties().fireResistant().tab(TAB)));
}
