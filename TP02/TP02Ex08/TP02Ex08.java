import java.util.Scanner;

public class TP02Ex08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] matriz = new int[3][4];
        int[][] matriz2 = new int[3][4];

        System.out.println("Digite doze valores:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = scan.nextInt();
            }
        }

        System.out.println("Digite uma constante multiplicativa:");
        int constante = scan.nextInt();

        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2[i].length; j++) {
                matriz2[i][j] = matriz[i][j] * constante;
            }
        }

        System.out.println("Matriz com os valores multiplicados:");
        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2[i].length; j++) {
                System.out.print(matriz2[i][j] + " ");
            }
            System.out.println();
        }
    }
}