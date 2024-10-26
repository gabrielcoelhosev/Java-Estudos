package mod1.ifelse;

import java.util.Scanner;

public class ex2{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite dois Números e eu direi qual é maior");

        System.out.println("Digite o primeiro número: ");
        double numero1 = scanner.nextDouble();

        System.out.println("Digite o segundo número: ");
        double numero2 = scanner.nextDouble();

        if (numero1 > numero2) {
            System.out.println("O " + numero1 + " é maior que o número " + numero2);    
        }

        else if (numero2 > numero1) {
            System.out.println("O " + numero2 + "é maior que o número " + numero1);
        }
        
        else{
            System.out.println("Os números são iguais!");
        }
    }
}