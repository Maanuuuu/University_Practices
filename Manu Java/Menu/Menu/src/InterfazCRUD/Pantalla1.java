package InterfazCRUD;


import javax.imageio.ImageIO;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import javax.swing.JOptionPane;
import java.util.Date;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Pantalla1 extends javax.swing.JFrame {

    
    public Pantalla1() {
        this.setResizable(false);
        
        initComponents();
        setLocationRelativeTo(null);
        cargarTabla();
        TxtTelefono.addKeyListener(new KeyAdapter() {
            private static final int MAX_DIGITS = 7;
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
            if (!(Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))) {
                e.consume();}
            if (TxtTelefono.getText().length() >= MAX_DIGITS && !(c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE)) {
                e.consume();}
            };
            
            });
        
        TxtNombre.addKeyListener(new KeyAdapter() {
            private static final int MAX_DIGITS = 7;
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
            if ((Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))) {
                e.consume();}
            }
            
            });
        
        TxtApellido.addKeyListener(new KeyAdapter() {
            private static final int MAX_DIGITS = 7;
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
            if ((Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))) {
                e.consume();}
            }
            
            });
        
        
        TxtCedula.addKeyListener(new KeyAdapter() {
            private static final int MAX_DIGITS = 8;
            public void keyTyped(KeyEvent e) {
                
                char c = e.getKeyChar();
                if (!(Character.isDigit(c)|| (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))) {
                    e.consume(); // No procesar el carácter si no es un número, un punto, backspace o delete
                }
                if (TxtCedula.getText().length() >= MAX_DIGITS && !(c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE)) {
                    e.consume(); 
                }
            };
        });
                }
    public static boolean validateEmail(String email) {
        String regex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}(?:\\.[a-zA-Z]{2})*$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);

        return matcher.matches();
    }
   
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Background = new javax.swing.JPanel();
        Estudiantes = new javax.swing.JLabel();
        TablaReg = new javax.swing.JLabel();
        Nombre = new javax.swing.JLabel();
        TxtNombre = new javax.swing.JTextField();
        Linea = new javax.swing.JLabel();
        Apellido = new javax.swing.JLabel();
        TxtApellido = new javax.swing.JTextField();
        Linea2 = new javax.swing.JLabel();
        Cedula = new javax.swing.JLabel();
        Linea1 = new javax.swing.JLabel();
        TxtCedula = new javax.swing.JTextField();
        Fecha = new javax.swing.JLabel();
        Linea3 = new javax.swing.JLabel();
        Telefono = new javax.swing.JLabel();
        ComboTelefono = new javax.swing.JComboBox<>();
        Linea4 = new javax.swing.JLabel();
        TxtTelefono = new javax.swing.JTextField();
        Correo = new javax.swing.JLabel();
        Linea5 = new javax.swing.JLabel();
        TxtCorreo = new javax.swing.JTextField();
        Guardar = new javax.swing.JButton();
        Eliminar = new javax.swing.JButton();
        AgregarReg = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaRegistros = new javax.swing.JTable();
        lbImg = new javax.swing.JLabel();
        Seleccionar = new javax.swing.JButton();
        Editar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Ver1 = new javax.swing.JButton();
        fecha = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Estudiantes");

        Background.setBackground(new java.awt.Color(255, 255, 255));

        Estudiantes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Estudiantes.png"))); // NOI18N
        Estudiantes.setText("Estudiantes");

        TablaReg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TablaReg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/tabla.png"))); // NOI18N

        Nombre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Nombre.png"))); // NOI18N
        Nombre.setText("jLabel2");

        TxtNombre.setBackground(new java.awt.Color(255, 255, 255));
        TxtNombre.setFont(new java.awt.Font("Comfortaa", 0, 16)); // NOI18N
        TxtNombre.setBorder(null);

        Linea.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/linea.png"))); // NOI18N
        Linea.setText("jLabel1");

        Apellido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Apellido.png"))); // NOI18N

        TxtApellido.setBackground(new java.awt.Color(255, 255, 255));
        TxtApellido.setFont(new java.awt.Font("Comfortaa", 0, 16)); // NOI18N
        TxtApellido.setBorder(null);

        Linea2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/linea.png"))); // NOI18N

        Cedula.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cedula.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Cedula.png"))); // NOI18N
        Cedula.setText("jLabel2");

        Linea1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/linea.png"))); // NOI18N

        TxtCedula.setBackground(new java.awt.Color(255, 255, 255));
        TxtCedula.setFont(new java.awt.Font("Comfortaa", 0, 16)); // NOI18N
        TxtCedula.setBorder(null);

        Fecha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Fecha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/fecha.png"))); // NOI18N

        Linea3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/linea.png"))); // NOI18N

        Telefono.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Telefono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Telefono.png"))); // NOI18N

        ComboTelefono.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        ComboTelefono.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0424", "0412", "0414", "0426" }));
        ComboTelefono.setBorder(null);
        ComboTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboTelefonoActionPerformed(evt);
            }
        });

        Linea4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/linea.png"))); // NOI18N

        TxtTelefono.setBackground(new java.awt.Color(255, 255, 255));
        TxtTelefono.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        TxtTelefono.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        TxtTelefono.setBorder(null);

        Correo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Correo.png"))); // NOI18N

        Linea5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/linea.png"))); // NOI18N

        TxtCorreo.setBackground(new java.awt.Color(255, 255, 255));
        TxtCorreo.setFont(new java.awt.Font("Comfortaa", 0, 12)); // NOI18N
        TxtCorreo.setBorder(null);

        Guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/guardar.png"))); // NOI18N
        Guardar.setBorder(null);
        Guardar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Guardar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/guardar2.png"))); // NOI18N
        Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarActionPerformed(evt);
            }
        });

        Eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Eliminar.png"))); // NOI18N
        Eliminar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 51)));
        Eliminar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Eliminar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Eliminar2.png"))); // NOI18N
        Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarActionPerformed(evt);
            }
        });

        AgregarReg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/agregar.png"))); // NOI18N
        AgregarReg.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        AgregarReg.setContentAreaFilled(false);
        AgregarReg.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        AgregarReg.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/agregar2.png"))); // NOI18N
        AgregarReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarRegActionPerformed(evt);
            }
        });

        TablaRegistros.setBackground(new java.awt.Color(255, 255, 255));
        TablaRegistros.setFont(new java.awt.Font("Comfortaa", 0, 12)); // NOI18N
        TablaRegistros.setForeground(new java.awt.Color(0, 0, 0));
        TablaRegistros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Apellido", "Cedula"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TablaRegistros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaRegistrosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TablaRegistros);
        if (TablaRegistros.getColumnModel().getColumnCount() > 0) {
            TablaRegistros.getColumnModel().getColumn(0).setResizable(false);
            TablaRegistros.getColumnModel().getColumn(1).setResizable(false);
            TablaRegistros.getColumnModel().getColumn(2).setResizable(false);
        }

        lbImg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbImg.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        Seleccionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/seleccionar.png"))); // NOI18N
        Seleccionar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        Seleccionar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Seleccionar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/seleccionar2.png"))); // NOI18N
        Seleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SeleccionarActionPerformed(evt);
            }
        });

        Editar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/editar.png"))); // NOI18N
        Editar.setBorder(null);
        Editar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Editar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/editar2.png"))); // NOI18N
        Editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("-");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        Ver1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ver.png"))); // NOI18N
        Ver1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0)));
        Ver1.setContentAreaFilled(false);
        Ver1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Ver1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ver2.png"))); // NOI18N
        Ver1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ver1ActionPerformed(evt);
            }
        });

        fecha.setBackground(new java.awt.Color(255, 255, 255));
        fecha.setForeground(new java.awt.Color(51, 51, 51));
        fecha.setDateFormatString("dd/MM/yyyy");
        fecha.setFont(new java.awt.Font("Comfortaa", 0, 12)); // NOI18N
        fecha.setMaxSelectableDate(new java.util.Date(1710306085000L));

        javax.swing.GroupLayout BackgroundLayout = new javax.swing.GroupLayout(Background);
        Background.setLayout(BackgroundLayout);
        BackgroundLayout.setHorizontalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackgroundLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Editar, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                        .addComponent(Eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Ver1))
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(BackgroundLayout.createSequentialGroup()
                                .addComponent(Telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(BackgroundLayout.createSequentialGroup()
                                        .addComponent(ComboTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(TxtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(Linea4, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(BackgroundLayout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(BackgroundLayout.createSequentialGroup()
                                        .addComponent(lbImg, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(Seleccionar))
                                    .addGroup(BackgroundLayout.createSequentialGroup()
                                        .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Cedula, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(Linea2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(TxtApellido)
                                            .addComponent(Linea, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(TxtNombre)
                                            .addComponent(Linea1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(TxtCedula)
                                            .addComponent(Linea3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(fecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addGroup(BackgroundLayout.createSequentialGroup()
                                        .addComponent(Correo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(Linea5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(TxtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))))))))
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackgroundLayout.createSequentialGroup()
                        .addComponent(TablaReg, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(95, 95, 95))
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(AgregarReg)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16))))
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addGap(295, 295, 295)
                .addComponent(Estudiantes, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        BackgroundLayout.setVerticalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Estudiantes, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TablaReg)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 489, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                        .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(AgregarReg, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Ver1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbImg, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Seleccionar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(49, 49, 49)
                        .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(TxtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Linea, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(Apellido)
                            .addGroup(BackgroundLayout.createSequentialGroup()
                                .addComponent(TxtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Linea2, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(31, 31, 31)
                        .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Linea1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(Cedula, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(TxtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                        .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Fecha, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackgroundLayout.createSequentialGroup()
                                .addComponent(fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Linea3, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                        .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Telefono)
                            .addGroup(BackgroundLayout.createSequentialGroup()
                                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(ComboTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                    .addComponent(TxtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Linea4, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(29, 29, 29)
                        .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Correo)
                            .addGroup(BackgroundLayout.createSequentialGroup()
                                .addComponent(TxtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Linea5, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(46, 46, 46)
                        .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Editar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    String xd;
    
    
    private void limpiar(){
            TxtNombre.setText(null);
            TxtApellido.setText(null);
            TxtCedula.setText(null);
            fecha.setDate(null);
            TxtTelefono.setText(null);
            TxtCorreo.setText(null);
            lbImg.setIcon(null);
            Guardar.setEnabled(true);
    
    }
    ArrayList IdEstudiantes;
    private void cargarTabla(){
        DefaultTableModel modeloTabla = (DefaultTableModel) TablaRegistros.getModel() ;
        modeloTabla.setRowCount(0);
        IdEstudiantes=new ArrayList<>();
        ResultSet rs;
        ResultSetMetaData rsmd;
        PreparedStatement ps;
        
        int columnas;
       
        try{
            Connection con= new Conexion().establecerConexion();
            
            
            
            
            ps = con.prepareStatement("SELECT \"Estudiantes\".\"id\", nombre, apellido, cedula FROM \"Estudiantes\" ORDER BY \"id\" ASC");
            
            
            rs=ps.executeQuery();
            rsmd=rs.getMetaData();
            columnas=rsmd.getColumnCount();
            while(rs.next()){
                Integer id=rs.getInt("id");
                IdEstudiantes.add(id);
                
                
                Object[] fila= new Object[columnas-1];
                for (int i = 0; i < columnas-1; i++) {
                    fila[i]=rs.getObject(i+2);
                    
                }
                modeloTabla.addRow(fila);
            }
            
            
            
        }catch(Exception e){
        JOptionPane.showMessageDialog(null, e.toString());
        }
        
    
    }
    

    
    
    private void AgregarRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarRegActionPerformed
            limpiar();
            cargarTabla();
    }//GEN-LAST:event_AgregarRegActionPerformed
    
    private void GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarActionPerformed
    try{
        String nombre=TxtNombre.getText();
        String apellido=TxtApellido.getText();
        String letramayus=nombre.substring(0,1);
        String otros=nombre.substring(1);
        String NombreDef=letramayus.toUpperCase()+otros.toLowerCase();
        
        String letramayusApe=apellido.substring(0,1);
        String otrosApe=apellido.substring(1);
        String ApeDef=letramayusApe.toUpperCase()+otrosApe.toLowerCase();
        
        String cedula=TxtCedula.getText();
        
        String primeros2=cedula.substring(0, 2);
        String segundos=cedula.substring(2,5);
        String terceros=cedula.substring(5, 8);
        
        String cedulaDef=primeros2+"."+segundos+"."+terceros;
        String fechita;
        java.util.Date date= new java.util.Date();
        SimpleDateFormat f= new SimpleDateFormat("dd/MM/yyyy");
        fechita= f.format(fecha.getDate());
        
        String seleccion= (String) ComboTelefono.getSelectedItem();
        String campotelefono= TxtTelefono.getText();
        String telefono=seleccion+campotelefono;
        
        String correo=TxtCorreo.getText();
        boolean esValido= validateEmail(correo);
        if (esValido==true){
        try{
            FileInputStream archivofoto;
            Connection con= new Conexion().establecerConexion();
            
            PreparedStatement ps= con.prepareStatement("INSERT INTO Estudiantes ( nombre, apellido,cedula, fecha, telefono, correo,foto) VALUES(?,?,?,?,?,?,?)" );
            
            ps.setString(1, NombreDef);
            ps.setString(2, ApeDef);
            ps.setString(3, cedulaDef);
            ps.setString(4, fechita);
            ps.setString(6, correo);
            
            ps.setString(5, telefono);
            
            
        
            
                
            
            
            
            
            archivofoto=new FileInputStream(xd);
            ps.setBinaryStream(7, archivofoto);
            
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registro guardado");
            
            limpiar();
            cargarTabla();
            
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.toString());
        
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Pantalla1.class.getName()).log(Level.SEVERE, null, ex);
        } 
        }else{JOptionPane.showMessageDialog(null, "Ingrese un email valido.");}
    }catch(Exception e){JOptionPane.showMessageDialog(null, "Rellene todos los campos de datos.");}
    }//GEN-LAST:event_GuardarActionPerformed

    private void TablaRegistrosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaRegistrosMouseClicked
        limpiar();
       
        try{
            Guardar.setEnabled(false);
            SimpleDateFormat s=new SimpleDateFormat("dd/MM/yyyy");
            java.util.Date fechita;
            
            BufferedImage si;
            ImageIcon foto;
            
            int fila=TablaRegistros.getSelectedRow();
            int id= Integer.parseInt(IdEstudiantes.get(fila).toString());
            
            
            Connection con= new Conexion().establecerConexion();
            ResultSet rs;
            
            PreparedStatement ps= con.prepareStatement("SELECT nombre,apellido,cedula,fecha,telefono,correo,foto FROM Estudiantes WHERE id=?");
            ps.setInt(1,id);
            
            rs=ps.executeQuery();
            
            while(rs.next()){
                
                // Obtener los datos de la imagen del ResultSet
                InputStream inputStream = rs.getBinaryStream("foto");

                // Convertir la imagen en un array de bytes
                ByteArrayOutputStream baos = new ByteArrayOutputStream();
                byte[] buffer = new byte[4096];
                int bytesRead;
                while ((bytesRead = inputStream.read(buffer)) != -1) {
                    baos.write(buffer, 0, bytesRead);
                }
                byte[] imagenBytes = baos.toByteArray();

                // Obtener la longitud de bytes de la imagen
                int longitudBytes = imagenBytes.length;

                si = ImageIO.read(new ByteArrayInputStream(imagenBytes));

                foto = new ImageIcon(si);

                Image img = foto.getImage();
                Image newImg = img.getScaledInstance(lbImg.getWidth(), lbImg.getHeight(), java.awt.Image.SCALE_SMOOTH);

                ImageIcon newIcon = new ImageIcon(newImg);

                // Establecer la imagen en el JLabel
                lbImg.setIcon(newIcon);
                
                
                TxtNombre.setText(rs.getString("nombre"));
                TxtApellido.setText(rs.getString("apellido"));
                TxtCedula.setText(rs.getString("cedula"));
                
                String la_fecha= rs.getString("fecha");
                fechita=(java.util.Date) s.parse(la_fecha);
                fecha.setDate(fechita);
                
                String telefono = rs.getString("telefono");
                String cuatroDigitos = telefono.substring(0, 4);
                String resto = telefono.substring(4);
                
                ComboTelefono.setSelectedItem(cuatroDigitos); 
                TxtTelefono.setText(resto);

                TxtCorreo.setText(rs.getString("correo"));
                
                
            }
            
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error"+e.toString());
       
        } catch (IOException ex) {
            Logger.getLogger(Pantalla1.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(Pantalla1.class.getName()).log(Level.SEVERE, null, ex);
        }
          
    }//GEN-LAST:event_TablaRegistrosMouseClicked

    private void EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarActionPerformed
            int fila=TablaRegistros.getSelectedRow();
            int id= Integer.parseInt(IdEstudiantes.get(fila).toString());
            
            Guardar.setEnabled(true);
        try{
            
            Connection con= new Conexion().establecerConexion();
            PreparedStatement ps= con.prepareStatement("DELETE FROM Estudiantes WHERE id=?");
            ps.setInt(1, id);
            
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registro Eliminado");
            limpiar();
            cargarTabla();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.toString());
        
        } 
    }//GEN-LAST:event_EliminarActionPerformed

    private void SeleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SeleccionarActionPerformed
    
        FileNameExtensionFilter filtro=new FileNameExtensionFilter("Formatos de Archivos JPEG(*.JPEG;*.JPG;*","jpg","jpeg");
        JFileChooser archivo= new JFileChooser();
        archivo.addChoosableFileFilter(filtro);
        archivo.setDialogTitle("Abrir archivo");
        File ruta= new File("C:\\Users\\manue\\OneDrive\\Escritorio\\Imagenes");
        archivo.setCurrentDirectory(ruta);
        int ventana = archivo.showOpenDialog(null);
        if(ventana==JFileChooser.APPROVE_OPTION){
            
            File file= archivo.getSelectedFile();
            xd=(String.valueOf(file));
            Image foto = getToolkit().getImage(String.valueOf(file));
            foto = foto.getScaledInstance(129, 129, Image.SCALE_DEFAULT);
            lbImg.setIcon(new ImageIcon(foto));
        }
        
    }//GEN-LAST:event_SeleccionarActionPerformed

    private void EditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarActionPerformed
        
        String nombre=TxtNombre.getText();
        String apellido=TxtApellido.getText();
        String cedula=TxtCedula.getText();
        
        
        String fechita;
        java.util.Date date= new java.util.Date();
        SimpleDateFormat f= new SimpleDateFormat("dd/MM/yyyy");
        fechita= f.format(fecha.getDate());
        
        
        String seleccion= (String) ComboTelefono.getSelectedItem();
        String campotelefono= TxtTelefono.getText();
        String telefono=seleccion+campotelefono;
        String correo=TxtCorreo.getText();
       
        FileInputStream archivofoto;
        try{
            int fila=TablaRegistros.getSelectedRow();
            
            Connection con= new Conexion().establecerConexion();
            PreparedStatement ps= con.prepareStatement("UPDATE Estudiantes SET nombre=?,apellido=?,cedula=?,fecha=?,telefono=?,correo=?,foto=? WHERE  id=?");
            
            ps.setString(1, nombre);
            ps.setString(2, apellido);
            ps.setString(3, cedula);
            ps.setString(4, fechita);
            ps.setString(5, telefono);
            
            try{
                isValidEmail(correo);
                ps.setString(6, correo);
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "El correo electronico no es valido");
            }
            
            archivofoto=new FileInputStream(xd);
            ps.setBinaryStream(7,archivofoto );
            ps.setInt(8, Integer.parseInt(IdEstudiantes.get(fila).toString()));
            
            
            
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registro editado");
            TxtNombre.setText("");
            TxtApellido.setText("");
            TxtCedula.setText("");
            fecha.setDate(null);
            TxtTelefono.setText("");
            TxtCorreo.setText("");
            lbImg.setIcon(null);
            Guardar.setEnabled(true);
            cargarTabla();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.toString());
        
        
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Pantalla1.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_EditarActionPerformed

    private void ComboTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboTelefonoActionPerformed

    private void Ver1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ver1ActionPerformed
        Ver ver = new Ver();
        ver.setVisible(true);
        int fila=TablaRegistros.getSelectedRow();
        int id= Integer.parseInt(IdEstudiantes.get(fila).toString());
        ver.llenar(fila, id);
        
    }//GEN-LAST:event_Ver1ActionPerformed

    public static boolean isValidEmail(String email) {
    String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\." +
            "[a-zA-Z0-9_+&*-]+)*@" +
            "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
            "A-Z]{2,7}$";

    Pattern pat = Pattern.compile(emailRegex);
    if (email == null) {
        return false;
    }
    Matcher matcher = pat.matcher(email);
    return matcher.matches();
}
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AgregarReg;
    private javax.swing.JLabel Apellido;
    private javax.swing.JPanel Background;
    private javax.swing.JLabel Cedula;
    private javax.swing.JComboBox<String> ComboTelefono;
    private javax.swing.JLabel Correo;
    private javax.swing.JButton Editar;
    private javax.swing.JButton Eliminar;
    private javax.swing.JLabel Estudiantes;
    private javax.swing.JLabel Fecha;
    private javax.swing.JButton Guardar;
    private javax.swing.JLabel Linea;
    private javax.swing.JLabel Linea1;
    private javax.swing.JLabel Linea2;
    private javax.swing.JLabel Linea3;
    private javax.swing.JLabel Linea4;
    private javax.swing.JLabel Linea5;
    private javax.swing.JLabel Nombre;
    private javax.swing.JButton Seleccionar;
    private javax.swing.JLabel TablaReg;
    private javax.swing.JTable TablaRegistros;
    private javax.swing.JLabel Telefono;
    private javax.swing.JTextField TxtApellido;
    private javax.swing.JTextField TxtCedula;
    private javax.swing.JTextField TxtCorreo;
    private javax.swing.JTextField TxtNombre;
    private javax.swing.JTextField TxtTelefono;
    private javax.swing.JButton Ver1;
    private com.toedter.calendar.JDateChooser fecha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbImg;
    // End of variables declaration//GEN-END:variables
}
