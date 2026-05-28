import java.util.Locale;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        int y = 1;
        int x = 2;

        double z = 20.0;

        String muayThai = "Muay Thai";
        String capoeira = "Capoeira";
        String mma = "MMA";
        String jiuJitsu = "Jiu Jitsu";
        
        System.out.printf("%.2f%n", z);
        System.out.printf("%.4f%n", z);

        System.out.println(z);

        System.out.print(y);
        System.out.println(" é bom demaisssss");

        System.out.println("Olá mundo");
        System.out.println("Começar é sempre chato >.<");
        System.out.println("Acaba vídeo pelo amor de Deussss");

        System.out.println("RESULTADO = " + x + " METROS");

        System.out.printf(
                "QUERO DORMIR %s, %s, %s e %s%n",
                muayThai,
                capoeira,
                mma,
                jiuJitsu
        );

        // EXERCÍCIO

        String product1 = "Computer";
        String product2 = "Office Desk";

        int age = 30;
        int code = 5290;
        char gender = 'F';

        double price1 = 2100.0;
        double price2 = 650.50;
        double measure = 53.234567;

        System.out.println();
        System.out.println("Products:");

        System.out.printf("%s, which price is $ %.2f%n", product1, price1);
        System.out.printf("%s, which price is $ %.2f%n", product2, price2);

        System.out.println();

        System.out.printf("Record: %d years old, code %d and gender: %c%n",
                age, code, gender);

        System.out.printf("Measure with eight decimal places: %.8f%n", measure);
        System.out.printf("Rounded (three decimal places): %.3f%n", measure);
        System.out.printf("US decimal point: %.3f%n", measure);
    }
}
