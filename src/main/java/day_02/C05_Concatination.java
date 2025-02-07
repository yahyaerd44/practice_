package day_02;

public class C05_Concatination {
    public static void main(String[] args) {

        //SELIM isminin icerisinde bulunan harfleri kullanmadan yazdiriniz
        /*ASCİİ table kullaniniz

                S = 83,
                E = 69,
                L = 76,
                I = 73,
                M = 77

        */
        char S = 83;
        char E = 69;
        char L = 76;
        char I = 73;
        char M = 77;

        System.out.println(S+E+L+I+M);//char verilerin arasında + işareti varsa intelij bunları mat toplalar
        //yanyana yazdırmak icin(cocatenation icin) basına "" koyarak bu ifadeyi stringe ceviririz
        //string bir ifade ile neyi toplarsak toplayalım sonuc string olur (yan yana yazılır)
        System.out.println(""+S+E+L+I+M);

        //3.practice dersinde kaldım

    }

}
