import java.io.BufferedReader;
import java.io.InputStreamReader;

public class KelasBuffered2 {
    public static void main (String[]args)throws Exception {
        //deklarasi variabel
        int angka_bulat;
        double pecahan;
        
        //instansi kelas buffered
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        //perintah input data
        System.out.print("\nMasukkan angka bulat : "); angka_bulat = Integer.parseInt(br.readLine());
        System.out.print("\nMasukkan angka pecahan : "); pecahan = Double.parseDouble(br.readLine());
        
        //output
        System.out.println("\nAngka Bulat = "+ angka_bulat);
        System.out.println("\nAngka Pecahan = "+ pecahan);
    }
}