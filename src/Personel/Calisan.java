package Personel;

public class Calisan {
    /*
     Bir "Çalışan" sınıfı oluşturun.
     Bu sınıfın özellikleri "isim" (String), "maaş" (double) ve "pozisyon" (String) olsun.
     Ayrıca "Çalışan" sınıfında, "isim", "maaş" ve "pozisyon" özelliklerini ayarlamak ve almak için
     gerekli olan getter ve setter metodları da olmalıdır.
     Daha sonra, "İdariPersonel" sınıfı oluşturun ve "Çalışan" sınıfından türetin.
     "İdariPersonel" sınıfının ek özellikleri "departman" (String) ve "izinGünüSayısı" (int) olsun.
     "İdariPersonel" sınıfında, "departman" ve "izinGünüSayısı" özelliklerini ayarlamak ve almak için
     gerekli olan getter ve setter metodları da olmalıdır.
     Son olarak, "AkademikPersonel" sınıfı oluşturun ve "Çalışan" sınıfından türetin.
     "AkademikPersonel" sınıfının ek özellikleri "bölüm" (String) ve "akademikUnvan" (String) olsun.
     "AkademikPersonel" sınıfında, "bölüm" ve "akademikUnvan" özelliklerini ayarlamak ve almak için
      gerekli olan getter ve setter metodları da olmalıdır.
     */

    String isim="Isim belirtilmemis";
    double maas;
    String pozisyon="Pozisyon belirtilmemis";

    public String getPozisyon() {
        return pozisyon;
    }

    public void setPozisyon(String pozisyon) {
        this.pozisyon = pozisyon;
    }

    public double getMaas() {
        return maas;
    }

    public void setMaas(double maas) {
        this.maas = maas;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }
}

