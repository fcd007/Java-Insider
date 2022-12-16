import java.util.Scanner;

public class ExerciciosForWhileDoWhile {
    public static void main(String[] args) {
        int numero = 0;
        int index = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número para gerar sua tabuada: ");
        String leitura = scanner.nextLine();
        int valor = Integer.parseInt(leitura);

        System.out.println("A tabuada de " + valor);
        System.out.println("----------------------------------");
        while(index <= 10) {
            if(leitura.isBlank() || leitura.isEmpty()) {
                break;
            }

            int resultado = index * valor;

            System.out.println(index + " x " + valor + " = " + resultado);
            index++;
        }
    }
}
