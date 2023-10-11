package fontjpanel;
import javax.swing.JFrame;

/**
 *
 * @author maryse
 */
public class TiposDeLetra {

    // ejecuta la aplicación
    public static void main(String args[]) {

        // crea marco para FontJPanel
        JFrame marco = new JFrame("Uso de tipos de letra");
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        FontJPanel fontJPanel = new FontJPanel(); // crea objeto FontJPanel
        marco.add(fontJPanel); // agrega objeto fontJPanel al marco
        marco.setSize(475, 170); // establece el tamaño del marco
        marco.setVisible(true); // muestra el marco
    } // ﬁn de main
} // ﬁn de la clase TiposDeLetra
