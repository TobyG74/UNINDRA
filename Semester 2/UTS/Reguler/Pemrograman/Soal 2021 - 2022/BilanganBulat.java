import java.util.Scanner;

public class BilanganBulat {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    
    int angka1, angka2, output;
    
    System.out.print("angka pertama : ");
    angka1 = in.nextInt();
    System.out.print("angka kedua : ");
    angka2 = in.nextInt();
    
    if (angka1 == angka2) {
      output = angka1 + angka2;
    } else {
      output = angka1 * angka2;
    }
    
    System.out.println("Output : " + output);
  }
} 
