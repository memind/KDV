package KDV;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        
        //Değişkenler
        double tutar, kdvliFiyat, kdvMiktarı;

        Scanner input = new Scanner(System.in);
        System.out.println("Tutar Girin: ");
        tutar = input.nextDouble();
        
        boolean kosul = tutar<1000;
        double kdvOran = kosul ? 0.18 : 0.08;
        
        double kdv = tutar*kdvOran;
        kdvliFiyat = kdv + tutar;
        kdvMiktarı = kdvliFiyat - tutar;

        System.out.println("KDV'siz Fiyat: "+ tutar+" TL");
        System.out.println("KDV Orani: "+kdvOran);
        System.out.println("KDV'li Fiyat: "+ kdvliFiyat+" TL");
        System.out.println("KDV Miktari: "+kdvMiktarı+" TL");
    }
}
