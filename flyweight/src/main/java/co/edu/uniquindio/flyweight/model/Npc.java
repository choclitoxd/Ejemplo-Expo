package co.edu.uniquindio.flyweight.model;

import co.edu.uniquindio.flyweight.model.assets.Prefab;
import javafx.scene.Parent;

import java.util.ArrayList;
import java.util.List;

public class Npc {
    private static final int MASX_HEALTH = 100;
    private static int id;
    private String name;
    private int health;
    private Coordinates coordinates;
    private Prefab prefab;

    public Npc(Prefab prefab) {
        this.name = "NPC" + id;
        this.health = MASX_HEALTH;
        this.coordinates = Coordinates.getCoordinates();
        this.prefab=prefab;
        id++;
    }

    public  int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public Coordinates getCoordinates() {
        return coordinates;
    }

    public Prefab getPrefab() {
        return prefab;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setCoordinates(Coordinates coordinates) {
        this.coordinates = coordinates;
    }

    public void setPrefab(Prefab prefab) {
        this.prefab = prefab;
    }

    public void showNpc(){
        System.out.println("name: " + name);
        System.out.println("health: " + health);
        System.out.println(coordinates);
        System.out.println("=== Prefab ====");
        System.out.println(prefab);
    }
}
