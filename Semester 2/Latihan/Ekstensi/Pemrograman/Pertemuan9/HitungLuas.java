import java.util.Scanner;
public class HitungLuas {
    public static void main (String[]args){
        int month, angka, panjang, lebar, lp, alas, tinggi;
        double ls;
        String ket, nama;
        
        Scanner oke = new Scanner(System.in);
        System.out.println("1. Mencari luas persegi panjang ");
        System.out.println("2. Mencari luas segitiga ");
        System.out.println();
        System.out.println("Masukan pilihan anda : ");
        month = oke.nextInt();
        System.out.println("-------------------------");
        
        switch (month) {
            case 1 : System.out.println(" MENCARI LUAS PERSEGI PANJANG ");
                     System.out.println("______________________________");
                     System.out.println("masukan nilai panjang : ");
                     panjang = oke.nextInt();
                     System.out.println("masukan nilai lebar : ");
                     lebar = oke.nextInt();
                     lp = panjang*lebar;
                     System.out.println("luas persegi panjang adalah : " + lp);
                     break;
            
            case 2 : System.out.println(" MENCARI LUAS SEGITIGA");
                     System.out.println("______________________________");
                     System.out.println("masukan nilai alas : ");
                     alas = oke.nextInt();
                     System.out.println("masukan nilai tinggi : ");
                     tinggi = oke.nextInt();
                     ls = 0.5 * alas * tinggi;
                     System.out.println("luas segitiga adalah : " + ls);
                     break;    
                     
        }
        
    }
}