import java.util.Scanner;
public class DAM1HernandezPuertas_Francisco_NombresNuevo { /*Aquí cambiaríamos el nombre de la clase a cuadrado, sin embargo,
    para mantener el nombre del archivo y que se ejecute el código, lo mantenemos así*/
    public static void main(String[] args) {
        final int LONGITUD_MINIMA_LADO = 1;
        final int CERO = 0;

        Scanner escaner = new Scanner(System.in);
        String entradaNumero;
        int longitudLado;

        do {
            System.out.print("Introduzca la longitud del lado del cuadrado: ");
            entradaNumero = escaner.nextLine();
            longitudLado = Integer.valueOf(entradaNumero);
        } while (longitudLado < CERO);

        for (int fila = 0; fila < longitudLado; fila++) {
            for (int columna = 0; columna < longitudLado; columna++) {
                System.out.print("#");
                if (columna < longitudLado - LONGITUD_MINIMA_LADO) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
