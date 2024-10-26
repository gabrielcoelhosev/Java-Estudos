package mod1.ifelse;
import java.util.Scanner;

public class ifelse{
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Quantas maçãs deseja comprar?: ");
    int quantia = scanner.nextInt();

    if (quantia < 12) {
        double preco = 0.30;
        double valorFinal = quantia * preco;
        System.out.println("Você está comprando " + quantia + " maçãs, está pagando R$ 0,30 por unidade, o preço final ficou em  R$" + valorFinal);
    }
    else{
        double preco = 0.25;
        double valorFinal = quantia * preco;
        System.out.println("Você está comprando " + quantia + " maçãs, está pagando R$ 0,25 por unidade, o preço final ficou em  R$" + valorFinal);
    }
  }
}