package skycat.wbshop.forge;

import dev.architectury.platform.forge.EventBuses;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import skycat.wbshop.WBShop;

@Mod(WBShop.MOD_ID)
public class WBShopForge {
    public WBShopForge() {
        // Submit our event bus to let architectury register our content on the right time
        EventBuses.registerModEventBus(WBShop.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());
        WBShop.init();
    }
}