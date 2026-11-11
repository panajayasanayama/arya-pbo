
package aryaa;

public class no5 {
    void halfTriangle() {
        System.out.println("Half Triangle");

        for (int i = 1; i <= 5; i++) {
            for(int k=5;k>=i;k--){
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    void fullTriangle() {
        System.out.println("\nFull Triangle");

        for (int i = 1; i <= 5; i++) {
            int jumlah;

            if (i <= 3) {
                jumlah = 2 * i - 1;
            } else {
                jumlah = 2 * (5 - i) + 1;
            }
            for(int k=5;k>=i;k--){
                if(i<=3)System.out.print(" ");
                else if(i==4)System.out.print("  ");
                else System.out.print("     ");
            }
            for (int j = 1; j <= jumlah; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
