package skycat.wbshop;

import com.google.gson.Gson;
import dev.architectury.event.events.common.EntityEvent;
import dev.architectury.event.events.common.LifecycleEvent;
import dev.architectury.platform.Platform;
import dev.architectury.utils.Env;
import lombok.Getter;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import skycat.wbshop.server.EconomyManager;

// TODO: For now, we are assuming that this is not installed on the client side. In the future, such assumption should be checked.
public class WBShop {
    @Getter public static final String MOD_ID = "wbshop";
    public static final Gson GSON = new Gson();
    public static final Logger LOGGER = LoggerFactory.getLogger("wbshop");
    public static final Settings SETTINGS = Settings.load();
    public static final EconomyManager ECONOMY_MANAGER = EconomyManager.makeNewManager();
    public static MinecraftServer SERVER_INSTANCE;

    public static void init() { // Common
        LOGGER.info("Initializing wbshop (common)");
        LifecycleEvent.SERVER_STARTING.register(WBShopEventHandler::onServerStarting);
        LifecycleEvent.SERVER_STOPPING.register(WBShopEventHandler::onServerStopping);
        LifecycleEvent.SERVER_LEVEL_SAVE.register(WBShopEventHandler::onServerSaving);
        EntityEvent.LIVING_DEATH.register(WBShopEventHandler::onEntityDeath);
    }
}