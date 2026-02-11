public class VowelOrConsonant {
    public static void main(String[] args) {

        char value = 'a';

        if (value >= 'a' && value <= 'z') {

            if (value == 'a' || value == 'e' || value == 'i' || value == 'o' || value == 'u') {
                System.out.println("It is a vowel.");
            } else {
                System.out.println("It is a consonant.");
            }

        } else {
            System.out.println("Not an alphabet character.");
        }
    }
}
