import java.io.BufferedReader;
import java.io.InputStreamReader;

public class KelasBuffered {
    public static void main (String[]args)throws Exception {
        //deklarasi variabel
        String nama;
        //instansi kelas buffered
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //perintah input data
        System.out.print("\nMasukkan nama : "); nama = br.readLine();
        
        //output
        System.out.println("\nNama : " + nama);
    }
}