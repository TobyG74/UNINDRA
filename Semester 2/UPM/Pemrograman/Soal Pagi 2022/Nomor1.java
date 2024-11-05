import java.util.Scanner;

public class Nomor1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        // Input Angka
        System.out.print("Input Sebuah Angka : ");
        int jumlah = in.nextInt();
        int i, sisa, bagi;
        i = 1;

        // Proses Loop Menentukan Mod & Hasil Bagi
        while (i <= 10) {
          sisa = jumlah % i;
          bagi = (int) jumlah / i;
          System.out.printf("%s : %s = %s sisa %s\n", jumlah, i, bagi, sisa);
          i++;
        }
   }
}
