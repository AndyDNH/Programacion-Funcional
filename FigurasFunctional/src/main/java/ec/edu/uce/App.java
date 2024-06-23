package ec.edu.uce;

import javax.swing.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        SwingUtilities.invokeLater(() -> {
                MainFrame figuras = new MainFrame();
                figuras.setVisible(true);

        });
    }
}
