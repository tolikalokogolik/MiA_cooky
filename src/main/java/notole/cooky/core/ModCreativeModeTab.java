package notole.cooky.core;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import notole.cooky.common.item.ModItems;

public class ModCreativeModeTab {

    public static final CreativeModeTab MOD_TAB = new CreativeModeTab("modtab"){
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.CHASAND_PLATE.get());
        }
    };

}
