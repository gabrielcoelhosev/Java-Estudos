package mod1.ifelse;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Determine o valor de a, b e c nos próximos Prompts para saber se estes podem formar um triângulo");

        System.out.println("Digite o valor de a: ");
        double a = scanner.nextDouble();

        System.out.println("Digite o valor de b: ");
        double b = scanner.nextDouble();

        System.out.println("Digite o valor de c: ");
        double c = scanner.nextDouble();



        if (a+b>c && a+c>b && b+c>a) {
            System.out.println("Pode ser um triângulo!");
        }
        else{
            System.out.println("Não pode ser um triângulo!");
        }
    }
}
