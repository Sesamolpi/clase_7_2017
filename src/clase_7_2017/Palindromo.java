package clase_7_2017;

import java.util.Arrays;
import java.util.Scanner;
///////////////////////////////////////////////////////////////////////////////////////
//  Realiza un programa que lea una frase y nos diga si se trata de un palíndromo:  ///
///////////////////////////////////////////////////////////////////////////////////////

public class Palindromo {

    public static void main(String[] args) {
        System.out.println("introduzca la primera frase ");
        Scanner entrada = new Scanner(System.in);
   

        byte[] byteCaracteres1;
        byteCaracteres1 = entrada.nextLine().toLowerCase().replace(" ", "").getBytes();

        byte[] byteCaracteresOrdenado;
        byteCaracteresOrdenado = byteCaracteres1;

        Arrays.sort(byteCaracteresOrdenado);

////////////////////////////////////////////////////////////////////////////////////////////////
        System.out.println("introduzca la segunda frase  ");
           
        byte[] byteCaracteres2;
        byteCaracteres2 = entrada.nextLine().toLowerCase().replace(" ", "").getBytes();

        byte[] byteCaracteresOrdenado2;
        byteCaracteresOrdenado2 = byteCaracteres2;

        Arrays.sort(byteCaracteresOrdenado2);
        
        boolean bandera=false;
        if (Arrays.equals(byteCaracteresOrdenado, byteCaracteresOrdenado2)) {
            bandera=true;
            System.out.println("Es palindromo");
        } else {
            System.out.println("No es palindromo");
        }

        System.out.println(Arrays.toString(byteCaracteres1));
        System.out.println(Arrays.toString(byteCaracteresOrdenado));

        System.out.println(Arrays.toString(byteCaracteres2));
        System.out.println(Arrays.toString(byteCaracteresOrdenado2));


    }
}
