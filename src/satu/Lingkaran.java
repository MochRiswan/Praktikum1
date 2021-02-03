/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package satu;
import java.util.Scanner;

/**
 *
 * @author MOKLET-2
 */
public class Lingkaran {
    Scanner I = new Scanner(System.in);
    double r,phi=3.14,h;
    
    void hitung(){
        System.out.println("====================");
        System.out.print("Masukkan jari-jari(cm)\t= ");
        r = I.nextDouble();
        
        h = phi*r*r;
        System.out.println("Hasil\t\t\t= "+h+"cm2");
    }
}
