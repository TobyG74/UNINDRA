import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class TarifJarakTempuh {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    String nama;
    final int tarif_4km = 9500;
    int jarak, diskon, hitung_tarif, total_tarif;
    
    // INPUT
    System.out.print("Nama Customer : ");
    nama = br.readLine();
    System.out.print("Jarak yang akan di tempuh (km) : ");
    jarak = Integer.parseInt(br.readLine());
    
    // PROSES
    diskon = 0;
    total_tarif = 0;
    
    if (jarak >= 0 && jarak <= 10) {
      if (jarak <= 4) {
        total_tarif = tarif_4km;
      } else {
        total_tarif = ((jarak - 4) * 2500) + tarif_4km - diskon;
      }
    } else if (jarak >= 10 && jarak <= 15) {
      diskon = 2000;
      if (jarak <= 4) {
        total_tarif = tarif_4km;
      } else {
        total_tarif = ((jarak - 4) * 2500) + tarif_4km - diskon;
      }
    } else if (jarak >= 15) {
      diskon = 5000;
      if (jarak <= 4) {
        total_tarif = tarif_4km;
      } else {
        total_tarif = ((jarak - 4) * 2500) + tarif_4km;
      }
    }
    
    // OUTPUT
    System.out.printf("Selamat, Anda mendapatkan potongan Rp.%s \n", diskon);
    System.out.printf("Tarif yang harus dibayarkan %s adalah sebesar %s", nama, total_tarif);
  }
} 
