package ec.edu.uce.model.objects;

import ec.edu.uce.interfaces.IDraw;

import java.awt.*;

public class Circle implements IDraw {
    private int x =50, y=50, width=100, height=100;
    private Color color = Color.ORANGE;


    @Override
    public void draw(Graphics g) {
        g.setColor(color);
        g.fillOval(x, y, width, height);
    }
}
