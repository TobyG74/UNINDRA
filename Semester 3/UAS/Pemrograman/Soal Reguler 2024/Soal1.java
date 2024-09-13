import java.util.*;

class UASSore1 {
  public static void main(String[] args){
    Scanner sc = new Scanner (System.in);

    System.out.print ("Digit terakhir NPM Anda : "); int npm=sc.nextInt();
    if(npm % 3 == 0) System.out.println("Hasil = " + uas(3));
    else if(npm % 5 == 0) System.out.println("Hasil = " + uas(5));
    else System.out.println("Hasil = " + uas(4));
    }
    static int uas(int a) {
      if (a == 0) return 4;
      else return 3 * uas(a - 1) + 2;
    }
}

/**
 * Tulis output dan proses mendapatkan hasil dari program berikut.
 * 
 * Untuk Jawaban Dengan NPM 1, 2, 4, 7, 8
 * Output dengan digit Akhir 2 Hasil nya 404
 * Karena 2 % 3 != 0 dan 2 % 5 != 0 maka akan masuk ke else
 * Dan akan mengulang sebanyak 4 kali sehingga hasil nya 404
 * 
 * Untuk Jawaban Dengan NPM 3, 6, 9
 * Output dengan digit Akhir 3 Hasil nya 134
 * Karena 3 % 3 == 0 maka akan masuk ke if pertama
 * Dan akan mengulang sebanyak 3 kali sehingga hasil nya 134
 * 
 * Untuk Jawaban Dengan NPM 5
 * Output dengan digit Akhir 5 Hasil nya 1214
 * Karena 5 % 5 == 0 maka akan masuk ke if kedua
 * Dan akan mengulang sebanyak 5 kali sehingga hasil nya 1214
 */