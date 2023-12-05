import java.util.Scanner;
public class DAM1HernandezPuertas_Francisco_FuncionesPrevio {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Introduzca una frase : ");
        String frase = scan.nextLine();
        if (frase.indexOf(" ") >= 0)
            System.out.println("La frase contiene " + frase.length() + " caracteres y contiene espacios"); 
        else
            System.out.println("La frase contiene " + frase.length() + " caracteres y no contiene espacios"); 
            if (frase.length() > 0) {
                        char primerCaracter = frase.charAt(0); // Obtiene el primer carácter de la frase
                        char ultimoCaracter = frase.charAt(frase.length() - 1); //Obtiene el último carácter de la frase

                        switch (Character.toLowerCase(primerCaracter)) {
                            case 'a':
                            case 'e':
                            case 'i':
                            case 'o':
                            case 'u':
                                System.out.println("La frase empieza por vocal");
                                break;
                            default:
                                System.out.println("La frase empieza por consonante");
                        }

                        switch (Character.toLowerCase(ultimoCaracter)) {
                            case 'a':
                            case 'e':
                            case 'i':
                            case 'o':
                            case 'u':
                                System.out.println("La frase termina por vocal");
                                break;
                            default:
                                System.out.println("La frase termina por consonante");
                        }
                    } else {
                        System.out.println("La frase está vacía.");
                    }
                }
            }
