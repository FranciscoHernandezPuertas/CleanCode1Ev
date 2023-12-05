import java.util.Scanner;
public class DAM1HernandezPuertas_Francisco_NombresPrevio {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String numeroString;
        int numeroInt;
        do{
            System.out.print("Introduzca un número para el lado del cuadrado: ");
            numeroString = scan.nextLine();
            numeroInt = Integer.valueOf(numeroString);
        }while(numeroInt<=0);

        for (int i = 0; i < numeroInt; i++) {
            for (int j = 0; j < numeroInt; j++) {
                System.out.print("#");
                if (j < numeroInt - 1) {
                    System.out.print(" ");
            }
        }
        System.out.println();
        }
    }
}