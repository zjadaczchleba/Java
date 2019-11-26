package regex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Mejl {
    public static void main(String[] args) {
        while (true) {
            System.out.println("Podaj adres email użytkownika");
            String email = new Scanner(System.in).nextLine();
            String patternEmail = "^([a-z]|[A-Z]|[0-9]|[._#]|[^\\s\\t]){1,}@([a-z]|[A-Z]|[0-9]|[._#]|[^\\s\\t]){1,}\\.([a-z]|[A-Z]|[^\\s\\t]){2,}$";
            String patternLowerCase = ".*[a-z]{1,}.*";
            String patternUpperCase = ".*[A-Z]{1,}.*";
            String patternDigit = ".*[0-9]{1,}.*";
            String patternSpecialCharacter = ".*[-_.&]{1,}.*";
            String patternWithoutSpace = ".*[\\s|\\t]{1,}.*";

            // walidacja adresu e-mail
            if (Pattern.matches(patternEmail, email)) {
                System.out.println("Adres e-mail jest ok");
            } else {
                System.out.println("Błędny adres email");
                continue;
            }
            System.out.println("Podaj hasło użytkownika");
            String password = new Scanner(System.in).nextLine();
        }
    }
}
