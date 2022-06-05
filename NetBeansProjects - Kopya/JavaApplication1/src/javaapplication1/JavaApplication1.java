/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author Devrim
 */
public class JavaApplication1 {
public static char[] donus(String x){
char c[]=new char[x.length()];
for(int i=0;i<x.length();i++){
c[i]=x.charAt(i);
}
return c;
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        String s1=k.next();
        char c1[]=new char[s1.length()];
        c1=donus(s1);
                for(int i=0;i<s1.length();i++){
                    System.out.print("  "+c1[i]);
                }
        // TODO code application logic here
    }
    
}
