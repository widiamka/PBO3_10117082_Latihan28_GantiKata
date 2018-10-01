/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3_10117082_latihan28_gantikata;
import java.util.Scanner;
/**
 *
 *  Nama : WIDIAMEGA K
* Kelas : IF3
* NIM   : 10117082
* Deskripsi Program : program ini berisi program untuk mengganti kata
* dari sebuah kalimat dan inputannya berasal dari user
 */
public class PBO3_10117082_Latihan28_GantiKata {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String kalimat;
        String kata;
        String kataB;
        
        
        Scanner scn = new Scanner (System.in);
        System.out.println("=======PROGRAM MENGGANTI KATA========");
        System.out.println("");
        System.out.println("Masukkan Kalimat : ");
        kalimat = scn.nextLine();
       
        System.out.println("Ganti Kata : ");
        kata = scn.nextLine();
        
        System.out.println("Menjadi Kata : ");
        kataB = scn.nextLine();
        
 
        String gantiKata = kalimat.replace(kata,kataB);
        System.out.println("==========HASIL FORMATTING============");
        System.out.println("Kalimat Awal : "+kalimat);
        System.out.println("Kalimat Baru : "+gantiKata);
    
    
    }
    
}
