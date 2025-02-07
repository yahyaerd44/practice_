package day_02;

import java.util.Scanner;

public class C04_Scanner {
    public static void main(String[] args) {

        //Kullanicidan aldiginiz character ile asagidaki gibi bir gorunum olusturunuz

              /*
                         A
                        A A
                       A A A
              */
        Scanner girdi=new Scanner(System.in);
        System.out.println("Lutfen bir karakter giriniz");
        //char data turunde bir veri almak istiyorum
        //oncak scanner objesinin(girdi) methodlarına bakınca nextChar diye bir
        //methodun olmadıgını gorduk
        //scanner ile char almak istiyorsak once string olarak alırız -> (next() methodu ile)
        //daha sonra bu stringin charAt(0)methodu ile 0. indexindeki karakteri alırız


        char ch=girdi.next().charAt(0);//0 burada 0.(sıfır) index demek,stringlerde index yapısı vardır ve sıfırdan baslar
        System.out.println(ch);

        System.out.println("================================================");
        /*
          A    -> 2 bosluk +ch + 2 bosluk
         A A    ->1 bosluk+ch+ 1 bosluk +ch+ 1 bosluk
        A A A   -> ch+1 bosluk + ch+ 1 bosluk + ch
        */

        //konsola bosluk(space) gormek icin mutlaka bi spacelerin "" icinde olması gerekir
        //"" dısındaki bosluklar onemsizdir
        System.out.println("  "+ ch +"  ");
        System.out.println(" "+ ch +" "+ ch +" ");
        System.out.println(ch + " "+ ch + " "+ ch);
        System.out.println("======================================================");
        //tek sout ile yapmak istesem -> \* ile yapariz -> imleci bir alt satira gecirir
        System.out.println("  "+ ch +"  \n "+ ch +" "+ ch +" \n"+ ch + " "+ ch + " "+ ch);
    }

}
