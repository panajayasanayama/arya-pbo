
package aryaa;

import java.util.Scanner;


public class no1 {
    int angka[]=new int[10];
    Scanner s=new Scanner(System.in);
    
    void masukanka(){
            for (int i = 0; i < 10; i++) {
            System.out.print("Masukkan angka ke-" + (i + 1) + ": ");
            angka[i] = s.nextInt();
        }

    }
    void besarkecil(){
        int terbesar = angka[0];
        int terkecil = angka[0];

        for (int i = 1; i < 10; i++) {
            if (angka[i] > terbesar) {
                terbesar = angka[i];
            }

            if (angka[i] < terkecil) {
                terkecil = angka[i];
            }
        }

        System.out.println("Bilangan terbesar: " + terbesar);
        System.out.println("Bilangan terkecil: " + terkecil);
    }       
    
}
