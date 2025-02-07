package day_02;

import java.util.Scanner;

public class O2_MethodCreation {
    /*
    1-Verilen sayi1 ve sayi2 variable'larinin degerlerini degistiren (SWAP)
    bir program yaziniz.
     Orn :sati1=10 ve sayi2=20;
      kod calistiktan sonra
      sayi1=20 ve sayi2=10

     */
    public static void main(String[] args) {

        /*
        amac :
        1 scanner kullanmak
        2 method olusturmak
         */

        Scanner scan = new Scanner(System.in);//kullanicidan veri alacaksak mutlaka Scanner objesini olusturmaliyız
        //mesaj
        System.out.println("Lutfen birinci sayiyi giriniz");
        int sayi1=scan.nextInt();

        //ikinci sayi icin mesaj
        System.out.println("Lutfen ikinci sayiyi giriniz");
        int sayi2=scan.nextInt();

        System.out.println("swaptan once sayi1 :"+sayi1);
        System.out.println("swaptan  once sayi2 :"+sayi2);


        /*main method icinde method olustururken
        1.methoda verecegin ismi yaz(ozel isim)
        2. method parantezi koy
        3. paratezin icine varsa argumentlerini yaz)
        //swaplama : yer degistirme demek
         */
        swaplaYazdir(sayi1,sayi2);//main mathodun icinde argument


    }

    public static void swaplaYazdir(int sayi1, int sayi2) //parametre
    {
    int sayi3;
    sayi3=sayi1;//hem sayi1 de hem de sayi3 de aynı deger var.Bundan sonra sayi1 i bosaltabilirim degistirebilirim sayi3=10
    sayi1=sayi2;//sayi1 de 20 var, sayi2 yi degistirebilirim.
    sayi2=sayi3;
        System.out.println("swaptan sonra sayi1 : "+sayi1);
        System.out.println("swaptan sonra sayi2 : "+sayi2);


    }

}
