package org.example.ModelElements;

public class Flash {

    public Point3D location;
    public Angle3D angle;
    public Color color;
    public Float power;

    public void Rotate(Angle3D angle) {
        this.angle = angle;
    }

    public void Move(Point3D location) {
        this.location = location;
    }

}
