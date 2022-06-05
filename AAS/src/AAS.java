public  class AAS{

public AAS(){
    System.out.println("yazdir bir n");

}
public AAS(int t,int u){
int say=1;
for(int i=1;i<=u;i++){
say*=t;}
System.out.println(say);


}
public AAS(String x,char B){

String a=" ";
a+=x+B; 
System.out.println(a); }



public static void main(String[] args) {
   AAS nen=new AAS();
 AAS nr=new AAS(5,4);
 AAS nb=new AAS("devrim",'?');
}


}