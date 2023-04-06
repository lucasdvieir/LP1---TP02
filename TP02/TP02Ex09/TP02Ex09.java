import java.util.Scanner;

public class TP02Ex09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o número de linhas da matriz (no máximo 10): ");
        int linhas = scan.nextInt();
        System.out.print("Digite o número de colunas da matriz (no máximo 10): ");
        int colunas = scan.nextInt();

        int[][] matriz = new int[linhas][colunas];

        System.out.println("Digite os valores da matriz:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = scan.nextInt();
            }
        }

        int[][] matrizT = new int[colunas][linhas];
        for (int i = 0; i < colunas; i++) {
            for (int j = 0; j < linhas; j++) {
                matrizT[i][j] = matriz[j][i];
            }
        }

        System.out.println("Matriz transposta:");
        for (int i = 0; i < matrizT.length; i++) {
            for (int j = 0; j < matrizT[i].length; j++) {
                System.out.print(matrizT[i][j] + " ");
            }
            System.out.println();
        }
    }
}