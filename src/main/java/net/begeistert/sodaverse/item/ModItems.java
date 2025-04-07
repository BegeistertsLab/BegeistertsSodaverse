package net.begeistert.sodaverse.item;

import net.begeistert.sodaverse.BegeistertsSodaverse;
import net.begeistert.sodaverse.block.ModBlocks;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    //setting up items
    public static final Item ABHORRENT_SODAIUM = registerItem("abhorrent_sodaium",
            new Item(new FabricItemSettings()));

    public static final Item IMPURE_ABHORRENT_SODAIUM = registerItem("impure_abhorrent_sodaium",
            new Item(new FabricItemSettings()));

    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier(BegeistertsSodaverse.MOD_ID, name), item);
    }

    //adding to creative tabs
    private static void ItemGroupIngredients(FabricItemGroupEntries entries) {
        entries.add(ABHORRENT_SODAIUM);
        entries.add(IMPURE_ABHORRENT_SODAIUM);

        entries.add(ModBlocks.BLOCK_OF_ABHORRENT_SODAIUM);
    }

    public static void registerModItems(){
        BegeistertsSodaverse.LOGGER.info("Registering items for "+ BegeistertsSodaverse.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::ItemGroupIngredients);

        BegeistertsSodaverse.LOGGER.info("Finished!");
    }
}
