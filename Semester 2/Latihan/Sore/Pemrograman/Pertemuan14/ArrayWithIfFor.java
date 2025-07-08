import java.util.Scanner;
public class ArrayWithIfFor {
    public static void main(String[]args){
        //membuat array mobil
        String [] mobil = new String[5];
        
        Scanner cetak = new Scanner(System.in);
        
        //mengisi data ke array dengan for
        for (int i=0; i<=mobil.length; i++){
            System.out.print("Nama mobil ke - "+i+" = ");
            mobil[i] = cetak.nextLine();
        }
        
        System.out.println("------------------------");
        System.out.println();
        
        // menampilkan data mobil
        for(String data : mobil){
            System.out.println(data);
        }
        
    }
}