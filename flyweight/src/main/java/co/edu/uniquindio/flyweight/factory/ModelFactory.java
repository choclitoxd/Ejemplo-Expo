package co.edu.uniquindio.flyweight.factory;

import co.edu.uniquindio.flyweight.model.Npc;
import co.edu.uniquindio.flyweight.model.ServerVideoJuego;
import co.edu.uniquindio.flyweight.model.assets.Animation;
import co.edu.uniquindio.flyweight.model.assets.Prefab;
import co.edu.uniquindio.flyweight.model.assets.Sound;
import co.edu.uniquindio.flyweight.model.assets.Texture;

import java.util.Arrays;
import java.util.List;

public class ModelFactory {
    private static ModelFactory modelFactory;

    private ServerVideoJuego serverVideoJuego = new ServerVideoJuego("PablitoRow");

    private ModelFactory(){
        inicializarDatos();
    }

    public static  ModelFactory getInstance(){
        if (modelFactory == null){
            modelFactory = new ModelFactory();
        }
        return modelFactory;
    }
    private void inicializarDatos() {
        List<Animation> animations= Arrays.asList(
                new Animation("walk"),
                new Animation("run")
        );
        List<Texture>textures= Arrays.asList(
                new Texture("texture1"),
                new Texture("texture2")
        );
        List<Sound>sounds= Arrays.asList(
                new Sound("bla"),
                new Sound("ble")
        );
        Prefab prefab1 = new Prefab(animations,textures,sounds);

        Npc npc1 = new Npc(prefab1);
        serverVideoJuego.addListNpc(npc1);
        Npc npc2 = new Npc(prefab1);
        serverVideoJuego.addListNpc(npc2);

        List<Animation> animations2= Arrays.asList(
                new Animation("flight"),
                new Animation("swim")
        );
        List<Texture>textures2= Arrays.asList(
                new Texture("texture3"),
                new Texture("texture4")
        );
        List<Sound>sounds2= Arrays.asList(
                new Sound("sha"),
                new Sound("she")
        );
        Prefab prefab2 = new Prefab(animations2,textures2,sounds2);
        Npc npc3 = new Npc(prefab2);
        serverVideoJuego.addListNpc(npc3);
        Npc npc4 = new Npc(prefab2);
        serverVideoJuego.addListNpc(npc4);
        serverVideoJuego.addListPreFab(prefab1);
        serverVideoJuego.addListPreFab(prefab2);
    }
    public List<Npc> obtenerNpc(){
        return serverVideoJuego.getListNpc();
    }

    public List<String> obtnerAnimaciones() {
        return serverVideoJuego.obtenerAnimaciones();
    }

    public List<String> obtenerSounds() {
        return serverVideoJuego.obtenerSounds();
    }

    public List<String> obtenerTextura() {
        return serverVideoJuego.obtenerTextura();
    }

    public List<Animation> obtenerAnimacionLista(int p) {
        return serverVideoJuego.obtenerAnimacionLista(p);
    }

    public List<Texture> obtenerListaTextura(int p) {
        return serverVideoJuego.obtenerListaTextura(p);
    }

    public List<Sound> obtenerlistaSounds(int p) {
        return serverVideoJuego.obtenerlistaSounds(p);
    }

    public boolean agregarPrefab(Prefab prefab) {
        return serverVideoJuego.addListPreFab(prefab);
    }

    public boolean addNpc(Npc npc) {
        return serverVideoJuego.addListNpc(npc);
    }

    public Prefab obtenerPrefab(Prefab prefab) {
        return serverVideoJuego.equalsPrefab(prefab);
    }
}
