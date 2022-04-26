package View;

import Model.Funciones_Reset;
import Model.Persona;
import Model.Pila;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Karla Bricelda Aguilar González
 */

public class MenuPrincipal extends javax.swing.JFrame {

//-------------------------------------OBJETOS---------------------------------------//
    Persona persona = new Persona();
//----------------------------------------------------------------------------------//

    public MenuPrincipal() {
        initComponents();
        this.setLocationRelativeTo(null);//Para centrar la ventana al ejecutar el programa
        this.setTitle("Tarea 2 - 825  |  Karla Aguilar González "); //Para agregar un titulo a la ventana
        Image icono = new ImageIcon(getClass().getResource("/Images/MyIcon.png")).getImage(); //Para agregar el icono a la ventana
        setIconImage(icono); //Para mostrar el icono 
        JButton[] botones = {btnExtraerMenores, btnMostrarTamMenores, btnVaciarPilaMenores,btnExtraerAdultos,
        btnMostrarTamAdultos, btnVaciarPilaAdultos, btnExtraerAdlMayores, btnMostrarTamAdlMayores, btnVaciarPilaAdlMayores};
        Funciones_Reset.DesactivarBotones(botones);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        btnExtraerAdlMayores = new javax.swing.JButton();
        btnExtraerAdultos = new javax.swing.JButton();
        btnMostrarTamAdultos = new javax.swing.JButton();
        btnExtraerMenores = new javax.swing.JButton();
        btnMostrarTamMenores = new javax.swing.JButton();
        btnVaciarPilaAdultos = new javax.swing.JButton();
        btnMostrarTamAdlMayores = new javax.swing.JButton();
        btnVaciarPilaAdlMayores = new javax.swing.JButton();
        btnVaciarPilaMenores = new javax.swing.JButton();
        btnReiniciar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        TabAdultos = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane9 = new javax.swing.JScrollPane();
        TablaAll = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        TabMenores = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        TabAdlMyores = new javax.swing.JTable();
        btnGenerar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(95, 158, 160));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 96), new java.awt.Color(0, 0, 96), new java.awt.Color(0, 0, 96), new java.awt.Color(0, 0, 96)));

        btnExtraerAdlMayores.setBackground(new java.awt.Color(0, 35, 102));
        btnExtraerAdlMayores.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnExtraerAdlMayores.setForeground(new java.awt.Color(204, 255, 255));
        btnExtraerAdlMayores.setText("EXTRAER UN ELEMENTO");
        btnExtraerAdlMayores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExtraerAdlMayoresActionPerformed(evt);
            }
        });

        btnExtraerAdultos.setBackground(new java.awt.Color(0, 35, 102));
        btnExtraerAdultos.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnExtraerAdultos.setForeground(new java.awt.Color(204, 255, 255));
        btnExtraerAdultos.setText("EXTRAER UN ELEMENTO");
        btnExtraerAdultos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExtraerAdultosActionPerformed(evt);
            }
        });

        btnMostrarTamAdultos.setBackground(new java.awt.Color(70, 130, 180));
        btnMostrarTamAdultos.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnMostrarTamAdultos.setForeground(new java.awt.Color(204, 255, 255));
        btnMostrarTamAdultos.setText("MOSTRAR TAMAÑO");
        btnMostrarTamAdultos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarTamAdultosActionPerformed(evt);
            }
        });

        btnExtraerMenores.setBackground(new java.awt.Color(0, 35, 102));
        btnExtraerMenores.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnExtraerMenores.setForeground(new java.awt.Color(204, 255, 255));
        btnExtraerMenores.setText("EXTRAER UN ELEMENTO");
        btnExtraerMenores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExtraerMenoresActionPerformed(evt);
            }
        });

        btnMostrarTamMenores.setBackground(new java.awt.Color(70, 130, 180));
        btnMostrarTamMenores.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnMostrarTamMenores.setForeground(new java.awt.Color(204, 255, 255));
        btnMostrarTamMenores.setText("MOSTRAR TAMAÑO");
        btnMostrarTamMenores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarTamMenoresActionPerformed(evt);
            }
        });

        btnVaciarPilaAdultos.setBackground(new java.awt.Color(85, 116, 132));
        btnVaciarPilaAdultos.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnVaciarPilaAdultos.setForeground(new java.awt.Color(204, 255, 255));
        btnVaciarPilaAdultos.setText("VACIAR PILA");
        btnVaciarPilaAdultos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVaciarPilaAdultosActionPerformed(evt);
            }
        });

        btnMostrarTamAdlMayores.setBackground(new java.awt.Color(70, 130, 180));
        btnMostrarTamAdlMayores.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnMostrarTamAdlMayores.setForeground(new java.awt.Color(204, 255, 255));
        btnMostrarTamAdlMayores.setText("MOSTRAR TAMAÑO");
        btnMostrarTamAdlMayores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarTamAdlMayoresActionPerformed(evt);
            }
        });

        btnVaciarPilaAdlMayores.setBackground(new java.awt.Color(85, 116, 132));
        btnVaciarPilaAdlMayores.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnVaciarPilaAdlMayores.setForeground(new java.awt.Color(204, 255, 255));
        btnVaciarPilaAdlMayores.setText("VACIAR PILA");
        btnVaciarPilaAdlMayores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVaciarPilaAdlMayoresActionPerformed(evt);
            }
        });

        btnVaciarPilaMenores.setBackground(new java.awt.Color(85, 116, 132));
        btnVaciarPilaMenores.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnVaciarPilaMenores.setForeground(new java.awt.Color(204, 255, 255));
        btnVaciarPilaMenores.setText("VACIAR PILA");
        btnVaciarPilaMenores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVaciarPilaMenoresActionPerformed(evt);
            }
        });

        btnReiniciar.setBackground(new java.awt.Color(0, 133, 202));
        btnReiniciar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnReiniciar.setForeground(new java.awt.Color(204, 255, 255));
        btnReiniciar.setText("REINICIAR PROCESO");
        btnReiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReiniciarActionPerformed(evt);
            }
        });

        btnSalir.setBackground(new java.awt.Color(255, 0, 0));
        btnSalir.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(204, 255, 255));
        btnSalir.setText("SALIR");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(95, 158, 160));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 96), new java.awt.Color(0, 0, 96), new java.awt.Color(0, 0, 96), new java.awt.Color(0, 0, 96)));

        jLabel1.setBackground(new java.awt.Color(0, 0, 96));
        jLabel1.setFont(new java.awt.Font("Dialog", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 96));
        jLabel1.setText("PILAS (LIFO: Last in,  First out)");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(295, 295, 295)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 547, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(322, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(15, 15, 15))
        );

        jPanel3.setBackground(new java.awt.Color(95, 158, 160));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 96), new java.awt.Color(0, 0, 96), new java.awt.Color(0, 0, 96), new java.awt.Color(0, 0, 96)), "ADULTOS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 1, 18), new java.awt.Color(0, 0, 96))); // NOI18N

        TabAdultos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "PERSONAS ENTRE 18 Y 64 "
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TabAdultos.getTableHeader().setReorderingAllowed(false);
        jScrollPane8.setViewportView(TabAdultos);
        if (TabAdultos.getColumnModel().getColumnCount() > 0) {
            TabAdultos.getColumnModel().getColumn(0).setResizable(false);
        }

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 277, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(95, 158, 160));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 96), new java.awt.Color(0, 0, 96), new java.awt.Color(0, 0, 96), new java.awt.Color(0, 0, 96)), "LISTA DE PERSONAS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 1, 18), new java.awt.Color(0, 0, 96))); // NOI18N

        TablaAll.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "TODOS"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TablaAll.getTableHeader().setReorderingAllowed(false);
        jScrollPane9.setViewportView(TablaAll);
        if (TablaAll.getColumnModel().getColumnCount() > 0) {
            TablaAll.getColumnModel().getColumn(0).setResizable(false);
        }

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(95, 158, 160));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 96), new java.awt.Color(0, 0, 96), new java.awt.Color(0, 0, 96), new java.awt.Color(0, 0, 96)), "MENORES", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 1, 18), new java.awt.Color(0, 0, 96))); // NOI18N

        TabMenores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "PERSONAS  MENORES A 18"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TabMenores.getTableHeader().setReorderingAllowed(false);
        jScrollPane5.setViewportView(TabMenores);
        if (TabMenores.getColumnModel().getColumnCount() > 0) {
            TabMenores.getColumnModel().getColumn(0).setResizable(false);
        }

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 271, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(95, 158, 160));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 96), new java.awt.Color(0, 0, 96), new java.awt.Color(0, 0, 96), new java.awt.Color(0, 0, 96)), "ADULTOS  MAYORES", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 1, 18), new java.awt.Color(0, 0, 96))); // NOI18N

        TabAdlMyores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "PERSONAS ENTRE 65 Y 100"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TabAdlMyores.getTableHeader().setReorderingAllowed(false);
        jScrollPane7.setViewportView(TabAdlMyores);
        if (TabAdlMyores.getColumnModel().getColumnCount() > 0) {
            TabAdlMyores.getColumnModel().getColumn(0).setResizable(false);
        }

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnGenerar.setBackground(new java.awt.Color(0, 59, 92));
        btnGenerar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnGenerar.setForeground(new java.awt.Color(204, 255, 255));
        btnGenerar.setText("GENERAR INFORMACIÓN");
        btnGenerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnReiniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGenerar)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnExtraerMenores)
                            .addComponent(btnMostrarTamMenores, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnVaciarPilaMenores, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(btnExtraerAdultos))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(btnMostrarTamAdultos))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(btnVaciarPilaAdultos)
                        .addGap(68, 68, 68)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(28, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnExtraerAdlMayores, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnMostrarTamAdlMayores, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnVaciarPilaAdlMayores, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(84, 84, 84))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnExtraerMenores)
                        .addComponent(btnGenerar, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addComponent(btnExtraerAdultos)
                    .addComponent(btnExtraerAdlMayores, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnMostrarTamAdlMayores)
                            .addComponent(btnMostrarTamAdultos))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnVaciarPilaAdultos)
                            .addComponent(btnVaciarPilaAdlMayores)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnMostrarTamMenores)
                            .addComponent(btnReiniciar, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnVaciarPilaMenores)
                            .addComponent(btnSalir))))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnExtraerMenoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExtraerMenoresActionPerformed
        int tope_pila = Pila.SizePila(persona.getPila_Menores(), 0); //OBTENEMOS LA CANTIDAD DE ELEMENTOS DE LA PILA(TOPE)
        Pila.popPila(persona.getPila_Menores(), tope_pila); //ELIMINAMOS UN ELEMENTO DE LA PILA
        //MOSTRAMOS LA PILA ACTUALIZADA EN EL JTABLE
        Pila.MostrarPilas(persona.getPila_Menores(), (DefaultTableModel) TabMenores.getModel(), 50);
    }//GEN-LAST:event_btnExtraerMenoresActionPerformed

    private void btnVaciarPilaAdlMayoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVaciarPilaAdlMayoresActionPerformed
        Pila.VaciarPila(persona.getPila_AdlMayores()); //ELIMINAMOS TODOS LOS ELEMENTOS DE LA PILA
         //MOSTRAMOS LA PILA ACTUALIZADA EN EL JTABLE 
        Pila.MostrarPilas(persona.getPila_AdlMayores(), (DefaultTableModel) TabAdlMyores.getModel(), 50);
        JOptionPane.showMessageDialog(null, "La pila se encuentra vacía");
    }//GEN-LAST:event_btnVaciarPilaAdlMayoresActionPerformed

    private void btnMostrarTamMenoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarTamMenoresActionPerformed
        int tam_pila = Pila.SizePila(persona.getPila_Menores(), 0);//OBTENEMOS LA CANTIDAD DE ELEMENTOS DE LA PILA
        JOptionPane.showMessageDialog(null, "El tamaño de la pila es de: " + tam_pila + " personas");
    }//GEN-LAST:event_btnMostrarTamMenoresActionPerformed

    private void btnVaciarPilaMenoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVaciarPilaMenoresActionPerformed
        Pila.VaciarPila(persona.getPila_Menores()); //ELIMINAMOS TODOS LOS ELEMENTOS DE LA PILA
        //MOSTRAMOS LA PILA ACTUALIZADA EN EL JTABLE 
        Pila.MostrarPilas(persona.getPila_Menores(), (DefaultTableModel) TabMenores.getModel(), 50);
        JOptionPane.showMessageDialog(null, "La pila se encuentra vacía");
    }//GEN-LAST:event_btnVaciarPilaMenoresActionPerformed

    private void btnExtraerAdultosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExtraerAdultosActionPerformed
        int tope_pila = Pila.SizePila(persona.getPila_Adultos(), 0);//OBTENEMOS LA CANTIDAD DE ELEMENTOS DE LA PILA(TOPE)
        Pila.popPila(persona.getPila_Adultos(), tope_pila); //ELIMINAMOS UN ELEMENTO DE LA PILA
        //MOSTRAMOS LA PILA ACTUALIZADA EN EL JTABLE 
        Pila.MostrarPilas(persona.getPila_Adultos(), (DefaultTableModel) TabAdultos.getModel(), 50);
    }//GEN-LAST:event_btnExtraerAdultosActionPerformed

    private void btnMostrarTamAdultosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarTamAdultosActionPerformed
        int tam_pila = Pila.SizePila(persona.getPila_Adultos(), 0);//OBTENEMOS LA CANTIDAD DE ELEMENTOS DE LA PILA
        JOptionPane.showMessageDialog(null, "El tamaño de la pila es de: " + tam_pila + " personas");
    }//GEN-LAST:event_btnMostrarTamAdultosActionPerformed

    private void btnVaciarPilaAdultosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVaciarPilaAdultosActionPerformed
        Pila.VaciarPila(persona.getPila_Adultos());//ELIMINAMOS TODOS LOS ELEMENTOS DE LA PILA
        //MOSTRAMOS LA PILA ACTUALIZADA EN EL JTABLE 
        Pila.MostrarPilas(persona.getPila_Adultos(), (DefaultTableModel) TabAdultos.getModel(), 50);
        JOptionPane.showMessageDialog(null, "La pila se encuentra vacía");
    }//GEN-LAST:event_btnVaciarPilaAdultosActionPerformed

    private void btnExtraerAdlMayoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExtraerAdlMayoresActionPerformed
        int tope_pila = Pila.SizePila(persona.getPila_AdlMayores(), 0);//OBTENEMOS LA CANTIDAD DE ELEMENTOS DE LA PILA(TOPE)
        Pila.popPila(persona.getPila_AdlMayores(), tope_pila);//ELIMINAMOS UN ELEMENTO DE LA PILA
         //MOSTRAMOS LA PILA ACTUALIZADA EN EL JTABLE 
        Pila.MostrarPilas(persona.getPila_AdlMayores(), (DefaultTableModel) TabAdlMyores.getModel(), 50);
    }//GEN-LAST:event_btnExtraerAdlMayoresActionPerformed

    private void btnMostrarTamAdlMayoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarTamAdlMayoresActionPerformed
        int tam_pila = Pila.SizePila(persona.getPila_AdlMayores(), 0);
        JOptionPane.showMessageDialog(null, "El tamaño de la pila es de: " + tam_pila + " personas");
    }//GEN-LAST:event_btnMostrarTamAdlMayoresActionPerformed

    private void btnReiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReiniciarActionPerformed
        btnGenerar.setEnabled(true); //ACTIVAMOS EL BOTÓN DE "GENERAR INFORMACIÓN"
