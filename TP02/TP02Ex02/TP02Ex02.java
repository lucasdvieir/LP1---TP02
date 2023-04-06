import java.util.Scanner;

public class TP02Ex02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double valor, soma = 0, media;
        double maiorValor = 0;

        for (int i = 1; i <= 10; i++) {
            do {
                System.out.print("Digite o " + i + "º valor positivo: ");
                valor = scan.nextDouble();

                if (valor <= 0) {
                    System.out.println("Valor inválido. Digite novamente.");
                }
            } while (valor <= 0);

            if (valor > maiorValor) {
                maiorValor = valor;
            }

            soma += valor;
        }

            media = soma / 10;

            System.out.println("Maior valor: " + maiorValor);
            System.out.println("Soma dos valores: " + soma);
            System.out.println("Média aritmética: " + media);
        
    }
}