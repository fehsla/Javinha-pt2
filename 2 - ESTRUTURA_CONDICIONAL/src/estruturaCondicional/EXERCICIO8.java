package estruturaCondicional;

import java.util.Scanner;
import java.util.Locale;

public class EXERCICIO8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        System.out.println("INFORME O SALARIO");
        double salarioLisarb = sc.nextDouble();

        double calculoImposto1;
        double calculoImposto2;
        double calculoImposto3;

        if (salarioLisarb >= 0 && salarioLisarb <= 2000) {

            System.out.println("ISENTO DE IMPOSTO");

        } else if (salarioLisarb > 2000 && salarioLisarb <= 3000) {

            calculoImposto1 = ((salarioLisarb - 2000) * 8) / 100;

            System.out.printf("SALARIO ATUAL: %.2f%n", salarioLisarb);
            System.out.printf("IMPOSTO 8%%: %.2f%n", calculoImposto1);

        } else if (salarioLisarb > 3000 && salarioLisarb <= 4500) {

            calculoImposto2 = ((3000 - 2000) * 8) / 100
                    + ((salarioLisarb - 3000) * 18) / 100;

            System.out.printf("SALARIO ATUAL: %.2f%n", salarioLisarb);
            System.out.printf("IMPOSTO DE 18%%: %.2f%n", calculoImposto2);

        } else {

            calculoImposto3 = ((3000 - 2000) * 8) / 100
                    + ((4500 - 3000) * 18) / 100
                    + ((salarioLisarb - 4500) * 28) / 100;

            System.out.printf("SALARIO ATUAL: %.2f%n", salarioLisarb);
            System.out.printf("IMPOSTO DE 28%%: %.2f%n", calculoImposto3);
        }

        sc.close();
    }
}
