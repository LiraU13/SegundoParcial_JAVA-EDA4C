import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PromedioGenTICS {

    public static BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
    public static String entrada;

    public static double[] leerPromedios(int n) throws IOException {
        double[] proms = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Escribe el promedio individual del estudiante con el ID " + i + " :");
            entrada = bufer.readLine();
            proms[i] = Double.parseDouble(entrada);
        }
        return proms;
    }

    public static double calcularPromedioGrupo(double[] p) {
        double suma = 0;
        for (int i = 0; i < p.length; i++) {
            suma = suma + p[i];
        }
        return suma / p.length;
    }

    public static void imrpimirPromedios(double[] proms) {
        int i = 0;
        System.out.println("Promedios individuales del grupo: ");
        System.out.println("  IdAlumno         Promedio Individual");
        System.out.println("------------------------------------------");
        for (double prom : proms) {
            System.out.println("     " + i + "             " + prom);
            i++;
        }
    }

    public static void main(String[] args) throws IOException {
        final int NUMGRUPOS = 5;
        double promedioGeneral = 0;

        for (int grupo = 1; grupo <= NUMGRUPOS; grupo++) {
            System.out.println("Grupo " + grupo);
            System.out.println("--------------------");

            System.out.println("Escribe el tamaño del grupo: ");
            entrada = bufer.readLine();
            int t = Integer.parseInt(entrada);

            double[] promedios = leerPromedios(t);
            imrpimirPromedios(promedios);
            double promedioGrupo = calcularPromedioGrupo(promedios);
            System.out.println("PROMEDIO DEL GRUPO " + grupo + " ES: " + promedioGrupo);

            promedioGeneral += promedioGrupo;
            System.out.println();
        }

        promedioGeneral /= NUMGRUPOS;
        System.out.println("EL PROMEDIO GENERAL DE LOS " + NUMGRUPOS + " GRUPOS ES: " + promedioGeneral);
    }
}