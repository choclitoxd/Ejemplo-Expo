package co.edu.uniquindio.flyweight.model.assets;

public class Texture {
    private String texture;

    public Texture(String texture) {
        this.texture = texture;
    }

    public String getTexture() {
        return texture;
    }

    @Override
    public String toString() {
        return "Textures{" +
                "texture='" + texture + '\'' +
                '}';
    }
}
