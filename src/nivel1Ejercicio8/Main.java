package nivel1Ejercicio8;

public class Main {
    public static void main(String[] args) {

        Reverser reverser = (text) -> new StringBuilder(text).reverse().toString();

        String original = "Postpunk";
        String reversed = reverser.reverse(original);

        System.out.println("Original: " + original);
        System.out.println("Reversed: " + reversed);
    }
}
