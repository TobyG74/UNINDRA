import java.io.BufferedReader;
import java.io.InputStreamReader;

public class GajiKaryawan {
    public static void main (String[] args) throws Exception  {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String nama;
        int gaji;
        double potongan, total_gaji;
        final double pajak = 0.11;
        
        System.out.println("Aplikasi Karyawan");
        System.out.println("=================");
        
        // INPUT
        System.out.print("Input Nama : "); nama = br.readLine();
        System.out.print("Input Gaji : "); gaji = Integer.parseInt(br.readLine());
        System.out.println("=================");
        
        // OUTPUT
        potongan = gaji * pajak;
        total_gaji = gaji - potongan;
        System.out.println("Pajak : " + (int) potongan);
        System.out.println("Total Gaji : " + (int) total_gaji);
    }
}
