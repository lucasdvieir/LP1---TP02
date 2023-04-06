//Nome: Anderson Rodrigues Ramos e Lucas Vieira Dos Santos Martins

import java.util.Scanner;

public class TP02Ex06 {
    public static void main(String[] args) {
        String[][] matriz = new String[2][3];

        matriz[0][0] = "Joao";
        matriz[0][1] = "Maria";
        matriz[0][2] = "Jose";
        matriz[1][0] = "Ana";
        matriz[1][1] = "Pedro";
        matriz[1][2] = "Mariana";

        System.out.println("Matriz:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}