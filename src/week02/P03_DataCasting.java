package week02;

import java.util.Scanner;

public class P03_DataCasting {
    public static void main(String[] args) {
        /*
        2- Kullanıcdan bir harf girmesini isteyiniz.
            O harften sonra gelen harfleri
            Girdiğiniz harf :
            Girdiğiniz harften sonraki  3 harf :
            şeklinde yazdrın.
            ipucu: char
        */

        // Scanner scan= new Scanner(System.in);
        // System.out.print("Lutfen bir harf giriniz : ");
        // char harf=scan.next().charAt(0);
        // System.out.println("Girdiginiz harf : " + harf);
        // System.out.println("Girdiginiz harften sonraki 3harf : "
        // + (char)(harf+1) + "," +
        // (char) (harf+2) + "," + (char) (harf+3));

        /*
        3- Kullanıcıdan iki double sayı alın ve
        ilk sayıyı ikinci sayıa bölün ve
        sonucu tam sayı yazdırın
        ipucu: sorumluluk bende
         */

        double sayi1= 50.4;
        double sayi2= 10.0;

        int sonuc= (int)(sayi1/sayi2);
        System.out.println(sonuc);


    }
}
