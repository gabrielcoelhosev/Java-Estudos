package mod1.ifelse;

import java.util.Scanner;

public class for2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número de entrada: ");
        double num = scanner.nextDouble();

        for(int i = 1; i <= 10; i++){
            double conta = i * num;
            System.out.println(i + " x " + num + " = " + conta);
        }

    }
}
