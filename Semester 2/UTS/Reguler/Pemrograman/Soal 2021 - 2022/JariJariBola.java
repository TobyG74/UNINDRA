import java.util.Scanner;

public class JariJariBola {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    
    final double n = 3.14;
    
    float volume;
    int r;
    
    System.out.print("Input jari-jari bola : ");
    r = in.nextInt();
    
    volume = (float) ((4 * n) / 3 * (Math.pow(r,3)));
    System.out.println("Volume bola adalah : " + volume);
  }
} 
