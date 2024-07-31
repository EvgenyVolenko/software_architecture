package Lesson_01.store3D.models;

public class Flash implements IMover {

    private static int counter = 3000;

    private int id;
    private Point3D location;
    private Angle3D angle;
    private String color;
    private Float power;

    public Flash(Point3D location, Angle3D angtle, String color, Float power) {
        this.location = location;
        this.angle = angtle;
        this.color = color;
        this.power = power;
        id = ++counter;
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
