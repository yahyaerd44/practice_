package day_02;

import java.util.Scanner;

public class C01_MethodCreation {
    //Fahrenheit degeri , Celsius degere ceviren method yazıniz.
    //formul : c = (f-32)/1.8
    //yani fahrenheit degerini bu methoda gonderdigimde bana celsius cinsinden sıcaklık  donmeli
    public static void main(String[] args) {
       //kullanicidan fahrenheit bir deger alalım
        //scanner objesi olusturalım
        Scanner scan=new Scanner(System.in);
        //kulanıcıya bir  mesaj verelim
        System.out.println("Lutfen fahrenheit cinsinden bir sicaklik giriniz");
        double fahrenheit=scan.nextDouble();//kullanicinin girmis oldugu veriyi fahrenheit variable'ına koydum.

        double celsius=fahrToCels(fahrenheit);
        System.out.println("fahrenheit = " + fahrenheit);
        System.out.println("celsius = " + celsius);

//dt practice 2.bolum 40. dk
    }

    public static double fahrToCels(double fahrenheit) {
        //formul : c = (f-32)/1.8
       double celsius=(fahrenheit-32)/1.8;

        return celsius;

    }


}
