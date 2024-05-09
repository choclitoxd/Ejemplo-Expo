package co.edu.uniquindio.flyweight.model.assets;

import java.util.ArrayList;
import java.util.List;

public class Prefab {
    private static int id;
    private String name;
    private List<Animation> animations;
    private List<Texture> textures;
    private List<Sound> sounds;

    public Prefab(List<Animation> animations, List<Texture> textures, List<Sound> sounds) {
        this.name = "Prefab" + id;
        this.animations = animations;
        this.textures = textures;
        this.sounds = sounds;
        id++;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Animation> getAnimations() {
        return animations;
    }

    public List<Texture> getTextures() {
        return textures;
    }

    public List<Sound> getSounds() {
        return sounds;
    }

    @Override
    public String toString() {
        return "Prefab{" +
                "name='" + name + '\'' +
                ", animations=" + animations +
                ", textures=" + textures +
                ", sounds=" + sounds +
                '}';
    }
}
