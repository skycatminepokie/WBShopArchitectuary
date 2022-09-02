package skycat.wbshop;

import com.google.common.base.Suppliers;
import dev.architectury.event.events.common.CommandRegistrationEvent;
import dev.architectury.registry.registries.Registries;

import java.util.function.Supplier;

public class WorldborderShop {
    public static final String MOD_ID = "wbshop";
    public static final Supplier<Registries> REGISTRIES = Suppliers.memoize(() -> Registries.get(MOD_ID));

    public static void init() {
        CommandRegistrationEvent.EVENT.register(((dispatcher, selection) -> {
            // Register commands here
        }));
    }
}