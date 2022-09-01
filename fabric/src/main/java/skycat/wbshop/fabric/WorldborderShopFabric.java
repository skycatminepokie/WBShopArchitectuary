package skycat.wbshop.fabric;

import skycat.wbshop.WorldborderShop;
import net.fabricmc.api.ModInitializer;

public class WorldborderShopFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        WorldborderShop.init();
    }
}