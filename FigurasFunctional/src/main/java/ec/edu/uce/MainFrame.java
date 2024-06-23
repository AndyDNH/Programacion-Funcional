package ec.edu.uce;



import ec.edu.uce.controller.Controlador;
import ec.edu.uce.interfaces.IDraw;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    private JButton boton1, boton2, boton3;
    private JPanel panelDibujo;
    private Controlador controlador = new Controlador();
    Graphics g = null;

    public MainFrame() {
        setTitle("Figuras Geometricas - UCE");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Botones
        boton1 = new JButton("Triangulo");
        boton2 = new JButton("Cuadrado");
        boton3 = new JButton("Circulo");

        boton1.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        boton2.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        boton3.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));



        panelDibujo = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);


            }

            @Override
            public Dimension getPreferredSize() {
                return new Dimension(300, 200);
            }
        };


        //Triangulo
        boton1.addActionListener((e) -> {
            drawFunction(panelDibujo.getGraphics(), (g) -> {
                g.setColor(Color.getHSBColor(0.5f, 0.5f, 0.5f));
                g.clearRect(0, 0, panelDibujo.getWidth(), panelDibujo.getHeight());
                int[] x = {50, 100, 150};
                int[] y = {150, 50, 150};
                g.fillPolygon(x, y, 3);
            });
        }
        );

        //Cuadrado
        boton2.addActionListener((e) -> {
                g = panelDibujo.getGraphics();
                g.clearRect(0, 0, panelDibujo.getWidth(), panelDibujo.getHeight());
                drawFunction(g, controlador::draw);
        });

        //Circulo
        boton3.addActionListener((e) -> {
                Graphics g = panelDibujo.getGraphics();
                g.clearRect(0, 0, panelDibujo.getWidth(), panelDibujo.getHeight());
                drawFunction(g, controlador::drawCircle);
        });


        JPanel panelBotones = new JPanel();
        // Configura el layout del panel para que sea vertical
        panelBotones.setLayout(new BoxLayout(panelBotones, BoxLayout.PAGE_AXIS));
        panelBotones.add(boton1);
        panelBotones.add(boton2);
        panelBotones.add(boton3);

        getContentPane().setLayout(new BorderLayout());
        getContentPane().add(panelBotones, BorderLayout.EAST);
        getContentPane().add(panelDibujo, BorderLayout.CENTER);
    }


    public void drawFunction(Graphics g, IDraw d){
        d.draw(g);
    }


}