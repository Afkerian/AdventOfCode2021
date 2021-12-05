
package Fuente;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author aleja
 */
public class DayFour {

    
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        File doc = new File("InputDay4.txt");
        Scanner sc = new Scanner(doc); 
        ArrayList <String> entrada = new ArrayList<String>();
        ArrayList <int[][]> bingoTablero = new ArrayList<int[][]>();
        String aux ="";
        int ultimo = 0;
        int target = 0;
        int targetMenor = 100;
        int score =0;
        int scoreFinal =0;
        boolean bingo = false;
        //Numeros al azar
        aux = sc.nextLine();
        entrada.add(aux);
        
        //Matriz de numeros y tableros
        String[] numeros = entrada.get(0).split(",", -2);
        int[][] tableros = new int[5][5];
        
        //Se agrega cada matriz
        while(sc.hasNextLine()){
            aux = sc.nextLine();
            entrada.add(aux);
        }
        //System.out.println(numeros);
        /*
        for(int j=0;j<numeros.length;j++){
            System.out.println(numeros[j]); 
        }
        
        for(int j=0;j<5;j++){
            tableros[j][0] = Integer.parseInt(numeros[j]); 
            tableros[j][1] = Integer.parseInt(numeros[j]);
            tableros[j][2] = Integer.parseInt(numeros[j]);
            tableros[j][3] = Integer.parseInt(numeros[j]);
            tableros[j][4] = Integer.parseInt(numeros[j]);
        }
        String imprimir ="";
        for(int i = 0;i<5;i++){
            for(int j=0;j<5;j++){
                imprimir+=tableros[i][j]+"\t";
            }
            imprimir+="\n";
        }
        System.out.println(imprimir);
        */
        
        //Tableros
        for(int i=2;i<entrada.size();i=i+6){
            
            //Relleno tablero
            //01234567890123
            //03 05 04 12 32
            
            for(int j=0;j<5;j++){
                if(entrada.get(i+j).substring(0, 1).equalsIgnoreCase("\s")){
                    tableros[j][0] = Integer.parseInt(entrada.get(i+j).substring(1, 2));
                }else{
                    tableros[j][0] = Integer.parseInt(entrada.get(i+j).substring(0, 2));
                }
                if(entrada.get(i+j).substring(3, 4).equalsIgnoreCase("\s")){
                    tableros[j][1] = Integer.parseInt(entrada.get(i+j).substring(4, 5));
                }else{
                    tableros[j][1] = Integer.parseInt(entrada.get(i+j).substring(3, 5));
                }
                if(entrada.get(i+j).substring(6, 7).equalsIgnoreCase("\s")){
                    tableros[j][2] = Integer.parseInt(entrada.get(i+j).substring(7, 8));
                }else{
                    tableros[j][2] = Integer.parseInt(entrada.get(i+j).substring(6, 8));
                }
                if(entrada.get(i+j).substring(9, 10).equalsIgnoreCase("\s")){
                    tableros[j][3] = Integer.parseInt(entrada.get(i+j).substring(10, 11));
                }else{
                    tableros[j][3] = Integer.parseInt(entrada.get(i+j).substring(9, 11));
                }
                if(entrada.get(i+j).substring(12, 13).equalsIgnoreCase("\s")){
                    tableros[j][4] = Integer.parseInt(entrada.get(i+j).substring(13, 14));
                }else{
                    tableros[j][4] = Integer.parseInt(entrada.get(i+j).substring(12, 14));
                }

            }
            
            //Se juega el bingo
            for(int k=0;k<numeros.length&&bingo==false;k++){
                for(int h=0;h<5&&bingo==false;h++){//filas
                    for(int j=0;j<5&&bingo==false;j++){//columnas
                        if(Integer.parseInt(numeros[k])==tableros[h][j]){
                            tableros[h][j]=0;
                        }
                        if((tableros[h][0]+tableros[h][1]+tableros[h][2]+tableros[h][3]+tableros[h][4])==0){
                            bingo = true;
                        }
                    }
                    if((tableros[0][h]+tableros[1][h]+tableros[2][h]+tableros[3][h]+tableros[4][h])==0){
                        bingo = true;
                    }
                }
                ultimo = Integer.parseInt(numeros[k]);
                target = k+1;
            }
            bingo =false;
            //Compureba que Bingo se resolvio primero
            if(target<targetMenor){
                
                targetMenor=target;
                for(int h=0;h<5&&bingo==false;h++){
                    for(int j=0;j<5&&bingo==false;j++){
                        score+=tableros[h][j];
                        //System.out.println(score);
                    }
                }
                scoreFinal = score*ultimo;
                score =0;
            }
            //System.out.println("SC: "+scoreFinal+" Tarj: "+target);
        }
        
        System.out.println(scoreFinal);
    }
    
}
