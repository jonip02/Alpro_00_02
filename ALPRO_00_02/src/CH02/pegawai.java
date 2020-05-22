import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class pegawai {
    public static void main (String[]args){
        String nik;
        String nama;
        String jabatan;
        boolean isaktif;
        
        Scanner scan= new Scanner(System.in);
        
        System.out.print(" Input NIK pegawai : ");
        nik=scan.nextLine();
        System.out.print(" Input Nama pegawai : ");
        nama=scan.nextLine();
        System.out.print(" Input Jabatan pegawai : ");
        jabatan=scan.nextLine();
        System.out.print(" Input is aktif pegawai : ");
        isaktif=scan.nextLine();
        
        System.out.println("");
        
        System.out.println("============================");
        
        System.out.println("NIK pegawai : "+nik );
        System.out.println("Nama pegawai : "+nama );
        System.out.println("Jabatan pegawai : "+jabatan );
        System.out.println("is aktif pegawai : "+isaktif );
    }
    
    
}