class OperatorLogika{
     static void main(String[] args) {
        boolean Benar = true;
        boolean Salah = false;
        System.out.println("Hubungan OR (||)");
        System.out.println("Benar || Benar : " +(Benar||Benar));
        System.out.println("Benar || Salah : " +(Benar||Salah));
        System.out.println("Salah || Benar : " +(Salah||Benar));
        System.out.println("Salah || Salah : " +(Salah||Salah));
        System.out.println("Hubungan AND (&&)");
        System.out.println("Benar && Benar : " +(Benar&&Benar));
        
        System.out.println("Benar && Salah : " +(Benar&&Salah));
        System.out.println("Salah && Benar : " +(Salah&&Benar));
        System.out.println("Salah && Salah : " +(Salah&&Salah));
        System.out.println("Hubungan NOT (!)");
        System.out.println("Kebalikan (NOT) dari Benar adalah: " +!Benar);
        System.out.println("Kebalikan (NOT) dari Salah adalah: " +!Salah);
     }
}