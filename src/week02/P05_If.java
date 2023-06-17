package week02;

import java.util.Scanner;

public class P05_If {
    public static void main(String[] args) {


        Scanner scan= new Scanner(System.in);

        System.out.println("lutfen prim gunununzu ve yilinizi girin");

        int gun=scan.nextInt();
        int yil=scan.nextInt();


        if (yil>1999){
            System.out.println("eyt li degilsiniz");
        } else if (gun<5000){
            System.out.println("eyt li degilsiniz");
        }


    }
}
