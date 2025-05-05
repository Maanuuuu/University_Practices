package Interfaz;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JLabel;

public class Pantalla extends javax.swing.JFrame {
    int xMouse,yMouse;
    public Pantalla() {
        initComponents();
        
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Background = new javax.swing.JPanel();
        Limpiar = new javax.swing.JButton();
        Operar = new javax.swing.JButton();
        Txt = new javax.swing.JTextField();
        ScrollMatriz = new javax.swing.JScrollPane();
        MostrarMatriz = new javax.swing.JTextArea();
        Header = new javax.swing.JPanel();
        Exit = new javax.swing.JPanel();
        X = new javax.swing.JLabel();
        ScrollPotencia = new javax.swing.JScrollPane();
        MostrarPotencia = new javax.swing.JTextArea();
        TextFibonacci = new javax.swing.JLabel();
        Fibonacci = new javax.swing.JLabel();
        OrdenadaPrin = new javax.swing.JLabel();
        DiagoPrin = new javax.swing.JLabel();
        DiagoSec = new javax.swing.JLabel();
        OrdenadaSec = new javax.swing.JLabel();
        Potencia = new javax.swing.JLabel();
        Potencia2 = new javax.swing.JLabel();
        Blanquito = new javax.swing.JPanel();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        Background.setBackground(new java.awt.Color(255, 255, 255));
        Background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Limpiar.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        Limpiar.setText("Limpiar");
        Limpiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LimpiarMouseClicked(evt);
            }
        });
        Limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimpiarActionPerformed(evt);
            }
        });
        Background.add(Limpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 80, 110, 40));

        Operar.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        Operar.setText("Operar");
        Operar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OperarMouseClicked(evt);
            }
        });
        Operar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OperarActionPerformed(evt);
            }
        });
        Background.add(Operar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 80, 110, 40));

        Txt.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        Txt.setForeground(new java.awt.Color(153, 153, 153));
        Txt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Txt.setText("Ingrese tamaño de la matriz (min 3 - máx 10)");
        Txt.setAutoscrolls(false);
        Txt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TxtMouseClicked(evt);
            }
        });
        Txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtActionPerformed(evt);
            }
        });
        Background.add(Txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 330, 39));

        MostrarMatriz.setColumns(20);
        MostrarMatriz.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        MostrarMatriz.setRows(5);
        MostrarMatriz.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        MostrarMatriz.setEnabled(false);
        ScrollMatriz.setViewportView(MostrarMatriz);

        Background.add(ScrollMatriz, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 610, 220));

        Header.setBackground(new java.awt.Color(255, 255, 255));
        Header.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                HeaderMouseDragged(evt);
            }
        });
        Header.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                HeaderMousePressed(evt);
            }
        });

        Exit.setBackground(new java.awt.Color(255, 255, 255));
        Exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ExitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ExitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ExitMouseExited(evt);
            }
        });

        X.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        X.setText("X");

        javax.swing.GroupLayout ExitLayout = new javax.swing.GroupLayout(Exit);
        Exit.setLayout(ExitLayout);
        ExitLayout.setHorizontalGroup(
            ExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(X, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
        );
        ExitLayout.setVerticalGroup(
            ExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(X, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout HeaderLayout = new javax.swing.GroupLayout(Header);
        Header.setLayout(HeaderLayout);
        HeaderLayout.setHorizontalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HeaderLayout.createSequentialGroup()
                .addGap(0, 639, Short.MAX_VALUE)
                .addComponent(Exit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        HeaderLayout.setVerticalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HeaderLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Exit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        Background.add(Header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 40));

        ScrollPotencia.setBorder(null);
        ScrollPotencia.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        ScrollPotencia.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N

        MostrarPotencia.setColumns(20);
        MostrarPotencia.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        MostrarPotencia.setRows(5);
        MostrarPotencia.setAutoscrolls(false);
        MostrarPotencia.setBorder(null);
        MostrarPotencia.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        MostrarPotencia.setEnabled(false);
        ScrollPotencia.setViewportView(MostrarPotencia);

        Background.add(ScrollPotencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 540, 330, 40));

        TextFibonacci.setBackground(new java.awt.Color(255, 255, 255));
        TextFibonacci.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        TextFibonacci.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TextFibonacci.setText("Secuencia Fibonacci :");
        TextFibonacci.setFocusable(false);
        TextFibonacci.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        TextFibonacci.setOpaque(true);
        Background.add(TextFibonacci, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 610, 260, 40));

        Fibonacci.setBackground(new java.awt.Color(255, 255, 255));
        Fibonacci.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        Fibonacci.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Fibonacci.setOpaque(true);
        Background.add(Fibonacci, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 610, 350, 40));

        OrdenadaPrin.setBackground(new java.awt.Color(255, 255, 255));
        OrdenadaPrin.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        OrdenadaPrin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        OrdenadaPrin.setText("La Diagonal Principal ordenada de mayor a menor es:");
        OrdenadaPrin.setOpaque(true);
        Background.add(OrdenadaPrin, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 400, 330, 40));

        DiagoPrin.setBackground(new java.awt.Color(255, 255, 255));
        DiagoPrin.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        DiagoPrin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        DiagoPrin.setOpaque(true);
        Background.add(DiagoPrin, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 400, 300, 40));

        DiagoSec.setBackground(new java.awt.Color(255, 255, 255));
        DiagoSec.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        DiagoSec.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        DiagoSec.setOpaque(true);
        Background.add(DiagoSec, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 470, 300, 40));

        OrdenadaSec.setBackground(new java.awt.Color(255, 255, 255));
        OrdenadaSec.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        OrdenadaSec.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        OrdenadaSec.setText("Promedio de la suma de la diagonal secundaria: ");
        OrdenadaSec.setOpaque(true);
        Background.add(OrdenadaSec, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 470, 310, 40));

        Potencia.setBackground(new java.awt.Color(255, 255, 255));
        Potencia.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        Potencia.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Potencia.setText("Potencia del menor de la primera columna");
        Potencia.setOpaque(true);
        Background.add(Potencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 540, 260, 20));

        Potencia2.setBackground(new java.awt.Color(255, 255, 255));
        Potencia2.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        Potencia2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Potencia2.setText("al mayor de la ultima columna");
        Potencia2.setOpaque(true);
        Background.add(Potencia2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 560, 260, 20));

        Blanquito.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout BlanquitoLayout = new javax.swing.GroupLayout(Blanquito);
        Blanquito.setLayout(BlanquitoLayout);
        BlanquitoLayout.setHorizontalGroup(
            BlanquitoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        BlanquitoLayout.setVerticalGroup(
            BlanquitoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        Background.add(Blanquito, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 540, -1, 40));

        Fondo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/si.jpg"))); // NOI18N
        Background.add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 690));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimpiarActionPerformed
      
    }//GEN-LAST:event_LimpiarActionPerformed

    private void TxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtActionPerformed

    }//GEN-LAST:event_TxtActionPerformed
    
    //Metodo para reiniciar el proceso
    private void LimpiarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LimpiarMouseClicked
        DiagoSec.setText("");
        DiagoPrin.setText("");
        Txt.setText("");
        Operar.setEnabled(true);
        Operar.setVisible(true);
        MostrarMatriz.setText("");
        Txt.setEnabled(true);
        Txt.setText("Ingrese tamaño (min 3 - máx 10)");
        Txt.setForeground(Color.GRAY);
        MostrarPotencia.setText("");
        Fibonacci.setText("");
    }//GEN-LAST:event_LimpiarMouseClicked
    
    
    private void TxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TxtMouseClicked
        Txt.setText("");
        Txt.setForeground(Color.black);
    }//GEN-LAST:event_TxtMouseClicked
    
    //Proceso y muestra de los resultados
    private void OperarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OperarMouseClicked

        int num=0;
        Operar.setEnabled(false);
        Operar.setVisible(false);
        Txt.setEnabled(false);
   
        try{
            num=Integer.parseInt(Txt.getText());
            if ((num>=3)&&(num<=10)){
                int[][] matriz=new int[num][num];
                matriz=Main.LlenadoMatriz(num);
                MostrarMatriz.setText(Main.ImpresionMatriz(matriz));
                DiagoPrin.setText(""+Main.DiagonalPrincipal(matriz));
                DiagoSec.setText(Main.DiagonalSecundaria(matriz));
                MostrarPotencia.setText(Main.Potencia(matriz).toString());
                Fibonacci.setText(""+Main.Fibonacci(matriz));
            }
            else{
                MostrarMatriz.setText("\n\n\n\n\n \t\t  Valor fuera de rango");
            }
        }
        catch (NumberFormatException ex) {
            MostrarMatriz.setText("\n\n\n\n\n \t           Valor no permitido, ingrese un numero entero");
        }
     
    }//GEN-LAST:event_OperarMouseClicked

    
        
    //Metodo del boton para cerrar la ventana
    private void ExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_ExitMouseClicked

    private void ExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitMouseEntered
        Exit.setBackground(Color.red);
        Exit.setForeground(Color.white);
    }//GEN-LAST:event_ExitMouseEntered

    private void ExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitMouseExited
        Exit.setBackground(Color.white);
        Exit.setForeground(Color.black);
    }//GEN-LAST:event_ExitMouseExited

    private void HeaderMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HeaderMousePressed
        xMouse=evt.getX();
        yMouse=evt.getY();
    }//GEN-LAST:event_HeaderMousePressed

    //Metodo para poder mover la ventana
    private void HeaderMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HeaderMouseDragged
        int x,y;
        x=evt.getXOnScreen();
        y=evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_HeaderMouseDragged

    private void OperarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OperarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_OperarActionPerformed

    
    
    
    
    
    
    public static void main(String args[]) {
      
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Pantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pantalla().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JPanel Blanquito;
    private javax.swing.JLabel DiagoPrin;
    private javax.swing.JLabel DiagoSec;
    private javax.swing.JPanel Exit;
    private javax.swing.JLabel Fibonacci;
    private javax.swing.JLabel Fondo;
    private javax.swing.JPanel Header;
    private javax.swing.JButton Limpiar;
    private javax.swing.JTextArea MostrarMatriz;
    private javax.swing.JTextArea MostrarPotencia;
    private javax.swing.JButton Operar;
    private javax.swing.JLabel OrdenadaPrin;
    private javax.swing.JLabel OrdenadaSec;
    private javax.swing.JLabel Potencia;
    private javax.swing.JLabel Potencia2;
    private javax.swing.JScrollPane ScrollMatriz;
    private javax.swing.JScrollPane ScrollPotencia;
    private javax.swing.JLabel TextFibonacci;
    private javax.swing.JTextField Txt;
    private javax.swing.JLabel X;
    // End of variables declaration//GEN-END:variables
}
