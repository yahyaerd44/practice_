package day_02;

public class C01_Odev {
    // iki sayının kareleri toplamını bulan ve yazdıran bir method olusturunuz
    //main methodun icinde tanımladıgım iki sayının kareleri toplamını bulan ve yazdıran bir method olusturun
    public static void main(String[] args) {

        int a=2;
        int b=3;

            kareToplaYazdir(a,b);//buradaki parantez icindeki variablelara argument denir


    }
    public static void kareToplaYazdir(int sayi1,int sayi2) //method parantezinin icine  method body de kullanacagımız variableleri tanımlıyoruz
                                        //bunlara parametreler denir
    {
       int toplam= (sayi1*sayi1)+(sayi2*sayi2);
        System.out.println("toplam = " + toplam);



    }


    }

