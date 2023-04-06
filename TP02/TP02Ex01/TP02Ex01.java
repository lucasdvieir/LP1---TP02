import java.util.Scanner;

public class TP02Ex01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int primeiroValor, segundoValor;
        
            System.out.print("Digite o primeiro valor: ");
            primeiroValor = scan.nextInt();
    
        do{   
            System.out.print("Digite o segundo valor (maior que o primeiro): ");
            segundoValor = scan.nextInt();
            } while (segundoValor <= primeiroValor);
        
        System.out.println("Valores digitados: primeiro = " + primeiroValor + ", segundo = " + segundoValor);
    }
}