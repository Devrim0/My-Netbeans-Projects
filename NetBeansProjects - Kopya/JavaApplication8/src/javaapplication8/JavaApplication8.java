/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication8;

import java.io.File;

/**
 *
 * @author Devrim
 */
public class JavaApplication8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     File fx;
        fx= new File("c:İndirilenler\Belgeler\ad.txt");
     printWriter px=new printWriter(fx);
     px.print("ali"+"   osman  "+11);
     px.close();
    }

    
    
}
