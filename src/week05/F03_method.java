package week05;

import java.util.Scanner;

public class F03_method {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("lutfen pozitif bir tam sayi girin");
        int sayi= scan.nextInt();
        System.out.println(asalSayiKontrolEt(sayi));
    }

    public static String asalSayiKontrolEt(int sayi) {

        String sonuc="";

        for (int i = 2; i <sayi; i++) {
            if (sayi%i==0){
                sonuc="Sayi asal degil";
                break;
            } else {
                sonuc="sayi asal";
            }

        }
        return sonuc;
    }
}
