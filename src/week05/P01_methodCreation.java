package week05;

import java.util.Scanner;

public class P01_methodCreation {
    static String output = "";

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir cumle ya da kelime girin");
        String input = scan.nextLine();
        stringdekiHarfleriYazdir(input, 4, 35);
    }

    public static void stringdekiHarfleriYazdir(String input, int baslangic, int bitis) {

        if (baslangic > bitis) {
            System.out.println("Hatali giris yaptiniz");
        } else if (baslangic > input.length() || bitis >= input.length() - 1) {
            System.out.println("Hatali giris yaptiniz, stringin sinirlari icinde bir deger girin");
        } else {
            input = input.replace(" ", "");
            for (int i = baslangic; i < bitis; i++) {
                output += input.charAt(i) + ",";
            }
            System.out.println(output);
        }
    }
}