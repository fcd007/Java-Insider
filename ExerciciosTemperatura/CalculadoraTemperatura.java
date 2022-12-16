public class CalculadoraTemperatura {

    public static void main(String[] args) {
        var scanner = new java.util.Scanner(System.in);

        double temperaturaF = Double.parseDouble(scanner.nextLine());
        double temperaturaC = ((temperaturaF - 32) / 9) * 5;

        System.out.format("Temperatura em Celcius = %f.2", temperaturaC);
    }
}
