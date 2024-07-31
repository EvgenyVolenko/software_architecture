package Lesson_01.store3D.models;

public class Camera implements IMover {

    private static int counter = 100;

    private int id;
    private Point3D location;
    private Angle3D angle;

    public Camera(Point3D location, Angle3D angle) {
        id = ++counter;
        this.location = location;
        this.angle = angle;
    }

    public int getId() {
        return id;
    }

    @Override
    public void rotate(Angle3D newAngle) {
        this.angle = newAngle;
    }

    @Override
    public void move(Point3D newLocation) {
        this.location = newLocation;
    }

}
