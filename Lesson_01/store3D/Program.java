package Lesson_01.store3D;

import java.util.ArrayList;
import java.util.List;

import Lesson_01.store3D.inmemory.ModelStore;
import Lesson_01.store3D.inmemory.Observer1;
import Lesson_01.store3D.models.Angle3D;
import Lesson_01.store3D.models.Camera;
import Lesson_01.store3D.models.Flash;
import Lesson_01.store3D.models.Point3D;
import Lesson_01.store3D.models.Poligon;
import Lesson_01.store3D.models.PoligonalModel;
import Lesson_01.store3D.models.Scene;

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

        List<PoligonalModel> models = new ArrayList<>();
        models.add(poligonalModel);

        Flash flash = new Flash(new Point3D(13, 14, 15), new Angle3D(16, 17, 18), "Красный", (float) 19);

        List<Flash> flashes = new ArrayList<>();
        flashes.add(flash);

        Camera camera1 = new Camera(new Point3D(1, 2, 3), new Angle3D(4, 5, 6));
        Camera camera2 = new Camera(new Point3D(7, 8, 9), new Angle3D(10, 11, 12));

        Scene scene1 = new Scene(models, camera1);
        Scene scene2 = new Scene(models, flashes, camera2);

        System.out.println(scene1.toString());
        System.out.println();
        System.out.println(scene2.toString());
    }
}
