package co.edu.uniquindio.flyweight.model;

import co.edu.uniquindio.flyweight.model.assets.Animation;
import co.edu.uniquindio.flyweight.model.assets.Prefab;
import co.edu.uniquindio.flyweight.model.assets.Sound;
import co.edu.uniquindio.flyweight.model.assets.Texture;

import java.util.ArrayList;
import java.util.List;

public class ServerVideoJuego {
    private List<Npc> listNpc;
    private List<Prefab> listPrefab;
    private String name;

    public ServerVideoJuego(String name) {
        this.listNpc  = new ArrayList<>();
        this.listPrefab = new ArrayList<>();
        this.name = name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Npc equalsNpc(String name){
        Npc equals = null;
        if (!listNpc.isEmpty()) {
            for (Npc npc:listNpc){
                if (npc.getName().equals(name)){
                    equals = npc;
                    break;
                }
            }
        }
        return equals;
    }
    public boolean addListNpc(Npc npc){
        boolean add = true;
        if (equalsNpc(npc.getName()) == null){
            listNpc.add(npc);
        }else {
            add = false;
        }
        return add;
    }
    public boolean deleteListaNpc(String name){
        boolean delete = true;
        Npc npcDelete = equalsNpc(name);
        if (npcDelete != null){
            listNpc.remove(npcDelete);
        }else{
            delete = false;
        }
        return delete;
    }
    public Prefab equalsPrefab(Prefab prefabNuevo){
        Prefab equals = null;
        if (!listPrefab.isEmpty()) {
            for (Prefab prefab:listPrefab){
                if (prefab.getTextures().equals(prefabNuevo.getTextures())&&prefab.getAnimations().equals(prefabNuevo.getAnimations())){
                    equals = prefab;
                    break;
                }
            }
        }
        return equals;
    }
    public boolean addListPreFab(Prefab prefab){
        boolean add = true;
        if (equalsPrefab(prefab) == null){
            listPrefab.add(prefab);
        }else {
            add = false;
        }
        return add;
    }
    public boolean deleteListPrefab(int id){
        boolean delete =  false;
        for (Prefab prefab:listPrefab){
            if (prefab.getId()==id){
                listPrefab.remove(prefab);
                delete = true;
                break;
            }
        }
        return delete;
    }

    public List<Npc> getListNpc() {
        System.out.println(listNpc);
        return listNpc;
    }

    public List<String> obtenerAnimaciones() {
        List<String> listaAnimaciones = new ArrayList<>();
        int contador = 0;
        for (Prefab prefab:this.listPrefab){
            String mensaje = "Animacion " + contador + ": ";
            for (Animation animation:prefab.getAnimations()){
                mensaje += animation.getAnimation() + " ";
            }
            listaAnimaciones.add(mensaje);
            contador ++;
        }
        return listaAnimaciones;
    }
    public List<String> obtenerSounds() {
        List<String> listaSounds = new ArrayList<>();
        int contador = 0;
        for (Prefab prefab:this.listPrefab){
            String mensaje = "Voz " + contador + ": ";
            for (Sound sound:prefab.getSounds()){
                mensaje += sound.getSound() + " ";
            }
            listaSounds.add(mensaje);
            contador ++;
        }
        return listaSounds;
    }

    public List<String> obtenerTextura() {
        List<String> listaTextura = new ArrayList<>();
        int contador = 0;
        for (Prefab prefab:this.listPrefab){
            String mensaje = "Textura " + contador + ": ";
            for (Texture texture:prefab.getTextures()){
                mensaje += texture.getTexture() + " ";
            }
            listaTextura.add(mensaje);
            contador ++;
        }
        return listaTextura;
    }

    public List<Animation> obtenerAnimacionLista(int posicion) {
        List<Animation>litaAnimations;
        System.out.println(posicion);
        litaAnimations = listPrefab.get(posicion).getAnimations();
        return litaAnimations;
    }

    public List<Texture> obtenerListaTextura(int p) {
        List<Texture> listaTextura;
        System.out.println(p);
        listaTextura = listPrefab.get(p).getTextures();
        return listaTextura;
    }

    public List<Sound> obtenerlistaSounds(int p) {
        List<Sound> listaSounds;
        System.out.println(p);
        listaSounds = listPrefab.get(p).getSounds();
        return listaSounds;
    }
}
