import java.util.Scanner;

public class P14 {
  public static void main(String[] args) throws Exception {
    System.out.println("\n\nSOAL NOMOR 1\n");
    soalSatu();
    System.out.println("\n\nSOAL NOMOR 2\n");
    soalDua();
    System.out.println("\n\nSOAL NOMOR 3 \n");
    soalTiga();
  }

  static void soalSatu() {
    Scanner userInput = new Scanner(System.in);

    System.out.print("Input angka pertama : ");
    int first = userInput.nextInt();
    System.out.print("Input angka kedua : ");
    int second = userInput.nextInt();
    System.out.print("Input angka ketiga : ");
    int limit = userInput.nextInt();
    int i = 1;
    System.out.println("OUTPUT : ");
    while (i <= limit) {
      var res = (i % first) == 0 || (i % second) == 0 ? "Java" : i;
      System.out.print(res + " ");
      i++;
    }
  }

  static void soalDua() {
    Scanner userInput = new Scanner(System.in);

    System.out.print("Input angka akhir : ");
    int lastNumber = userInput.nextInt();
    System.out.print("Input batas : ");
    int limit = userInput.nextInt();
    int i = 1;
    System.out.println("OUTPUT : ");
    do {
      var last = Integer.toString(i).charAt(Integer.toString(i).length() - 1);
      int lastDigit = Character.getNumericValue(last);
      if (lastNumber == lastDigit) {
        System.out.print(i + " ");
      }

      i++;
    } while (i <= limit);
  }

  static void soalTiga() {
    Scanner userInput = new Scanner(System.in);

    System.out.print("Input Jumlah Baris : ");
    int line = userInput.nextInt();
    System.out.print("Input Jumlah Kolom : ");
    int column = userInput.nextInt();

    System.out.println("OUTPUT : ");
    for (var i = 1; i <= line; i++) {
      for (var j = 1; j <= column; j++) {
        System.out.print((j + i) % 2 == 0 ? "O" : "X");
        System.out.print(" ");
      }
      System.out.println();
    }
  }
}
