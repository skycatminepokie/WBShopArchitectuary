package skycat.wbshop.forge;

import dev.architectury.platform.forge.EventBuses;
import skycat.wbshop.WorldborderShop;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(WorldborderShop.MOD_ID)
public class WorldborderShopForge {
    public WorldborderShopForge() {
        // Submit our event bus to let architectury register our content on the right time
        EventBuses.registerModEventBus(WorldborderShop.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());
        WorldborderShop.init();
    }
}