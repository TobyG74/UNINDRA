import java.util.Scanner;

class Pertemuan_2 {
    public static void main (String[] args) {
        int data[] = {3,9,76,54,43,12,46,39,76,12,88,45,89};
        int i, x;
        
        Scanner in = new Scanner(System.in);
        
        for (i = 0; i < data.length; i++) {
            System.out.println("Data ke-1" + i + "\t" + data[i]);
        }
        
        System.out.print("Masukkan Angka Yang Ingin Dicari : ");
        x = in.nextInt();
        
        int j = 0;
        for (i = 0; i < data.length; i++) {
            if (x == data[i]) {
                System.out.println("Angka ditemukan pada elemen ke-" + i);
                j++;
            }
        }
        
        if (j == 0) System.out.println("Data tidak ditemukan");

        in.close();
    }
}
