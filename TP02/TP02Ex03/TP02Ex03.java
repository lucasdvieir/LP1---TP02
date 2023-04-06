import java.util.Scanner;

public class TP02Ex03 {
	public static void main(String[] args) {
        int cont = 1;
		while(cont == 1){
	Scanner scan = new Scanner(System.in);
	int n;
	int numPositivos = 0;
	int numNegativos = 0;
	double valor,  media;
	double soma = 0;
	double maiorValor = 0;
	double menorValor = 0;
    
	
	
		System.out.println("Digite a quantidade de valores (positiva e menor que 20): ");
		n = scan.nextInt();

		do{
		if (n <= 0 || n >= 20) {
			System.out.println("Quantidade inválida. Digite novamente.");
		}
	} while (n <= 0 || n >= 20);
	
	for (int i = 1; i <= n; i++) {
		System.out.print("Digite o " + i + "º valor: ");
		valor = scan.nextDouble();

		soma += valor;
		media = soma / i;

		if(i == 1){
			maiorValor = valor;
			menorValor = valor;
		}

		if (valor > maiorValor) {
			maiorValor = valor;
		}

		if (valor < menorValor) {
			menorValor = valor;
		}

		if (valor > 0) {
			numPositivos++;
		} else if (valor < 0) {
			numNegativos++;
		}
	}
	
	if (n == 0) {
		System.out.println("Nenhum valor foi digitado.");
	} else {
		media = soma / n;
		double porcentagemPositivos = ((double) numPositivos / n) * 100;
		double porcentagemNegativos = ((double) numNegativos / n) * 100;

		System.out.println("Maior valor: " + maiorValor);
		System.out.println("Menor valor: " + menorValor);
		System.out.println("Soma dos valores: " + soma);
		System.out.println("Média aritmética: " + media);
		System.out.println("Porcentagem de valores positivos: " + porcentagemPositivos + "%");
		System.out.println("Porcentagem de valores negativos: " + porcentagemNegativos + "%");
	}
    System.out.println("Gostaria de executar novamente? 1 para Sim e 0 para ou Não");
    cont = scan.nextInt();;
	
} 
}
}
