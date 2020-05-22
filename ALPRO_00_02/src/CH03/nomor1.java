

import java.util.Scanner;

public class nomor1 {

	public static void main(String[] args) {
	
		System.out.println("Program menentukan nilai tertinggi antara variabel x dan y");
		System.out.println("");

		Scanner scan = new Scanner(System.in);

		int x, y;

		System.out.print("Masukkan nilai X : ");
		   x = scan.nextInt();
		System.out.print("Masukkan nilai Y : ");
		   y = scan.nextInt();

		System.out.println("=============================");   

		if (x > y) {
			System.out.println("Nilai tertinggi nya adalah X : " +x);
		}else {
			System.out.println("Nilai tertinggi nya adalah Y : " +y);
		}


	}

}