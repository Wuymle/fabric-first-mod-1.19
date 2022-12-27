package net.wuymle.firstmod;

import net.fabricmc.api.ClientModInitializer;
import net.wuymle.firstmod.event.KeyInputHandler;

public class FirstModClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        KeyInputHandler.register();

    }
}
