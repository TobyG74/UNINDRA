import java.util.Scanner;
public class InputanScanner{
    public static void main(String[]args){
        Scanner s = new Scanner (System.in);
        String nama, kelas;
        long npm; int tugas, ujian;
        
        System.out.print("Masukan Nama Anda        : "); nama = s.nextLine();
        System.out.print("Masukan NPM Anda         : "); npm = s.nextLong();
        System.out.print("Masukan Kelas Anda       : "); kelas = s.next();
        System.out.print("Masukan Nilai Tugas Anda : "); tugas = s.nextInt();
        System.out.print("Masukan Nilai Ujian Anda : "); ujian = s.nextInt();
        
        System.out.println();
        
        System.out.println("Data yang anda input adalah :"); 
        System.out.println("Nama             : "+nama);
        System.out.println("npm              : "+npm);
        System.out.println("Kelas            : "+kelas);
        System.out.println("Total Nilai Anda : "+ ((tugas*30/100) + (ujian*70/100)));
    }
}