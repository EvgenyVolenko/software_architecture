package Lesson_01.store3D.inmemory;

public interface IModelChanger {

    /**
     * Произошло изменение в хранилище моделей
     */

    void notifyChange();

    void RegisterModelChanger(ModelChangedObserver o);

    void RemoveModelChanger(ModelChangedObserver o);
}
