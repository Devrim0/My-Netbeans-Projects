package grafıkarayuzkelimeisleme;

import java.util.Arrays;


public class WORDTEXT {

    static class dugum {

        public int dizi[][];
        public dugum ileri;

        public dugum(int dizi[][]) {
            this.dizi=dizi;
            ileri = null;
        }

    }

    static class yigit {

        public dugum top, tmp;

        public yigit() {

            top = null; //yigit islemleri
            //JFRAME İSLEMLERİ

        }

        boolean bosmu() {
            return top == null;
        }

        void ekle(dugum yeni) {
            if (bosmu()) {
                top = yeni;
            } else {
                yeni.ileri = top;
                top = yeni;
                
            }
        }

        dugum sil() {
            tmp = top;
            if (!bosmu()) {
                top = top.ileri;
            }
            return tmp;

        }

        dugum tepe() {
            if (!bosmu()) {
                return top;
            } else {
                return null;
            }
        }

    

    void bfs(dugum root){
            boolean visited[] = null;
    ekle(root);
    visited[root.dizi[0][0]]=true;
        System.out.println(root.dizi[0][0]+" ");
    while(!bosmu())
        root=tepe();
        sil();
      for(int i=0;i<6;i++){
      if(root.dizi[i][i]==1 &&visited[i]==true){
      ekle(root);
      visited[i+1]=true;
      
      }
          System.out.println(Arrays.toString(root.dizi)+" ");
      }  
        
    }
        
    }
    
    
    public static void main(String[] args){
        int d[][]={{1,0,0,0},{0,1,0,1,0}};
yigit t=new yigit();
t.bfs(new dugum(d));
    }
}
