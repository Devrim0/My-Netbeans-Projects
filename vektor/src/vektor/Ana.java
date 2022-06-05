/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vektor;


 class Vektor {
 
     int ai,aj,ak;
 }
public class Ana{
  
    public static Vektor topla(Vektor V1,Vektor V2){
        int y=0;
    Vektor vr=new Vektor();
    vr.ai=V1.ai+V2.ai;
    vr.aj=V1.aj+V2.aj;
    vr.ak=V1.ak+V1.ak;
        
    y+=vr.ai+vr.aj+vr.ak;
        System.out.println(y);
        return vr;
    }
    public static void main(String[] args) {
        Vektor v1=new Vektor();
        Vektor v2=new Vektor();
        Vektor V3=new Vektor();
        v1.ai=9;v1.aj=8;v1.ak=6;
        v2.ai=1;v2.aj=6;v2.ak=3;
      V3=topla(v1,v2);
        System.out.println(" "+V3+"  ");
    }
    
}
