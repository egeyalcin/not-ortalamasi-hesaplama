import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        int mat,fizik,kimya,turkce,muzik;

        Scanner inp = new Scanner(System.in);

        System.out.println("Matemaik Notunuz :");
        mat = inp.nextInt();

        System.out.println("Fizik Notunuz :");
        fizik = inp.nextInt();

        System.out.println("Kimya Notunuz :");
        kimya = inp.nextInt();

        System.out.println("Turkce Notunuz :");
        turkce = inp.nextInt();

        System.out.println("Muzik Notunuz :");
        muzik = inp.nextInt();

        int toplam = mat + fizik + kimya + turkce + muzik;
        int sonuc = toplam / 5;
        System.out.println("Sonuc" + sonuc);
        String str = sonuc > 60 ? "Sınıfı geçti" :  "Sınıfta kaldı";
        System.out.println(str);
    }
}
