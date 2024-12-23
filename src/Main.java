import javax.swing.*;
import javax.swing.ImageIcon;
import java.awt.*;

class WeihnachtsGUI extends JFrame {


    public WeihnachtsGUI () {
    }

    public static void main(String[] args) {
        WeihnachtsGUI gui = new WeihnachtsGUI(); // Erzeugung eines Fensters
        gui.setTitle("WeihnachtsGUI"); // Setzt den Titel des Fensters
        gui.setSize(1000, 600); // Initialiserung der Größe und Breite des Fensters
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // X Button schließt das Fenster
        gui.setVisible(true); // macht das Fenster sichbar
        gui.setLayout(new BorderLayout());
        ImageIcon logo = new ImageIcon("src/logo.jpg"); // Erzeugung eines Logos
        gui.setIconImage(logo.getImage()); // Veränderung des Fensterlogos
        Leinwand panel1 = new Leinwand();
        panel1.setBackground(Color.BLUE);
        Leinwand panel2 = new Leinwand();
        gui.add(panel1, BorderLayout.CENTER);
        gui.add(panel2, BorderLayout.EAST);
        //panel2.setSize(new Dimension(500,600));
    }
}

class Leinwand extends JPanel {
public Leinwand() {
  //super.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 5))
  // super.setBackground(Color.BLUE);
  //super.setPreferredSize(new Dimension(500,500));
}
}

