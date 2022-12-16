public class Aplicativo {

    public static void main(String[] args) {
        Fracao fracao1 = new Fracao(2,4);
        Fracao fracao2 = new Fracao(3,2);

        Fracao resultado = fracao1.multiplicar(fracao2);

        System.out.println("Resultado = " + resultado.numerador + "/" + resultado.denominador);
    }
}
