package Mypackage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ServiceShape {

    @Autowired
    private Circle circle;
    @Autowired
    private Triangle triangle;

    public Circle getCircle() {
        System.out.println("Inside getCircle");
        return circle;
    }

    public void setCircle(Circle circle) {
        this.circle = circle;
    }

    public Triangle getTriangle() {
        return triangle;
    }

    public void setTriangle(Triangle triangle) {
        this.triangle = triangle;
    }
}
