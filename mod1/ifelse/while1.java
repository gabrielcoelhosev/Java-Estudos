package mod1.ifelse;

import java.util.Scanner;

public class while1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String entrada;

            
        for(int i = 5; i >= 0; i--){
            System.out.println(i);
        }

        System.out.println("Digite algo (digite 'sair' para encerrar!)");

        while (true) {
            entrada = scanner.nextLine();

            System.out.println("Digite algo (digite 'sair' para encerrar!)");

            if (entrada.equalsIgnoreCase("sair")) {
                break;
            }
        }
    }
}
