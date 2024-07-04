import java.util.Scanner;

public class App {
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);

       System.out.print("Digite um texto :");
       String texto = entrada.nextLine();

       String texto2 = texto.toUpperCase();

       System.out.println("Texto minúsculo :" + texto2 );

    }
}
