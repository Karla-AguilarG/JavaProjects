package View;

import Model.Array_Data;
import Model.Array_Functions;
import Model.Functions_Clean;
import Model.Insert_Sound;
import Model.Ordinances;
import java.awt.Color;
import java.awt.Image;
import java.util.Arrays;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Karla Bricelda Aguilar González
 */
public class Main_Menu extends javax.swing.JFrame {
    
 //-------------------------------------OBJETOS---------------------------------------//
    Array_Data array = new Array_Data();
    Insert_Sound audio = new Insert_Sound();
 //----------------------------------------------------------------------------------//
    
    public Main_Menu() {
        initComponents();
        this.setLocationRelativeTo(null);//Para centrar la ventana al ejecutar el programa
        this.setTitle("Proyecto 1- 825  |  Karla Aguilar González "); //Para agregar un titulo a la ventana
        Image icono = new ImageIcon(getClass().getResource("/Images/MyIcon.png")).getImage(); //Para agregar el icono a la ventana
        setIconImage(icono); //Para mostrar el icono 
        PanelTablas.setBackground(new Color(0, 0, 0, 30));//Para que la tabla tenga transparencia
        btnOrdenarLista.setEnabled(false); //Desactivamos el botón de Ordenar la Lista
        audio.playMusic("/Sounds/SonidoPrograma.wav"); //Activamos el sonido al abrirse ésta ventana
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelPrincipal = new javax.swing.JPanel();
        btnReiniciar = new javax.swing.JButton();
        btnGenerarLista = new javax.swing.JButton();
        btnOrdenarLista = new javax.swing.JButton();
        TituloVentana = new javax.swing.JLabel();
        PanelTablas = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        Tabla_OrdQuicksort = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla_OrdShellsort = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        TablaListaNumeros = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        Tabla_OrdBurbuja = new javax.swing.JTable();
        DuracionOrd = new javax.swing.JLabel();
        PanelTBur = new javax.swing.JPanel();
        time_ordburbuja = new javax.swing.JLabel();
        PanelTQuick = new javax.swing.JPanel();
        time_ordquick = new javax.swing.JLabel();
        PanelTShell = new javax.swing.JPanel();
        time_shellsort = new javax.swing.JLabel();
        PanelTituloShell = new javax.swing.JPanel();
        tituloORDS = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        PanelTituloQuick = new javax.swing.JPanel();
        tituloORDQ = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        PanelTituloBur = new javax.swing.JPanel();
        tituloORDB = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        PanelTituloLista = new javax.swing.JPanel();
        tituloLista = new javax.swing.JLabel();
        tituloAleatoria = new javax.swing.JLabel();
        IconoVentana = new javax.swing.JLabel();
        LogoUned = new javax.swing.JLabel();
        FondoVentana = new javax.swing.JLabel();
        btnStopMusic = new javax.swing.JButton();
        btnPlayMusic = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        TituloVentana1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        PanelPrincipal.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        PanelPrincipal.setForeground(new java.awt.Color(0, 51, 51));
        PanelPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnReiniciar.setBackground(new java.awt.Color(153, 51, 0));
        btnReiniciar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnReiniciar.setForeground(new java.awt.Color(255, 255, 255));
        btnReiniciar.setText("REINICIAR");
        btnReiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReiniciarActionPerformed(evt);
            }
        });
        PanelPrincipal.add(btnReiniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 530, 140, 40));

        btnGenerarLista.setBackground(new java.awt.Color(102, 0, 102));
        btnGenerarLista.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnGenerarLista.setForeground(new java.awt.Color(255, 255, 255));
        btnGenerarLista.setText("GENERAR LISTA");
        btnGenerarLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarListaActionPerformed(evt);
            }
        });
        PanelPrincipal.add(btnGenerarLista, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, -1, -1));

        btnOrdenarLista.setBackground(new java.awt.Color(0, 102, 102));
        btnOrdenarLista.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnOrdenarLista.setForeground(new java.awt.Color(255, 255, 255));
        btnOrdenarLista.setText("ORDENAR LISTA");
        btnOrdenarLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrdenarListaActionPerformed(evt);
            }
        });
        PanelPrincipal.add(btnOrdenarLista, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 340, -1, -1));

        TituloVentana.setBackground(new java.awt.Color(102, 51, 0));
        TituloVentana.setFont(new java.awt.Font("Elephant", 3, 24)); // NOI18N
        TituloVentana.setForeground(new java.awt.Color(153, 51, 0));
        TituloVentana.setText("ORDENAMIENTO ");
        PanelPrincipal.add(TituloVentana, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 90, 290, 60));

        PanelTablas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        Tabla_OrdQuicksort.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        Tabla_OrdQuicksort.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                ""
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Tabla_OrdQuicksort.getTableHeader().setReorderingAllowed(false);
        jScrollPane4.setViewportView(Tabla_OrdQuicksort);

        Tabla_OrdShellsort.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        Tabla_OrdShellsort.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                ""
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Tabla_OrdShellsort.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(Tabla_OrdShellsort);

        TablaListaNumeros.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        TablaListaNumeros.setForeground(new java.awt.Color(0, 0, 0));
        TablaListaNumeros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                ""
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TablaListaNumeros.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(TablaListaNumeros);

        Tabla_OrdBurbuja.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        Tabla_OrdBurbuja.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                ""
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Tabla_OrdBurbuja.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(Tabla_OrdBurbuja);

        DuracionOrd.setBackground(new java.awt.Color(0, 0, 0));
        DuracionOrd.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        DuracionOrd.setForeground(new java.awt.Color(0, 0, 0));
        DuracionOrd.setText("DURACIÓN EN MILI-SEGUNDOS :");

        PanelTBur.setBackground(new java.awt.Color(0, 102, 153));

        time_ordburbuja.setBackground(new java.awt.Color(255, 255, 255));
        time_ordburbuja.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        time_ordburbuja.setForeground(new java.awt.Color(255, 255, 255));
        time_ordburbuja.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        javax.swing.GroupLayout PanelTBurLayout = new javax.swing.GroupLayout(PanelTBur);
        PanelTBur.setLayout(PanelTBurLayout);
        PanelTBurLayout.setHorizontalGroup(
            PanelTBurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(time_ordburbuja, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanelTBurLayout.setVerticalGroup(
            PanelTBurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(time_ordburbuja, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        PanelTQuick.setBackground(new java.awt.Color(0, 102, 153));

        time_ordquick.setBackground(new java.awt.Color(255, 255, 255));
        time_ordquick.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        time_ordquick.setForeground(new java.awt.Color(255, 255, 255));
        time_ordquick.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        javax.swing.GroupLayout PanelTQuickLayout = new javax.swing.GroupLayout(PanelTQuick);
        PanelTQuick.setLayout(PanelTQuickLayout);
        PanelTQuickLayout.setHorizontalGroup(
            PanelTQuickLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(time_ordquick, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
        );
        PanelTQuickLayout.setVerticalGroup(
            PanelTQuickLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(time_ordquick, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
        );

        PanelTShell.setBackground(new java.awt.Color(0, 102, 153));

        time_shellsort.setBackground(new java.awt.Color(255, 255, 255));
        time_shellsort.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        time_shellsort.setForeground(new java.awt.Color(255, 255, 255));
        time_shellsort.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        javax.swing.GroupLayout PanelTShellLayout = new javax.swing.GroupLayout(PanelTShell);
        PanelTShell.setLayout(PanelTShellLayout);
        PanelTShellLayout.setHorizontalGroup(
            PanelTShellLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(time_shellsort, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
        );
        PanelTShellLayout.setVerticalGroup(
            PanelTShellLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(time_shellsort, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        PanelTituloShell.setBackground(new java.awt.Color(0, 153, 255));
        PanelTituloShell.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        tituloORDS.setBackground(new java.awt.Color(255, 255, 255));
        tituloORDS.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        tituloORDS.setForeground(new java.awt.Color(255, 255, 255));
        tituloORDS.setText("ORDENAMIENTO");

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("SHELLSORT");

        javax.swing.GroupLayout PanelTituloShellLayout = new javax.swing.GroupLayout(PanelTituloShell);
        PanelTituloShell.setLayout(PanelTituloShellLayout);
        PanelTituloShellLayout.setHorizontalGroup(
            PanelTituloShellLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTituloShellLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(tituloORDS)
                .addContainerGap(36, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelTituloShellLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(46, 46, 46))
        );
        PanelTituloShellLayout.setVerticalGroup(
            PanelTituloShellLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTituloShellLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloORDS)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        PanelTituloQuick.setBackground(new java.awt.Color(0, 153, 255));
        PanelTituloQuick.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        tituloORDQ.setBackground(new java.awt.Color(255, 255, 255));
        tituloORDQ.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        tituloORDQ.setForeground(new java.awt.Color(255, 255, 255));
        tituloORDQ.setText("ORDENAMIENTO");

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("QUICKSORT");

        javax.swing.GroupLayout PanelTituloQuickLayout = new javax.swing.GroupLayout(PanelTituloQuick);
        PanelTituloQuick.setLayout(PanelTituloQuickLayout);
        PanelTituloQuickLayout.setHorizontalGroup(
            PanelTituloQuickLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTituloQuickLayout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addGroup(PanelTituloQuickLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelTituloQuickLayout.createSequentialGroup()
                        .addComponent(tituloORDQ)
                        .addGap(33, 33, 33))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelTituloQuickLayout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(46, 46, 46))))
        );
        PanelTituloQuickLayout.setVerticalGroup(
            PanelTituloQuickLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTituloQuickLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloORDQ)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        PanelTituloBur.setBackground(new java.awt.Color(0, 153, 255));
        PanelTituloBur.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        tituloORDB.setBackground(new java.awt.Color(255, 255, 255));
        tituloORDB.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        tituloORDB.setForeground(new java.awt.Color(255, 255, 255));
        tituloORDB.setText("ORDENAMIENTO");

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("BURBUJA");

        javax.swing.GroupLayout PanelTituloBurLayout = new javax.swing.GroupLayout(PanelTituloBur);
        PanelTituloBur.setLayout(PanelTituloBurLayout);
        PanelTituloBurLayout.setHorizontalGroup(
            PanelTituloBurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTituloBurLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(PanelTituloBurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tituloORDB)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelTituloBurLayout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(23, 23, 23)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        PanelTituloBurLayout.setVerticalGroup(
            PanelTituloBurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTituloBurLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloORDB)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        PanelTituloLista.setBackground(new java.awt.Color(0, 153, 255));
        PanelTituloLista.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        tituloLista.setBackground(new java.awt.Color(255, 255, 255));
        tituloLista.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        tituloLista.setForeground(new java.awt.Color(255, 255, 255));
        tituloLista.setText("LISTA ");

        tituloAleatoria.setBackground(new java.awt.Color(255, 255, 255));
        tituloAleatoria.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        tituloAleatoria.setForeground(new java.awt.Color(255, 255, 255));
        tituloAleatoria.setText("ALEATORIA");

        javax.swing.GroupLayout PanelTituloListaLayout = new javax.swing.GroupLayout(PanelTituloLista);
        PanelTituloLista.setLayout(PanelTituloListaLayout);
        PanelTituloListaLayout.setHorizontalGroup(
            PanelTituloListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelTituloListaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tituloLista)
                .addGap(70, 70, 70))
            .addGroup(PanelTituloListaLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(tituloAleatoria)
                .addContainerGap(56, Short.MAX_VALUE))
        );
        PanelTituloListaLayout.setVerticalGroup(
            PanelTituloListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTituloListaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloLista)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tituloAleatoria)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout PanelTablasLayout = new javax.swing.GroupLayout(PanelTablas);
        PanelTablas.setLayout(PanelTablasLayout);
        PanelTablasLayout.setHorizontalGroup(
            PanelTablasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelTablasLayout.createSequentialGroup()
                .addGroup(PanelTablasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PanelTablasLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(DuracionOrd, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PanelTBur, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(PanelTablasLayout.createSequentialGroup()
                        .addGroup(PanelTablasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelTablasLayout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelTablasLayout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addComponent(PanelTituloLista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                        .addGroup(PanelTablasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(PanelTituloBur, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(36, 36, 36)
                .addGroup(PanelTablasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PanelTablasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(PanelTituloShell, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(PanelTShell, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(PanelTablasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PanelTablasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(PanelTituloQuick, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(PanelTQuick, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        PanelTablasLayout.setVerticalGroup(
            PanelTablasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTablasLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(PanelTablasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PanelTituloShell, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PanelTituloQuick, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PanelTituloBur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PanelTituloLista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelTablasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 419, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addComponent(jScrollPane4)
                    .addComponent(jScrollPane2))
                .addGap(40, 40, 40)
                .addGroup(PanelTablasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(PanelTQuick, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PanelTBur, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PanelTShell, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(DuracionOrd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        PanelPrincipal.add(PanelTablas, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 50, 960, 640));

        IconoVentana.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/FondoColorK2.jpeg"))); // NOI18N
        PanelPrincipal.add(IconoVentana, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 610, 420));

        LogoUned.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/UNED.jpg"))); // NOI18N
        PanelPrincipal.add(LogoUned, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 650, -1, -1));

        FondoVentana.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/MyFondo.jpg"))); // NOI18N
        FondoVentana.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        PanelPrincipal.add(FondoVentana, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 0, 1040, 740));

        btnStopMusic.setBackground(new java.awt.Color(153, 0, 153));
        btnStopMusic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/QuitarSonido.png"))); // NOI18N
        btnStopMusic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStopMusicActionPerformed(evt);
            }
        });
        PanelPrincipal.add(btnStopMusic, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, 60, 50));

        btnPlayMusic.setBackground(new java.awt.Color(0, 102, 102));
        btnPlayMusic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ActivarSonido.png"))); // NOI18N
        btnPlayMusic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlayMusicActionPerformed(evt);
            }
        });
        PanelPrincipal.add(btnPlayMusic, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 60, 50));

        btnSalir.setBackground(new java.awt.Color(153, 0, 0));
        btnSalir.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setText("SALIR");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        PanelPrincipal.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 660, 130, -1));

        TituloVentana1.setBackground(new java.awt.Color(102, 51, 0));
        TituloVentana1.setFont(new java.awt.Font("Elephant", 3, 24)); // NOI18N
        TituloVentana1.setForeground(new java.awt.Color(153, 51, 0));
        TituloVentana1.setText("ALGORITMOS DE ");
        PanelPrincipal.add(TituloVentana1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 40, 300, 60));

        getContentPane().add(PanelPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1670, 740));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnReiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReiniciarActionPerformed
//===========================================================================================================//  
        DefaultTableModel[] ModelosTab = {(DefaultTableModel) TablaListaNumeros.getModel(),
            (DefaultTableModel) Tabla_OrdBurbuja.getModel(), (DefaultTableModel) Tabla_OrdQuicksort.getModel(),
            (DefaultTableModel) Tabla_OrdShellsort.getModel()}; //Vector de Modelo de JTables
        Functions_Clean.LimpiarModelosJTables(ModelosTab);//Limpiamos los modelos
//===========================================================================================================//  
        JLabel[] CamposLabel = {time_ordquick, time_ordburbuja, time_shellsort};//Vector de JLabel
        Functions_Clean.LimpiarJLabels(CamposLabel); //Limpiamos los campos de texto del JLabel
//===========================================================================================================//  
        btnOrdenarLista.setEnabled(false);//Desactivamos el botón de Ordenar Lista
        btnGenerarLista.setEnabled(true); //Activamos el botón de Generar Lista
    }//GEN-LAST:event_btnReiniciarActionPerformed

    private void btnOrdenarListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdenarListaActionPerformed
        btnOrdenarLista.setEnabled(false); //Desactivamos el botón de Ordenar Lista
//===========================================================================================================// 
//                        ORDENAMOS LA LISTA USANDO EL MÉTODO BURBUJA                                       //
        long InicioOB = System.nanoTime(); //Time Inicio
        array.setArrayOB(Ordinances.Ord_Burbuja(array.getArrayOB()));
        long FinalOB = System.nanoTime();//Time Final
//===========================================================================================================//
//                        ORDENAMOS LA LISTA USANDO EL MÉTODO QUICKSORT                                     //
        long InicioOQ = System.nanoTime();//Time Inicio
        array.setArrayOQ(Ordinances.Ord_QuickSort(array.getArrayOQ(), 0, array.getArrayOQ().length - 1));
        long FinalOQ = System.nanoTime();//Time Final
//===========================================================================================================//
//                          ORDENAMOS LA LISTA USANDO EL MÉTODO SHELLSORT                                   //
        long InicioOS = System.nanoTime(); //Time Inicio
        array.setArrayOS(Ordinances.Ord_Shell(array.getArrayOS()));
        long FinalOS = System.nanoTime();//Time Final
//===========================================================================================================// 
        DefaultTableModel[] ModelosTab = {(DefaultTableModel) Tabla_OrdBurbuja.getModel(), (DefaultTableModel) Tabla_OrdQuicksort.getModel(),
            (DefaultTableModel) Tabla_OrdShellsort.getModel()}; //Vector de Modelo de JTables
        Functions_Clean.LimpiarModelosJTables(ModelosTab);
//===========================================================================================================// 
        Array_Functions.MostrarArreglo(array.getArrayOB(), (DefaultTableModel) Tabla_OrdBurbuja.getModel()); //Mostrar Array     
        Array_Functions.MostrarArreglo(array.getArrayOQ(), (DefaultTableModel) Tabla_OrdQuicksort.getModel()); //Mostrar Array  
        Array_Functions.MostrarArreglo(array.getArrayOS(), (DefaultTableModel) Tabla_OrdShellsort.getModel()); //Mostrar Array
//===========================================================================================================// 
//                       MOSTRAMOS LA DURACIÓN DE ORDENAMIENTO DE CADA ALGORITMO                            //
        time_ordburbuja.setText(String.valueOf((FinalOB - InicioOB) / 1000000.0));
        time_ordquick.setText(String.valueOf((FinalOQ - InicioOQ) / 1000000.0));
        time_shellsort.setText(String.valueOf((FinalOS - InicioOS) / 1000000.0));
//===========================================================================================================// 
        JOptionPane.showMessageDialog(null, "Lista ordenada con éxito!");
//===========================================================================================================//  
    }//GEN-LAST:event_btnOrdenarListaActionPerformed

    private void btnGenerarListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarListaActionPerformed
        btnGenerarLista.setEnabled(false);//Desactivamos el botón de Generar Lista
//===========================================================================================================// 
// LLENAMOS EL ARREGLO ORIGINAL CON DATOS ALEATORIOS DE TIPO DOUBLE(NÚMEROS REALES) CON UN RANGO DE 0-10000 //
        array.setListaAleatoria(Array_Functions.LlenarArregloAleatorio(0, 1000));
//===========================================================================================================// 
// LLENAMOS 3 ARREGLOS AUXILIARES COPIANDO LOS DATOS DEL ARREGLO ORIGINAL PARA CONSERVAR LOS DATOS INICIALES //
// Y ASÍ PODER ORDENAR CADA UNO CON LOS MÉTODOS DE ORDENAMIENTO Y CONSERVANDO LOS DATOS ORIGINALES           //
// PARA REALIZAR UNA CORRECTA ORDENACIÓN                                                                     //
        array.setArrayOB(Arrays.copyOf(array.getListaAleatoria(), array.getListaAleatoria().length));
        array.setArrayOQ(Arrays.copyOf(array.getListaAleatoria(), array.getListaAleatoria().length));
        array.setArrayOS(Arrays.copyOf(array.getListaAleatoria(), array.getListaAleatoria().length));
//===========================================================================================================//  
        DefaultTableModel tab_model = (DefaultTableModel) TablaListaNumeros.getModel();
        Array_Functions.MostrarArreglo(array.getListaAleatoria(), tab_model); //Mostrar Array
//===========================================================================================================//  
        btnOrdenarLista.setEnabled(true); //Activamos el botón de Ordenar Lista
        JOptionPane.showMessageDialog(null, "Lista generada con éxito!");
    }//GEN-LAST:event_btnGenerarListaActionPerformed

    private void btnStopMusicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStopMusicActionPerformed
        audio.stopMusic("/Sounds/SonidoPrograma.wav"); //STOP al sonido
    }//GEN-LAST:event_btnStopMusicActionPerformed

    private void btnPlayMusicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlayMusicActionPerformed
        audio.playMusic("/Sounds/SonidoPrograma.wav"); //PLAY sonido
    }//GEN-LAST:event_btnPlayMusicActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        JOptionPane.showMessageDialog(null, "Programa finalizado con éxito!");
        System.exit(0);//Se termina de ejecutar el programa y se cierra
    }//GEN-LAST:event_btnSalirActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DuracionOrd;
    private javax.swing.JLabel FondoVentana;
    private javax.swing.JLabel IconoVentana;
    private javax.swing.JLabel LogoUned;
    private javax.swing.JPanel PanelPrincipal;
    private javax.swing.JPanel PanelTBur;
    private javax.swing.JPanel PanelTQuick;
    private javax.swing.JPanel PanelTShell;
    private javax.swing.JPanel PanelTablas;
    private javax.swing.JPanel PanelTituloBur;
    private javax.swing.JPanel PanelTituloLista;
    private javax.swing.JPanel PanelTituloQuick;
    private javax.swing.JPanel PanelTituloShell;
    private javax.swing.JTable TablaListaNumeros;
    private javax.swing.JTable Tabla_OrdBurbuja;
    private javax.swing.JTable Tabla_OrdQuicksort;
    private javax.swing.JTable Tabla_OrdShellsort;
    private javax.swing.JLabel TituloVentana;
    private javax.swing.JLabel TituloVentana1;
    private javax.swing.JButton btnGenerarLista;
    private javax.swing.JButton btnOrdenarLista;
    private javax.swing.JButton btnPlayMusic;
    private javax.swing.JButton btnReiniciar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnStopMusic;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel time_ordburbuja;
    private javax.swing.JLabel time_ordquick;
    private javax.swing.JLabel time_shellsort;
    private javax.swing.JLabel tituloAleatoria;
    private javax.swing.JLabel tituloLista;
    private javax.swing.JLabel tituloORDB;
    private javax.swing.JLabel tituloORDQ;
    private javax.swing.JLabel tituloORDS;
    // End of variables declaration//GEN-END:variables
}
