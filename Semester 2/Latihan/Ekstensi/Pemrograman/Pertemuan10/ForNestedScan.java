import java.util.Scanner;
public class ForNestedScan {
    public static void main(String[]args){
        int a;
        Scanner oke = new Scanner (System.in);
        a=oke.nextInt();
        
        for(int i=1; i<=a; i++){
            for(int j=1; j<=i; j++){
                System.out.println(j+" ");
            }
            System.out.println(" ");
        }
    }
}