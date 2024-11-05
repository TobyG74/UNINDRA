import java.util.Scanner;

public class Nomor5 {
   public static void main(String[] args) {
     Scanner in = new Scanner(System.in);

     // Jumlah Index Array = 5
     int data[] = new int[5];

     // Proses Input Data Array
     for (int i = 1; i <= 5; i++) {
       System.out.print("Input bilangan ke-" + 1 + " : ");
       data[i - 1] = in.nextInt();
     }
   
     System.out.println("Data : ");
     
     // Print Data Array 
     for (int i = 1; i <= 5; i++) {
       System.out.print(data[i - 1] + " ");
     } 
   }
}
