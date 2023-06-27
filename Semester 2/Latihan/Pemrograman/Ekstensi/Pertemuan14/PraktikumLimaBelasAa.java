public class PraktikumLimaBelasAa {
    public static void main(String[] args) {
        String[] name = {"Ardi", "Pian", "robi"};
        double[][] nil = {
                {60, 70, 90},
                {80, 70, 90},
                {70, 60, 90}
        };
        double nilai = 0;

        System.out.println("+-------+-------+------+--------+------------+");
        System.out.println("I Nama\tI UTS\tI UAS\tI Tugas\tI Nilai Akhir I");
        System.out.println("+-------+-------+------+--------+------------+");

        for (int row = 0; row < 3; row++) {
            System.out.print("I " + name[row] + "\tI ");
            for (int colum = 0; colum < 3; colum++) {
                System.out.print(nil[row][colum] + "\tI ");
            }
            nilai = (0.35 * nil[row][0]) + (0.45 * nil[row][1]) + (0.2 * nil[row][2]);
            System.out.println(nilai + "\t\tI ");
        }

        System.out.println("+-------+-------+------+--------+------------+");
    }
}
