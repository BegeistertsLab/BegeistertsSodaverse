package net.begeistert.sodaverse.block;

import net.begeistert.sodaverse.BegeistertsSodaverse;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {

    public static final Block BLOCK_OF_ABHORRENT_SODAIUM = registerBlock("block_of_abhorrent_sodaium",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));

    private static Block registerBlock(String name, Block block){
        registerBlockItem(name,block);
        return Registry.register(Registries.BLOCK, new Identifier(BegeistertsSodaverse.MOD_ID, name),block);
    }

    private static Item registerBlockItem(String name, Block block){
        return Registry.register(Registries.ITEM, new Identifier(BegeistertsSodaverse.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }




    public static void registerModBlocks(){
        BegeistertsSodaverse.LOGGER.info("Registering blocks for "+ BegeistertsSodaverse.MOD_ID);


        BegeistertsSodaverse.LOGGER.info("Finished!");
    }
}
