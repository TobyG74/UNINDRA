import java.util.Scanner;
import java.text.DecimalFormat;

public class PajakPerseorangan {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		DecimalFormat formatter = new DecimalFormat("#0");
		
		int kategori, pendapatan;
		double pajak = 0;
		
		System.out.print("Status Kategori :\n1. Tidak Kawin\n2. Kawin\n");
		
		System.out.print("Input status kategori : ");
		kategori = in.nextInt();
		System.out.print("Masukan pendapatan anda dalam 1 tahun : ");
		pendapatan = in.nextInt();
		
		if (kategori == 1) {
		    if ((pendapatan >= 0) && (pendapatan <= 70000000)) pajak = 0.05 * pendapatan;
		    else if ((pendapatan >= 70000000) && (pendapatan <= 270000000)) pajak = 0.15 * pendapatan;
		    else if (pendapatan >= 270000000) pajak = 0.25 * pendapatan;
		} else if (kategori == 2) {
		    if ((pendapatan >= 0) && (pendapatan <= 50000000)) pajak = 0.05 * pendapatan;
		    else if ((pendapatan >= 50000000) && (pendapatan <= 250000000)) pajak = 0.15 * pendapatan;
		    else if (pendapatan >= 250000000) pajak = 0.25 * pendapatan;
		}
		System.out.print("Pajak anda adalah sebesar : " + formatter.format(pajak));
	}
}
