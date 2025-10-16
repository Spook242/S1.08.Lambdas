package nivel1Ejercicio3;

import java.util.Arrays;
import java.util.List;

public class Main {

    static void main(String[] args) {

        List<String> months = Arrays.asList(
                "January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"
        );

        System.out.println("Months of the year:");

        months.forEach(month -> System.out.println(month));
    }
}
