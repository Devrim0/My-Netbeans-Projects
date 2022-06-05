
import java.awt.Button;
import javax.swing.JButton;

public class NewJFrame extends javax.swing.JFrame {

    public NewJFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jToggleButton1 = new javax.swing.JToggleButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPane2 = new javax.swing.JTextPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextPane3 = new javax.swing.JTextPane();
        jButton13 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        toplama = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        bolme = new javax.swing.JButton();
        cikarma = new javax.swing.JButton();
        carpma = new javax.swing.JButton();
        sayi1 = new javax.swing.JTextField();
        sayi2 = new javax.swing.JTextField();
        sonuc = new javax.swing.JLabel();
        sonuc1 = new javax.swing.JLabel();

        jButton2.setText("jButton2");

        jButton1.setText("1");

        jButton5.setText("jButton5");

        jButton7.setText("jButton7");

        jButton12.setText("jButton12");

        jButton6.setText("jButton6");

        jButton9.setText("jButton9");

        jButton10.setText("jButton10");

        jButton11.setText("jButton11");

        jButton4.setText("jButton4");

        jButton8.setText("jButton8");

        jToggleButton1.setText("jToggleButton1");

        jScrollPane1.setViewportView(jTextPane1);

        jScrollPane2.setViewportView(jTextPane2);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 209, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );

        jScrollPane3.setViewportView(jTextPane3);

        jButton13.setText("jButton13");

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        toplama.setText("toplama");
        toplama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toplamaActionPerformed(evt);
            }
        });
        getContentPane().add(toplama, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 88, -1, -1));

        jButton3.setText("jButton2");
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(112, 91, 0, 8));

        bolme.setText("bolme");
        bolme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bolmeActionPerformed(evt);
            }
        });
        getContentPane().add(bolme, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 170, -1, -1));

        cikarma.setText("çıkarma");
        cikarma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cikarmaActionPerformed(evt);
            }
        });
        getContentPane().add(cikarma, new org.netbeans.lib.awtextra.AbsoluteConstraints(315, 79, -1, -1));

        carpma.setText("carpma");
        carpma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carpmaActionPerformed(evt);
            }
        });
        getContentPane().add(carpma, new org.netbeans.lib.awtextra.AbsoluteConstraints(332, 170, -1, -1));
        getContentPane().add(sayi1, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 89, 81, -1));
        getContentPane().add(sayi2, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 152, 81, -1));
        getContentPane().add(sonuc, new org.netbeans.lib.awtextra.AbsoluteConstraints(208, 205, 89, -1));
        getContentPane().add(sonuc1, new org.netbeans.lib.awtextra.AbsoluteConstraints(133, 194, 102, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void toplamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toplamaActionPerformed
       int x,y;
       
        
       
        JButton Button= toplama ;
        
       
       x=(int)Integer.parseInt(sayi1.getText());
       y=(int)Integer.parseInt(sayi2.getText());
       int sonucc=x+y;
       sonuc1.setText(String.valueOf(sonucc));
        

   
    }//GEN-LAST:event_toplamaActionPerformed

    private void cikarmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cikarmaActionPerformed
      
        JButton JButton = cikarma;
    int   x=(int)Integer.parseInt(sayi1.getText());
     int  y=(int)Integer.parseInt(sayi2.getText());
       int sonucc=x-y;
       sonuc1.setText(String.valueOf(sonucc));
      
    }//GEN-LAST:event_cikarmaActionPerformed

    private void carpmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carpmaActionPerformed
        
        JButton JButton = carpma;
    int   x=(int)Integer.parseInt(sayi1.getText());
     int  y=(int)Integer.parseInt(sayi2.getText());
       int sonucc=x*y;
       sonuc1.setText(String.valueOf(sonucc));
      
    }//GEN-LAST:event_carpmaActionPerformed

    private void bolmeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bolmeActionPerformed
       
        JButton JButton = bolme;
    int   x=(int)Integer.parseInt(sayi1.getText());
     int  y=(int)Integer.parseInt(sayi2.getText());
       double sonucc=x/y;
       sonuc1.setText(String.valueOf(sonucc));
    }//GEN-LAST:event_bolmeActionPerformed


    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
                new NewJFrame().setBounds(230, 300, 230, 300);
            }
        });}
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bolme;
    private javax.swing.JButton carpma;
    private javax.swing.JButton cikarma;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JTextPane jTextPane2;
    private javax.swing.JTextPane jTextPane3;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JTextField sayi1;
    private javax.swing.JTextField sayi2;
    private javax.swing.JLabel sonuc;
    private javax.swing.JLabel sonuc1;
    private javax.swing.JButton toplama;
    // End of variables declaration//GEN-END:variables
}
