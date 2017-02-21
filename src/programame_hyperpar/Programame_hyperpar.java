/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programame_hyperpar;

import java.util.Scanner;

/**
 *
 * @author profe
 * 
 * Número hyperpar
Tiempo máximo: 1,000-3,000 s  Memoria máxima: 4096 KiB
Se dice que un número es hyperpar cuando todos sus dígitos son pares. ¿Sabes identificarlos?

Entrada
La entrada consta de una serie de casos de prueba. Cada uno está compuesto de una única línea con un número no negativo ni mayor que 10^9.

Los casos de prueba terminan con un número negativo que no habrá que procesar.

Salida
Para cada caso de prueba se escribirá, en una línea independiente, SI si el número es hyperpar y NO si no lo es.

Entrada de ejemplo
2460
1234
2
-1
Salida de ejemplo
SI
NO
SI
 * 
 * 
 */
public class Programame_hyperpar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in=new Scanner(System.in);
        while (in.hasNext()) {
		long num = in.nextLong(); 
                int llargada=String.valueOf(num).length()-1;
  		if(num>0){
                    do{
                        long potencia=(long)Math.pow(10, llargada);
                        long digit=num/potencia;
                        if(digit%2!=0){
                            System.out.println("NO");
                            break;
                        }else{
                            num=num%potencia;
                            llargada--;
                        }
                    }while(llargada>=0);
                    if(num==0) System.out.println("SI");
                } else 
                    if(num==0) System.out.println("SI");
                    else {
                        break;
                    }    
	}
    }
    
}
