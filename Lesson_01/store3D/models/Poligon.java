package Lesson_01.store3D.models;

import java.util.List;

public class Poligon {

    private List<Point3D> points;

    public void setPoints(List<Point3D> points) {
        this.points = points;
    }

    public Poligon(List<Point3D> points) {
        this.points = points;
    }

    public Poligon() {

    }
}
