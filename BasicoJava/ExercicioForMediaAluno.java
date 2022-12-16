import java.util.Scanner;

public class ExercicioForMediaAluno {
    public static void main(String[] args) {
        int quantidadeNotas = 1;
        double somaNotas = 0.0;
        double mediaDasNotas = 0.0;

        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.print("Digite sua nota:" + quantidadeNotas + ": ");
            String linha = scanner.nextLine();
            if(linha.equals("")) {
                quantidadeNotas--;
               break;
            }

            quantidadeNotas++;

            somaNotas += Double.parseDouble(linha);

        }

        mediaDasNotas = (somaNotas / quantidadeNotas);
        System.out.println("Soma das notas = " + somaNotas + " quantidade de notas = " + quantidadeNotas);
        System.out.println("Sua média das notas é = " + mediaDasNotas);
    }
}
