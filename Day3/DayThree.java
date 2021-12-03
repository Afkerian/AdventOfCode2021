/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Fuente;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author aleja
 */
public class DayThree {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        File doc = new File("InputDay3.txt");
        Scanner sc = new Scanner(doc); 
        ArrayList <String> entrada = new ArrayList<String>();
        
        long gamma =0;//mas se repite
        long epsilon =0;//menos se repite
        String aux ="";
        String aux1 ="";
        int c0 = 0,c1 = 0,c2 = 0,c3 = 0,c4 = 0,c5 = 0,c6 = 0,c7 = 0,c8 = 0,c9 = 0,c10 = 0,c11 = 0,cero;
        int u0 = 0,u1 = 0,u2 = 0,u3 = 0,u4 = 0,u5 = 0,u6 = 0,u7 = 0,u8 = 0,u9 = 0,u10 = 0,u11 = 0,uno;
        
        
        
        while (sc.hasNextLine()){
            aux = sc.nextLine();
            entrada.add(aux);
        }
        
        for(int i=0;i<entrada.size();i++){
            if(1<=Integer.parseInt(entrada.get(i).substring(0, 1))){
                c0++;
            }else{
                u0++;
            }
            if(1<=Integer.parseInt(entrada.get(i).substring(1, 2))){
                c1++;
            }else{
                u1++;
            }
            if(1<=Integer.parseInt(entrada.get(i).substring(2, 3))){
                c2++;
            }else{
                u2++;
            }
            if(1<=Integer.parseInt(entrada.get(i).substring(3, 4))){
                c3++;
            }else{
                u3++;
            }
            if(1<=Integer.parseInt(entrada.get(i).substring(4, 5))){
                c4++;
            }else{
                u4++;
            }
            if(1<=Integer.parseInt(entrada.get(i).substring(5, 6))){
                c5++;
            }else{
                u5++;
            }
            if(1<=Integer.parseInt(entrada.get(i).substring(6, 7))){
                c6++;
            }else{
                u6++;
            }
            if(1<=Integer.parseInt(entrada.get(i).substring(7, 8))){
                c7++;
            }else{
                u7++;
            }
            if(1<=Integer.parseInt(entrada.get(i).substring(8, 9))){
                c8++;
            }else{
                u8++;
            }
            if(1<=Integer.parseInt(entrada.get(i).substring(9, 10))){
                c9++;
            }else{
                u9++;
            }
            if(1<=Integer.parseInt(entrada.get(i).substring(10, 11))){
                c10++;
            }else{
                u10++;
            }
            if(1<=Integer.parseInt(entrada.get(i).substring(11, 12))){
                c11++;
            }else{
                u11++;
            }
        }
        aux = "";
        if(c0>u0){
           aux+=0; 
        }else{
            aux+=1;
        }
        if(c1>u1){
           aux+=0; 
        }else{
            aux+=1;
        }
        if(c2>u2){
           aux+=0; 
        }else{
            aux+=1;
        }
        if(c3>u3){
           aux+=0; 
        }else{
            aux+=1;
        }
        if(c4>u4){
           aux+=0; 
        }else{
            aux+=1;
        }
        if(c5>u5){
           aux+=0; 
        }else{
            aux+=1;
        }
        if(c6>u6){
           aux+=0; 
        }else{
            aux+=1;
        }
        if(c7>u7){
           aux+=0; 
        }else{
            aux+=1;
        }
        if(c8>u8){
           aux+=0; 
        }else{
            aux+=1;
        }
        if(c9>u9){
           aux+=0; 
        }else{
            aux+=1;
        }
        if(c10>u10){
           aux+=0; 
        }else{
            aux+=1;
        }
        if(c11>u11){
           aux+=0; 
        }else{
            aux+=1;
        }
        gamma = Integer.parseInt(aux, 2);
        System.out.println("Gamma: "+aux);
        System.out.println(gamma);
        
        for(int i=0;i<=11;i++){
            if(Integer.parseInt(aux.substring(i, i+1))==0){
                aux1+=1;
            }else{
                aux1+=0;
            }
        }
        System.out.println("Epsilon: "+aux1);
        epsilon = Integer.parseInt(aux1, 2);
        System.out.println(epsilon);
        System.out.println(gamma*epsilon);
    }
    
}
