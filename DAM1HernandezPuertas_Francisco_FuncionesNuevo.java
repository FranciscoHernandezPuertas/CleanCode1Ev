import java.util.Scanner;

public class DAM1HernandezPuertas_Francisco_FuncionesNuevo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Introduzca una frase : ");
        String frase = scan.nextLine();

        imprimirInformacionFrase(frase);
        verificarYMostrarCaracter(frase, "inicia");
        verificarYMostrarCaracter(frase, "finaliza");
    }

    private static void imprimirInformacionFrase(String frase) {
        if (frase.contains(" ")) {
            System.out.println("La frase contiene " + frase.length() + " caracteres y contiene espacios");
        } else {
            System.out.println("La frase contiene " + frase.length() + " caracteres y no contiene espacios");
        }
    }

    private static void verificarYMostrarCaracter(String frase, String tipo) {
        if (!frase.isEmpty()) {
            char caracter = obtenerCaracter(frase, tipo);
            imprimirTipoCaracter("La frase " + tipo + " por", caracter);
        } else {
            System.out.println("La frase está vacía.");
        }
    }

    private static char obtenerCaracter(String frase, String tipo) {
        switch (tipo) {
            case "inicia":
                return (frase.length() > 0) ? frase.charAt(0) : '\0';
            case "finaliza":
                return (frase.length() > 0) ? frase.charAt(frase.length() - 1) : '\0';
            default:
                return '\0';
        }
    }

    private static void imprimirTipoCaracter(String mensaje, char caracter) {
        if (esVocal(caracter)) {
            System.out.println(mensaje + " vocal");
        } else {
            System.out.println(mensaje + " consonante");
        }
    }

    private static boolean esVocal(char caracter) {
        switch (Character.toLowerCase(caracter)) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                return true;
            default:
                return false;
        }
    }
}
