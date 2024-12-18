import java.util.Scanner;

public class Nomor22 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    
    // Input Sebuah Angka
    System.out.print("Input Sebuah Angka : ");
    int jumlah = in.nextInt();
    int i = 1;
    
    System.out.println("Angka yang dapat membagi 30 tanpa sisa adalah : ");
   
    // Proses Loop Menentukan Mod 
    do {
      if (jumlah % i == 0) System.out.print(i + " ");
      i++;
    } while (i <= jumlah);
  }
}
