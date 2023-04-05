import java.util.Scanner;

class RumusPersegiPanjang {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Masukkan Panjang Persegi : ");
        int panjang = in.nextInt();
        System.out.print("Masukkan Lebar Persegi : ");
        int lebar = in.nextInt();
        
        int luas = panjang * lebar;
        int keliling = 2 * (panjang + lebar);
        System.out.println("Luas Persegi Panjang : " + luas);
        System.out.println("Keliling Persegi Panjang : " + keliling);

    }
}
