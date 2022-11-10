
package com.mycompany.calculadorasimples;

/**
 *
 * @author Vitória Maria
 */
import java.util.Scanner;

public class CalculadoraSimples {

    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int x, y, z=0;
        String operador;
        System.out.println("Digite a opercao: ");
        x = scan.nextInt();
        operador = scan.next();
        y = scan.nextInt();
        
        if(operador.equals("+")){
            z = x + y;
        }
        if(operador.equals("-")){
            z = x - y;
        }
        if(operador.equals("*")){
            z = x * y;
        }
        if(operador.equals("/")){
            z = x/y;
        }
        
        System.out.println(z);       
    }
}
