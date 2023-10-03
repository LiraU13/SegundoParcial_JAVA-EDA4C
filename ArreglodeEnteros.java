import java.util.Scanner;

public class ArreglodeEnteros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduzca el tamaño del arreglo de enteros: ");
        int tamano = scanner.nextInt();

        int[] arregloEnteros = new int[tamano];

        for (int i = 0; i < tamano; i++) {
            System.out.println("Introduzca el valor entero para la posición " + i + " del arreglo: ");
            arregloEnteros[i] = scanner.nextInt();
        }

        int maximo = arregloEnteros[0];
        int minimo = arregloEnteros[0];
        int impares = 0;
        int pares = 0;

        for (int i = 0; i < tamano; i++) {
            if (arregloEnteros[i] > maximo) {
                maximo = arregloEnteros[i];
            }
            if (arregloEnteros[i] < minimo) {
                minimo = arregloEnteros[i];
            }
            if (arregloEnteros[i] % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }

        System.out.println("El valor máximo en el arreglo es: " + maximo);
        System.out.println("El valor mínimo en el arreglo es: " + minimo);
        System.out.println("Hay " + impares + " valores impares en el arreglo.");
        System.out.println("Hay " + pares + " valores pares en el arreglo.");
        
        scanner.close();
    }
}