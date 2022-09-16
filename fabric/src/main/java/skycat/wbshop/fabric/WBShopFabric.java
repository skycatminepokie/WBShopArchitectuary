package skycat.wbshop.fabric;

import net.fabricmc.api.ModInitializer;
import skycat.wbshop.WBShop;

public class WBShopFabric implements ModInitializer {

    @Override
    public void onInitialize() {
        WBShop.init();
    }
}