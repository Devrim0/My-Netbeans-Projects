/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aaa;

import java.util.Scanner;

/**
 *
 * @author Devrim
 */
public class AAA {
public AAA(){
    System.out.println("ilk olusturucu");}
public AAA(int t){
    System.out.println("ikinci olusturucu="+t);
}
public AAA(String t,String y){
    System.out.println(t+"  "+y);
}    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
       AAA ali=new AAA();
       AAA veli=new AAA(8);
       String a=k.next();
       String b=k.next();
       AAA dey=new AAA(a,b);
    }
    
}
