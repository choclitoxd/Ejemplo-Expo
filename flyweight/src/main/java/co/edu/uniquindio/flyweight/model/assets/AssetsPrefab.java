package co.edu.uniquindio.flyweight.model.assets;

import java.util.HashMap;
import java.util.Map;

public class AssetsPrefab {
    private static Map<Integer,Prefab> prefabMap= new HashMap<>();
    public static Prefab getPrefab(Prefab prefab){
        int id = prefab.getId();
        if(!prefabMap.containsKey(id))
            prefabMap.put(id,prefab);
        return prefabMap.get(id);
    }
}
