package week5;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir gün giriniz (örnek: MONDAY): ");
        String girilenGun = scanner.nextLine().toUpperCase();

        try {
            Day secilenGun = Day.valueOf(girilenGun);
            System.out.println(secilenGun + " günü çalışma saatleri: " + secilenGun.getCalismaSaati());
        } catch (IllegalArgumentException e) {
            System.out.println("Geçersiz gün girdiniz. Lütfen MONDAY, TUESDAY gibi İngilizce gün adlarını kullanınız.");
        }

        scanner.close();
    }
}
