public class ExercicioForSomaPares {

    public static void main(String[] args) {
        int numero = 100;
        int somaDosPares = 0;

        for (int index = 0; index <= 100; index++) {
            if(index % 2 == 0) {
                somaDosPares += index;
                System.out.println("-----------------");
                System.out.println(index);
                System.out.println(somaDosPares);
                System.out.println("-----------------");
            }
        }

        System.out.println("Soma dos pares de 0 a 100 = " + somaDosPares);
    }
}