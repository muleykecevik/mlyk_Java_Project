package Calismalarim;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Fibonacci {

    //Kullanıcadan alınanan bir tamsayıya kadar FIBONACCI dizisi oluşturun. 1 1 2 3 5 8

    public static void main(String[] args) {


        int sayi=0;

        fibonacci(sayi);
    }

    public static void fibonacci(int sayi) {

        List<Integer> sayilar= new ArrayList<>();
        sayilar.add(1);
        sayilar.add(1);
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen Fibonacci dizisi yazmak icin bir tam sayi giriniz");
        sayi=scan.nextInt();
        for (int i = 2; i <sayi; i++) {

            sayilar.add(sayilar.get(i-2)+ sayilar.get(i-1));

        }

        System.out.println(sayilar);
    }
}
