package me.jonnite;

import net.fabricmc.api.ClientModInitializer;
import net.minecraft.resources.Identifier;

public class Main implements ClientModInitializer {
    @Override
    public void onInitializeClient() {

    }

    /**
     * Adapts to the {@link Identifier} changes introduced in 1.21.
     */
    public static Identifier id(String namespace, String path) {
        //? if <1.21 {
        /*return new Identifier(namespace, path);
        *///?} else
        return Identifier.fromNamespaceAndPath(namespace, path);
    }
}