package week02;

public class P11_StringMani {
    public static void main(String[] args) {

        String isim= "Ahmet";
        String soyIsim="Yil";

        if (isim.length()> soyIsim.length()){

           isim=isim.substring(0,1).toUpperCase()+ isim.substring(1).toLowerCase();
           soyIsim=soyIsim.substring(0,1).toUpperCase();
            System.out.println(isim+soyIsim);

        } else {

            isim=isim.substring(0,1).toUpperCase();
            isim=isim.substring(1).toLowerCase();
            soyIsim=soyIsim.toUpperCase();
            System.out.println(isim+soyIsim);


        }
    }
}
