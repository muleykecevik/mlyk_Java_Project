package Personel;

public class AkademikPersonel extends Calisan {

   /*
   "AkademikPersonel" sınıfının ek özellikleri "bölüm" (String) ve "akademikUnvan" (String) olsun.
     "AkademikPersonel" sınıfında, "bölüm" ve "akademikUnvan" özelliklerini ayarlamak ve almak için
    gerekli olan getter ve setter metodları da olmalıdır.
            */

    String bolum="Bolum belirtilmemis";
    String akademikUnvan="Akademik unvan belirtilmemis";

    public String getAkademikUnvan() {
        return akademikUnvan;
    }

    public void setAkademikUnvan(String akademikUnvan) {
        this.akademikUnvan = akademikUnvan;
    }

    public String getBolum() {
        return bolum;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

    public static void main(String[] args) {
        Calisan cls1= new Calisan();
        cls1.isim="Ahmet";

    }

}
