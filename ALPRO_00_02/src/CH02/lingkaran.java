import java.util.Scanner;
public class lingkaran {
    public static void main (String []args) {
        double r;
        double luas;
        double phi = 3.14;
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan panjang Jari-jari :");
        r=scan.nextDouble();
        
        luas = phi*r*r;
        
        System.out.println("Luas lingkaran adalah : " + luas);
    }
}