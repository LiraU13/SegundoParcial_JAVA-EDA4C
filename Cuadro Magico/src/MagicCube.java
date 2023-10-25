import java.util.Scanner;

public class MagicCube {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("\n---------------------- CONSTRUYENDO LA MATRIZ ----------------------");

        System.out.println("\nIngrese el número de columnas:");
        int columnas = scanner.nextInt();

        System.out.println("Ingrese el número de filas:");
        int filas = scanner.nextInt();

        int n = Math.max(columnas, filas);

        if (columnas != filas) {
            System.out.println("\n¡TU MATRIZ NO ES CUADRADA POR SUS MEDIDAS!");
            scanner.close();
            return;
        }

        int[][] matriz = new int[n][n];
        System.out.println("\nIngrese los valores de la matriz:");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = scanner.nextInt();
            }
        }

        System.out.println("\n---------------------- REALIZANDO LAS OPERACIONES ----------------------");

        int sumaFila = 0;
        int sumaColumna = 0;
        int sumaDiagonalPrincipal = 0;
        int sumaDiagonalSecundaria = 0;

        for (int i = 0; i < n; i++) {
            sumaFila = 0;
            sumaColumna = 0;

            for (int j = 0; j < n; j++) {
                sumaFila += matriz[i][j];
                sumaColumna += matriz[j][i];
            }

            sumaDiagonalPrincipal += matriz[i][i];
            sumaDiagonalSecundaria += matriz[i][n - i - 1];

            if (sumaFila != sumaColumna) {
                System.out.println("\nLa matriz no es un cuadro mágico.");
                scanner.close();
                return;
            }
        }

        if (sumaDiagonalPrincipal != sumaDiagonalSecundaria) {
            System.out.println("\nLa matriz no es un cuadro mágico.");
            scanner.close();
            return;
        }

        System.out.println("\n¡Tu matriz es un cuadro mágico!");

        System.out.println("\n---------------------- IMPRIMIENDO RESULTADOS ----------------------");

        System.out.println("\nMatriz:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\nEl resultado de las sumas es: " + sumaFila);

        scanner.close();
    }
}