import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int mat,fizik,kimya,turkce,tarih,muzik;

        Scanner input = new Scanner(System.in);

        System.out.print("Matematik notunuzu giriniz: ");
        mat=input.nextInt();

        System.out.print("Fizik notunuzu giriniz: ");
        fizik=input.nextInt();

        System.out.print("Kimya notunuzu giriniz: ");
        kimya=input.nextInt();

        System.out.print("Türkçe notunuzu giriniz: ");
        turkce=input.nextInt();

        System.out.print("Tarih notunuzu giriniz: ");
        tarih=input.nextInt();

        System.out.print("Muzik notunuzu giriniz");
        muzik=input.nextInt();

        int ort=(mat+fizik+kimya+turkce+tarih+muzik)/6;
        System.out.println(ort>=60 ?"Sınıfı Geçti":"Sınıfta Kaldınız");
    }
}
