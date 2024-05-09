package co.edu.uniquindio.flyweight.model.assets;

public class Animation {
    private String animation;

    public Animation(String animation) {
        this.animation = animation;
    }

    public String getAnimation() {
        return animation;
    }

    @Override
    public String toString() {
        return "Animation{" +
                "animation='" + animation + '\'' +
                '}';
    }
}
