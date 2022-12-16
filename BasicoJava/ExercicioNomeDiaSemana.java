import java.sql.SQLOutput;

public class ExercicioNomeDiaSemana {

    public static void main(String[] args) {
        int diaSelecionado = 2;
        String diaSemana = "";

        switch (diaSelecionado) {
            case 1:
                diaSemana = "Domingo";
                break;
            case 2:
                diaSemana = "Segunda-Feira";
                break;
            case 3:
                diaSemana = "Terça-feira";
                break;
            case 4:
                diaSemana = "Quarta-Feira";
                break;
            case 5:
                diaSemana = "Quinta-Feira";
                break;
            case 6:
                diaSemana = "Sexta-feira";
                break;
            case 7:
                diaSemana = "Sábado";
                break;
            default:
                diaSemana = "Inválido";
        }

        System.out.println("Dia da semana: " + diaSemana);

        //exercícios refatorado

        String diaString = switch (diaSelecionado) {
            case 1 -> "DOMINGO";
            case 2 -> "SEGUNDA";
            case 3 -> "TERCA";
            case 4 -> "QUARTA";
            case 5 -> "QUINTA";
            case 6 -> "SEXTA";
            case 7 -> "SÁBADO";
            default -> "Unexpected value: " + diaSelecionado;
        };

        System.out.println("Dia da semana: " + diaString);
    }
}
