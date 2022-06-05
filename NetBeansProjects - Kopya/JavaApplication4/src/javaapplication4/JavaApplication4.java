/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;



/**
 *
 * @author Devrim
 */
public class JavaApplication4 {
public static void karakter(String s[]){ 
char c[][]=new char[3][3];
for(int i=0;i<3;i++){
for(int j=0;j<3;j++){
c[i][j]=s[i].charAt(j);
}
}
for(int i=0;i<3;i++){
    System.out.println();
    for(int j=0;j<3;j++){
        System.out.print("  "+c[i][j]);
}
}
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    String a[]={"dev","deh","rim"};
  
   karakter(a);
        System.out.println();
       
    }
    
}
