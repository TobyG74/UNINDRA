import java.util.*;
public class Soal1{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        String npm,nama;
        int jm;
        System.out.print("NPM: ");
        npm = input.nextLine();
        System.out.print("Nama: ");
        nama = input.nextLine();
        System.out.println("========================================================");
        System.out.print("Jumlah Matkul: ");     
        jm = input.nextInt();
        System.out.println("========================================================");   
        String [][]data = new String[jm][3];
        for(int i = 0; i < jm; i++) {
            System.out.print("Kode MK: ");
            data[i][0] = input.next();
            System.out.print("SKS: ");
            data[i][1] = input.next();
            System.out.print("Nama Dosen: ");
            data[i][2] = input.next();
            System.out.println();
        }
        System.out.println("==============================================================");
        System.out.println("\t\t\tKRS");
        System.out.println("==============================================================");
        System.out.println("NPM: " + npm + "\t\tNama Mahasiswa: " + nama);
        System.out.println("==============================================================");
        System.out.println("Kode MK\t\t\tSKS\t\t\tNama Dosen");
        for(int i = 0; i < jm; i++) {
            System.out.println(data[i][0] + "\t\t\t" + data[i][1] + "\t\t" + data[i][2]);
        }
    }
}