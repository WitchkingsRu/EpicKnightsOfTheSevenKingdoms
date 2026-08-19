package net.ekotsk.misc;

import net.ekotsk.item.ModItems;
import dev.architectury.registry.level.entity.trade.SimpleTrade;
import dev.architectury.registry.level.entity.trade.TradeRegistry;
import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraft.world.entity.npc.VillagerTrades;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.trading.ItemCost;

import java.util.Optional;

public class ModMerchantOffers {
    public static VillagerTrades.ItemListing[] SHEPHERD_TRADES;
    public static VillagerTrades.ItemListing[] WANDERING_TRADER_TRADES;
    public static VillagerTrades.ItemListing[] WANDERING_TRADER_TRADES_RARE;

    public static void setup()
    {
        SHEPHERD_TRADES = new VillagerTrades.ItemListing[]{
                new SimpleTrade(new ItemCost(Items.EMERALD), Optional.empty(), new ItemStack(ModItems.SPEAR_PATTERN.get()), 7, 0, 1),
                new SimpleTrade(new ItemCost(Items.EMERALD), Optional.empty(), new ItemStack(ModItems.DORNISH_SUN_PATTERN.get()), 7, 0, 1),
                new SimpleTrade(new ItemCost(Items.EMERALD), Optional.empty(), new ItemStack(ModItems.BRIGHT_SUN_PATTERN.get()), 7, 0, 1),
                new SimpleTrade(new ItemCost(Items.EMERALD), Optional.empty(), new ItemStack(ModItems.SUNS_PATTERN.get()), 7, 0, 1),
                new SimpleTrade(new ItemCost(Items.EMERALD), Optional.empty(), new ItemStack(ModItems.MOONS_PATTERN.get()), 7, 0, 1),
                new SimpleTrade(new ItemCost(Items.EMERALD), Optional.empty(), new ItemStack(ModItems.STAG_PATTERN.get()), 7, 0, 1),
                new SimpleTrade(new ItemCost(Items.EMERALD), Optional.empty(), new ItemStack(ModItems.STARK_PATTERN.get()), 7, 0, 1),
                new SimpleTrade(new ItemCost(Items.EMERALD), Optional.empty(), new ItemStack(ModItems.KRAKEN_PATTERN.get()), 7, 0, 1),
                new SimpleTrade(new ItemCost(Items.EMERALD), Optional.empty(), new ItemStack(ModItems.LANNISTER_PATTERN.get()), 7, 0, 1),
                new SimpleTrade(new ItemCost(Items.EMERALD), Optional.empty(), new ItemStack(ModItems.TARGARYEN_PATTERN.get()), 7, 0, 1),
                new SimpleTrade(new ItemCost(Items.EMERALD), Optional.empty(), new ItemStack(ModItems.ARRYN_PATTERN.get()), 7, 0, 1),
                new SimpleTrade(new ItemCost(Items.EMERALD), Optional.empty(), new ItemStack(ModItems.ARROWS_PATTERN.get()), 7, 0, 1),
                new SimpleTrade(new ItemCost(Items.EMERALD), Optional.empty(), new ItemStack(ModItems.ROSE_PATTERN.get()), 7, 0, 1),
                new SimpleTrade(new ItemCost(Items.EMERALD), Optional.empty(), new ItemStack(ModItems.FISH_PATTERN.get()), 7, 0, 1),
                new SimpleTrade(new ItemCost(Items.EMERALD), Optional.empty(), new ItemStack(ModItems.FALLEN_STAR_PATTERN.get()), 7, 0, 1),
                new SimpleTrade(new ItemCost(Items.EMERALD), Optional.empty(), new ItemStack(ModItems.SWORD_PATTERN.get()), 7, 0, 1),
                new SimpleTrade(new ItemCost(Items.EMERALD), Optional.empty(), new ItemStack(ModItems.WEIRWOOD_PATTERN.get()), 7, 0, 1),
                new SimpleTrade(new ItemCost(Items.EMERALD), Optional.empty(), new ItemStack(ModItems.CARRIED_SHIELD_PATTERN.get()), 7, 0, 1),
                new SimpleTrade(new ItemCost(Items.EMERALD), Optional.empty(), new ItemStack(ModItems.SEAHORSE_PATTERN.get()), 7, 0, 1),
                new SimpleTrade(new ItemCost(Items.EMERALD), Optional.empty(), new ItemStack(ModItems.BEACON_PATTERN.get()), 7, 0, 1),
                new SimpleTrade(new ItemCost(Items.EMERALD), Optional.empty(), new ItemStack(ModItems.HIGHTOWER_PATTERN.get()), 7, 0, 1),
                new SimpleTrade(new ItemCost(Items.EMERALD), Optional.empty(), new ItemStack(ModItems.GRAPE_PATTERN.get()), 7, 0, 1),
                new SimpleTrade(new ItemCost(Items.EMERALD), Optional.empty(), new ItemStack(ModItems.SCYTHE_PATTERN.get()), 7, 0, 1),
                new SimpleTrade(new ItemCost(Items.EMERALD), Optional.empty(), new ItemStack(ModItems.HORN_PATTERN.get()), 7, 0, 1),
                new SimpleTrade(new ItemCost(Items.EMERALD), Optional.empty(), new ItemStack(ModItems.BONEHAND_PATTERN.get()), 7, 0, 1),
                new SimpleTrade(new ItemCost(Items.EMERALD), Optional.empty(), new ItemStack(ModItems.SEVEN_PATTERN.get()), 7, 0, 1),
                new SimpleTrade(new ItemCost(Items.EMERALD), Optional.empty(), new ItemStack(ModItems.WYL_PATTERN.get()), 7, 0, 1),
                new SimpleTrade(new ItemCost(Items.EMERALD), Optional.empty(), new ItemStack(ModItems.HOG_PATTERN.get()), 7, 0, 1),
                new SimpleTrade(new ItemCost(Items.EMERALD), Optional.empty(), new ItemStack(ModItems.SHIELD_PATTERN.get()), 7, 0, 1),
                new SimpleTrade(new ItemCost(Items.EMERALD), Optional.empty(), new ItemStack(ModItems.APPLE_PATTERN.get()), 7, 0, 1),
                new SimpleTrade(new ItemCost(Items.EMERALD), Optional.empty(), new ItemStack(ModItems.HIVES_PATTERN.get()), 7, 0, 1),
                new SimpleTrade(new ItemCost(Items.EMERALD), Optional.empty(), new ItemStack(ModItems.HUNTER_PATTERN.get()), 7, 0, 1),
                new SimpleTrade(new ItemCost(Items.EMERALD), Optional.empty(), new ItemStack(ModItems.HORSE_HEAD_PATTERN.get()), 7, 0, 1),
                new SimpleTrade(new ItemCost(Items.EMERALD), Optional.empty(), new ItemStack(ModItems.PRANCING_HORSE_PATTERN.get()), 7, 0, 1),
                new SimpleTrade(new ItemCost(Items.EMERALD), Optional.empty(), new ItemStack(ModItems.CIRCLES_PATTERN.get()), 7, 0, 1),
                new SimpleTrade(new ItemCost(Items.EMERALD), Optional.empty(), new ItemStack(ModItems.TWO_TOWERS_PATTERN.get()), 7, 0, 1),
                new SimpleTrade(new ItemCost(Items.EMERALD), Optional.empty(), new ItemStack(ModItems.THREE_TOWERS_PATTERN.get()), 7, 0, 1),
        };

        WANDERING_TRADER_TRADES = new VillagerTrades.ItemListing[] {
                new SimpleTrade(new ItemCost(Items.EMERALD), Optional.empty(), new ItemStack(ModItems.GOLD_CLOAK_RIGHT_DECORATION.get()), 5, 0, 1),
                new SimpleTrade(new ItemCost(Items.EMERALD), Optional.empty(), new ItemStack(ModItems.GOLD_CLOAK_LEFT_DECORATION.get()), 5, 0, 1),
                new SimpleTrade(new ItemCost(Items.EMERALD), Optional.empty(), new ItemStack(ModItems.FANCY_CAPE_DECORATION.get()), 5, 0, 1),
                new SimpleTrade(new ItemCost(Items.EMERALD), Optional.empty(), new ItemStack(ModItems.DRAGON_DECORATION.get()), 5, 0, 1),
        };
        WANDERING_TRADER_TRADES_RARE = new VillagerTrades.ItemListing[] {
                new SimpleTrade(new ItemCost(Items.EMERALD, 48), Optional.empty(), new ItemStack(ModItems.AEGON_CROWN_DECORATION.get()), 1, 0, 2),
        };

        TradeRegistry.registerVillagerTrade(VillagerProfession.SHEPHERD, 1, ModMerchantOffers.SHEPHERD_TRADES);
        TradeRegistry.registerTradeForWanderingTrader(false, ModMerchantOffers.WANDERING_TRADER_TRADES);
        TradeRegistry.registerTradeForWanderingTrader(true, ModMerchantOffers.WANDERING_TRADER_TRADES_RARE);
    }
}
