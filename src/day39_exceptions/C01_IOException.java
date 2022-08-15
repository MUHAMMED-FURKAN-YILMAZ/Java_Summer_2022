package day39_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class C01_IOException {
    public static void main(String[] args) throws FileNotFoundException {

        /*
        Java'da bilgisayarimizdaki bir dosyaya erismek istiyorsak
        FileInputStream Class'indan yardim aliriz.
        Ayni sekilde Java'dan bilgisayarimizidaki bir dosyaya
        ekleme veya update yapmak istersek
        FileOutputStream Class'indan yardim aliriz.
         */

        FileInputStream fis = new FileInputStream("src/day39_exceptions/Test.txt");

        /*
        Goruldugu gibi compile time'da altini kirmizi cizen her durum
        Compile Tİme Error degildir
        Java'da bazi exception'lar da
        Compile Time Exception'dir
        Ozellikle dosya okuma ve yazma ile ilgili exception'lar
        Compile Time Exception'dir

        Compile Time Exception olustugunda Java cozum icin 2 ihtimal onerir
        1- try-catch ile cevrelemek
        2- method signature'ina throws keyword ile beklenen exception turunu yazmak

        throws exception, sadece olayin farkinda oldugumuzun deklarasyonudur
        exception'in handle edilmesinde hic bir rolu yoktur
        Yani try-catch ile kontrol altina aldigimiz exception'lar da
        kod calismaya devam ediyordu
        Ancak throws Exception yazdigimizda Java bir exception ile karsilasirsa
        hic bir sey yapmamisiz gibi hata mesaji yayinlayip calismayi durdurur.
        */

    }
}