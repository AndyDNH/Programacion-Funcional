package ec.edu.uce.model.objects;

import ec.edu.uce.interfaces.IDraw;

import java.awt.*;

public class Square implements IDraw {
    private int x =50, y=50, width=100, height=100;
    private Color color = Color.getHSBColor(0.7f, 0.3f, 0.3f);




    @Override
    public void draw(Graphics g) {
//        g.clearRect(0, 0, g.getWidth(), g.getHeight());
        g.setColor(color);
        g.fillRect(x, y, width, height);

    }
}
