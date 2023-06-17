package Personel;

public class Runner {
    public static void main(String[] args) {

        Calisan c1= new Calisan();

        System.out.println(c1.isim);
        System.out.println(c1.maas);
        System.out.println(c1.pozisyon);

        System.out.println("=======================");

       IdariPersonel c2= new IdariPersonel();

        System.out.println(c2.departman);
        System.out.println(c2.izinGunSayisi);

        System.out.println("=========================");

        AkademikPersonel c3=  new AkademikPersonel();
        System.out.println(c3.akademikUnvan);
        System.out.println(c3.bolum);

        Calisan c4= new AkademikPersonel();
        System.out.println(c4.getIsim());
        c4.setMaas(3.000);
        System.out.println(c4.getPozisyon());
        c4.setPozisyon("Prof");
        c4.setPozisyon("Ogr. Uyesi");
        System.out.println(c4.maas);
        System.out.println(c4.pozisyon);




    }
}
