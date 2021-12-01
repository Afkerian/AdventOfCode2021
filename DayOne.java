/*
 Alejandro Moya - EPN
 */
package Fuente;

import java.util.Scanner;


public class DayOne {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int contador =0;
        int aux=0;
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        while(n!=-1){
            aux = in.nextInt();
            if(aux>n){
                contador++;
            }
            n=aux;
        }
        System.out.print(contador);
        
    }
    
}
