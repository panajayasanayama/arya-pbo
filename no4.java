 
package aryaa;
import java.util.Scanner;

public class no4 { 
    int banyakAngka;
    int total;
    int angka;

    void input() {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan banyak angka : ");
        banyakAngka = input.nextInt();

        total = 0;
        angka = 1;
    }

    void hitung() {
        for (int i = 1; i <= banyakAngka; i++) {
            System.out.print(angka + " ");

            total += angka;
            angka += 2;
        }
    }

    void tampilkanTotal() {
        System.out.println("\nTotal penjumlahan : " + total);
    }

}
