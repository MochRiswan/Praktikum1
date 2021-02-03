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
public class Persegi {
    Scanner I = new Scanner(System.in);
    double s,h;
    
    void hitung(){
        System.out.println("====================");
        System.out.print("Masukkan sisi(cm)\t= ");
        s = I.nextDouble();
        
        h = s*s;
        System.out.println("Hasil\t\t\t= "+h+"cm2");
    }
}
