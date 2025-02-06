package day_01;

public class C01_Variables {
    public static void main(String[] args) {


        //Bir vaariable olustur ve yazdır
        // Variable neden olusturulur ?
        //cunku dinamik olması icin bir degeri tek yerden degistirmemiz yeterli.

        //sytax : variable data turu+ variable isim+ atama operatoru + variable deger
                     int                  yas               =               37              ;
                     int sayi =50;
        System.out.println(sayi); //ctrl + d ile satırın sonuna gelip alt alta cogaltabiliriz.
        System.out.println(sayi);
        System.out.println(sayi);

        //sayi= 50 seklinde etiketi ile yazdir
        System.out.println("sayi = " + sayi);

        //ctrl alt L ==> kodlarımızı duzenlemeye yarar.
        //bir variable ı etkiketiyle birlikte yazdırmanin kısa yolu = soutv
        System.out.println("sayi = " + sayi);

        System.out.println(sayi);

        //string bir variable olusturulım -> non- primitive bir data turu, "" icinde yazılır,buyuk harfle baslar.
        String isim ="Ali";
        //isim variable ını etiketiyle yazdır
        System.out.println("isim = " + isim);

        //Olusturdugun variable'ı farkli bir variable'a kopyala
        //yeni bir variable olusturacagım : benimYasim ve bu variable ın degeri yas variablenın degerine esit olsun(kopyalama yapıyor)
        int benimYasim =yas;

        String onunIsmi=isim;

        //camelCase :her kelimede kucuk harfle baslar buyuk harfe gecer
        //PascalCase :Buyuk harfle baslayıp buyuk harfle devam eder
        //snake_case :alt tre ile ayırır
        //kebab-case :normal tre ile ayırmaya denir.


        //Aynı satırda coklu variable deklere et
        int yil=2023, ay=5 ,gun=15;
        System.out.println("yil = " + yil);
        System.out.println("ay = " + ay);
        System.out.println("gun = " + gun);

        //Bir variable degerini guncelle
        //Az once olusturdugunuz isim variablenin degerini Veli olarak guncelle
        isim ="Veli";
        System.out.println("isim = " + isim);
        System.out.println("onunIsmi = " + onunIsmi);
        //Java yukarında asagı ve soldan saga calısır

        //Degiskenleri(variable) yazdır

        //bir variable deklere et :x --> deklare etmek =tanımlamak -> data turu +data ismi
        double x;

        //Bir variable baslat : y
        double y=12.5;

        //Baska bir variable baslat :z
        double z =33;// java buraya yazdımız 33 degerini 33.0 olarak algıladı ve hata vermedi.

        //x degiskenini y degiskeni ile baslat
        x =y;//bir variable bir scope(kapsam-main method) da sadece bir kez deklare edilebilir.

        //varable y'i guncelle
        y=13.9;//ondalikli sayilarda .(nokta) kullanirız

        //Degiskenleri yazdir
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);


    }

}
