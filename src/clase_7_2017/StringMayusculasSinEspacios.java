package clase_7_2017;

// Realiza un programa que lea una frase y nos la muestre en mayúsculas y sin espacios

import java.util.Scanner;

public class StringMayusculasSinEspacios {
    
    
    public static void main(String[] args) {
        
        System.out.println("introduzca una frase ");
         
        Scanner entrada = new Scanner(System.in);
           
        String frase = entrada.nextLine().toUpperCase().replace(" ","");
        
        
        System.out.println(frase);
        
        
    }
}
