
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class Main {

    public static void main(String[] args) {

        // Ablak letrehozasa
        JFrame ablak = new JFrame("Utazasi koltsegkalkulator");

        ablak.setSize(800, 600);
        ablak.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ablak.setLocationRelativeTo(null);

        // Fo panel
        JPanel foPanel = new JPanel();
        foPanel.setLayout(new BorderLayout(10, 10));

        // Cim
        JLabel cim = new JLabel("Utazasi koltsegkalkulator");
        cim.setFont(new Font("Arial", Font.BOLD, 24));
        cim.setHorizontalAlignment(JLabel.CENTER);

        foPanel.add(cim, BorderLayout.NORTH);

        // Adatok megadasa
        JPanel adatPanel = new JPanel();
        adatPanel.setLayout(new GridLayout(3, 4, 10, 10));

        adatPanel.setBorder(
                BorderFactory.createTitledBorder("Uj utazas adatai")
        );

        // Indulasi hely
        adatPanel.add(new JLabel("Indulasi hely:"));
        JTextField indulasiHely = new JTextField();
        adatPanel.add(indulasiHely);

        // Erkezesi hely
        adatPanel.add(new JLabel("Erkezesi hely:"));
        JTextField erkezesiHely = new JTextField();
        adatPanel.add(erkezesiHely);

        // Datum
        adatPanel.add(new JLabel("Datum:"));
        JTextField datum = new JTextField();
        adatPanel.add(datum);

        // Kozlekedesi mod
        adatPanel.add(new JLabel("Kozlekedesi mod:"));

        String[] modok = {"Auto", "Busz", "Vonat"};
        JComboBox<String> kozlekedes = new JComboBox<>(modok);

        adatPanel.add(kozlekedes);

        // Tavolsag
        adatPanel.add(new JLabel("Tavolsag (km):"));
        JTextField tavolsag = new JTextField();
        adatPanel.add(tavolsag);

        // Koltseg
        adatPanel.add(new JLabel("Koltseg (Ft):"));
        JTextField koltseg = new JTextField();
        adatPanel.add(koltseg);

        foPanel.add(adatPanel, BorderLayout.CENTER);

        // Utazasok tablazata
        String[] oszlopok = {
                "Indulasi hely",
                "Erkezesi hely",
                "Datum",
                "Kozlekedes",
                "Tavolsag",
                "Koltseg"
        };

        DefaultTableModel modell =
                new DefaultTableModel(oszlopok, 0);

        JTable tabla = new JTable(modell);

        JScrollPane gorgeto = new JScrollPane(tabla);

        gorgeto.setBorder(
                BorderFactory.createTitledBorder("Rogzitett utazasok")
        );

        // Also panel
        JPanel alsoPanel = new JPanel();

        JButton hozzaadas = new JButton("Utazas hozzaadasa");

        JLabel osszesKoltseg = new JLabel("Osszes koltseg: 0 Ft");

        alsoPanel.add(hozzaadas);
        alsoPanel.add(osszesKoltseg);

        // Reszek osszeallitasa
        JPanel kozepPanel = new JPanel(new BorderLayout(10, 10));

        kozepPanel.add(adatPanel, BorderLayout.NORTH);
        kozepPanel.add(gorgeto, BorderLayout.CENTER);

        foPanel.add(kozepPanel, BorderLayout.CENTER);
        foPanel.add(alsoPanel, BorderLayout.SOUTH);

        // Ablak megjelenitese
        ablak.add(foPanel);
        ablak.setVisible(true);
    }
}
