package proje;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Manav {

      static List<String> urunler= new ArrayList<>();
      static List<Double> fiyat = new ArrayList<>();

      static Scanner scan = new Scanner(System.in);

     static List<String> sepettekiUrunler= new ArrayList<>();
     static List<Double> sepettekiFiyat = new ArrayList<>();
     static List<Double> sepettekiKg = new ArrayList<>();

     static double toplamFiyat=0;
     static double toplamKg=0;


    public static void main(String[] args) {
        urunleriEkle(urunler,fiyat);

        boolean bittiMi=true;
        int secim;



        while (bittiMi) {

            System.out.println();
            System.out.println("Yapmak istediginiz islemi seciniz");

            System.out.println("1- Sepete Urun Ekle \n2- Odeme \n3- Islem iptal");

            secim=scan.nextInt();

            switch(secim){
                case 1 :
                    urunleriListele(urunler,fiyat);
                    sepeteEkle();
                    break;
                case 2 :

                    break;
                default:

            }
        }

    }

    private static void sepeteEkle() {

        System.out.println("Sepete eklemek istediginiz urun kodunu giriniz");
        int urunKodu=scan.nextInt();
        System.out.println("Kac kg almak istersiniz");
        double kg= scan.nextDouble();

        sepettekiUrunler.add(urunler.get(urunKodu));
        sepettekiFiyat.add(fiyat.get(urunKodu));
        sepettekiKg.add(kg);
        toplamKg+=kg;

        toplamFiyat+=fiyat.get(urunKodu)*kg;
        System.err.println("Mevcut Fiyat : "+toplamFiyat+"\nMevcut agirlik : "+toplamKg);
    }

    public static void urunleriEkle(List<String> urunler, List<Double> fiyat) {

        urunler.add("Domates");
        urunler.add("Patates");
        urunler.add("Biber");
        urunler.add("Sogan");
        urunler.add("Havuc");
        urunler.add("Elma");
        urunler.add("Muz");
        urunler.add("Cilek");
        urunler.add("Kavun");
        urunler.add("Uzum");
        urunler.add("Limon");

        fiyat.add(20.10);
        fiyat.add(30.20);
        fiyat.add(30.50);
        fiyat.add(20.30);
        fiyat.add(30.10);
        fiyat.add(50.20);
        fiyat.add(100.90);
        fiyat.add(60.10);
        fiyat.add(40.30);
        fiyat.add(20.70);
        fiyat.add(10.50);
    }

    public static void urunleriListele(List<String> urunler, List<Double> fiyat){
        System.out.println("\tNO\t\t\tURUN\t\t\tFIYAT" +
                "\n\t====\t\t========\t\t=======");

        for (int i = 0; i < urunler.size(); i++) {
            System.out.println("\t"+ i +"\t\t\t"+urunler.get(i)+"\t\t\t"+fiyat.get(i));
        }
    }



}
