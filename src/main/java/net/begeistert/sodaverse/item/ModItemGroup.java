package net.begeistert.sodaverse.item;


import net.begeistert.sodaverse.BegeistertsSodaverse;
import net.begeistert.sodaverse.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup SODAVERSE_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(BegeistertsSodaverse.MOD_ID, "sodaverse_group"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.sodaverse"))
                    .icon(() ->new ItemStack(ModItems.ABHORRENT_SODAIUM)).entries((displayContext, entries) -> {
                        entries.add(ModItems.ABHORRENT_SODAIUM);
                        entries.add(ModItems.IMPURE_ABHORRENT_SODAIUM);

                        entries.add(ModBlocks.BLOCK_OF_ABHORRENT_SODAIUM);
                    }).build());

    public static void registerItemGroups(){

    }
}
