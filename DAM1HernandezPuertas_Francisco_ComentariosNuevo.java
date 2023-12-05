import java.util.Scanner;
public class DAM1HernandezPuertas_Francisco_ComentariosNuevo {
    public static void main(String[] args) {
        Scanner escaner = new Scanner(System.in);

        // Inicializamos variables para conteo y operaciones
        int contadorNumeros = 1;
        String numeroString;
        int numero;
        int numerosPositivos = 0;
        int sumaNumerosPositivos = 0;
        int numerosNegativos = 0;
        int sumaNumerosNegativos = 0;
        int numerosCero = 0;

        // Inicio de la iteración para recoger números
        do {
            System.out.print("Introduce el " + contadorNumeros + "º número: ");
            numeroString = escaner.nextLine();
            numero = Integer.valueOf(numeroString);

            // Clasificación de números en una estructura de control
            if (numero > 0) {
                numerosPositivos++;
                sumaNumerosPositivos += numero;
            } else if (numero < 0) {
                numerosNegativos++;
                sumaNumerosNegativos += numero;
            } else if (numero == 0) {
                numerosCero++;
            } else {
                System.out.println("Número inválido");
            }

            contadorNumeros++;
        } while (contadorNumeros < 21);

        // Impresión de resultados
        System.out.println("Cantidad de números positivos: " + numerosPositivos);
        System.out.println("Media de números positivos: " + sumaNumerosPositivos / numerosPositivos);
        System.out.println("Cantidad de números negativos: " + numerosNegativos);
        System.out.println("Media de números negativos: " + sumaNumerosNegativos / numerosNegativos);
        System.out.println("Cantidad de ceros: " + numerosCero);
    }
}
