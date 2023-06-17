package week02;

public class P04_If {
    public static void main(String[] args) {

        /*
        2- Kullanıcıdan İki adet vize notu ve bir adet final notu girmesini isteyin
        Yıl sonu notunu vizeler %40 finaller % 60 olacak şekilde hesaplayıp
        Ders durumuna bu not 50'den büyük ise Geçtiniz Tebrikler! olduğunu 50'den
        küçükse Maalesef Kaldınız olarak aşağıdaki formatta yazdırınız

        Ad:
        Soyad:
        1.Vize:
        2. Vize:
        Final :
        Yıl Sonu Notu:
        Ders Durumu :
        */

        int vize=40;
        int fin=30;

        int ortalama= (vize*40/100) + (fin*60/100);

        if (ortalama>=50){
            System.out.println("gectiniz tebrikler");
        }
        if (ortalama<50){
            System.out.println("maalesef kaldiniz");
        }


    }
}
