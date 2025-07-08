import java.util.Scanner;
public class DoWhileScanner {
    public static void main( String [] args ) {
        Scanner masuk = new Scanner (System.in);
        int m;
        float n, jumlah, x, rata;
        System.out.print("Banyaknya data = ");
        n = masuk.nextFloat();
        
        jumlah = 0;
        m = 1;
        do{
            System.out.println("Data ke - "+ m +" = ");
            x = masuk.nextFloat();
            
            jumlah += x;
            m++;
        }while(m<=n);
        System.out.println("rata-rata = "+ jumlah/n);
    }
}