package Interfaz;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Pantalla extends javax.swing.JFrame {
    int xMouse,yMouse;
    public Pantalla() {
        
        initComponents();
        
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        Background = new javax.swing.JPanel();
        Eliminar = new javax.swing.JButton();
        Operar = new javax.swing.JButton();
        Agregar = new javax.swing.JButton();
        Txt = new javax.swing.JTextField();
        Header = new javax.swing.JPanel();
        Exit = new javax.swing.JPanel();
        X = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Index = new javax.swing.JTextField();
        txtConcatenar = new javax.swing.JLabel();
        txtMinus = new javax.swing.JLabel();
        Concatenar = new javax.swing.JLabel();
        Minusculas = new javax.swing.JLabel();
        Lista = new javax.swing.JLabel();
        Invertir = new javax.swing.JLabel();
        txtInvertir = new javax.swing.JLabel();
        Numletras = new javax.swing.JLabel();
        txtInvertir1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        Background.setBackground(new java.awt.Color(113, 91, 255));

        Eliminar.setBackground(new java.awt.Color(255, 255, 255));
        Eliminar.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        Eliminar.setForeground(new java.awt.Color(0, 0, 0));
        Eliminar.setText("Eliminar");
        Eliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EliminarMouseClicked(evt);
            }
        });
        Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarActionPerformed(evt);
            }
        });

        Operar.setBackground(new java.awt.Color(255, 255, 255));
        Operar.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        Operar.setForeground(new java.awt.Color(0, 0, 0));
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

        Agregar.setBackground(new java.awt.Color(255, 255, 255));
        Agregar.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        Agregar.setForeground(new java.awt.Color(0, 0, 0));
        Agregar.setText("Agregar");
        Agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarActionPerformed(evt);
            }
        });

        Txt.setBackground(new java.awt.Color(255, 255, 255));
        Txt.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        Txt.setForeground(new java.awt.Color(51, 51, 51));
        Txt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Txt.setText("Ingrese una cadena de texto");
        Txt.setAutoscrolls(false);
        Txt.setCaretColor(new java.awt.Color(0, 0, 0));
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

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Listas Enlazadas");

        javax.swing.GroupLayout HeaderLayout = new javax.swing.GroupLayout(Header);
        Header.setLayout(HeaderLayout);
        HeaderLayout.setHorizontalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HeaderLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 513, Short.MAX_VALUE)
                .addComponent(Exit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        HeaderLayout.setVerticalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HeaderLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Exit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        Index.setBackground(new java.awt.Color(255, 255, 255));
        Index.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        Index.setForeground(new java.awt.Color(51, 51, 51));
        Index.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Index.setText("0");
        Index.setAutoscrolls(false);
        Index.setCaretColor(new java.awt.Color(0, 0, 0));
        Index.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                IndexMouseClicked(evt);
            }
        });
        Index.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IndexActionPerformed(evt);
            }
        });

        txtConcatenar.setBackground(new java.awt.Color(255, 255, 255));
        txtConcatenar.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtConcatenar.setForeground(new java.awt.Color(51, 51, 51));
        txtConcatenar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtConcatenar.setText("3. Concatenar con el último =");
        txtConcatenar.setFocusable(false);
        txtConcatenar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        txtConcatenar.setOpaque(true);

        txtMinus.setBackground(new java.awt.Color(255, 255, 255));
        txtMinus.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtMinus.setForeground(new java.awt.Color(51, 51, 51));
        txtMinus.setText("  4. Pasar a minúsculas =");
        txtMinus.setFocusable(false);
        txtMinus.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        txtMinus.setOpaque(true);

        Concatenar.setBackground(new java.awt.Color(255, 255, 255));
        Concatenar.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        Concatenar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Concatenar.setOpaque(true);

        Minusculas.setBackground(new java.awt.Color(255, 255, 255));
        Minusculas.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        Minusculas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Minusculas.setOpaque(true);

        Lista.setBackground(new java.awt.Color(255, 255, 255));
        Lista.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        Lista.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Lista.setOpaque(true);

        Invertir.setBackground(new java.awt.Color(255, 255, 255));
        Invertir.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        Invertir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Invertir.setOpaque(true);

        txtInvertir.setBackground(new java.awt.Color(255, 255, 255));
        txtInvertir.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtInvertir.setForeground(new java.awt.Color(51, 51, 51));
        txtInvertir.setText("   2. Invertir texto =");
        txtInvertir.setOpaque(true);

        Numletras.setBackground(new java.awt.Color(255, 255, 255));
        Numletras.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        Numletras.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Numletras.setOpaque(true);

        txtInvertir1.setBackground(new java.awt.Color(255, 255, 255));
        txtInvertir1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtInvertir1.setForeground(new java.awt.Color(51, 51, 51));
        txtInvertir1.setText("  1. Numero de letras =");
        txtInvertir1.setOpaque(true);

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Index");

        javax.swing.GroupLayout BackgroundLayout = new javax.swing.GroupLayout(Background);
        Background.setLayout(BackgroundLayout);
        BackgroundLayout.setHorizontalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(BackgroundLayout.createSequentialGroup()
                                .addComponent(txtInvertir, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(Invertir, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(BackgroundLayout.createSequentialGroup()
                                .addComponent(txtConcatenar, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(Concatenar, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(BackgroundLayout.createSequentialGroup()
                                .addComponent(txtMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(Minusculas, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(BackgroundLayout.createSequentialGroup()
                                .addComponent(txtInvertir1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(Numletras, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, BackgroundLayout.createSequentialGroup()
                            .addGap(100, 100, 100)
                            .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(BackgroundLayout.createSequentialGroup()
                                    .addComponent(Txt, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(Agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(BackgroundLayout.createSequentialGroup()
                                    .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(Index, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(BackgroundLayout.createSequentialGroup()
                                            .addGap(170, 170, 170)
                                            .addComponent(Operar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(68, 68, 68)
                                    .addComponent(Eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addComponent(Lista, javax.swing.GroupLayout.PREFERRED_SIZE, 458, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(jLabel1)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        BackgroundLayout.setVerticalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addComponent(Header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Txt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addComponent(Lista, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Operar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Index, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(75, 75, 75)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtInvertir1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Numletras, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtInvertir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Invertir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtConcatenar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Concatenar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Minusculas, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 42, Short.MAX_VALUE))
        );

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

    private void EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarActionPerformed
        
    }//GEN-LAST:event_EliminarActionPerformed

    private void TxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtActionPerformed

    }//GEN-LAST:event_TxtActionPerformed
    ArrayList mostrar = new ArrayList<>();
    //Metodo para reiniciar el proceso
    private void EliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EliminarMouseClicked
        int index;
        index= Integer.parseInt(Index.getText());
        
        lista.eliminar(index);
        mostrar.remove(index);
        Lista.setText(Show(mostrar));
    }//GEN-LAST:event_EliminarMouseClicked
    
    
    private void TxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TxtMouseClicked
        Txt.setText("");
    }//GEN-LAST:event_TxtMouseClicked
    
    //Proceso y muestra de los resultados
    private void OperarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OperarMouseClicked
        
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

    
    ListaEnlazada lista=new ListaEnlazada();
    private void OperarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OperarActionPerformed
        int index;
        int tam;
        
        
        try{
             index= Integer.parseInt(Index.getText());
             if(lista.getSize()==0){
                JOptionPane.showMessageDialog(rootPane, "La lista esta vacia");
                Numletras.setText("");
                Invertir.setText("");
                Concatenar.setText("");
                Minusculas.setText("");
                Txt.setText("");
            }
             else if (index>lista.getSize()-1){
                JOptionPane.showMessageDialog(rootPane, "El index esta fuera de rango");
            }
            
            else{
                
            tam=lista.nroletras(lista.obtener(index).toString());
            Numletras.setText(""+tam);
            StringBuilder invertido= lista.invertir(lista.obtener(index).toString());
            Invertir.setText(invertido.toString());
            Concatenar.setText(lista.obtener(index).toString()+" "+lista.obtener(lista.size-1).toString());
            Minusculas.setText(lista.minusculas(lista.obtener(index).toString()).toString());
            }
        
        
        }catch (NumberFormatException e){
            
            JOptionPane.showMessageDialog(rootPane, "Ingrese un numero");
        }
        
       
    }//GEN-LAST:event_OperarActionPerformed
    
    
    
    int x=0;
    private void AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarActionPerformed
        lista.aggPrimero(Txt.getText());
        mostrar.add(0, lista.obtener(x).toString());
        Txt.setText("");
        Lista.setText(Show(mostrar));
            
       
        
        
    }//GEN-LAST:event_AgregarActionPerformed

    private void IndexMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IndexMouseClicked
        Index.setText("");
    }//GEN-LAST:event_IndexMouseClicked

    private void IndexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IndexActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IndexActionPerformed

    
    public String Show(ArrayList mostrar){
        String cadena="";
        
        for (int i = 0; i < mostrar.size(); i++) {
                cadena+=" "+mostrar.get(i).toString();
               
        }
        return cadena;
    }
    
    
    
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
    private javax.swing.JButton Agregar;
    private javax.swing.JPanel Background;
    private javax.swing.JLabel Concatenar;
    private javax.swing.JButton Eliminar;
    private javax.swing.JPanel Exit;
    private javax.swing.JPanel Header;
    private javax.swing.JTextField Index;
    private javax.swing.JLabel Invertir;
    private javax.swing.JLabel Lista;
    private javax.swing.JLabel Minusculas;
    private javax.swing.JLabel Numletras;
    private javax.swing.JButton Operar;
    private javax.swing.JTextField Txt;
    private javax.swing.JLabel X;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JLabel txtConcatenar;
    private javax.swing.JLabel txtInvertir;
    private javax.swing.JLabel txtInvertir1;
    private javax.swing.JLabel txtMinus;
    // End of variables declaration//GEN-END:variables
}
