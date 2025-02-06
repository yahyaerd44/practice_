package day_02;

public class OrnekCalısmalar {

    public static void main(String[] args) {

      int sayi=13;
      int sayi2=15;
      yazdır(sayi,sayi2);
      karesini(3,4);
    }

    private static void karesini(int a ,int b) {
        System.out.println(a*b);

    }

    private static int yazdır(int sayi,int sayi2) {
        System.out.println(sayi+sayi2);
        return sayi+sayi2;
    }



    }


