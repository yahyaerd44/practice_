package day_02;

import java.util.Scanner;

public class C03_Scanner {
    public static void main(String[] args) {
        //ctrl alt L sayfayı duzenleme

        //kullanicidan aldiginiz iki sayinin karelerinin birbirine esit olup olmadıgını  kontrol eden bir method yaziniz.
        //yani alınan iki sayinin kareleri esit ise true ,degilse false yazdirin
        Scanner input=new Scanner(System.in);//scanner objesi olusturdum ismine input verdim.
        System.out.println("Lutfen birinci sayı giriniz");
        int x=input.nextInt();
        System.out.println("Lutfen ikinci sayiyi giriniz");
        int y=input.nextInt();

      boolean sonuc=karelerEsitMi(x,y);
        System.out.println("sonuc = " + sonuc);
    }

    public static boolean karelerEsitMi(int x, int y) {
        //javada = isareti assigment(atama ) isaretidir.
        //matematiksel anlamdaki esit icin == kullanırız.

        boolean sonuc= x*x==y*y;

        return sonuc;

    }


}





