package mod1.ifelse;

import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

         System.out.println("Insira uma nota entre 0 a 10: ");
         int nota = scanner.nextInt();

        String avaliacao;

        switch (nota) {
            case 0:
            case 1:
            case 2:
            case 3:
            avaliacao = "Reprovado!";
            break;

            case 4:
            case 5:
            avaliacao = "Insuficiente!";
            break;

            case 6:
            avaliacao = "Regular!";
            break;

            case 7:
            case 8:
            avaliacao = "Bom!";
            break;

            case 9:
            case 10:
            avaliacao = "Excelente!";
            break;

            default:
            avaliacao = "Nota inválida!";
                break;
        }

        System.out.println("Nota " + nota + ", " + avaliacao);
    }
}
