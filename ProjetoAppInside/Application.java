import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

       System.out.print("Nome: ");
       String nome = scanner.nextLine();
       System.out.print("Sobrenome: ");
       String sobrenome = scanner.next();

       System.out.print("Nome: " + nome +  " Sobrenome: " + sobrenome);
    }
}
