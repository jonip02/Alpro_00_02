/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author LENOVO
 */
import java.util.Scanner;
public class fakultas {
     public static void main (String[]args){
       
        String nama;
        int jumlahmahawiswa;
        
        
        Scanner scan= new Scanner(System.in);
        
    
        System.out.print(" Input Nama fakultas : ");
        nama=scan.nextLine();
        System.out.print(" Input Jumlah mahasiswa mahasiswa : ");
        jumlahmahawiswa=scan.nextInt();
      
        
        System.out.println("");
        
        System.out.println("============================");
        
      
        System.out.println("Nama jurusan : "+nama );
        System.out.println("Alamat Mahasiswa : "+jumlahmahawiswa );
     
    }
    
    
    
}
