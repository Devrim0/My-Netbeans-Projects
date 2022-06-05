
import java.applet.Applet;

public class AdjacencyMatrix extends Applet{
  static  class matris{
    int src;int dest;
    public matris(int src,int dest){
    this.src=src;
    this.dest=dest;
    }
    }
  static   class Graph {
        int V;
        int[][] adjMatrix;
        int yoluzunlugu=0;

        Graph(int V) {
            this.V = V;
            adjMatrix = new int[V][V];
        }
        void addEdge(matris yeni) {
            adjMatrix[yeni.src-1][yeni.dest-1] = 1;
            adjMatrix[yeni.src][yeni.dest-1] = 1;
              
            
            System.out.println(yoluzunlugu);
        }
        matris removeEdge() {
            matris tmp=bas;
            adjMatrix[src-1][dest-1] =0;
            
        }
        void print() {
            for(int j = 0; j < V; j++) {
                for(int k = 0; k < V; k++)
              
                    System.out.print(adjMatrix[j][k]+" ");
                System.out.println();
            }
        }
    }
    public static void main(String[] args) {
    
        Graph G = new Graph(10);

        G.addEdge(new matris(1, 1));
 G.addEdge(new matris(1, 2)) ;    
 G.addEdge(new matris(1, 3)) ;    
 G.addEdge(new matris(1, 4));
 G.addEdge(new matris(1, 5)) ;    
 G.addEdge(new matris(2, 2)) ;    
 G.addEdge(new matris(2, 3));
 G.addEdge(new matris(2, 4)) ;    
 G.addEdge(new matris(2, 8)) ;    
 G.addEdge(new matris(2, 9));
 G.addEdge(new matris(3, 1)) ;    
 G.addEdge(new matris(3, 3)) ;    
 G.addEdge(new matris(3, 4));
 G.addEdge(new matris(3, 6)) ;    
 G.addEdge(new matris(3, 7)) ;    
 G.addEdge(new matris(4, 4));
 G.addEdge(new matris(4, 8)) ;    
 G.addEdge(new matris(5, 6)) ;    
 G.addEdge(new matris(5, 7));
    
        G.print();
  }
}
