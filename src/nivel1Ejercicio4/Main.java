package nivel1Ejercicio3;

import java.util.Arrays;
import java.util.List;

public class Main {

    static void main(String[] args) {

        List<String> mesos = Arrays.asList(
                "Gener", "Febrer", "Març", "Abril", "Maig", "Juny",
                "Juliol", "Agost", "Setembre", "Octubre", "Novembre", "Desembre"
        );

        System.out.println("Mesos de l'any:");

        // Imprimim tots els elements amb una expressió lambda
        mesos.forEach(mes -> System.out.println(mes));
    }
}
