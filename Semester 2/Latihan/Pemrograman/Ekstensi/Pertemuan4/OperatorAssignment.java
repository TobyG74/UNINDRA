class OperatorAssignment {
    public static void main(String[] args){
        int var = 10;
        int a,b,c;
        a = b = c = 100;
        int d,e,f;
        f = 200;
        e = f;
        d = e;
        System.out.println("Nilai var : " + var);
        System.out.println("Nilai a : " + a);
        System.out.println("Nilai b : " + b);
        System.out.println("Nilai c : " + c);
        System.out.println("Nilai f : " + f);
        System.out.println("Nilai e : " + e);
        System.out.println("Nilai d : " + d);
        
        int z;
        char Teks1 = 'a'; /* dalam Unicode 
                            karakter 'a' direpresentasikan dengan
                            angka 97 */
        z = Teks1 * 100; // z = 97 * 10;
        System.out.println("Nilai Teks1 : " + Teks1);
        System.out.println("Nilai z : " + z);
    }
}