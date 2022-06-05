
package topsektirme;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

class top{
int x;
int y;
int vx;
int vy;
int r;
public top(int x,int y,int vx,int vy,int r){
this.x=x;this.y=y;this.vx=vx;this.vy=vy;this.r=r;
}
public top(){}
public int getR(){
return r;
}
public void setR(int r){
this.r=r;
}
public int getVX(){return vx;}
public void setVX(int vx){
this.vx=vx;
}

public int getVY(){return vy;}
public void setVY(int vy){
this.vy=vy;
}

public int getX(){return x;}
public void setX(int x){
this.x=x;}
public  int getY(){
  return y;  
    
}
public void setY(int y){
this.y=y;}

public void topciz(Graphics g,top topum){
g.setColor(Color.black);
g.fillOval(topum.x,topum.y, topum.r, topum.r);
topum.Git(g,topum);}
public void Git(Graphics g,top topum){
topum.x=topum.x+topum.vx;
topum.y=topum.y+topum.vy;
topum.topciz(g, topum);

}
}

public class TOPSEKTİRME extends Applet implements Runnable{
     top top1,top2,top3,top4;Thread Gorev;
    public void init(){
    Gorev= new Thread(this);
    setSize(600,600);
    top1=new top(30,30,Color.yellow,"kirmizi");
    top2=new top(80,200,Color.red,"kirmizi");
    top3=new top(100,100,Color.blue,"kirmizi");
    top4=new top(150,150,Color.green,"kirmizi");
    Gorev.start();
    }
    public void run(){
    while(true){
    try{
    hareketet();
    repaint();
    Gorev.sleep(1);
    }
    catch(InterruptedException e){
    }
    }
    }
    public void stop(){
    Gorev=null;
    }
public void paint(Graphics g){}

   
    

}
 class hatafirlat extends Exception{
tektop topum;
hatafirlat(){
topum=t;
}
}