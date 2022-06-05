package kuyrukbreathsourch.algoritma;

import java.util.Arrays;
import static javafx.beans.binding.Bindings.length;

class kuyruk {

    int dizi[][];

    kuyruk ileri;
    int root;

    public kuyruk(int dizi[][], int root) {
        this.dizi = dizi;
        this.root = root;

    }

}

public class KUYRUKBREATHSOURCHALGORİTMA {

    public static int[][] matris = {
        {1, 1, 1, 1, 1, 0, 0, 1, 1, 1},
        {0, 1, 1, 1, 1, 1, 0, 1, 0, 1},
        {0, 0, 1, 0, 1, 1, 1, 0, 0, 1},
        {1, 0, 1, 1, 1, 0, 1, 1, 0, 1},
        {0, 0, 0, 1, 0, 0, 0, 1, 1, 1},
        {1, 0, 1, 1, 1, 0, 0, 1, 1, 0},
        {0, 0, 0, 0, 1, 0, 0, 1, 0, 1},
        {0, 1, 1, 1, 1, 1, 1, 1, 0, 0},
        {1, 1, 1, 1, 1, 0, 0, 1, 1, 1},
        {0, 0, 1, 0, 0, 1, 1, 0, 0, 1}};
    boolean[] ziyaret;

    kuyruk bas, son;
    int sayi;

    public KUYRUKBREATHSOURCHALGORİTMA() {

        bas = null;
        son = null;
        sayi = 0;

    }

    public boolean bosmu() {
        return son == null;
    }

    void ekle(kuyruk yeni) {
        if (bosmu()) {
            bas = yeni;
            son = yeni;
        } else {
            son.ileri = yeni;
            son = yeni;

        }

    }

    public kuyruk sil() {
        kuyruk sonuc = bas;
        if (bas != null) {
            sayi--;
        }
        bas = bas.ileri;
        if (bas == null) {
            son = null;
        }
        return sonuc;
    }

    void goster(int root) {
        kuyruk tmp = bas;
        if (tmp != null) {
            // System.out.println(tmp.root);
            tmp = tmp.ileri;

        }

    }

    void BFS(kuyruk dizi) {
        if (bosmu()) {
            ekle(dizi);
          System.out.println(dizi.root);  
         ziyaret[dizi.root] = true;
        }
        while (!bosmu()) {

 
            for (int i = 0; i < dizi.dizi.length; i++) {

                if (dizi.dizi[dizi.root][i] == 1 && ziyaret[i]==false ) {

                  
                       
                        ekle(dizi.ileri);
                        sayi++;
                        System.out.print(dizi.ileri.dizi[dizi.root][i] + "  " + i);
//                       if(  ziyaret[i] == true){sil();}
                       
                       
                     if (dizi.dizi[dizi.root][i] == 0 ) {
                     i+=1;
                  ekle(dizi.ileri);
                       System.out.print(dizi.ileri.dizi[dizi.root][i+1] + "  " + i);}

                     }
                
            }
        }

        System.out.println(sayi);

    }

              //  System.out.println(sayi);
    //System.out.println( sil().dizi);
    public static void main(String[] args) {
        KUYRUKBREATHSOURCHALGORİTMA b = new KUYRUKBREATHSOURCHALGORİTMA();
        int i, j;
        for (i = 0; i < matris.length; i++) {
            for (j = 0; j < matris.length; j++) {
                // b.ekle(new kuyruk(d,d[0][0]));
                b.BFS(new kuyruk(matris, matris[i][j]));
            }

        }
    }

}
