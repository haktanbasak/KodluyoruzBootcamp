import java.util.Scanner;

public class GradeAverage {
    public static void main(String[] args) {
        int mat, fizik, turkce, kimya, tarih, muzik, toplam;
        double ort;

        Scanner scan = new Scanner(System.in);

        System.out.println("Matematik notu : ");
        mat = scan.nextInt();

        System.out.println("Fizik notu : ");
        fizik = scan.nextInt();

        System.out.println("Türkçe notu : ");
        turkce = scan.nextInt();

        System.out.println("Kimya notu : ");
        kimya = scan.nextInt();

        System.out.println("Tarih notu : ");
        tarih = scan.nextInt();

        System.out.println("Müzik notu : ");
        muzik = scan.nextInt();

        toplam =  mat + fizik + turkce + kimya + tarih + muzik;
        ort = toplam / 6.0;
        System.out.println("Ortalama : " + ort);

        String sonuc = (ort>60) ? "\nSınıfı geçti." : "\nSınıfta kaldı.";
        System.out.println(sonuc);
    }
}
