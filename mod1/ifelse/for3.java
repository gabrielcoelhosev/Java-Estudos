package mod1.ifelse;

import java.util.Scanner;

public class for3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número de entrada: ");
        double entrada = scanner.nextDouble();

        double somaTotal = 0;

        for(int i = 1; i <= 10; i++){
            double soma = i + entrada;
            
            if (soma % 2 == 0) {
                System.out.println(soma);
                somaTotal += soma;
            }
        }

        System.out.println("A soma do números pares é: " + somaTotal);
    }
}
