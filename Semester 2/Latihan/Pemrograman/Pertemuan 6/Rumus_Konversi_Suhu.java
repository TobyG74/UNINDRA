import java.util.Scanner;

class Rumus_Konversi_Suhu {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Suhu dalam derajat celcius : ");
        int celcius = in.nextInt();
        
        double fahrenheit = (9.0/5.0) * celcius + 32;
        System.out.println("Maka, suhu dalam derajat fahrenheit : " + fahrenheit);
        
    }
}
