package net.lennilid.tutorial.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.lennilid.tutorial.Tutorial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item OrangeFruit = registerItem("orange_fruit", new Item(new Item.Settings()));
    public static final Item Banana = registerItem("banana", new Item(new Item.Settings()));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(Tutorial.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Tutorial.LOGGER.info("Registering Mod Items for " + Tutorial.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(content -> {
            content.add(OrangeFruit);
            content.add(Banana);
        });
    }
}