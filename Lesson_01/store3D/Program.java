package Lesson_01.store3D;

import java.util.ArrayList;
import java.util.List;

import Lesson_01.store3D.inmemory.ModelStore;
import Lesson_01.store3D.inmemory.Observer1;
import Lesson_01.store3D.models.Poligon;
import Lesson_01.store3D.models.PoligonalModel;

public class Program {
    public static void main(String[] args) {

        Observer1 observer1 = new Observer1();

        ModelStore store = new ModelStore();

        store.RegisterModelChanger(observer1);

        Poligon poligon1 = new Poligon();

        List<Poligon> poligons = new ArrayList<>();
        poligons.add(poligon1);

        PoligonalModel poligonalModel = new PoligonalModel(poligons);
        store.add(poligonalModel);
    }
}
