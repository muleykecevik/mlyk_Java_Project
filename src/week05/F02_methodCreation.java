package week05;

import java.util.Scanner;

public class F02_methodCreation {
    static String duzenliStr="";
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen adinizi giriniz");
        String name=scan.nextLine();
        System.out.println("Lutfen soyadinizi giriniz");
        String surname=scan.nextLine();
        System.out.println(isimSoyisimYazdir(name, surname));
    }
    public static String isimSoyisimYazdir(String name, String surname) {
        name=name.toUpperCase().charAt(0)+name.substring(1).toLowerCase();
        surname=surname.toUpperCase().charAt(0)+surname.substring(1).toLowerCase();
       duzenliStr=name+" "+surname;
    return duzenliStr;
    }
}
