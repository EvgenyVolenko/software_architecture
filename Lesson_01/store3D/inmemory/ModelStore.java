package Lesson_01.store3D.inmemory;

import java.util.ArrayList;
import java.util.List;

import Lesson_01.store3D.models.Camera;
import Lesson_01.store3D.models.Flash;
import Lesson_01.store3D.models.PoligonalModel;
import Lesson_01.store3D.models.Scene;

public class ModelStore implements IModelChanger {

    private List<ModelChangedObserver> observers = new ArrayList<>();

    private List<PoligonalModel> models = new ArrayList<>();
    private List<Flash> flashes = new ArrayList<>();
    private List<Scene> scenes = new ArrayList<>();
    private List<Camera> cameras = new ArrayList<>();

    public void add(PoligonalModel model) {
        models.add(model);
        notifyChange();
    }

    public Scene getScena(int id) {
        Scene scena = this.scenes.get(id);
        return scena;
    }

    @Override
    public void notifyChange() {
        for (ModelChangedObserver observer : observers) {
            observer.applyUpdateModel();
        }
    }

    @Override
    public void RegisterModelChanger(ModelChangedObserver o) {
        observers.add(o);
    }

    @Override
    public void RemoveModelChanger(ModelChangedObserver o) {
        observers.remove(o);
    }
}
