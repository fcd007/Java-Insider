public class Aplicacao {

    public static void main(String[] args) {
        int numero = 10;
        int j = 10;

        if(numero % 2 == 0) {
            numero += 5;
        } else {
            numero *= 2;
        }

        System.out.println("valor número = " + numero);
    }
}
