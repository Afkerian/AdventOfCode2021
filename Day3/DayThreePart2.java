
package Fuente;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author aleja
 */
public class DayThreePart2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
         File doc = new File("InputDay3.txt");
        Scanner sc = new Scanner(doc); 
        ArrayList <String> entrada = new ArrayList<String>();
        ArrayList <String> entradaUnos = new ArrayList<String>();
        ArrayList <String> entradaCeros = new ArrayList<String>();
        ArrayList <String> entradaAux = new ArrayList<String>();
        long oxygen =0;//mas se repite
        long scrubber =0;//menos se repite
        String aux ="";
        String aux1 ="";
        int cero =0;
        int uno =0;
        
        while(sc.hasNext()){
            aux = sc.nextLine();
            entrada.add(aux);
            entradaAux.add(aux);
        }
        //System.out.println("Tamano de entrada Inicial: "+entrada.size());
        //Oxigeno
        for(int j=0;entrada.size()>1;j++){
            for(int i=0;i<entrada.size();i++){
                if(Integer.parseInt(entrada.get(i).substring(j, j+1))==1){
                    uno++;
                    entradaUnos.add(entrada.get(i));
                }else{
                    cero++;
                    entradaCeros.add(entrada.get(i));
                }
            }
            if(entrada.size()!=1){
                if(uno>cero){
                entrada.clear();
                entrada = (ArrayList<String>) entradaUnos.clone();
                entradaUnos.clear();
                entradaCeros.clear();

                }else if(uno<cero){
                    entrada.clear();
                    entrada = (ArrayList<String>) entradaCeros.clone();
                    entradaUnos.clear();
                    entradaCeros.clear();   
                }
                if(uno==cero){
                    entrada.clear();
                    entrada = (ArrayList<String>) entradaUnos.clone();
                    entradaUnos.clear();
                    entradaCeros.clear();
                }
            }
            
            if(j==11){
                j=0;
            }
            uno =0;
            cero =0;
            //System.out.println(entrada.size());
        }
        oxygen = Integer.parseInt(entrada.get(0), 2);
        System.out.println(oxygen);
        System.out.println("Tamano de entrada 1 Final: "+entrada.size());


        uno = 0;
        cero =0;
        entradaUnos.clear();
        entradaCeros.clear();
              
        //Depurador
        for(int j=0;entradaAux.size()>1;j++){
            for(int i=0;i<entradaAux.size();i++){
                if(Integer.parseInt(entradaAux.get(i).substring(j, j+1))==1){
                    uno++;
                    entradaUnos.add(entradaAux.get(i));
                }else{
                    cero++;
                    entradaCeros.add(entradaAux.get(i));
                }
            }
            if(entradaAux.size()!=1){
                if(uno<cero){
                entrada.clear();
                entradaAux = (ArrayList<String>) entradaUnos.clone();
                entradaUnos.clear();
                entradaCeros.clear();
            }else if(uno>cero){
                entrada.clear();
                entradaAux = (ArrayList<String>) entradaCeros.clone();
                entradaUnos.clear();
                entradaCeros.clear();
            }
            if(uno==cero){
                entrada.clear();
                entradaAux = (ArrayList<String>) entradaCeros.clone();
                entradaUnos.clear();
                entradaCeros.clear();
            }
            }
            
            if(j==11){
                j=0;
            }
            uno = 0;
            cero =0;
            
        }
        scrubber = Integer.parseInt(entradaAux.get(0), 2);
        System.out.println(scrubber);
        System.out.println("Tamano de entrada 2 Final: "+entradaAux.size());
        System.out.println(oxygen*scrubber);
        
    }
    
}
