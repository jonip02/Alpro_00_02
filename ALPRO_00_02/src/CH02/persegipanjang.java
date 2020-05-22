import java.util.Scanner;
public class persegipanjang{
	public static void main(String[]args){
		int panjang,lebar,luas;
	Scanner s=new Scanner (System.in);
	
	System.out.print("Masukkan panjang panjang =");
	panjang=s.nextInt();
	System.out.print("Masukkan panjang lebar =");
	lebar=s.nextInt();
	luas= panjang*lebar;
	System.out.println("Luas Persegi Panjang Adalah = "+ luas);

	}
}