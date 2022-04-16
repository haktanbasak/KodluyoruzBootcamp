import java.util.Scanner;

public class ÜçgenAlan {
    public static void main(String[] args) {
        int a, b, c, u;
        double  alan;
        Scanner scan = new Scanner(System.in);
        
        System.out.print("İlk kenarı giriniz : ");
        a = scan.nextInt();

        System.out.print("İkinci kenarı giriniz : ");
        b = scan.nextInt();

        System.out.print("Üçüncü kenarı giriniz : ");
        c = scan.nextInt();

        u = (a + b + c) / 2;
        System.out.println("Üçgenin çevresi : " + u*2);

        alan = Math.sqrt(u * (u-a) * (u-b) * (u-c));
        System.out.println("Alan : " + alan);

    }
}