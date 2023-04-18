import java.util.Scanner; 
public class InputOutput{ 
    public static void main (String [] args){ 
        double hargaSewaDVD = 5000, jumlahDVD, 
        denda = 0.1, hargaTotal, lamaSewa, 
        dendaNya; 
        Scanner s = new Scanner(System.in);
        
        System.out.println("masukkan jumlah DVD: ");
        
        jumlahDVD = s.nextFloat();
        
        if (jumlahDVD <= 5){ 
            
            System.out.println("masukkan lama sewa: ");
            lamaSewa = s.nextFloat();
        
            if (lamaSewa <= 3){
                
                hargaTotal = hargaSewaDVD*jumlahDVD; 
                System.out.println("harga Total yang harus anda adalah "+ hargaTotal);
                
            } else {
                
                dendaNya = 
                (hargaSewaDVD*jumlahDVD)*denda; hargaTotal = (hargaSewaDVD*jumlahDVD) + dendaNya; 
                System.out.println("denda anda adalah "+ dendaNya); 
                System.out.println("harga plus denda anda adalah "+hargaTotal); 
            
            }
        } else {
            
            System.out.println("DVD anda terlalu banyak...!!"); 
        
        } 
    } 
}