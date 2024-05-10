import java.util.Scanner;
public class ArrayWithIfScan {
    public static void main(String[]args){
        String [] bulan = {"Muharam", "Safar", "Rabi'ul awal", "Rabi'ul Akhir", "Jumadil Awal", "Jumadil Akhir", "Rajab", "Sya'ban", "Ramadhan", "Syawal", "Dzulqo'dah", "Dzulhijjah"};
        Scanner cetak = new Scanner(System.in);
        System.out.print("Masukkan bulan 1 - 12 : ");
        int pilihBulan = cetak.nextInt();
        
        if(pilihBulan >= 1 && pilihBulan <=12){
            System.out.println("Nama Bulan = " + bulan[pilihBulan-1]);
        }else{
            System.out.println("Hanya ada 12 bulan saja");
        }
    }
}