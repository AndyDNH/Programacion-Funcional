package ec.edu.uce.controller;

import ec.edu.uce.model.objects.Circle;
import ec.edu.uce.model.objects.Square;
import ec.edu.uce.model.objects.Triangle;

import java.awt.*;

public class Controlador {

    Square square = new Square();
    Circle circle = new Circle();
    Triangle triangle = new Triangle();

    public void draw(Graphics g) {
        square.draw(g);
    }

    public void drawCircle(Graphics g) {
        circle.draw(g);
    }

    public void drawTriangle(Graphics g) {
        triangle.draw(g);
    }


}
