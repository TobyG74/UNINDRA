import java.io.FileOutputStream;
import java.io.PrintStream;

public class Pertemuan_7_Latihan1 {
    public static void main(String[] args) {
        try {
            FileOutputStream out = new FileOutputStream("./tugasP3.txt");
            PrintStream p = new PrintStream(out);

            /** Menuliskan Data */
            p.println("9981117806701");
            p.println("0832348108521");
            p.println("1560016594591");
            p.println("3452416706704");
            p.println("5560247018199");

            /** Menutup File */
            p.close();
            System.out.println("Berhasil Menuliskan File.");
        } catch (Exception e) {
            System.out.println("Gagal Menuliskan File. Error : " + e.getMessage());
        }
    }
}
