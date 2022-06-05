/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package voltran;

/**
 *
 * @author Devrim
 */
public class voltman {
       class        ates {
    public void yuz(){ 
        int sayac=0;
        
        for(int i=0;i<100;i++){
            sayac++;
        if(sayac<51){System.out.println("ateşe devam edin: "+i);
                }
        else 
           break;
        }
        System.out.println("hava sicak cunku ates yer yeri kul etti");
    }
    
}
class     kar{
void yag(){

}
}
class hava{
void soguk(){

}
}
class yagmur{
void yagar(){

}
}

    ates aa=new ates();
    kar ba=new kar();
    hava bb=new hava();
    yagmur cc=new yagmur();
    
public static void main(String[] args){
    voltman tt=new voltman();
    tt.aa.yuz();
}
}