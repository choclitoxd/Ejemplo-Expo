package co.edu.uniquindio.flyweight.model.assets;

public class Sound {
    private String sound;

    public Sound(String sound) {
        this.sound = sound;
    }

    public String getSound() {
        return sound;
    }

    @Override
    public String toString() {
        return "Sounds{" +
                "sound='" + sound + '\'' +
                '}';
    }
}
