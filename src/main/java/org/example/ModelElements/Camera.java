package org.example.ModelElements;

public class Camera {

    public Point3D location;
    public Angle3D angle;

    public void Rotate(Angle3D angle) {
        this.angle = angle;
    }

    public void Move(Point3D location) {
        this.location = location;
    }
}
