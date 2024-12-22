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
        ImageIcon logo = new ImageIcon("src/logo.jpg"); // Erzeugung eines Logos
        gui.setIconImage(logo.getImage()); // Veränderung des Fensterlogos

    }
}

class Leinwand {





}

 /*JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout(FlowLayout.CENTER,10,5));
        // Veränderung der Hintergrundfarbe -> Fester vergrößern, wenn es nicht direkt klappt
        panel.setBackground(Color.RED);
        gui.add(panel, BorderLayout.CENTER);
        */