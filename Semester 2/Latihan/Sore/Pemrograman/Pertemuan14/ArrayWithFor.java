public class ArrayWithFor {
    public static void main(String[] args) {
        int[] data= {10,4,2,5,3,8,9,2,9,5};
        int terbesar= data[0];
 
        for ( int i=0 ; i<10;i++){
            if (data[i]> terbesar)
                terbesar= data[i];
        }
        System.out.println("Data terbesar= "+terbesar);
    }
}
