package Menu;


import InterfazCRUD.Pantalla1;
import Listas.PantallaListas;
import MatrizOriginal.MatrizOriginal;
import MatrizRecursiva.PantallaMatriz;







public class Menu extends javax.swing.JFrame {

    
    public Menu() {
        initComponents();
        this.setTitle("Menu");
        setResizable(false);
        setLocationRelativeTo(null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Background = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        CRUD = new javax.swing.JButton();
        Listas = new javax.swing.JButton();
        Matriz = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        MatrizOriginal = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Background.setBackground(new java.awt.Color(255, 255, 255));
        Background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Comfortaa", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Menú de Interfaces");
        Background.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 260, 47));

        CRUD.setFont(new java.awt.Font("Comfortaa", 0, 18)); // NOI18N
        CRUD.setText("CRUD");
        CRUD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CRUDActionPerformed(evt);
            }
        });
        Background.add(CRUD, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 390, 250, 47));

        Listas.setFont(new java.awt.Font("Comfortaa", 0, 16)); // NOI18N
        Listas.setText("Listas Entrelazadas");
        Listas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListasActionPerformed(evt);
            }
        });
        Background.add(Listas, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 310, 250, 47));

        Matriz.setFont(new java.awt.Font("Comfortaa", 0, 18)); // NOI18N
        Matriz.setText("Matriz (Recursiva)");
        Matriz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MatrizActionPerformed(evt);
            }
        });
        Background.add(Matriz, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, 250, 47));

        jLabel2.setFont(new java.awt.Font("Comfortaa", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Seleccione la Interfaz que desee utilizar:");
        Background.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 300, -1));

        MatrizOriginal.setFont(new java.awt.Font("Comfortaa", 0, 18)); // NOI18N
        MatrizOriginal.setText("Matriz");
        MatrizOriginal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MatrizOriginalActionPerformed(evt);
            }
        });
        Background.add(MatrizOriginal, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, 250, 47));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/fondo.jpg"))); // NOI18N
        jLabel3.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        Background.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 480));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, 401, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CRUDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CRUDActionPerformed
       Pantalla1 crud= new Pantalla1(); 
       crud.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
       crud.setVisible(true);
    }//GEN-LAST:event_CRUDActionPerformed

    private void ListasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListasActionPerformed
        PantallaListas listas= new PantallaListas();
        listas.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        listas.setVisible(true);
    }//GEN-LAST:event_ListasActionPerformed

    private void MatrizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MatrizActionPerformed
        PantallaMatriz matriz= new PantallaMatriz();
        matriz.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        matriz.setVisible(true);
        
    }//GEN-LAST:event_MatrizActionPerformed

    private void MatrizOriginalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MatrizOriginalActionPerformed
        MatrizOriginal matrizori= new MatrizOriginal();
        matrizori.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        matrizori.setVisible(true);
    }//GEN-LAST:event_MatrizOriginalActionPerformed

    
    public static void main(String args[]) {
      
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JButton CRUD;
    private javax.swing.JButton Listas;
    private javax.swing.JButton Matriz;
    private javax.swing.JButton MatrizOriginal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
