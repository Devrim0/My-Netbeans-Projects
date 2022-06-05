
package graphs;

import java.util.Arrays;

public class GRAPHS {
static class node {
int v;
int mat[][];
public node(int v){
this.v=v;
mat=new int[v][v];
}

void ekle(int src,int dest,int agirlik){
mat[src-1][dest-1]=agirlik;
}
void sil(int src,int dest){
    
mat[src-1][dest-1]=0;

}

void print(){
for(int i=0;i<v;i++){
  for(int j=0;j<v;j++)
System.out.print(mat[i][j]+" ");
 System.out.println("");
}
}


void agirliktoplami(){
    int sum=0;
for(int i=0;i<v;i++){
  for(int j=0;j<v;j++){
  
  if(mat[i][j]!=0){
  sum+=mat[i][j];
  }
  }}
    System.out.println("maliyet toplami:"+sum);
      
      
}
}
    public static void main(String[] args) {
        node n=new node(5);
        n.ekle(1,1,4);
        n.ekle(1,2,8);
        n.ekle(2,1,5);
        n.ekle(2,3,9);
        n.ekle(2,4,6);
        n.ekle(4,1,7);
        n.ekle(1,3,1);
        n.ekle(1,5,3);
        n.ekle(2,5,2);
        n.ekle(4,3,1);
        n.ekle(5,4,2);
        n.ekle(3,5,6);
        n.print();
        n.agirliktoplami();
        
   n.sil(3, 5);
        n.agirliktoplami();
    }
    
}
