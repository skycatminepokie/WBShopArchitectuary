package skycat.wbshop;

import dev.architectury.event.events.common.EntityEvent;
import dev.architectury.event.events.common.LifecycleEvent;
import lombok.Getter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WBShop {
    @Getter public static final String MOD_ID = "wbshop";
    public static final Logger LOGGER = LoggerFactory.getLogger("wbshop");

    public static void init() { // Common (logical server-side things still go here to allow use of the mod in single-player)
        LOGGER.info("Initializing wbshop (common)");
        LifecycleEvent.SERVER_STARTING.register(WBShopEventHandler::onServerStarting);
        LifecycleEvent.SERVER_STOPPING.register(WBShopEventHandler::onServerStopping);
        LifecycleEvent.SERVER_LEVEL_SAVE.register(WBShopEventHandler::onServerSaving);
        EntityEvent.LIVING_DEATH.register(WBShopEventHandler::onEntityDeath);
    }
}