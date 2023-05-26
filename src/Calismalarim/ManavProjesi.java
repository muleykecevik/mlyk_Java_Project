package Calismalarim;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ManavProjesi {

    static List<String> urunler= new ArrayList<>(Arrays.asList("1. Domates", "2. Soğan", "3. Portakal", "4. Elma", "5. Kivi"));
    static List<Integer> fiyatlar= new ArrayList<>(Arrays.asList(15, 18, 13, 10, 17));
    static int toplamFiyat=0;

    public static void main(String[] args) {
         /*
                   Basit bir 5 ürünlü manav alisveris programi yaziniz.
         1. Adim : urun listesinden urun sectir ve kac kilo oldugunu sor.
         2. Adim : Baska bir urun almak isteyip istemedigini sor.
                   istemiyorsa toplam miktari goster, istiyorsa tekrar urun sectir.
                   Bu islemi alisverisi bitirmek isteyene kadar tekrarla.
         3. Adim : Musteri her urun sectiginde, aldigi urunun fiyatini toplam fiyata ekle.
         4. Adim : Alisveris bitince toplam odemesi gereken tutari goster.
     */
        urunSec();
    }
    public static void urunSec() {

        Scanner scan= new Scanner(System.in);
        for (String each: urunler) {
            System.out.println(each);
        }
        System.out.println("Lutfen listeden urun seciniz");
        int urun= scan.nextInt();
        System.out.println("Kac kilo istiyorsunuz?");
        int kilo= scan.nextInt();
        System.out.println("Baska urun istiyor musunuz? İstiyorsaniz E'ye istemiyorsaniz H'ye basiniz");
        char devam=scan.next().charAt(0);

        toplamFiyat+=kilo*(fiyatlar.get((urun-1)));

        if (devam=='h' || devam=='H'){
            System.out.println("Odenecek toplam tutar : " + toplamFiyat );
        } else {
            urunSec();
        }
    }
}
