import java.util.Scanner;
public class WhileScanner {
    public static void main(String[]args){
        int jumlah;
        Scanner sc = new Scanner (System.in);
        System.out.println("Masukan jumlah data = ");
        jumlah = sc.nextInt();
        
        int i=1;
        while(i<jumlah){
            System.out.println(i);
            i++;
        }
        System.out.println(" ");
    }
}