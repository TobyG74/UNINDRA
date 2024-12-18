import java.util.Scanner;
public class ifMajemukNilai{
    public static void main(String[]args){
      double tugas,uts,uas,nilaiTotal; 
        String nilaiHuruf; 
        Scanner s= new Scanner(System.in);
        
        System.out.println("masukkan nilai Tugas: ");
        
        tugas = s.nextFloat(); 
        tugas *= 0.2;// tugas = tugas * 0.2 
        System.out.println("pointnya adalah "+tugas); 
        System.out.println("masukkan nilai uts: ");
        
        uts = s.nextFloat(); 
        uts *= 0.3; 
        System.out.println("pointnya adalah "+uts); 
        System.out.println("masukkan nilai uas: ");
        
        uas = s.nextFloat(); 
        uas *= 0.5;
        System.out.println("pointnya adalah "+uas); 
        
        nilaiTotal = tugas + uts + uas; 
        System.out.printf("jumlah nilai point anda %.2f\n",nilaiTotal); 
        if(nilaiTotal > 80){ 
            nilaiHuruf = "A"; 
        }else if (nilaiTotal > 70){ 
            nilaiHuruf = "B"; 
        }else if(nilaiTotal > 60){ 
            nilaiHuruf = "C"; 
        }else{ 
            nilaiHuruf = "E"; }System.out.println("nilai anda adalah "+nilaiHuruf); 
    }
}