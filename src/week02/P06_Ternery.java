package week02;

import java.util.Scanner;

public class P06_Ternery {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);

        System.out.println("lutfen 3 kenar uzunlugu giriniz");

        int kenar1= scan.nextInt();
        int kenar2= scan.nextInt();
        int kenar3= scan.nextInt();


        System.out.println(kenar1>0 ? (kenar1 == kenar2 && kenar2 == kenar3) ? "eskenar ucgen" : "eskenar degil" : "yanlis giris");

    }
}
