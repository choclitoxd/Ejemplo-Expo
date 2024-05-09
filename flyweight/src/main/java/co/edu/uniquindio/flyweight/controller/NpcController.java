package co.edu.uniquindio.flyweight.controller;

import co.edu.uniquindio.flyweight.factory.ModelFactory;
import co.edu.uniquindio.flyweight.model.Npc;
import co.edu.uniquindio.flyweight.model.assets.Animation;
import co.edu.uniquindio.flyweight.model.assets.Prefab;
import co.edu.uniquindio.flyweight.model.assets.Sound;
import co.edu.uniquindio.flyweight.model.assets.Texture;

import java.util.List;

public class NpcController {
    ModelFactory modelFactory;
    public NpcController() {
        modelFactory = ModelFactory.getInstance();

    }
    public List<Npc> obtenerNpc(){
        return modelFactory.obtenerNpc();
    }

    public List<String> obtenerSounds() {
        return modelFactory.obtenerSounds();
    }

    public List<String> obtenerTextura() {
        return modelFactory.obtenerTextura();
    }

    public List<Animation> obtenerAnimacionLista(int p) {
        return modelFactory.obtenerAnimacionLista(p);
    }

    public List<Texture> obtenerListaTextura(int numero) {
        return modelFactory.obtenerListaTextura(numero);
    }

    public List<Sound> obtenerlistaSounds(int p) {
        return modelFactory.obtenerlistaSounds(p);
    }

    public boolean agregarPrefab(Prefab prefab) {
        return modelFactory.agregarPrefab(prefab);
    }

    public boolean addNpc(Npc npc) {
        return modelFactory.addNpc(npc);
    }
    public List<String> obtnerAnimaciones(){
        return modelFactory.obtnerAnimaciones();
    }

    public Prefab obtenerPrefab(Prefab prefab) {
        return modelFactory.obtenerPrefab(prefab);
    }
}
