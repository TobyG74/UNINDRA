import java.util.Scanner;
public class SwitchCaseScanner{
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         char inputan;
         String nama;
         System.out.print("Masukkan nama: ");
         nama = sc.nextLine();
         
         System.out.print("Nilai : ");
         String s=sc.next();
         
         inputan= s.charAt(0);
         System.out.println("\n");
         
        //enter s'byk 1 kolom
        
         switch(inputan){
            case 'A': System.out.println(nama+" Nilai Anda memuaskan");
            break;
            case 'B': System.out.println(nama+" Nilai Anda bagus");
            break;
            case 'C': System.out.println(nama+" Nilai Anda cukup");
            break;
            default : System.out.println(nama+" Ngulang Tahun depan");
         }
     }
}
