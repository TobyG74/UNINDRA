class Pertemuan_5_Latihan3 {
    public static void main(String[] args) {
        System.out.println("Tugas 4: Operasi String");
        System.out.println("Nama : Tobi Saputra");
        System.out.println("NPM : 202243502612");
        System.out.println();
        String str = "Pemrograman Java";
        
        for (int i = str.length(); i >= 0; i--) {
            System.out.println(str.substring(i, str.length()));
        }
    }
}
