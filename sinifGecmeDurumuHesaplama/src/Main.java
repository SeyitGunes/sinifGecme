import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int matematik, fizik, turkce, kimya, muzik;
        Scanner input = new Scanner(System.in);

        System.out.println("Matematik Notunuzu Giriniz: ");
        matematik = input.nextInt();
        System.out.println("Fizik Notunuzu Giriniz: ");
        fizik = input.nextInt();
        System.out.println("Türkçe Notunuzu Giriniz: ");
        turkce = input.nextInt();
        System.out.println("Kimya Notunuzu Giriniz: ");
        kimya = input.nextInt();
        System.out.println("Müzik Notunuzu Giriniz: ");
        muzik = input.nextInt();

        double ortalama = (matematik + fizik + turkce + kimya + matematik) / 5;

        if (ortalama >= 55) {
            System.out.println("***Sınıfı Geçtiniz Başarılısınız***" + ortalama);
        } else {
            System.out.println("!!!Sınıfta Kaldınız, Seneye Görüşmek Üzere!!!" + ortalama);
        }

    }
}
