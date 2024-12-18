class Latihan_Pertemuan_04 {
    public static void main (String[] args) {
        
        int perbedaan1 = 1;
        int perbedaan2 = 1;
        
        // Nilai ditambah setelah melakukan operasi, hasil 1
        System.out.println("i = " + perbedaan1++);
        // Nilai ditambah sebelum melakukan operasi, hasil 2
        System.out.println("i = " + ++perbedaan2);
        
        /**
         * 3 * 4 hasilnya 12
         * 45 % 5 hasilnya 0
         * -21 * 3 hasilnya -63
         * jadi 12 - 63 hasilnya -51
         */
        int soal1 = 3 * 4 + 45 % 5 - 21 * 3;
        System.out.println("Hasil = " + soal1);
        
        /**
         * 3 * 12 hasilnya 36
         * 23 + 36 hasilnya 59 (36 hasil 3 * 12)
         * -2 * 3 hasilnya -6
         * -6 / 2 hasilnya -3 (-6 hasil -2 * 3)
         * jadi 59 - 3 hasilnya 56
         */
        int soal2 = 23 + 3 * 12 - 2 * 3 / 2;
        System.out.println("Hasil = " + soal2);
        
        /**
         * 9 % 3 hasilnya 0
         * 3 * 4 hasilnya 12
         * 12 + 0 hasilnya 12
         * jadi 12 - 12 hasilnya 0
         */
        int soal3 = 9 % 3 + 3 * 4 - 12;
        System.out.println("Hasil = " + soal3);
    }
}
