package Fuente;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author aleja
 */
public class DaySixPart2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        File doc = new File("InputDay6.txt");
        Scanner sc = new Scanner(doc);
        ArrayList<Integer> entrada = new ArrayList<Integer>();
        String aux = "";
        int tamEntrada = 0;
        
        String[] casoBase = sc.nextLine().split(",", -2);
        
        for(int i=0;i<casoBase.length;i++){
            entrada.add(Integer.parseInt(casoBase[i]));
        }

        for (int i = 1; i <=256; i++) {
            //System.out.println(entrada.size());
            tamEntrada = entrada.size();//5
            for (int j = 0; j < tamEntrada; j++) {
               // System.out.println(entrada.size());
                switch (entrada.get(j)) {
                    case 8: {
                        entrada.set(j, 7);
                        break;
                    }
                    case 7: {
                        entrada.set(j, 6);
                        break;
                    }
                    case 6: {
                        entrada.set(j, 5);
                        break;
                    }
                    case 5: {
                        entrada.set(j, 4);
                        break;
                    }
                    case 4: {
                        entrada.set(j, 3);
                        break;
                    }
                    case 3: {
                        entrada.set(j, 2);
                        break;
                    }
                    case 2: {
                        entrada.set(j, 1);
                        break;
                    }
                    case 1: {
                        entrada.set(j, 0);
                        break;
                    }
                    case 0: {
                        entrada.set(j, 6);
                        entrada.add(8);
                        break;
                    }
                }
            }
        }
        System.out.println(entrada.size());

    }
    //Aumentar memoria haha Lo que no se saca con software se compenza con hardware - Gabriel Caceres 2021!
}
