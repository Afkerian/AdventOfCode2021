
package Fuente;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author aleja
 */
public class DayOnePart2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic 
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> entrada = new ArrayList<>();
        int cont=0;
        int n = 0;
        while(n!=-1){
           // System.out.println(n);
            n = in.nextInt();
            if(n!=-1){
                entrada.add(n);
            }

        }
        
        for(int i =0;i<entrada.size()-3;i++){
            
            //System.out.println((entrada.get(i)+entrada.get(i+1)+entrada.get(i+2)));
            //System.out.println((entrada.get(i+1)+entrada.get(i+2)+entrada.get(i+3)));
            if((entrada.get(i)+entrada.get(i+1)+entrada.get(i+2))<(entrada.get(i+1)+entrada.get(i+2)+entrada.get(i+3))){
                cont++;
            }
        }
        System.out.println(cont);
    }
    
}
