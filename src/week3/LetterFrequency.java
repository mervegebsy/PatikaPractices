package week3;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class LetterFrequency {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kelimeleri giriniz: ");
        String input = scanner.nextLine();

        Map<Character, Integer> harfSayilari = new LinkedHashMap<>();


        for (char ch : input.toLowerCase().toCharArray()) {
            if (Character.isLetter(ch)) {
                harfSayilari.put(ch, harfSayilari.getOrDefault(ch, 0) + 1);
            }
        }

        for (Map.Entry<Character, Integer> entry : harfSayilari.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

        scanner.close();
    }
}
