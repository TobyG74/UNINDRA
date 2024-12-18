import javax.swing.*;

class balokpbo {
    private int p, l, T;

    public void inputData() {
        String teks1 = JOptionPane.showInputDialog("Masukkan Panjang : ");
        p = Integer.parseInt(teks1);
        String teks2 = JOptionPane.showInputDialog("Masukkan Lebar : ");
        l = Integer.parseInt(teks2);
        String teks3 = JOptionPane.showInputDialog("Masukkan Tinggi : ");
        T = Integer.parseInt(teks3);
    }

    int volumeBalok() {
        return (p * l) * T; // Kesalahan pertama terdapat disini, pada foto tidak ada return
    }

    public void displayData() {
        System.out.println("Panjang = " + this.p);
        System.out.println("Lebar = " + this.l);
        System.out.println("Tinggi = " + this.T);
        System.out.println("Volume Balok = " + volumeBalok());
    }
}

public class pertemuan7_quiz_nomor5 {
    public static void main(String[] args) {
        balokpbo blkpbo = new balokpbo(); // Kesalahan kedua terdapat disini, nama class seharusnya balokpbo bukan
                                          // volumepbo
        blkpbo.inputData(); // Kesalahan ketiga terdapat disini, nama objek seharusnya blkpbo bukan balokpbo
        blkpbo.displayData(); // Kesalahan keempat terdapat disini, nama objek seharusnya blkpbo bukan
                              // balokpbo
        System.exit(0);
    }
}