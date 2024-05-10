import java.util.Scanner;
class ArrayScanner {
    public static void main (String[]args){
        int input, index;
        Scanner s = new Scanner(System.in);
        System.out.print("Masukan banyak array = ");
        input = s.nextInt();
        
        int [] z = new int [input];
        for(index=1; index<z.length; index++){
            System.out.print("Masukan nilai array ke [ "+index+" ] = ");
            z[index] = s.nextInt();
        }
        System.out.println("\n");
        for(index=0; index<z.length; index++){
            System.out.println(z[index]);
        }
    }
}