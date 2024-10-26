package mod1.ifelse;

import java.util.Scanner;

public class ex4{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número de 1 a 7 para representar um dia da semana: ");
        int dia = scanner.nextInt();

        String diaSemana;

        switch (dia) {
            case 1:
                diaSemana = "Domingo";
                break;
            
            case 2:
                diaSemana = "Segunda Feira";
                break;

            case 3: 
                diaSemana = "Terça Feira";
                break;

            case 4:
                diaSemana = "Quarta Feira";
                break;

            case 5: 
                diaSemana = "Quinta Feira";
                break;

                case 6:
                diaSemana = "Sexta Feira";
                break;

                case 7:
                diaSemana = "Sábado";
                break;

            default: diaSemana = "Número invalido";
        }

        System.out.println("O dia correspondente é: " + diaSemana);
    }
}