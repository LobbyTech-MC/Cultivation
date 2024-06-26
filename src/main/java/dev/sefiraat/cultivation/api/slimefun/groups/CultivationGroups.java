package dev.sefiraat.cultivation.api.slimefun.groups;

import dev.sefiraat.cultivation.Cultivation;
import dev.sefiraat.cultivation.api.utils.CultivationThemes;
import dev.sefiraat.cultivation.implementation.slimefun.groups.PlantCodexFlexGroup;
import dev.sefiraat.cultivation.implementation.utils.Keys;
import dev.sefiraat.sefilib.slimefun.itemgroup.DummyItemGroup;
import dev.sefiraat.sefilib.slimefun.itemgroup.SimpleFlexGroup;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

/**
 * This class is used to store the ItemGroups used in this addon
 */
public final class CultivationGroups {

    private CultivationGroups() {
        throw new IllegalStateException("Utility class");
    }

    public static final SimpleFlexGroup MAIN = new SimpleFlexGroup(
        Cultivation.getInstance(),
        "农耕工艺",
        Keys.newKey("main"),
        new CustomItemStack(
            new ItemStack(Material.AZURE_BLUET),
            CultivationThemes.MAIN.color("农耕工艺")
        )
    );

    public static final DummyItemGroup HIDDEN_CONTENT = new DummyItemGroup(
        Keys.newKey("hidden"),
        new CustomItemStack(
            Material.BARRIER,
            "隐藏的物品",
            "这些物品不能被直接访问。"
        )
    );

    public static final DummyItemGroup CRAFTING = new DummyItemGroup(
        Keys.newKey("crafting"),
        new CustomItemStack(
            new ItemStack(Material.STICK),
            CultivationThemes.MAIN.color("合成材料")
        )
    );

    public static final DummyItemGroup TOOLS = new DummyItemGroup(
        Keys.newKey("tools"),
        new CustomItemStack(
            new ItemStack(Material.COMPASS),
            CultivationThemes.MAIN.color("工具")
        )
    );

    public static final DummyItemGroup MACHINES = new DummyItemGroup(
        Keys.newKey("machines"),
        new CustomItemStack(
            new ItemStack(Material.GLASS),
            CultivationThemes.MAIN.color("机器")
        )
    );

    public static final DummyItemGroup PLANTS = new DummyItemGroup(
        Keys.newKey("plants"),
        new CustomItemStack(
            new ItemStack(Material.MELON_SEEDS),
            CultivationThemes.MAIN.color("作物")
        )
    );

    public static final DummyItemGroup BUSHES = new DummyItemGroup(
        Keys.newKey("bushes"),
        new CustomItemStack(
            new ItemStack(Material.SWEET_BERRIES),
            CultivationThemes.MAIN.color("灌木")
        )
    );

    public static final DummyItemGroup TREES = new DummyItemGroup(
        Keys.newKey("trees"),
        new CustomItemStack(
            new ItemStack(Material.ACACIA_SAPLING),
            CultivationThemes.MAIN.color("树木")
        )
    );

    public static final DummyItemGroup PRODUCE = new DummyItemGroup(
        Keys.newKey("produce"),
        new CustomItemStack(
            new ItemStack(Material.APPLE),
            CultivationThemes.MAIN.color("产品")
        )
    );

    public static final DummyItemGroup BY_PRODUCTS = new DummyItemGroup(
        Keys.newKey("by-products"),
        new CustomItemStack(
            new ItemStack(Material.BEETROOT_SEEDS),
            CultivationThemes.MAIN.color("副产品")
        )
    );

    public static final DummyItemGroup FOODS = new DummyItemGroup(
        Keys.newKey("foods"),
        new CustomItemStack(
            new ItemStack(Material.BEETROOT_SOUP),
            CultivationThemes.MAIN.color("食物")
        )
    );

    public static final PlantCodexFlexGroup PLANT_CODEX = new PlantCodexFlexGroup(
        Keys.newKey("plant_codex"),
        new CustomItemStack(
            new ItemStack(Material.BEETROOT_SEEDS),
            CultivationThemes.MAIN.color("培育宝典")
        )
    );

    static {
        Cultivation plugin = Cultivation.getInstance();

        PLANTS.setCrossAddonItemGroup(true);
        BUSHES.setCrossAddonItemGroup(true);
        TREES.setCrossAddonItemGroup(true);

        // Slimefun Registry
        MAIN.register(plugin);
        HIDDEN_CONTENT.register(plugin);
        CRAFTING.register(plugin);
        TOOLS.register(plugin);
        MACHINES.register(plugin);

        PLANTS.register(plugin);
        BUSHES.register(plugin);
        TREES.register(plugin);
        PRODUCE.register(plugin);
        BY_PRODUCTS.register(plugin);
        FOODS.register(plugin);

        MAIN.addItemGroup(CRAFTING);
        MAIN.addItemGroup(TOOLS);
        MAIN.addItemGroup(MACHINES);
        MAIN.addItemGroup(PLANTS);
        MAIN.addItemGroup(BUSHES);
        MAIN.addItemGroup(TREES);
        MAIN.addItemGroup(PRODUCE);
        MAIN.addItemGroup(BY_PRODUCTS);
        MAIN.addItemGroup(FOODS);
        MAIN.addItemGroup(PLANT_CODEX);
    }
}
