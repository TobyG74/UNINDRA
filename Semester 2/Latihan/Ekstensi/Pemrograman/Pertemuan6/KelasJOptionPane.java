import javax.swing.JOptionPane;

public class KelasJOptionPane {
    public static void main (String[]args) {
        //deklarasi variabel
        String nama;
        double tinggi;
        
        //perintah input
        nama = JOptionPane.showInputDialog("Masukkan nama : ");
        tinggi = Double.parseDouble(JOptionPane.showInputDialog("Masukkan tinggi : "));
        
        //dialog output
        JOptionPane.showMessageDialog("\nNama : "+ nama + "\nTinggi : "+ tinggi);
}