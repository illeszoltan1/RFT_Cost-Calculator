import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
        // Az ablak beallitasa
        JFrame ablak = new JFrame("Utazasi koltsegkalkulator");
        ablak.setSize(950, 650);
        ablak.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ablak.setLocationRelativeTo(null);

        // Fo panel
        JPanel foPanel = new JPanel(new BorderLayout(10, 10));
        foPanel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
        foPanel.setBackground(new Color(245, 247, 250));

        // Cim
        JLabel cim = new JLabel("Utazasi koltsegkalkulator", JLabel.CENTER);
        cim.setFont(new Font("Arial", Font.BOLD, 24));
        cim.setForeground(new Color(35, 55, 80));
        foPanel.add(cim, BorderLayout.NORTH);

        // Adatbeviteli panel
        JPanel adatPanel = new JPanel(new GridLayout(3, 4, 10, 12));
        adatPanel.setBorder(BorderFactory.createTitledBorder("Uj utazas adatai"));
        adatPanel.setBackground(Color.WHITE);

        // Indulasi hely
        adatPanel.add(new JLabel("Indulasi hely (varos):"));
        JTextField indulasiHely = new JTextField();
        indulasiHely.setToolTipText("Pelda: Budapest");
        adatPanel.add(indulasiHely);

        // Erkezesi hely
        adatPanel.add(new JLabel("Erkezesi hely (varos):"));
        JTextField erkezesiHely = new JTextField();
        erkezesiHely.setToolTipText("Pelda: Debrecen");
        adatPanel.add(erkezesiHely);

        // Datum
        adatPanel.add(new JLabel("Datum (EEEE-HH-NN):"));
        JTextField datum = new JTextField();
        datum.setToolTipText("Pelda: 2026-11-10");
        adatPanel.add(datum);

        // Kozlekedesi mod
        adatPanel.add(new JLabel("Kozlekedesi mod:"));
        String[] modok = {"Auto", "Busz", "Vonat"};
        JComboBox<String> kozlekedes = new JComboBox<>(modok);
        adatPanel.add(kozlekedes);

        // Tavolsag
        adatPanel.add(new JLabel("Tavolsag (km):"));
        JTextField tavolsag = new JTextField();
        tavolsag.setToolTipText("Pelda: 120");
        adatPanel.add(tavolsag);

        // Koltseg
        adatPanel.add(new JLabel("Koltseg (Ft):"));
        JTextField koltseg = new JTextField();
        koltseg.setToolTipText("Pelda: 8500");
        adatPanel.add(koltseg);

        // Felso resz: cim es adatbeviteli panel
        JPanel felsoPanel = new JPanel(new BorderLayout(10, 10));
        felsoPanel.setBackground(new Color(245, 247, 250));
        felsoPanel.add(cim, BorderLayout.NORTH);
        felsoPanel.add(adatPanel, BorderLayout.CENTER);

        // Utazasok tablazata
        String[] oszlopok = {
                "Indulasi hely", "Erkezesi hely", "Datum",
                "Kozlekedes", "Tavolsag (km)", "Koltseg (Ft)"
        };

        DefaultTableModel modell = new DefaultTableModel(oszlopok, 0);
        JTable tabla = new JTable(modell);
        tabla.setRowHeight(25);
        tabla.getTableHeader().setFont(new Font("Arial", Font.BOLD, 12));

        JScrollPane gorgeto = new JScrollPane(tabla);
        gorgeto.setBorder(BorderFactory.createTitledBorder("Rogzitett utazasok"));

        // Also gombsor
        JPanel alsoPanel = new JPanel(new BorderLayout());
        alsoPanel.setBackground(new Color(245, 247, 250));

        JButton hozzaadas = new JButton("Utazas rogzitese");
        JLabel osszesKoltseg = new JLabel("Osszes koltseg: - Ft");
        osszesKoltseg.setFont(new Font("Arial", Font.BOLD, 15));

        alsoPanel.add(hozzaadas, BorderLayout.WEST);
        alsoPanel.add(osszesKoltseg, BorderLayout.EAST);

        // A gomb megjeleniti a megadott adatokat a tablazatban.
        // A koltsegszamitas kesobb kerul a programba.
        hozzaadas.addActionListener(e -> {
            modell.addRow(new Object[]{
                    indulasiHely.getText(),
                    erkezesiHely.getText(),
                    datum.getText(),
                    kozlekedes.getSelectedItem(),
                    tavolsag.getText(),
                    koltseg.getText()
            });

            indulasiHely.setText("");
            erkezesiHely.setText("");
            datum.setText("");
            tavolsag.setText("");
            koltseg.setText("");
        });

        // Panelek osszeallitasa
        JPanel kozepPanel = new JPanel(new BorderLayout(10, 10));
        kozepPanel.setBackground(new Color(245, 247, 250));
        kozepPanel.add(felsoPanel, BorderLayout.NORTH);
        kozepPanel.add(gorgeto, BorderLayout.CENTER);

        foPanel.add(kozepPanel, BorderLayout.CENTER);
        foPanel.add(alsoPanel, BorderLayout.SOUTH);

        ablak.add(foPanel);
        ablak.setVisible(true);
    }
}
