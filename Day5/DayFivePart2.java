package Fuente;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author aleja
 */
public class DayFivePart2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        File doc = new File("InputDay5.txt");
        Scanner sc = new Scanner(doc);
        ArrayList<String> entrada = new ArrayList<String>();
        int[][] plano = new int[1000][1000];
        String aux = "";
        int x1 = 0;
        int y1 = 0;
        int x2 = 0;
        int y2 = 0;
        //int diag = 0;
        int count = 0;
        while (sc.hasNextLine()) {
            aux = sc.nextLine();
            entrada.add(aux);
        }

        for (int i = 0; i < entrada.size(); i++) {

            String[] coordenadas = entrada.get(i).split(",| -> ", -2);
            x1 = Integer.parseInt(coordenadas[0]);
            y1 = Integer.parseInt(coordenadas[1]);
            x2 = Integer.parseInt(coordenadas[2]);
            y2 = Integer.parseInt(coordenadas[3]);
            //System.out.println("A(" + x1 + " , " + y1 + ") -> B(" + x2 + " , " + y2 + ")");

            if ((x1 == x2) && (y1 == y2)) {
                //2,4 ->  2,4
                //8,8 - 8,8
                if (x1 == y1) {
                    plano[x1][y1]++;
                }
                //System.out.println("Punto Comun: "+x1);
            } else {
                //Horizontal
                if (x1 == x2) {
                    if (y1 > y2) {
                        while (y1 >= y2) {
                            plano[x1][y2]++;
                            //System.out.println("y2: "+y2);
                            y2++;
                        }
                    } else {
                        while (y1 <= y2) {
                            plano[x1][y1]++;
                            //System.out.println("y1: "+y1);
                            y1++;
                        }
                    }

                }
                //Vertical
                if (y1 == y2) {

                    if (x1 > x2) {
                        while (x1 >= x2) {
                            plano[x2][y1]++;
                            //System.out.println("x2: "+x2);
                            x2++;
                        }
                    } else {
                        while (x1 <= x2) {
                            plano[x1][y1]++;
                            //System.out.println("x1: "+x1);
                            x1++;
                        }
                    }

                }
            }
        }

        //Diagonales
        //int m = 0;
        for (int i = 0; i < entrada.size(); i++) {
            String[] coordenadas = entrada.get(i).split(",| -> ", -2);
            x1 = Integer.parseInt(coordenadas[0]);
            y1 = Integer.parseInt(coordenadas[1]);
            x2 = Integer.parseInt(coordenadas[2]);
            y2 = Integer.parseInt(coordenadas[3]);

            //Pendiente
            if (x1 != x2) {// No cero
                if ((((y2 - y1) / (x2 - x1)) == 1) || (((y2 - y1) / (x2 - x1) == -1))) {
                    int m = (y2 - y1) / (x2 - x1);
                    //x1=y1
                    if (x1 == y1) {
                        if (x1 > x2) {
                            while (x1 >= x2) {
                                plano[x2][x2]++;
                                x2++;
                            }
                        } else {
                            while (x1 <= x2) {
                                plano[x1][x1]++;
                                x1++;
                            }
                        }
                    } else {//x1!+y1 //Funciona
                        if (x1 > x2) {
                            if (y1>y2) {
                                while (x1 >= x2) {
                                    plano[x1][y1]++;
                                    x1--;
                                    y1--;
                                }
                            }else{
                                while(x1>=x2){
                                    plano[x1][y1]++;
                                    x1--;
                                    y1++;
                                }
                            }
                        }else{//x1<x2
                            if (y1>y2) {
                                while (x1 <= x2) {
                                    plano[x1][y1]++;
                                    x1++;
                                    y1--;
                                }
                            }else{
                                while(x1<=x2){
                                    plano[x1][y1]++;
                                    x1++;
                                    y1++;
                                }
                            }
                        }
                    }
                }
            }

        }

        //System.out.println(diag);
        //Cuenta Lineas sobrepuestas
        //System.out.println("\n\nTablero\n\n");
        for (int j = 0; j < plano.length; j++) {
            for (int k = 0; k < plano.length; k++) {
                //System.out.print(plano[j][k] + " ");
                if (plano[j][k] > 1) {
                    count++;
                }
            }
            //System.out.println("");
        }

        System.out.println(count);
    }

}
