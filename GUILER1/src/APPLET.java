
import java.awt.Color;
import java.awt.Graphics;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

class dugum {
	// (x, y) matris hücre koordinatlarını temsil eder
    // dist, kaynaktan olan minimum mesafesini gösterir.
    int x, y, dist;
    dugum ileri;

    dugum(int x, int y, int dist) {
        this.x = x;
        this.y = y;
        this.dist = dist;
        ileri = null;
    }
};

public class APPLET extends JFrame{
    private static final long serialVersionUID = 1L;

    dugum bas, son;
    

    public APPLET() {
        
       
 setTitle("maze solver");
        setSize(640, 640);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        bas = null;
        son = null;

    }

    public boolean bosmu() {
        return son == null;
    }

    void ekle(dugum yeni) {
        if (bosmu()) {
            bas = yeni;
            son = yeni;
        } else {
            son.ileri = yeni;
            son = yeni;

        }

    }

    dugum sil() {
        dugum tmp = bas;

        bas = bas.ileri;
        if (bas == null) {
            son = null;
        }
        return tmp;
    }
    // M x N matrix
    private static final int M = 10;
    private static final int N = 10;
    // Aşağıdaki diziler bir hücreden 4 olası hareketin tüm ayrıntılarını verir
    private static final int row[] = {0, 1, 0, 1};
    private static final int col[] = {1, 0, 1, 0};
// Konuma gidip gitmediğini kontrol etme işlevi (satır, sütun)
// geçerli konumdan. İşlev false eğer döndürür (satır, sütun)
// geçerli bir konum değil veya 0 değeri var ya da zaten ziyaret edilmiş

                                                       
                                                            
    private static boolean gecerli(int mat[][], boolean ziyaret[][], int row, int col) {
 
        return (row >= 0) && (row < M) && (col >= 0) && (col < N)
    && !ziyaret[row][col]; 
// else {
// return (row >= 0) && (row < M) && (col >= 0) && (col < N)
                 //&& !ziyaret[row][col];     } 
      
          
          
                   
    
    }
    
    static int mindist, ii,jj;
    public static void BFS(int mat[][], int i, int j, int x, int y) { //BFS= BREATH SEARCH ALGORİTM;

// ziyaret edilen hücreleri takip etmek için bir matris inşa et	
        boolean[][] ziyaret = new boolean[M][N];

        // boş bir kuyruk olustur
        
      APPLET m = new APPLET();
      APPLET m1 = new APPLET();
      APPLET m2 = new APPLET();
ziyaret[i][j] = true;
// kaynak hücreyi ziyaret edildiği gibi işaretle ve kaynak düğümü sıkıştır
      if(mat[row[i]][col[j]]==0){
         m.ekle(new dugum(i, j, 0)); }
        
      else  if(mat[row[i]][col[j]]==1){
         m.ekle(new dugum(i, j, 0)); }
     
        
     //  if(mat[row[i]][col[j]]==0){
       
        
    
        
        
        // kaynaktan hedefe en uzun yolun uzunluğunu saklar
        
        int min_dist = Integer.MAX_VALUE;

        // sıra boş olmayana kadar calıstır
        
        while (!m.bosmu()) //!q.isEmpty()
        {
// kuyruktan ön düğümü aç ve işle
            
            dugum node = m.sil();

            // (i, j) mevcut hücreyi temsil eder ve dist
// kaynaktan minimum uzaklık
            i = node.x;
            j = node.y;
             ii=i;
                jj=j;
                
            int dist = node.dist;

            // eğer hedef bulunursa, min_dist'i güncelle ve durdur
            if (ii == x && jj ==y) {
                min_dist = dist;
               
                break;
            }

            // mevcut hücreden tüm 4 olası hareketi kontrol et
// ve her geçerli hareketi zorla
            for (int k = 0; k < 4; k++) {
                // pozisyona gitmek mümkün mü kontrol edin
// (i + satır [k], j + col [k]) geçerli konumdan
                if (gecerli(mat, ziyaret, ii + row[k], jj + col[k])) {
                    
                    // bir sonraki hücreyi ziyaret edildi olarak işaretle ve sıkıştır
                    ziyaret[ii + row[k]][jj + col[k]] = true;
                    m.ekle(new dugum(ii + row[k], jj + col[k], dist+1));
                }
            }
        
        }
        if (min_dist != Integer.MAX_VALUE) {
            mindist=min_dist+1;
            
            System.out.print("Kaynaktan hedefe giden en kısa yol "
                    + "has length ==  " + mindist+" dir");
            
            
        } else {
            System.out.print("Kaynaktan hedefe giden en kısa yol "
                    + "has length ==  " + 12+" dir");;
        }
    }

