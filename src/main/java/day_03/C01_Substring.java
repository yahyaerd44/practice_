package day_03;

import java.util.Scanner;

public class C01_Substring {
    public static void main(String[] args) {
    /*
    Kullanicidan ad ve soyadını aralarında bir bosluk olacak sekilde sisteme girmesini isteyiniz
    NOT : Yalnızca bir ad bir soyad girilmeli
    Ad ve Soyadı ilk harfleeri buyuk kalanı kucuk olacak sekilde alt alta yazdirin
    Ad    :Canan
    Soyad :Can
     */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen ad ve soyadinizi aralarında bir bosluk olacak sekilde giriniz.");
        String adSoyad = scan.nextLine();//next methodu sadece space'e kadar olan kısmı alır
        //ilk once space nin indexx ini bulurum
        //0 (sıfır) dan space index ine kadar olan kısmı substring ile alırım
        //space den bir sonra baslayan kısmın sonuna kadar kısmını soyad olarak alırım
        int spaceIndex = adSoyad.trim().indexOf(" ");//indexOf methodu ile parantez icine girdigimiz karakterin index ini verir
        //substring methodunun 2 formulu var
        //1.substring(index)-> yazilan indexten string in sonuna kadar olan kısmı string olarak dondurur
        //or: deniz -> substring(3)-->iz doner
        //2.substring(index1,index2)-> index1 dahil,index2 haric olmak uzere index1 den index2 ye kadar olan kısmı
        //string olarak doner
        //deniz->substring(2,4)->ni
        String ad = adSoyad.trim().substring(0, spaceIndex);
        String soyad = adSoyad.trim().substring(spaceIndex + 1);
        System.out.println("Ad : " + ad);
        System.out.println("Soyad : " + soyad);

        char adIlkHarf = ad.toUpperCase().charAt(0);
        String adKalani = ad.substring(1).toLowerCase();
        ad =adIlkHarf+adKalani;//concatenation(stringleri birlestirme-yanyana yazdırma)-ilk harf buyuk gerisi kucuk

        char soyadIlkHarf = soyad.toUpperCase().charAt(0);
        String soyadKalan = soyad.substring(1).toLowerCase();
        soyad =soyadIlkHarf+soyadKalan;
        System.out.println("Ad : " + ad);
        System.out.println("Soyad : " + soyad);





    }
}
