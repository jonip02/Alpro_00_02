import java.util.Scanner;

public class nomor2 {

	public static void main(String[] args) {
		
		System.out.println("Program menentukan nilai tertinggi antara variabel x, y dan z");
		System.out.println("");
		Scanner scan = new Scanner(System.in);

		int x, y, z;

		System.out.print("Masukkan nilai X : ");
		   x = scan.nextInt();
		System.out.print("Masukkan nilai Y : ");
		   y = scan.nextInt();
		System.out.print("Masukkan nilai Z : ");
		   z = scan.nextInt();

		   System.out.println("============================="); 

		if ((x > y) && (x > z)) {
			System.out.println("Nilai tertinggi nya adalah X : " +x);
		}else if ((y > x) && (y > z)) {
			System.out.println("Nilai tertinggi nya adalah Y : " +y);
		}else {
			System.out.println("Nilai tertinggi nya adalah Z : " +z);
		}

	}

}