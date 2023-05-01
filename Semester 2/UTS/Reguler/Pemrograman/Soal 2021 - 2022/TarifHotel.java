import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class TarifHotel {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    String kelas_kamar;
    int tarif, total_tarif, lama_menginap;
    
    // INPUT
    System.out.print("Jenis kelas kamar : ");
    kelas_kamar = br.readLine();
    System.out.print("Lama menginap (dalam hari) : ");
    lama_menginap = Integer.parseInt(br.readLine());
    
    // PROSES
    tarif = 0; total_tarif = 0;

    if (kelas_kamar.toLowerCase().equals("standard")) {
      if (lama_menginap >= 1 && lama_menginap <= 2) {
        tarif = 400000;
        total_tarif = tarif * lama_menginap;
      } else if (lama_menginap >= 2) {
        tarif = 350000;
        total_tarif = tarif * lama_menginap;
      }
    } else if (kelas_kamar.toLowerCase().equals("eksekutif")) {
      if (lama_menginap >= 1 && lama_menginap <= 2) {
        tarif = 1200000;
        total_tarif = tarif * lama_menginap;
      } else if (lama_menginap >= 2) {
        tarif = 1000000;
        total_tarif = tarif * lama_menginap;
      }
    } else {
      System.out.printf("Jenis kelas kamar %s tidak ada dalam daftar!", kelas_kamar);
    }
    
    // OUTPUT
    System.out.println("Total tarif yang harus di bayar adalah Rp. " + total_tarif);
  }
} 
