public class ExerciciosMultas {

    public static void main(String[] args) {
        int permitida = 100;
        int velocidadeAtual = 101;
        int velocidadeConsiderada;
        int multa = 0;

        if(velocidadeAtual > permitida) {
            if(permitida < 100) {
                velocidadeConsiderada = velocidadeAtual + 7;
            } else {
                velocidadeConsiderada = velocidadeAtual + (int)(velocidadeAtual * 0.10);
            }

            int diferenca =velocidadeConsiderada - permitida;
            multa = diferenca * 10;
        }

        System.out.println("Valor multa R$" + multa);
    }
}
