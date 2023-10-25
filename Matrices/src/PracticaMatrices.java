import java.util.Scanner;

public class PracticaMatrices {
    public static int[][] MulMat ( int[][] a, int[][] b ) {
        int[][] C = new int[a.length] [b[0].length];
        
        if (a[0].length != b.length) {
            System.out.println("Las matrices no se pueden multiplicar. Las columnas de A deben ser iguales a las filas de B.");
            return null;
        }

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                for (int k = 0; k < a[0].length; k++) {
                    C[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        return C;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
        System.out.println("Escribe las medidas de la matriz A:");
        int filA = scanner.nextInt();
        int colA = scanner.nextInt();
        int[][] A = new int[filA][colA];
        
        System.out.println("Escribe los valores de la matriz A:");
        for (int i = 0; i < filA; i++) {
            for (int j = 0; j < colA; j++) {
                A[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Escribe las medidas de la matriz B:");
        int filB = scanner.nextInt();
        int colB = scanner.nextInt();
        int[][] B = new int[filB][colB];
        
        System.out.println("Escribe los valores de la matriz B:");
        for (int i = 0; i < filB; i++) {
            for (int j = 0; j < colB; j++) {
                B[i][j] = scanner.nextInt();
            }
        }

        int[][] resultado = MulMat(A, B);
        
        if (resultado != null) {
            System.out.println("El resultado de la multiplicación de matrices es:");
            for (int i = 0; i < resultado.length; i++) {
                for (int j = 0; j < resultado[0].length; j++) {
                    System.out.print(resultado[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}