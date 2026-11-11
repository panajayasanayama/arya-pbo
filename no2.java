
package aryaa;
import java.util.Scanner;

public class no2 {
         int jumlah,angka;
        void penjumlahan() {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah bilangan: ");
        jumlah = input.nextInt();

        double total = 0;

        for (int i = 1; i <= jumlah; i++) {
            System.out.print("Masukkan angka ke-" + i + ": ");
            angka = input.nextInt();

            total += angka;
        }

        double rata = total / jumlah;

        System.out.println("Total jumlah: " + total);
        System.out.println("Rata-rata: " + rata);
    }
}


