import java.util.Scanner;
public class mahasiswa {
    public static void main (String[]args){
        String nim;
        String nama;
        String alamat;
        String hp;
        
        Scanner scan= new Scanner(System.in);
        
        System.out.print(" Input NIM mahasiswa : ");
        nim=scan.nextLine();
        System.out.print(" Input Nama mahasiswa : ");
        nama=scan.nextLine();
        System.out.print(" Input Alamat mahasiswa : ");
        alamat=scan.nextLine();
        System.out.print(" Input Nomor hp mahasiswa : ");
        hp=scan.nextLine();
        
        System.out.println("");
        
        System.out.println("=======================================");

        System.out.println("");
        
        System.out.println("NIM Mahasiswa : "+nim );
        System.out.println("Nama Mahasiswa : "+nama );
        System.out.println("Alamat Mahasiswa : "+alamat );
        System.out.println("Nomor hp Mahasiswa : "+hp );
    }
    
}