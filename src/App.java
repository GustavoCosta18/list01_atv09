import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entre com uma temperatura em graus fahrenheint: ");
        double fahrenheint = sc.nextDouble();
        sc.close();

        double celcius = 5 * ((fahrenheint-32) / 9);

        System.out.println(fahrenheint + " graus fahrenheint, equivalem a " + celcius + "graus celcius.");
    }
}
