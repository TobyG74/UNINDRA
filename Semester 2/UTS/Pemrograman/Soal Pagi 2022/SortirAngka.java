import java.util.Scanner;

public class SortirAngka {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int angka;
		
		System.out.print("Input sebuah angka : ");
		angka = in.nextInt();
		
		if ((angka % 4 == 0) && (angka % 5 == 0)) {
		    System.out.printf("%s angka dapat dibagi oleh 4 dan 5", angka);
		} else if ((angka % 4 == 0) || (angka % 5 == 0)) {
		    System.out.printf("%s angka dapat dibagi oleh salah satu 4 atau 5, tetapi tidak oleh keduanya", angka);
		} else {
		    System.out.printf("%s tidak dapat dibagi oleh angka 4 atau 5", angka);
		}
	}
}
