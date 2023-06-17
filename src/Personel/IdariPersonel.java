package Personel;

public class IdariPersonel extends Calisan{

    /*
    Daha sonra, "İdariPersonel" sınıfı oluşturun ve "Çalışan" sınıfından türetin.
     "İdariPersonel" sınıfının ek özellikleri "departman" (String) ve "izinGünüSayısı" (int) olsun.
     "İdariPersonel" sınıfında, "departman" ve "izinGünüSayısı" özelliklerini ayarlamak ve almak için
     gerekli olan getter ve setter metodları da olmalıdır.
     */

    String departman="Departman belirtilmemis";
    int izinGunSayisi;

    public int getIzinGunSayisi() {
        return izinGunSayisi;
    }

    public void setIzinGunSayisi(int izinGunSayisi) {
        this.izinGunSayisi = izinGunSayisi;
    }

    public String getDepartman() {
        return departman;
    }

    public void setDepartman(String departman) {
        this.departman = departman;
    }

    public static void main(String[] args) {
       Calisan c5=new IdariPersonel();
        c5.pozisyon="Hoca";
        c5.maas=4000;
        c5.isim="Mehmet";
    }
}

