public class ArrayLengthFor{
    public static void main (String[]args){
        int angka [] = new int[100];
        int x = 1;
        int total = 0;
        
        for(int i=0; i<angka.length; i++){
            angka[i] = x;
            x++;
            total+=angka[i];
        }
        
        System.out.println(total);
    }
}