//=========================================================================================================================//
//                              DESACTIVAMOS LOS BOTONES DE CADA PILA                                                     //
        JButton[] botones = {btnExtraerMenores, btnMostrarTamMenores, btnVaciarPilaMenores, btnExtraerAdultos,
            btnMostrarTamAdultos, btnVaciarPilaAdultos, btnExtraerAdlMayores, btnMostrarTamAdlMayores, btnVaciarPilaAdlMayores};
        Funciones_Reset.DesactivarBotones(botones);
//=========================================================================================================================// 
//                      ELIMINAMOS LA INFORMACIÓN CONTENIDA EN LOS ARREGLOS                                               //
//----- Declaramos un matriz de tipo objeto que almacene los 4 arreglos de tipo objeto para después ----------------------// 
//----- eliminar la información al mismo tiempo --------------------------------------------------------------------------//
        Object AllPilas[][] = {persona.getLista_Todos(), persona.getPila_Menores(),
            persona.getPila_Adultos(), persona.getPila_AdlMayores()};
        Funciones_Reset.VaciarTodasPilas(AllPilas);
//=========================================================================================================================//  
//                              LIMPIAMOS LA INFORMACIÓN QUE SE VISUALIZA EN LOS JTABLES                                  //
        DefaultTableModel[] mod_tablas = {(DefaultTableModel) TabMenores.getModel(), (DefaultTableModel) TabAdultos.getModel(),
            (DefaultTableModel) TabAdlMyores.getModel(), (DefaultTableModel) TablaAll.getModel()};
        Funciones_Reset.LimpiarModelosJTables(mod_tablas);
    }//GEN-LAST:event_btnReiniciarActionPerformed

    private void btnGenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarActionPerformed
        btnGenerar.setEnabled(false); //DESACTIVAMOS EL BOTÓN DE "GENERAR INFORMACIÓN"
