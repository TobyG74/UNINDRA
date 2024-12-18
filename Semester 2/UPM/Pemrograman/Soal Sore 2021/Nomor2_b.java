import java.util.Scanner;

public class Nomor2_b {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Masukkan Banyaknya Perulangan Yang Diinginkan : ");
        int x = in.nextInt();
        
        System.out.println("=======================================");
        System.out.println("Angka yang habis dibagi 3 dan habis dibagi 5 serta tidak habis dibagi 2 adalah : ");
        for (int i = 0; i <= x; i++) {
            if (i % 3 == 0 && i % 5 == 0 && i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
    }
}
