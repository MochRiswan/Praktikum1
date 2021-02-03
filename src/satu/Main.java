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
public class Main {
    
    public static void main(String[] args) {
        
        Scanner I = new Scanner(System.in);
        int p;
        System.out.println("Pilihan perhitungan");
        System.out.println("1. Luas lingkaran");
        System.out.println("2. Luas persegi");
        System.out.print("Masukkan pilihan=>");
        p = I.nextInt();
        
        Lingkaran luas1 = new Lingkaran();
        Persegi luas2 = new Persegi();
        
        switch(p){
            case 1:
                luas1.hitung();
                break;
            case 2:
                luas2.hitung();
                break;
            default:
                System.out.println("TIDAK TERSEDIA");
        }
    }
}
