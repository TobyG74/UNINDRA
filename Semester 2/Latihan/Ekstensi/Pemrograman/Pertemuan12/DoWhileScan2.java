import java.util.Scanner;
public class DoWhileScan2 {
    public static void main (String [] args) {
        Scanner input = new Scanner (System.in);
        
        float a,b;
        String u;
        do{
            System.out.print("Masukan angka 1 = ");
            a = input.nextFloat();
            
            System.out.print("Masukan angka 2 = ");
            b = input.nextFloat();
            
            System.out.println(a+ " + " +b+ " = " + (a+b) );
            System.out.println(a+ " - " +b+ " = " + (a-b) );
            System.out.println(a+ " x " +b+ " = " + (a*b) );
            System.out.println(a+ " : " +b+ " = " + (a/b) );
            System.out.println(a+ " mod " +b+ " = " + (a%b) );
            
            System.out.print("\n Ulang (y/n) = ");
            u = input.next();
        }while(u.equals ("y"));
    }
}