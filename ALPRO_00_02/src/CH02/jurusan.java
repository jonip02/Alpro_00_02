import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class jurusan {
    public static void main (String[]args){
       
        String nama,akreditasi;
        int jumlahmahawiswa;
        
        
        Scanner scan= new Scanner(System.in);
        
    
        System.out.print(" Input Nama jurusan : ");
        nama=scan.nextLine();
        System.out.print(" Input Jumlah mahasiswa mahasiswa : ");
        jumlahmahawiswa=scan.nextInt();
        System.out.print(" Input Akreditasi  : ");
        akreditasi=scan.nextLine();
        
        System.out.println("");
        
        System.out.println("============================");
        
      
        System.out.println("Nama jurusan : "+nama );
        System.out.println("Alamat Mahasiswa : "+jumlahmahawiswa );
        System.out.println(" akreditasi : "+akreditasi );
    }
    
    
}