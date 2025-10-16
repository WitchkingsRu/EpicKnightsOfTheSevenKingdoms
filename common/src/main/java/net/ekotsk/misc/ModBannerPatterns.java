package net.ekotsk.misc;

import com.magistuarmory.misc.HeraldryRegistry;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.ekotsk.ASOIAFMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.block.entity.BannerPattern;

public class ModBannerPatterns {
    public static final DeferredRegister<BannerPattern> PATTERNS;

    public static final RegistrySupplier<BannerPattern> SPEAR_PATTERN;
    public static final RegistrySupplier<BannerPattern> DORNISH_SUN_PATTERN;
    public static final RegistrySupplier<BannerPattern> STARK;
    public static final RegistrySupplier<BannerPattern> LANNISTER;
    public static final RegistrySupplier<BannerPattern> KRAKEN;
    public static final RegistrySupplier<BannerPattern> TARGARYEN;
    public static final RegistrySupplier<BannerPattern> STAG;
    public static final RegistrySupplier<BannerPattern> ARRYN;
    public static final RegistrySupplier<BannerPattern> ROSE;
    public static final RegistrySupplier<BannerPattern> FISH;


    public static RegistrySupplier<BannerPattern> add(String name) {
        HeraldryRegistry.register(name);
        return PATTERNS.register(name, () -> new BannerPattern(name));
    }

    public static void init()
    {
        PATTERNS.register();
    }
    static {
        PATTERNS = DeferredRegister.create(ASOIAFMod.MOD_ID, Registries.BANNER_PATTERN);
        SPEAR_PATTERN = add("spear");
        DORNISH_SUN_PATTERN = add("dornish_sun");
        STARK = add("stark");
        KRAKEN = add("kraken");
        LANNISTER = add("lannister");
        TARGARYEN = add("targaryen");
        STAG = add("stag");
        ARRYN = add("arryn");
        ROSE = add("rose");
        FISH = add("fish");


    }
}
