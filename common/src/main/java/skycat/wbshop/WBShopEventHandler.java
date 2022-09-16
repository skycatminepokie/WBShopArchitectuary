package skycat.wbshop;

import com.mojang.authlib.Environment;
import dev.architectury.event.EventResult;
import dev.architectury.networking.NetworkManager;
import dev.architectury.platform.Platform;
import dev.architectury.utils.Env;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.world.ServerWorld;

public class WBShopEventHandler {


    public static void onServerStarting(MinecraftServer server) {

    }

    public static void onServerStopping(MinecraftServer server) {

    }

    public static void onServerSaving(ServerWorld world) {

    }

    public static EventResult onEntityDeath(LivingEntity livingEntity, DamageSource damageSource) {
        if (Platform.getEnvironment().equals(Env.SERVER)) {

        }
        if (livingEntity.isPlayer()) {
            // TODO: On death code
        }
        return EventResult.pass();
    }
}
