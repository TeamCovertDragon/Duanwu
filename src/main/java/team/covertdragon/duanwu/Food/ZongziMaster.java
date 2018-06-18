package team.covertdragon.duanwu.Food;

import java.util.HashMap;
import java.util.Map;

/**
 * Central manager of all zongzi-related objects.
 */
public final class ZongziMaster {

    public static final ZongziMaster INSTANCE = new ZongziMaster();

    private final Map<String, ZongziFlavor> flavorRegistry;

    private ZongziMaster() {
        flavorRegistry = new HashMap<>();
    }

    public void registerNewFlavor(final String id, final ZongziFlavor flavor) {
        this.flavorRegistry.putIfAbsent(id, flavor);
    }

    public ZongziFlavor lookup(final String id) {
        return this.flavorRegistry.get(id);
    }
}