    //Labirentteki en kısa yol
    
  static  int[][] mat
                = {
                    {0, 1, 1, 1, 1, 0, 0, 1, 1, 1},
                    {0, 1, 1, 1, 1, 1, 0, 1, 0, 1},
                    {0, 0, 1, 0, 1, 1, 1, 0, 0, 1},
                    {1, 0, 1, 1, 1, 0, 1, 1, 1, 1},
                    {0, 0, 0, 1, 0, 0, 0, 1, 1, 1},
                    {1, 0, 1, 1, 1, 0, 0, 1, 1, 0},
                    {0, 0, 0, 0, 1, 0, 0, 1, 0, 1},
                    {0, 1, 1, 1, 1, 1, 1, 1, 0, 0},
                    {1, 1, 1, 1, 1, 0, 0, 1, 1, 1},
                    {0, 0, 1, 0, 0, 1, 1, 0, 0, 1}
                };
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
        public void run() {
                APPLET wiew = new APPLET();
                wiew.setVisible(true);
            try {
             
                Thread.sleep(200);
            } catch (InterruptedException ex) {
                Logger.getLogger(APPLET.class.getName()).log(Level.SEVERE, null, ex);
            }
            }

        });
        // giriş labirenti
        
// Kaynaktan (0, 0) en kısa yolu bul
// hedef (7, 5)
        BFS(mat, 0, 0, 6, 8); /// KOORDINATLAR 
                 /* {1, 1, 1, 1, 1, 0, 0, 1, 1, 1}
                    {0, 1, 1, 1, 1, 1, 0, 1, 0, 1},
                    {0, 0, 1, 0, 1, 1, 1, 0, 0, 1},
                    {1, 0, 1, 1, 1, 0, 1, 1, 1, 1},
                    {0, 0, 0, 1, 0, 0, 0, 1, 1, 1},
                    {1, 0, 1, 1, 1, 0, 0, 1, 1, 0},
                    {0, 0, 0, 0, 1, 0, 0, 1, 0, 1},
                    {0, 1, 1, 1, 1, 1, 1, 1, 0, 0},
                    {1, 1, 1, 1, 1, 0, 0, 1, 1, 1},
                    {0, 0, 1, 0, 0, 1, 1, 0, 0, 1}*/
    }


 @SuppressWarnings("empty-statement")
        public void paint(Graphics g) {
            
             g.translate(50, 50);
            
             {

 
		
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                Color color;
                if(mat[i][j]==1){
                        color = Color.yellow;
                        // g.setColor(Color.blue);
            
                }
                        else{
                       
                   
                        color = Color.RED;
	
           
                }
                g.setColor(color);;
                g.fillRect( 40*j, 40*i, 40-8, 40-8);
           g.setColor(Color.BLACK);
          // repaint();
  }}
       g.setColor(Color.green);
      
       
         
          g.fillOval( 40*(jj), 40*(ii), 42-10, 42-10);
          g.setColor(Color.black);
         
        g.drawString("İSTENİLEN NOKTA", 39*(jj), 39*(ii));
        repaint();
        
                }
         g.setColor(Color.red);
           g.fillRect(420, 10, 40, 40);
           g.setColor(Color.black);
      g.drawString("ENGEL:", 466, 30);
       g.setColor(Color.yellow);
           g.fillRect(420, 80, 40, 40);
           g.setColor(Color.black);
      g.drawString("YOL:",466, 100);
     
}

     
        }	