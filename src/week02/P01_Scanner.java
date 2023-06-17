package week02;

import java.util.Scanner;

public class P01_Scanner {
    public static void main(String[] args) {

        /*
    1- Kullanıcıdan ad/soyad/yas/mail adresi/şifre bilgileirini alıp
    sisteme kaydedildiğini aşağıdaki formatta yazdırın.
    *****       KAYIT BAŞARILI      *****
    Adınız: Tarık
    Soyadınız: Yiğit
    Yaşınız:42
    Mail Adresiniz:tarik@yigit.com
    Şifreniz: A2e365
    şeklinde sistemimize kaydınız başarıyla tamamlanmıştır.


        */

        /*
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen adinizi girin");
        String name = scan.nextLine();
        System.out.println("lutfen soyainizi girin");
        String surname = scan.nextLine();
        System.out.println("lutfen yasinizi girin");
        int yas = scan.nextInt();
        System.out.println("lutfen e posta giriniz");
        String email = scan.next();
        System.out.println("lutfen sifrenizi girin");
        String pass = scan.next();
        System.out.println("*****       KAYIT BAŞARILI      *****");

        System.out.println("Adiniz : " +name );
        System.out.println("SoyAdiniz : " +surname );
        System.out.println("Yasiniz : " +yas );
        System.out.println("mailiniz : " +email );
        System.out.println("Sifreniz : " +pass );
        System.out.println("şeklinde sistemimize kaydınız başarıyla tamamlanmıştır.");
        System.out.println("===========================");
        System.out.println(name.charAt(0)+ ". " + surname + ", " + yas);

         */

        /*
        Yukarıda aldığınız bilgileri
        Kullanıcı : T.Yiğit, 42
        şeklinde yazdırın


        int a=100, h= 120;

        System.out.println("ucgenin alani : " + (a*h/2));
        */


        Scanner scan = new Scanner(System.in);

        /*
        3-Kullanıcıdan iki sayı alıp üçüncü bir
        değişken kullanmadan sayı değerlerini
           değiştirin (Swap)
         */


        System.out.println("lutfen iki sayi girin");


        double num1= scan.nextDouble();
        double num2= scan.nextDouble();

        System.out.println("number one : " + num1 + "number two : " + num2);

        System.out.println("==================");

        num1= num1+num2;

        num2=num1-num2;

        num1= num1-num2;

        System.out.println("number one : " + num1 + "number two : " + num2);


    }
}
