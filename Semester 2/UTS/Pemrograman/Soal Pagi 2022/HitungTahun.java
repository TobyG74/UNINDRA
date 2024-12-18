import java.util.Scanner;

public class HitungTahun {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int hari, menit, tahun;
		
		final int asumsi_tahun = 365;
		
		System.out.print("Input jumlah menit : ");
		menit = in.nextInt();
		
		hari = menit % (60 * 24 * asumsi_tahun) / (60 * 24);
		tahun = menit / (60 * 24 * asumsi_tahun);
		System.out.printf("%s menit = %s tahun %s hari", menit, tahun, hari);
	}
}
