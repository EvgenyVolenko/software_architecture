package Lesson_01.store3D.models;

import java.util.List;

import javax.sound.sampled.AudioFileFormat.Type;

public class Scene {

    private static int counter = 500;

    private int id;
    private List<PoligonalModel> models;
    private List<Flash> flashes;
    private Camera camera;

    public Scene(List<PoligonalModel> models, List<Flash> flashes, Camera camera) {
        id = ++counter;
        this.models = models;
        this.flashes = flashes;
        this.camera = camera;
    }

    public Scene(List<PoligonalModel> models, Camera camera) {
        id = ++counter;
        this.models = models;
        this.camera = camera;
    }

    public int getId() {
        return id;
    }

    public Type method1(Type type) {
        return type;
    }

    public Type method2(Type type) {
        return type;
    }

    @Override
    public String toString() {
        return "Scene [id=" + id + ", models=" + models + ", flashes=" + flashes + ", camera=" + camera + "]";
    }

}
