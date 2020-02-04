
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Kumanda Programı....");
        Scanner scanner = new Scanner(System.in);
        String islemler
                = "\t1. Kanallari Goster\n"
                + "\t2. Kanal Ekle\n"
                + "\t3. Kanal Sil\n"
                + "\t4. Kanal Sayisini Goster\n"
                + "\tQ. Cikis İcin q'ya Basin";
        Kumanda kumanda = new Kumanda();

        while (true) {
            System.out.println(islemler);
            System.out.print("\tİslemi giriniz: ");
            String islem = scanner.nextLine();
            if (islem.equals("q")) {
                System.out.println(">>Programdan Cikiliyor...");
                break;
            } else if (islem.equals("1")) {
                kumanda.kanallariGoster(kumanda);
            } else if (islem.equals("2")) {
                System.out.print(">>Eklenecek Kanal : ");
                String kanal_ismi = scanner.nextLine();
                kumanda.kanalEkle(kanal_ismi);
            } else if (islem.equals("3")) {
                System.out.print(">>Silinecek Kanal : ");
                String kanal_ismi = scanner.nextLine();
                kumanda.kanalSil(kanal_ismi);
            } else if (islem.equals("4")) {
                System.out.println(">>Kanal Sayisi : " + kumanda.kanalSayisi());
            } else {
                System.out.println(">>Gecersiz islem....");
            }
        }
    }
}
