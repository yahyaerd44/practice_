package day_01;

public class C05_MethodCreation {
    public static void main(String[] args) {

        // iki sayının kareleri toplamını bulan ve yazdıran bir method olusturunuz
        // 3 ve 5 -> yazdıracak
        //methodum sadece yazdırma islemi yapacak bu yuzden return type void olabilir.

        //main methodun icinde tanımladıgım iki sayının kareleri toplamını bulan ve yazdıran bir method olusturun
        kareTopla(3,5);//parantez icine tanımladıgımız degerlere argument denir
        kareTopla(10,100);
        kareTopla(4,9);
    }
    public static void kareTopla(int sayi1,int sayi2)//parametre diyoruz ve burada deklare ettigimiz variablelar
                                                    //method body kısminda kullanilabilir
    {
        int sonuc=sayi1*sayi1+sayi2*sayi2;
        System.out.println(sonuc);
    }
}
