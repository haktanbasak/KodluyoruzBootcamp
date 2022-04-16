import java.util.Scanner;

public class KDV {
    public static void main(String[] args) {
        double tutar, kdvOran;
        Scanner scan = new Scanner(System.in);
        System.out.print("Para tutarını giriniz : ");
        tutar = scan.nextDouble();

        kdvOran = (tutar >= 0 && tutar < 1000) ? 0.18 : 0.08;
        double kdv = tutar * kdvOran;
        double kdvliTutar = tutar + kdv;
        System.out.println("KDV tutarı : " + kdv);
        System.out.println("KDV'li tutar : " + kdvliTutar);
        
    }
}
