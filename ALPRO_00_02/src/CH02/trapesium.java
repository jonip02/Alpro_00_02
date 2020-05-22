import java.util.Scanner;
public class trapesium {
    public static void main (String[]args){
        double alasatas,alasbawah,tinggi;
        double luas;
        
        Scanner scan= new Scanner(System.in);
        
        System.out.print("Masukkan tinggi trapesium : ");
        tinggi=scan.nextDouble();
        
        System.out.print("Masukkan alasbawah trapesium : ");
        alasbawah=scan.nextDouble();
        
        System.out.print("Masukkan alasatas trapesium : ");
        alasatas=scan.nextDouble();
        
        luas = tinggi* (alasatas+alasbawah) / 2;
        
        System.out.println("Luas Trapesium adalah : " + luas);
    }
    
    
}