/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bilangan.ganjil.pkgdo.pkgwhile;

import java.util.Scanner;
public class BilanganGanjilDoWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a;
        Scanner s = new Scanner (System.in);
        System.out.print("Masukkan Angka = ");
        a=s.nextInt();
        int i=1;
        do {
            System.out.print(i + " ");
            i += 2;
        }while (i<a);
    }
    
}