//=========================================================================================================================//
//                                 ACTIVAMOS LOS BOTONES DE CADA PILA                                                     //
        JButton[] botones = {btnExtraerMenores, btnMostrarTamMenores, btnVaciarPilaMenores,
        btnExtraerAdultos, btnMostrarTamAdultos, btnVaciarPilaAdultos, btnExtraerAdlMayores,
        btnMostrarTamAdlMayores, btnVaciarPilaAdlMayores};
        Funciones_Reset.ActivarBotones(botones);
//=========================================================================================================================//         
//      LLENAMOS EL ARREGLO QUE INCLUYE TODAS LAS PERSONAS CON UN ID DE 9 DÍGITOS Y ÚNICO + EDAD ALEATORIA                //        
        Pila.pushTodos(persona.getLista_Todos(), persona.getLista_Todos().length, 0);
//=========================================================================================================================//
// LLENAMOS LAS 3 PILAS (MENORES, ADULTOS Y ADULTOS MAYORES) CON LA INFORMACIÓN EXTRAÍDA DE LA LISTA DE PERSONAS          //
//                   SEGÚN EL RANGO DE EDAD CORRESPONDIENTE PARA CADA PILA                                                //
        Pila.pushPilas(persona.getLista_Todos(), persona.getPila_Menores(),
                persona.getPila_Adultos(), persona.getPila_AdlMayores(), 0, 0, 0);
