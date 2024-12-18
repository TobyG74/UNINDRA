class Variabel {
    static int a;
    public static void main(String[] args) {
        int x; // variabel x ini dikenal di seluruh method main()
        x = 10;
        a = 2; //variabel a juga dikenal di sini
        System.out.println("Nilai a : " + a);
        { //awal dari blok baru
            int y; // variabel ini hanya dikenal di dalam blok code ini saja
            y = 5;
            System.out.println("Nilai x : " + x); //variabel x dikenal disini
            System.out.println("Nilai a : " + a); //variabel a juga dikenal di sini
            
            { //nested blok
                int z;// variabel ini hanya dikenal di dalam nested blok ini saja
                z = 20;
                // variabel x,y dan a dikenal di dalam nested blok ini
                System.out.println("Nilai x + y + z + a : " + (x + y + z + a));
            } //akhir dari nested blok
        
            //z = 11; // variabel z tidaklagi dikenal di sini
            //variabel y masih dikenal di sini karena masih dalam blok
            //code tempat ia dideklarasikan
        
        System.out.println("Nilai y : " + y);
        } //akhir dari blok baru
        
        //y = 12; // variabel y tidak dikenal di sini
        //variabel x masih dikenal disini karena masih dalam blok
        //code tempat ia dideklarasikan
        System.out.println("Nilai x : " + x);
    }
}