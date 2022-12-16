public class Fracao {
    int numerador;
    int denominador;

    public Fracao() {};
    public Fracao(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }

    Fracao multiplicar(Fracao fracao) {
        Fracao resultado = new Fracao();
        resultado.numerador = numerador * fracao.numerador;
        resultado.denominador = denominador * fracao.denominador;
        return resultado;
    }
}
