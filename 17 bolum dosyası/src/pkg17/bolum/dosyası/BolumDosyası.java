/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg17.bolum.dosyası;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Devrim
 */
public class BolumDosyası {
public static void dosya(){
File fx=new File("ad.txt");
    try {
        PrintWriter px=new PrintWriter(fx);
        for(int i=0;i<=500;i++){
       if(i%17==0){
      px.println(i);
       } }
         px.close();
        
    } catch (FileNotFoundException ex) {
        Logger.getLogger(BolumDosyası.class.getName()).log(Level.SEVERE, null, ex);
    }
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        dosya();
        // TODO code application logic here
    }
    
}
