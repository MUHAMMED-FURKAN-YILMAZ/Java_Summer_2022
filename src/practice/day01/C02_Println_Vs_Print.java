package practice.day01;

public class C02_Println_Vs_Print {
    /*
 println() ve print() arasinda tek fark var;
 println satir atliyor,
 print ise imlecin ayni satirda kalmasini sagliyor.
  */
    public static void main(String[] args) {
        System.out.println("****println****");
        System.out.println("welcome");
        System.out.println("java");
        System.out.println("practice");
        System.out.println("****print****");
        System.out.print("welcome");
        System.out.print(" java");
        System.out.print(" class");
    }
}
