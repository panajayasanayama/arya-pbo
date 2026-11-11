
package aryaa;


public class no7 {
    int i;
    int batas = 5;

    void postIncrement() {
        System.out.print("Menggunakan i++ : ");

        i = 0;

        while (i < batas) {
            System.out.print(i++ + " ");
        }

        System.out.println();
    }

    void preIncrement() {
        System.out.print("Menggunakan ++i : ");

        i = 0;

        while (i < batas) {
            System.out.print(++i + " ");
        }

        System.out.println();
    }
}