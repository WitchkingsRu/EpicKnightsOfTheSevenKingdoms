package net.ekotsk.misc;

import java.util.HashSet;
import java.util.Set;

public class HeraldryRegistry {
    static Set<String> HERALDRY = new HashSet<>(Set.of(
            "arrows",
            "arryn",
            "beacon",
            "bonehand",
            "bright_sun",
            "carried_shield",
            "dornish_sun",
            "fallen_star",
            "fish",
            "grape",
            "hightower",
            "horn",
            "kraken",
            "lannister",
            "moons",
            "quarters",
            "rose",
            "scythe",
            "seahorse",
            "spear",
            "stag",
            "stark",
            "suns",
            "sword",
            "targaryen",
            "weirwood",
            "seven",
            "wyl",
            "prancing_horse",
            "shield",
            "horse_head",
            "circles",
            "hog",
            "hunter",
            "two_towers",
            "three_towers",
            "apple",
            "hives"
            ));

    public static void register(String name) {
        HERALDRY.add(name);
    }

    public static boolean isRegistered(String name) {
        return HERALDRY.contains(name);
    }
}
