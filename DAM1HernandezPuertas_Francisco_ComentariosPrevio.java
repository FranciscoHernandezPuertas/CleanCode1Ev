import java.util.Scanner;
public class DAM1HernandezPuertas_Francisco_ComentariosPrevio {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int contadorNumeros = 1;
        String numeroString;
        int numero;
        int numerosPositivos = 0;
        int numerosPositivosOperacion = 0;
        int numerosNegativos = 0;
        int numerosNegativosOperacion = 0;
        int numerosCero = 0;
        do{
            System.out.print("Introduce el " + contadorNumeros + "º número: ");
            numeroString = scan.nextLine();
            numero = Integer.valueOf(numeroString);
            if(numero>0) {
                numerosPositivos++;
                numerosPositivosOperacion += numero;
            }
            else if(numero<0) {
                numerosNegativos++;
                numerosNegativosOperacion += numero;
            }
            else if(numero==0) {
                numerosCero++;
            }
            else
            System.out.println("Número inválido");
            contadorNumeros++;
        }while(contadorNumeros<21);
        System.out.println("Cantidad de números positivos: " + numerosPositivos);
        System.out.println("Media de números positivos: " + numerosPositivosOperacion/numerosPositivos);
        System.out.println("Cantidad de números negativos: " + numerosNegativos);
        System.out.println("Media de números positivos: " + numerosNegativosOperacion/numerosNegativos);
        System.out.println("Cantidad de ceros: " + numerosCero);
    }
}
