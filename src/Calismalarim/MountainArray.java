package Calismalarim;

public class MountainArray {
    public static void main(String[] args) {
        /*Sorumuz
       Mountanin Array: Verilen herhangi bir arrayin Mountain Array olup olmadığını kontrol ediniz.
       Mountain Array --> [0,2,5,3,1]
       Bir array elemanları en büyük değerine kadar sürekli artan, en büyük değerden sonra sürekli azalan değer alıyorsa "Mountain Array" dir.
       Mountain array değildir --->[5,2,7,1,4]

         */
        int[]arr={5,2,7,1,4};
        int sayac=0;
        int enBuyukDeger=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>enBuyukDeger){
                enBuyukDeger=arr[i];
            }
        }
        if (enBuyukDeger>arr.length-1){
            enBuyukDeger=arr.length;
        }
        for (int i = 1; i <enBuyukDeger ; i++) {
            if (arr[i-1]<arr[i]){
                sayac++;
            }
        }
        for (int i = enBuyukDeger; i >arr.length ; i--) {
            if (arr[i+1]>arr[i]){
                sayac++;
            }
        }
        if (sayac==0) {
            System.out.println("Mountain array dgil");
        } else {
            System.out.println("Mountain array");
        }




        StringBuilder sb1 = new StringBuilder("OCAJP8");

        sb1.subSequence(2, 4);


        System.out.println(sb1);

    }






}
