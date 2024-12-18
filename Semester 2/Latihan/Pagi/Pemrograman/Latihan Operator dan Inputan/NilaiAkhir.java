import java.io.BufferedReader;
import java.io.InputStreamReader;

public class NilaiAkhir {
    public static void main (String[] args) throws Exception  {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String nama, npm;
        int tugas, uts, uas;
        double akhir;
        
        System.out.println("Sistem Penilaian Universitas");
        System.out.println("============================");
        
        // INPUT
        System.out.print("NPM : "); 
        npm = br.readLine();
        System.out.print("Nama : "); 
        nama = br.readLine();
        System.out.print("Nilai Tugas : "); 
        tugas = Integer.parseInt(br.readLine());
        System.out.print("Nilai UTS : "); 
        uts = Integer.parseInt(br.readLine());
        System.out.print("Nilai UAS : "); 
        uas = Integer.parseInt(br.readLine());
        System.out.println("=======================");
        
        // OUTPUT
        akhir = (0.2 * tugas) + (0.3 * uts) + (0.5 * uas);
        System.out.println("Nilai Akhir : " + (int) akhir);
    }
}
