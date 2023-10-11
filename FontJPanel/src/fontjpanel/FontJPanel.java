package fontjpanel;
import java.awt.Font;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author maryse
 * 
 * La aplicación muestra texto en cuatro tipos de letra distintos, con cada tipo
 * de letra en diferente tamaño. 
 * La aplicación utiliza el constructor de Font para inicializar objetos Font 
 * que se pasan al método setFont de Graphics para cambiar el tipo de letra para
 * dibujar. 
 * Cada llamadaal constructor de Font pasa un nombre de tipo de letra 
 * (Serif, Monospaced, o SansSerif) como una cadena, un estilo de tipo de letra 
 * (Font.PLAIN, Font.ITALIC o Font.BOLD) y un tamaño de tipo de letra.
 */
public class FontJPanel extends JPanel {

    // muestra objetos String en distintos tipos de letra y colores
    public void paintComponent(Graphics g) {
        super.paintComponent(g); // llama al método paintComponent de la superclase
        // establece el tipo de letra a Serif (Times), negrita, 12 puntos y dibuja una cadena
        g.setFont(new Font("Serif", Font.BOLD, 12));
        g.drawString("Serif 12 puntos, negrita.", 20, 50);
        
        // establece el tipo de letra a Monospaced (Courier), cursiva, 24 puntos y dibuja una cadena
        g.setFont(new Font("Monospaced", Font.ITALIC, 24));
        g.drawString("Monospaced 24 puntos, cursiva.", 20, 70);
        
        // establece el tipo de letra a SansSerif (Helvetica), simple, 14 puntos y dibuja  una cadena
        g.setFont(new Font("SansSerif", Font.PLAIN, 14));
        g.drawString("SansSerif 14 puntos, simple.", 20, 90);
        
        // establece el tipo de letra a Serif (Times), negrita/cursiva, 18 puntos y dibuja una cadena
        g.setColor(Color.RED);
        g.setFont(new Font("Serif", Font.BOLD + Font.ITALIC, 18));
        g.drawString(g.getFont().getName() + " " + g.getFont().getSize()
                + " puntos, negrita cursiva.", 20, 110);
    } // ﬁn del método paintComponent
} // ﬁn de la clase FontJPanel
