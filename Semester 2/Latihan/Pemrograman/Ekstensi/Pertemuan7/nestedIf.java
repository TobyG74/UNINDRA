public class nestedIf {
    public static void main (String[]args){
       int nilai=-4;
       
       if (nilai>0){
           
           if(nilai%2==0){
               System.out.println("positif genap");
           }else{
               System.out.println("positif ganjil");
           }
           
       }else if (nilai<0) {
           
            if(nilai%2==0){
               System.out.println("negatif genap");
           }else{
               System.out.println("negatif ganjil");
           }
        }
    }
}