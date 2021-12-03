
package Fuente;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author aleja
 */
public class DayTwo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        File doc = new File("InputDay2.txt");
        Scanner sc = new Scanner(doc); 
        ArrayList <String> entrada = new ArrayList<String>();
        int forward = 0;
        int down = 0;
        int up = 0;
        String aux1 = "";
        String aux = "";
        int j= 0;
        

        while (sc.hasNextLine()){
            aux = sc.nextLine();
            entrada.add(aux);
        }
        
        
        for(int i=0;i<entrada.size();i++){
            if(entrada.get(i).indexOf("forward")>=0){
                //forward #
                //012345678
                System.out.println("Ingreso"+i);
                aux = entrada.get(i).substring(8);
                forward+=Integer.parseInt(aux);
            }
            if(entrada.get(i).indexOf("down")>=0){
                //down #
                //012345
                aux = entrada.get(i).substring(5);
                down+=Integer.parseInt(aux);
            }
            if(entrada.get(i).indexOf("up")>=0){
                //up #
                //0123
                aux = entrada.get(i).substring(3);
                up+=Integer.parseInt(aux);
            }
        }
        j = down - up;
        System.out.println(forward*j);
        
    }
    
}
