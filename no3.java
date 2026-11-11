
package aryaa;

import java.util.Scanner;
public class no3 {
    int baris;
    int angka;

    void input() {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan banyak baris : ");
        baris = input.nextInt();

        angka = 1;
    }

    void tampilkan() {
        for (int i = 1; i <= baris; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(angka + " ");
                angka++;
            }
            System.out.println();
        }
    }
}




