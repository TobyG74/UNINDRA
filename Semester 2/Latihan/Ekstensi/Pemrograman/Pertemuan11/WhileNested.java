public class WhileNested {
    public static void main(String[]args){
        int i=2;
        while(i<8){
            int j=1;
            while(j<i){
                System.out.print(j);
                j++;
            }
            i++;
            System.out.println(" ");
        }
    }
}