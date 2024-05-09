package co.edu.uniquindio.flyweight.factory;

import co.edu.uniquindio.flyweight.model.Npc;
import co.edu.uniquindio.flyweight.model.assets.AssetsPrefab;
import co.edu.uniquindio.flyweight.model.assets.Prefab;

public class NpcFactory {
    public static Npc createNpc(Prefab prefab){
        Prefab prefabNew = AssetsPrefab.getPrefab(prefab);
        Npc npc = new Npc(prefab);
        return npc;
    }
}
