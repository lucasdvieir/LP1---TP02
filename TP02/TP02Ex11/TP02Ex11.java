import java.util.Scanner;

public class TP02Ex11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite a ordem da matriz: ");
        int ordem = scan.nextInt();

        if (ordem > 10) {
            System.out.println("A ordem da matriz deve ser no máximo 10.");
            return;
        }

        double[][] matriz = new double[ordem][ordem];

        for (int i = 0; i < ordem; i++) {
            for (int j = 0; j < ordem; j++) {
                System.out.print("Digite o elemento [" + (i+1) + "][" + (j+1) + "]: ");
                matriz[i][j] = scan.nextDouble();
            }
        }

        double det = calcularDeterminante(matriz);

        System.out.println("O determinante da matriz é: " + det);
    }

    // método recursivo para calcular o determinante
    public static double calcularDeterminante(double[][] matriz) {
        int n = matriz.length;

        if (n == 1) {
            return matriz[0][0];
        }

        double det = 0;

        for (int j = 0; j < n; j++) {
            det += Math.pow(-1, j) * matriz[0][j] * calcularDeterminante(obterMatrizMenor(matriz, 0, j));
        }

        return det;
    }

    // método auxiliar para obter a matriz menor
    public static double[][] obterMatrizMenor(double[][] matriz, int i, int j) {
        int n = matriz.length;
        double[][] menor = new double[n-1][n-1];

        int p = 0;
        int q = 0;

        for (int k = 0; k < n; k++) {
            if (k != i) {
                q = 0;
                for (int l = 0; l < n; l++) {
                    if (l != j) {
                        menor[p][q] = matriz[k][l];
                        q++;
                    }
                }
                p++;
            }
        }

        return menor;
    }
}