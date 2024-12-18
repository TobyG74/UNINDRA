import java.io.BufferedReader;
import java.io.InputStreamReader;

public class KonversiWaktu {
    public static void main (String[] args) throws Exception  {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int angka, menit, detik;
        
        System.out.println("Konversi detik ke menit");
        System.out.println("=======================");
        
        // INPUT
        System.out.print("Input angka (detik) : "); 
        angka = Integer.parseInt(br.readLine());
        System.out.println("=======================");
        
        // OUTPUT
        menit = angka / 60;
        detik = angka % 60;
        System.out.printf("%s angka = %s menit %s detik", angka, menit, detik);
    }
}
