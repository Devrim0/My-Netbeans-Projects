/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package string.ge.donustur.kodu;

import java.util.Scanner;

/**
 *
 * @author Devrim
 */
public class BB {
    public String don(char[]a){
    String s=" ";
    for(int i=0;i<a.length;i++)
        s+=a[i];
    return s;
    
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        // TODO code application logic here
        BB x=new BB();
        char a1[]={'d','e','i','s','n'}; 
            
        System.out.println(x.don(a1)); 
    }
    
}
