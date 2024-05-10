

import java.util.ArrayList;
import java.util.Scanner;

class DOWHILE {
  static final String toko = "TOKO SUMBER REJEKI";
  static final String jalan = "Jl. Raya Tengah No. 80, Kel . Gedong";
  static final String alamat = "Kec . Pasar Rebo, Jakarta Timur 13760";

  public static void main(String[] args) {
      Scanner userInput = new Scanner(System.in);
    
      // fake database
      ArrayList<String> listProduk = new ArrayList<String>();
      ArrayList<Integer> listQty = new ArrayList<Integer>();
      ArrayList<Integer> listPrice = new ArrayList<Integer>();

      System.out.print("Masukan jumlah ( total ) produk : ");
      var totalLoop = userInput.nextInt();
      userInput.nextLine();
      var countLoop = 0;
    
      do  {
        countLoop++;
        System.out.println("Input barang ke  "  + countLoop + " :");
        String namaProduk = userInput.nextLine();
        listProduk.add(namaProduk);
        // ask qty produk
        System.out.println("Input QTY barang ke  " + countLoop + " : ");
        listQty.add(userInput.nextInt());
        userInput.nextLine(); 
        // ask price produk
        System.out.println("Input Harga Barang ke : " + countLoop);
        listPrice.add(userInput.nextInt());
        userInput.nextLine(); // membersihkan karakter newline
      
    
      } while (countLoop < totalLoop);

      int totalQty = 0;
      int subtotal = 0;
      //   increment
      for (int i = 0; i < listProduk.size(); i++) {
        int allPrice = listQty.get(i) * listPrice.get(i);
        subtotal += allPrice;
        totalQty += listQty.get(i);
      }
      // discount
      int discount = 10 ;//subtotal >= 1000000? 15: subtotal >= 750000 ? 10 : subtotal >= 500000 ? 5 : 0;
      int totalPrice = (int) (subtotal - (subtotal * discount / 100) + (subtotal * 0.1));
      // ask user cash
      System.out.println("Masukan jumlah cash : ");
      int cash = userInput.nextInt();
      if (cash < totalPrice) {
        System.out.println("Uang tidak cukup");
        return;
      }
      // protected function for print outpout
      System.out.println("Anda sudah melakukan perulangan sebanyak " + countLoop + " kali");
      print(listProduk, listQty,  listPrice, totalQty, subtotal,discount, totalPrice,cash);
  } 
  // protected function for print outpout
  protected static void print( ArrayList<String> listProduk,ArrayList<Integer> listQty,ArrayList<Integer> listPrice, int totalQty, int subtotal,int discount,int totalPrice,int cash) {
    String line = "-".repeat(35);
    System.out.println("\n\n");
    System.out.println(line);
    System.out.println(toko);
    System.out.println(jalan);
    System.out.println(alamat);
    System.out.println(line);
    System.out.printf( "%-20s %-5s %10s %10s\n", "Nama", "Qty", "Harga", "Total" );
    System.out.println(line);
    for (int i = 0; i < listProduk.size(); i++) {
      int allPrice = listQty.get(i) * listPrice.get(i);
      System.out.printf( "%-20s %-5d %10d %10d\n", listProduk.get(i), listQty.get(i), listPrice.get(i), allPrice );
    }
    System.out.println(line);
    System.out.printf("%-20s %,2d\n", "Subtotal :", subtotal);
    var percentage = discount + "%";
    System.out.printf("%-20s %2s\n", "Diskon :", percentage);
    System.out.printf("%-20s %,2d\n", "PPN (11%) :", (int) (subtotal * 0.11));
    System.out.println(line);
    System.out.printf("%-20s %,2d\n", "Total QTY :", totalQty);
    System.out.printf("%-20s %,2d\n", "Total :", (int) totalPrice  );
    System.out.printf("%-20s %,2d\n", "Bayar :", cash);
    System.out.printf("%-20s %,2d\n", "Kembali :",(int) (cash - totalPrice ));
    System.out.println(line);
    System.out.println(line);
    System.out.println("-------- Terima Kasih -----------");
  }
}
