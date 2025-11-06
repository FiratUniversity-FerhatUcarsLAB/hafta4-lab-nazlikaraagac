/*
 * Ad Soyad: Nazlı Karaağaç
 * Ogrenci No: 250541105
 * Tarih: 06.11.2025
 * Aciklama: Gorev 2 - Geometrik Hesaplayici
 *
 *Bu program bir dairenin yaricapini kullanicidan alir
 *ve dairenin alanini, capini, cevresini; kurenin hacmini,
 *yuzey alanini duzenli bir formatta ekrana yazdirir.

     
import java.util.Scanner;

public class GeometrikHesaplama {
    
    public static void main(String[] args) {
        final String GEOMETRIK_HESAPLAYICI = "=== GEOMETRIK HESAPLAYICI ===";
        final double PI =  3.14159;

        Scanner input = new Scanner(System.in);

        System.out.println(GEOMETRIK_HESAPLAYICI);

        System.out.print("Dairenin yaricapini giriniz (cm): ");
        double yaricap = input.nextDouble();

        double alan = PI * yaricap * yaricap;
        double cevre = 2 * PI * yaricap;
        double cap = 2 * yaricap;
        double hacim = (4.0 / 3.0) * PI * yaricap * yaricap * yaricap;
        double yuzeyAlani = 4 * PI * yaricap * yaricap;
       
        System.out.println("\n" + GEOMETRIK_HESAPLAYICI);
        System.out.printf("Daire Alani: %.2f cm^2%n", alan);
        System.out.printf("Daire Cevresi: %.2f cm%n", cevre);
        System.out.printf("Daire Capi: %.2f cm%n", cap);
        System.out.printf("Kure Hacmi: %.2f cm^3%n", hacim);
        System.out.printf("Kure Yuzey Alani: %.2f cm^2%n", yuzeyAlani);
      
        input.close();
    }
}
