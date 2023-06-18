public class PraktikumLimaBelas {
    public static void main(String[] args) {
        String[][] arrayData = new String[2][3];

        arrayData[0][0] = "2020202";
        arrayData[0][1] = "Hilmi";
        arrayData[0][2] = "Jakarta";
        arrayData[1][0] = "2012290";
        arrayData[1][1] = "Franziska";
        arrayData[1][2] = "Bogor";
        System.out.println("NPM \t\t Nama \t\t Alamat");

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arrayData[i][j] + "\t\t");
            }
            System.out.println();
        }
    }
}