//=========================================================================================================================// 
//             MOSTRAMOS LA INFORMACIÓN DE LA LISTA DE PERSONAS CON TODOS LOS DATOS EN UN JTABLE                           //
        Pila.MostrarLista(persona.getLista_Todos(), (DefaultTableModel) TablaAll.getModel());
//=========================================================================================================================// 
//             MOSTRAMOS LA INFORMACIÓN DE LAS 3 PILAS (MENORES, ADULTOS Y ADULTOS MAYORES) EN UN JTABLE                  //
        Pila.MostrarPilas(persona.getPila_Menores(), (DefaultTableModel) TabMenores.getModel(), 50);
        Pila.MostrarPilas(persona.getPila_Adultos(), (DefaultTableModel) TabAdultos.getModel(), 50);
        Pila.MostrarPilas(persona.getPila_AdlMayores(), (DefaultTableModel) TabAdlMyores.getModel(), 50);
    }//GEN-LAST:event_btnGenerarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        JOptionPane.showMessageDialog(null, "Programa finalizado con éxito!");
        System.exit(0);//Se termina de ejecutar el programa y se cierra
    }//GEN-LAST:event_btnSalirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TabAdlMyores;
    private javax.swing.JTable TabAdultos;
    private javax.swing.JTable TabMenores;
    public static javax.swing.JTable TablaAll;
    private javax.swing.JButton btnExtraerAdlMayores;
    private javax.swing.JButton btnExtraerAdultos;
    private javax.swing.JButton btnExtraerMenores;
    private javax.swing.JButton btnGenerar;
    private javax.swing.JButton btnMostrarTamAdlMayores;
    private javax.swing.JButton btnMostrarTamAdultos;
    private javax.swing.JButton btnMostrarTamMenores;
    private javax.swing.JButton btnReiniciar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnVaciarPilaAdlMayores;
    private javax.swing.JButton btnVaciarPilaAdultos;
    private javax.swing.JButton btnVaciarPilaMenores;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    // End of variables declaration//GEN-END:variables
}
