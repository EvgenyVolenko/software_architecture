package Lesson_01.store3D.models;

public interface IMover {

    public void rotate(Angle3D newAngle);

    public void move(Point3D newLocation);
}
