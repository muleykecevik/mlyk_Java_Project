package week05;

import java.util.Scanner;

public class F04_methodCreation {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("lutfen pozitif bir tam sayi girin");
        int sayi= scan.nextInt();
        System.out.println(pozitifBolenleriBulma(sayi));
    }
    public static int pozitifBolenleriBulma (int sayi) {

        int sayac=0;
        for (int i = 1; i <=sayi ; i++) {
            if (sayi % i == 0) {
                sayac++;
            }
        }
        return sayac;
    }
}
