package week05;
import java.util.ArrayList;
import java.util.Scanner;
public class Desimal_bineary {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Desimal deger giriniz");
        int sayi=scan.nextInt();
        System.out.println(sayi+" desimal degerin binary karsiligi " +binaryDonusum(sayi));
    }
    private static ArrayList<Integer> binaryDonusum(int sayi) {
        ArrayList<Integer> binary= new ArrayList<>();
        while (sayi>=1){
            binary.add(sayi%2);
            sayi/=2;
        }
     return binary;
    }



}
