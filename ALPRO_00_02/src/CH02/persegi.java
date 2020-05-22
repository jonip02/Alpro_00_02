import java.util.Scanner;
public class persegi{
	public static void main(String[]args){
		int sisi,luas;
	Scanner s=new Scanner (System.in);
	
	System.out.print("Masukkan panjang sisi =");
	sisi=s.nextInt();
	luas= sisi*sisi;
	System.out.println("Luas Persegi Adalah = "+ luas);

	}
}