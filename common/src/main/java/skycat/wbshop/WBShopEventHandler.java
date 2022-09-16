package skycat.wbshop;

import com.mojang.authlib.Environment;
import dev.architectury.event.EventResult;
import dev.architectury.networking.NetworkManager;
import dev.architectury.platform.Platform;
import dev.architectury.utils.Env;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.world.ServerWorld;
import skycat.wbshop.server.EconomyManager;

public class WBShopEventHandler {


    public static void onServerStarting(MinecraftServer server) {
        WBShop.SERVER_INSTANCE = server;
    }

    public static void onServerStopping(MinecraftServer server) {

    }

    public static void onServerSaving(ServerWorld world) {

    }

    public static EventResult onEntityDeath(LivingEntity livingEntity, DamageSource damageSource) {
        if (livingEntity.isPlayer()) {
            EconomyManager.getInstance().onPlayerDeath((PlayerEntity) livingEntity); // TODO This cast should work, but maybe a fallback should be added
        }
        return EventResult.pass();
    }
}
