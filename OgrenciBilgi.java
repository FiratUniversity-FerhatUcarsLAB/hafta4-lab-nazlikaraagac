/*
 * Ad Soyad: Nazlı Karaağaç
 * Ogrenci No: 250541105
 * Tarih: 06.11.2025
 * Aciklama: Gorev 1 - Ogrenci Bilgi Sistemi
 * 
 * Bu program kullanicidan ogrenci bilgilerini alir ve
 * duzenli bir formatta ekrana yazdirir.
 * Diğer java dosyalarının başında da bu örnek formattaki gibi kısa bilgi giriniz
 */

import java.util.Scanner;

public class OgrenciBilgi {
    public static void main(String[] args) {
        final String SISTEM_BASLIK = "=== OGRENCI BILGI SISTEMI ===";
        final double GPA_LIMIT = 2.50;

        Scanner input = new Scanner(System.in);

        System.out.println(SISTEM_BASLIK);

        System.out.print("Adinizi giriniz: ");
        String ogrenciAdi = input.next();

        System.out.print("Soyadinizi giriniz: ");
        String ogrenciSoyadi = input.next();

        System.out.print("Ogrenci numaraniz: ");
        int ogrenciNumarasi = input.nextInt();

        System.out.print("Yasiniz: ");
        int yas = input.nextInt();

        System.out.print("GPA (0,00-4,00): ");
        double gpa = input.nextDouble();

        String durum = (gpa >= GPA_LIMIT) ? "Basarili Ogrenci" : "Basarisiz Ogrenci";

        System.out.println("\n" + SISTEM_BASLIK);
        System.out.printf("Ad Soyad   : %s %s%n", ogrenciAdi, ogrenciSoyadi);
        System.out.printf("Ogrenci No : %d%n", ogrenciNumarasi);
        System.out.printf("Yas        : %d%n", yas);
        System.out.printf("GPA        : %.2f%n", gpa);
        System.out.printf("Durum      : %s%n", durum);
        
        input.close();
    }
}
