package clase_7_2017;

import java.util.Scanner;


// Dada una cadena de caracteres leída a través de teclado, muestra cada una de sus palabras en una línea diferente de pantalla.

public class PalabraXlinea {


    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        System.out.println(" Introduce frase ");
        String str1 = entrada.nextLine();
        String array[];
        array = str1.split(" ");
        
        for (String array1 : array) {
            System.out.println(array1);
        }
    }
}
