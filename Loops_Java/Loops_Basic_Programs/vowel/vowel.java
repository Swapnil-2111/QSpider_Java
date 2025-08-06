// package vowel;

public class vowel {
    public static void main(String[] args) {
        String op;
        for (int i = 65; i <= 122; i++) {
            if (i >= 65 && i <= 90 || i >= 97 && i <= 122) {
                op = switch (i) {
                    case 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' -> (char)i + " is a vowel";
                    default -> (char)i + " is a consonant";
                };
                System.out.println(op);
            }
        }
    }
}
