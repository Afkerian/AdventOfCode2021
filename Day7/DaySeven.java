package Fuente;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author aleja
 */
public class DaySeven {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        File doc = new File("InputDay7.txt");
        Scanner sc = new Scanner(doc);
        ArrayList<Integer> entrada = new ArrayList<Integer>();
        ArrayList<Integer> entradaAux = new ArrayList<Integer>();
        int cont = 0;
        int contMin = 0;
        int numero = 0;
        int maximo = 0;
        int minimo = 0;

        String[] token = sc.nextLine().split(",", -2);

        for (int i = 0; i < token.length; i++) {
            entrada.add(Integer.parseInt(token[i]));
        }

        maximo = Collections.max(entrada);
        minimo = Collections.min(entrada);
        entradaAux.addAll(entrada);

        Set<Integer> set = new HashSet<>(entradaAux);
        entradaAux.clear();
        entradaAux.addAll(set);
        Collections.sort(entradaAux);

        for (int i = 0; i < entradaAux.size(); i++) {
            for (int j = 0; j < entrada.size(); j++) {
                cont += Math.abs(entrada.get(j) - entradaAux.get(i));
                
            }
            if (i == 0) {
                contMin = cont;
            }
            if (cont < contMin) {
                contMin = cont;
                numero = i;
                cont = 0;
            } else {
                cont = 0;
            }
        }
        System.out.println(contMin);

    }

}
