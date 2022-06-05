
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sayidan.isim;

import java.util.Scanner;

/**
 *
 * @author Devrim
 */
public class SayidanIsim {
public static void gonder(String[] a){
char b[][]=new char[1][16];
  //int j;  
for(int i=0;i<1;i++){
    
for(int j=0;j<16;j++){
b[i][j]+=a[i].charAt(j);

}
    
}
    
for(int i=0;i<1;i++){
for(int j=0;j<16;j++)  {
    System.out.println(" "+b[i][j]);
        }}
    //System.out.println();
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      String v[]={"123devrimevrim45"};
      //for(int i=0;i<v.length;i++){
      
      
      gonder(v);
    }
    
}
