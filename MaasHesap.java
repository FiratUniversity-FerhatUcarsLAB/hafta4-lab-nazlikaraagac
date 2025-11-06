/*
 * Ad Soyad: Nazlı Karaağaç
 * Ogrenci No: 250541105
 * Tarih: 06.11.2025
 * Aciklama: Gorev 3 - Maas Bordrosu
 *
 *Bu program kullanicidan calisanin adini-soyadini, aylik brut maasini,
 *haftalik calisma saatini ve mesai saati sayisini alarak calisanin maas 
 *bordrosunu ekrana yazdirir.

import java.util.Scanner;

public class MaasHesap {
    public static void main(String[] args) {
        final String MAAS_BORDROSU = "====================================\n" +
                                       "           MAAS BORDROSU\n" +
                                       "====================================";
        final String GELIRLER = "GELIRLER";
        final String KESINTILER = "KESINTILER";
        final double SGK_ORANI = 0.14;
        final double GELIR_VERGISI_ORANI = 0.15;
        final double DAMGA_VERGISI_ORANI = 0.00759;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Calisanin Adini ve Soyadini Giriniz: ");
        String calisanAdiSoyadi = scanner.nextLine();

        System.out.print("Calisanin Aylik Brut Maasini Giriniz (TL): ");
        double brutMaas = scanner.nextDouble();

        System.out.print("Calisanin Haftalik Calisma Saatini Giriniz: ");
        int haftalikCalismaSaati = scanner.nextInt();

        System.out.print("Calisanin Mesai Saati Sayisini Giriniz: ");
        int mesaiSaati = scanner.nextInt();

        double mesaiUcreti = (brutMaas / 160) * mesaiSaati * 1.5;
        double toplamGelir = brutMaas + mesaiUcreti;

        double sgk = toplamGelir * SGK_ORANI;
        double gelirVergisi = toplamGelir * GELIR_VERGISI_ORANI;
        double damgaVergisi = toplamGelir * DAMGA_VERGISI_ORANI;
        double toplamKesinti = sgk + gelirVergisi + damgaVergisi;

        double netMaas = toplamGelir - toplamKesinti;

        double kesintiOrani = (toplamKesinti / toplamGelir) * 100;

        double saatlikNetKazanc = netMaas / 176;

        double gunlukNetKazanc = netMaas / 22;

        System.out.println(MAAS_BORDROSU);
        System.out.printf("Calisan: %s%n", calisanAdiSoyadi);

        System.out.println(" ");
        System.out.println(GELIRLER);
        System.out.printf("   Brut Maas             : %.2f TL%n", brutMaas);
        System.out.printf("   Mesai Ucreti (10 Saat): %.2f TL%n", mesaiUcreti);
        System.out.println("   -----------------------");
        System.out.printf("   TOPLAM GELIR          : %.2f TL%n", toplamGelir);

        System.out.println(" ");
        System.out.println(KESINTILER);
        System.out.printf("   SGK Kesintisi (14.0%%) : %.2f TL%n", sgk);
        System.out.printf("   Gelir Vergisi (15.0%%) : %.2f TL%n", gelirVergisi);
        System.out.printf("   Damga Vergisi (0.8%%)  : %.2f TL%n", damgaVergisi);
        System.out.println("   ----------------------");
        System.out.printf("   TOPLAM KESINTI        : %.2f TL%n", toplamKesinti);

        System.out.printf("NET MAAS                 : %.2f TL%n", netMaas);
        System.out.println("====================================");

        scanner.close();  
    }
}

