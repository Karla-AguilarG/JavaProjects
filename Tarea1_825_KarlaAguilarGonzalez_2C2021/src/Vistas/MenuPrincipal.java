package Vistas;

import Clases_Datos.Datos_Arreglo;
import Clases_Funciones.Funciones_Arreglo;
import Clases_Funciones.Funciones_Numero;
import Clases_Funciones.Funciones_Validar;
import Clases_Datos.Datos_Numero;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Karla Bricelda Aguilar González
 */
public class MenuPrincipal extends javax.swing.JFrame {

    MenuPrincipal.FondoPanel fondo = new MenuPrincipal.FondoPanel();

    private final Datos_Arreglo array_num = new Datos_Arreglo();

    public MenuPrincipal() {
        this.setContentPane(fondo);
        initComponents();
        this.setLocationRelativeTo(null);//Para centrar la ventana al ejecutar el programa
        this.setTitle("Tarea1- 825  |  Karla Aguilar González "); //Para agregar un titulo a la ventana
        Image icono = new ImageIcon(getClass().getResource("/Imagenes/MyIcon.png")).getImage(); //Para agregar el icono a la ventana
        setIconImage(icono); //Para mostrar el icono 
        JPanel[] Paneles = {Panel1, Panel2, Panel3, PanelArray};
        PanelTablaDatos.setBackground(new Color(0, 0, 0, 0));
        Funciones_Validar.TransparenciaJPanel(Paneles);
        PanelTablaDatos.setVisible(false);
        btnResultados.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollBar1 = new javax.swing.JScrollBar();
        Panel1 = new javax.swing.JPanel();
        txtNumero = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        btnIngresarNumero = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        InvertirNum = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        SumaDigitos = new javax.swing.JLabel();
        Panel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        btnTerminar = new javax.swing.JButton();
        Panel3 = new javax.swing.JPanel();
        btnCrearArreglo = new javax.swing.JButton();
        PanelArray = new javax.swing.JPanel();
        PanelK1 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        Datomayor = new javax.swing.JLabel();
        PosMayor = new javax.swing.JLabel();
        PanelK4 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        ImParArray = new javax.swing.JLabel();
        PanelK3 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        ParArray = new javax.swing.JLabel();
        PanelK2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        Datomenor = new javax.swing.JLabel();
        PosMenor = new javax.swing.JLabel();
        PanelTablaDatos = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaArrayAleatory = new javax.swing.JTable();
        btnResultados = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Panel1.setBackground(new java.awt.Color(102, 102, 102));
        Panel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 255, 204), new java.awt.Color(153, 255, 204), new java.awt.Color(153, 255, 204), new java.awt.Color(153, 255, 204)));
        Panel1.setForeground(new java.awt.Color(51, 51, 51));

        txtNumero.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtNumero.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumeroKeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("INGRESE UN NÚMERO : ");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("1. LA SUMA DE LOS DÍGITOS ES : ");

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("2. EL NÚMERO INVERTIDO ES:");

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnIngresarNumero.setBackground(new java.awt.Color(0, 153, 102));
        btnIngresarNumero.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnIngresarNumero.setForeground(new java.awt.Color(255, 255, 255));
        btnIngresarNumero.setText("INGRESAR");
        btnIngresarNumero.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnIngresarNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarNumeroActionPerformed(evt);
            }
        });

        btnEliminar.setBackground(new java.awt.Color(102, 0, 0));
        btnEliminar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setText("ELIMINAR");
        btnEliminar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 153, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 255, 204), new java.awt.Color(153, 255, 204), new java.awt.Color(153, 255, 204), new java.awt.Color(153, 255, 204)));

        InvertirNum.setBackground(new java.awt.Color(0, 0, 0));
        InvertirNum.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        InvertirNum.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(InvertirNum, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(InvertirNum, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(0, 153, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 255, 204), new java.awt.Color(153, 255, 204), new java.awt.Color(153, 255, 204), new java.awt.Color(153, 255, 204)));

        SumaDigitos.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        SumaDigitos.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(SumaDigitos, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(SumaDigitos, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout Panel1Layout = new javax.swing.GroupLayout(Panel1);
        Panel1.setLayout(Panel1Layout);
        Panel1Layout.setHorizontalGroup(
            Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator2)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(Panel1Layout.createSequentialGroup()
                .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnIngresarNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(Panel1Layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(jLabel4))
                    .addGroup(Panel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel6)
                        .addGap(31, 31, 31)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Panel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        Panel1Layout.setVerticalGroup(
            Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel1Layout.createSequentialGroup()
                .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel1Layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(Panel1Layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(btnIngresarNumero)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminar)))
                .addGap(30, 30, 30)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(76, 76, 76)
                .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(Panel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(31, 31, 31)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(78, 78, 78)
                        .addComponent(jLabel6))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(95, 95, 95))
        );

        Panel2.setBackground(new java.awt.Color(102, 102, 102));
        Panel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 255, 204), new java.awt.Color(153, 255, 204), new java.awt.Color(153, 255, 204), new java.awt.Color(153, 255, 204)));

        jLabel7.setFont(new java.awt.Font("Tahoma", 3, 26)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("PROGRAMA DE RECURSIÓN  -  II CUATRIMESTRE  2021");

        javax.swing.GroupLayout Panel2Layout = new javax.swing.GroupLayout(Panel2);
        Panel2.setLayout(Panel2Layout);
        Panel2Layout.setHorizontalGroup(
            Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel2Layout.createSequentialGroup()
                .addGap(473, 473, 473)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Panel2Layout.setVerticalGroup(
            Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel2Layout.createSequentialGroup()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
        );

        btnTerminar.setBackground(new java.awt.Color(204, 0, 0));
        btnTerminar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnTerminar.setForeground(new java.awt.Color(255, 255, 255));
        btnTerminar.setText("TERMINAR");
        btnTerminar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnTerminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTerminarActionPerformed(evt);
            }
        });

        Panel3.setBackground(new java.awt.Color(102, 102, 102));
        Panel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 255, 204), new java.awt.Color(153, 255, 204), new java.awt.Color(153, 255, 204), new java.awt.Color(153, 255, 204)));
        Panel3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        btnCrearArreglo.setBackground(new java.awt.Color(0, 0, 51));
        btnCrearArreglo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnCrearArreglo.setForeground(new java.awt.Color(255, 255, 255));
        btnCrearArreglo.setText("CREAR Y MOSTRAR ARREGLO ");
        btnCrearArreglo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCrearArreglo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearArregloActionPerformed(evt);
            }
        });

        PanelArray.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 255, 204), new java.awt.Color(153, 255, 204), new java.awt.Color(153, 255, 204), new java.awt.Color(153, 255, 204)));

        PanelK1.setBackground(new java.awt.Color(255, 153, 153));
        PanelK1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 255, 204), new java.awt.Color(153, 255, 204), new java.awt.Color(153, 255, 204), new java.awt.Color(153, 255, 204)));
        PanelK1.setForeground(new java.awt.Color(255, 153, 204));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("NÚMERO MAYOR  : ");

        jLabel13.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("POSICION :");

        Datomayor.setBackground(new java.awt.Color(0, 0, 0));
        Datomayor.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        Datomayor.setForeground(new java.awt.Color(0, 0, 0));

        PosMayor.setBackground(new java.awt.Color(0, 0, 0));
        PosMayor.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        PosMayor.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout PanelK1Layout = new javax.swing.GroupLayout(PanelK1);
        PanelK1.setLayout(PanelK1Layout);
        PanelK1Layout.setHorizontalGroup(
            PanelK1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelK1Layout.createSequentialGroup()
                .addContainerGap(43, Short.MAX_VALUE)
                .addGroup(PanelK1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelK1Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(PosMayor, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelK1Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(59, 59, 59)
                        .addComponent(Datomayor, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(52, 52, 52))
        );
        PanelK1Layout.setVerticalGroup(
            PanelK1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelK1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelK1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(Datomayor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PanelK1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PosMayor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(14, 14, 14))
        );

        PanelK4.setBackground(new java.awt.Color(255, 153, 153));
        PanelK4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 255, 204), new java.awt.Color(153, 255, 204), new java.awt.Color(153, 255, 204), new java.awt.Color(153, 255, 204)));
        PanelK4.setForeground(new java.awt.Color(255, 153, 204));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("CANTIDAD DE NÚMEROS IMPARES  : ");

        ImParArray.setBackground(new java.awt.Color(0, 0, 0));
        ImParArray.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        ImParArray.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout PanelK4Layout = new javax.swing.GroupLayout(PanelK4);
        PanelK4.setLayout(PanelK4Layout);
        PanelK4Layout.setHorizontalGroup(
            PanelK4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelK4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ImParArray, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelK4Layout.setVerticalGroup(
            PanelK4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelK4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelK4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ImParArray, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        PanelK3.setBackground(new java.awt.Color(255, 153, 153));
        PanelK3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 255, 204), new java.awt.Color(153, 255, 204), new java.awt.Color(153, 255, 204), new java.awt.Color(153, 255, 204)));
        PanelK3.setForeground(new java.awt.Color(255, 153, 204));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("CANTIDAD DE NÚMEROS PARES : ");

        ParArray.setBackground(new java.awt.Color(0, 0, 0));
        ParArray.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        ParArray.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout PanelK3Layout = new javax.swing.GroupLayout(PanelK3);
        PanelK3.setLayout(PanelK3Layout);
        PanelK3Layout.setHorizontalGroup(
            PanelK3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelK3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ParArray, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelK3Layout.setVerticalGroup(
            PanelK3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelK3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PanelK3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ParArray, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );

        PanelK2.setBackground(new java.awt.Color(255, 153, 153));
        PanelK2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 255, 204), new java.awt.Color(153, 255, 204), new java.awt.Color(153, 255, 204), new java.awt.Color(153, 255, 204)));
        PanelK2.setForeground(new java.awt.Color(255, 153, 204));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("NÚMERO MENOR  : ");

        jLabel14.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("POSICION :");

        Datomenor.setBackground(new java.awt.Color(0, 0, 0));
        Datomenor.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        Datomenor.setForeground(new java.awt.Color(0, 0, 0));

        PosMenor.setBackground(new java.awt.Color(0, 0, 0));
        PosMenor.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        PosMenor.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout PanelK2Layout = new javax.swing.GroupLayout(PanelK2);
        PanelK2.setLayout(PanelK2Layout);
        PanelK2Layout.setHorizontalGroup(
            PanelK2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelK2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PanelK2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelK2Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(PosMenor, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelK2Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(55, 55, 55)
                        .addComponent(Datomenor, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(49, 49, 49))
        );
        PanelK2Layout.setVerticalGroup(
            PanelK2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelK2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelK2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Datomenor, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelK2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(PosMenor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        TablaArrayAleatory.setBackground(new java.awt.Color(255, 153, 153));
        TablaArrayAleatory.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        TablaArrayAleatory.setForeground(new java.awt.Color(0, 0, 0));
        TablaArrayAleatory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "POSICIÓN", "NÚMERO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TablaArrayAleatory.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(TablaArrayAleatory);
        if (TablaArrayAleatory.getColumnModel().getColumnCount() > 0) {
            TablaArrayAleatory.getColumnModel().getColumn(0).setResizable(false);
            TablaArrayAleatory.getColumnModel().getColumn(0).setHeaderValue("POSICIÓN");
            TablaArrayAleatory.getColumnModel().getColumn(1).setResizable(false);
            TablaArrayAleatory.getColumnModel().getColumn(1).setHeaderValue("NÚMERO");
        }

        javax.swing.GroupLayout PanelTablaDatosLayout = new javax.swing.GroupLayout(PanelTablaDatos);
        PanelTablaDatos.setLayout(PanelTablaDatosLayout);
        PanelTablaDatosLayout.setHorizontalGroup(
            PanelTablaDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 267, Short.MAX_VALUE)
        );
        PanelTablaDatosLayout.setVerticalGroup(
            PanelTablaDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTablaDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 492, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout PanelArrayLayout = new javax.swing.GroupLayout(PanelArray);
        PanelArray.setLayout(PanelArrayLayout);
        PanelArrayLayout.setHorizontalGroup(
            PanelArrayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelArrayLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(PanelTablaDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addGroup(PanelArrayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(PanelK1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PanelK3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PanelK4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PanelK2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        PanelArrayLayout.setVerticalGroup(
            PanelArrayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelArrayLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(PanelArrayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PanelTablaDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PanelArrayLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(PanelK1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addComponent(PanelK2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55)
                        .addComponent(PanelK3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56)
                        .addComponent(PanelK4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        btnResultados.setBackground(new java.awt.Color(0, 0, 51));
        btnResultados.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnResultados.setForeground(new java.awt.Color(255, 255, 255));
        btnResultados.setText("DESPLEGAR RESULTADOS");
        btnResultados.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnResultados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResultadosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Panel3Layout = new javax.swing.GroupLayout(Panel3);
        Panel3.setLayout(Panel3Layout);
        Panel3Layout.setHorizontalGroup(
            Panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel3Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(btnCrearArreglo, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnResultados, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(107, 107, 107))
            .addGroup(Panel3Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(PanelArray, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );
        Panel3Layout.setVerticalGroup(
            Panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel3Layout.createSequentialGroup()
                .addGap(0, 18, Short.MAX_VALUE)
                .addGroup(Panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnResultados, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCrearArreglo, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PanelArray, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Logo_UNED.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnTerminar, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Panel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(Panel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(Panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Panel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(btnTerminar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(14, 14, 14))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void btnCrearArregloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearArregloActionPerformed
        PanelTablaDatos.setVisible(true);
        btnResultados.setEnabled(true);
        DefaultTableModel tab_model = (DefaultTableModel) TablaArrayAleatory.getModel();
        array_num.setArreglo_Aleatorio(Funciones_Arreglo.LlenarArregloAleatorio(0, 100)); //LLenar Array
        Funciones_Arreglo.MostrarArreglo(array_num.getArreglo_Aleatorio(), tab_model); //Mostrar Array

        JLabel[] CamposTexto = {Datomayor, PosMayor, Datomenor, PosMenor, ParArray, ImParArray};
        Funciones_Validar.LimpiarJLabels(CamposTexto);
    }//GEN-LAST:event_btnCrearArregloActionPerformed

    private void btnTerminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTerminarActionPerformed
        JOptionPane.showMessageDialog(null, "Programa finalizado con éxito!");
        System.exit(0);//Se termina de ejecutar el programa y se cierra
    }//GEN-LAST:event_btnTerminarActionPerformed


    private void btnIngresarNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarNumeroActionPerformed
        JTextField[] CamposTexto = {txtNumero};
        try {
            if (Funciones_Validar.CamposVacios(CamposTexto) == true) {
                JOptionPane.showMessageDialog(null, "Error,no debe dejar espacios vacíos, debe ingresar un número entero", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                Datos_Numero num = new Datos_Numero(Integer.parseInt(txtNumero.getText()));
                JOptionPane.showMessageDialog(null, "Número ingresado con éxito!");

                //SUMAR DIGITOS
                int Suma = Funciones_Numero.SumaDigitos(num.getNumero());
                SumaDigitos.setText(String.valueOf(Suma));

                //INVERTIR DIGITOS
                String Invertir = "";
                if (num.getNumero() < 0) {
                    Invertir = Funciones_Numero.InvertirDigitos(String.valueOf(num.getNumero() * -1));
                    InvertirNum.setText("-" + Invertir);
                } else {
                    Invertir = Funciones_Numero.InvertirDigitos(String.valueOf(num.getNumero()));
                    InvertirNum.setText(Invertir);
                }
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Error,debe ingresar un número de tipo entero", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnIngresarNumeroActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        JTextField[] CamposTexto = {txtNumero}; //Vector de JTexfield
        Funciones_Validar.LimpiarJTextFields(CamposTexto); //Limpiamos los campos de texto del JTexfield

        JLabel[] CamposLabel = {SumaDigitos, InvertirNum};//Vector de JLabel
        Funciones_Validar.LimpiarJLabels(CamposLabel); //Limpiamos los campos de texto del JLabel
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnResultadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResultadosActionPerformed
        //NUMERO MAYOR Y POSICIÓN 
        String NumMayor = "" + Funciones_Arreglo.NumeroMayorArreglo(array_num.getArreglo_Aleatorio(), 0, 0);
        Datomayor.setText(NumMayor);
        int IndiceMayor = Funciones_Arreglo.BuscarIndiceNum(array_num.getArreglo_Aleatorio(), Integer.parseInt(NumMayor), 0);
        PosMayor.setText(String.valueOf(IndiceMayor));

        //NUMERO MENOR Y POSICIÓN
        int NumMenor = Funciones_Arreglo.NumeroMenorArreglo(array_num.getArreglo_Aleatorio(), 1000, 0);
        Datomenor.setText(String.valueOf(NumMenor));
        int indicmen = Funciones_Arreglo.BuscarIndiceNum(array_num.getArreglo_Aleatorio(), NumMenor, 0);
        PosMenor.setText(String.valueOf(indicmen));

        //CONTAR PARES
        int Par = Funciones_Arreglo.ContarNumerosParesArreglo(array_num.getArreglo_Aleatorio(), 0);
        ParArray.setText(String.valueOf(Par));

        //CONTAR IMPARES
        int ImPar = Funciones_Arreglo.ContarNumerosImParesArreglo(array_num.getArreglo_Aleatorio(), 0);
        ImParArray.setText(String.valueOf(ImPar));
    }//GEN-LAST:event_btnResultadosActionPerformed

    private void txtNumeroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumeroKeyTyped
        if (txtNumero.getText().length() > 9) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(null, "Error,debe ingresar un máximo de 10 digitos numéricos de tipo entero", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_txtNumeroKeyTyped

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Datomayor;
    private javax.swing.JLabel Datomenor;
    private javax.swing.JLabel ImParArray;
    private javax.swing.JLabel InvertirNum;
    private javax.swing.JPanel Panel1;
    private javax.swing.JPanel Panel2;
    private javax.swing.JPanel Panel3;
    private javax.swing.JPanel PanelArray;
    private javax.swing.JPanel PanelK1;
    private javax.swing.JPanel PanelK2;
    private javax.swing.JPanel PanelK3;
    private javax.swing.JPanel PanelK4;
    private javax.swing.JPanel PanelTablaDatos;
    private javax.swing.JLabel ParArray;
    private javax.swing.JLabel PosMayor;
    private javax.swing.JLabel PosMenor;
    private javax.swing.JLabel SumaDigitos;
    private javax.swing.JTable TablaArrayAleatory;
    private javax.swing.JButton btnCrearArreglo;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnIngresarNumero;
    private javax.swing.JButton btnResultados;
    private javax.swing.JButton btnTerminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField txtNumero;
    // End of variables declaration//GEN-END:variables

    //Clase para agregar una imagen al fondo del panel 
    public class FondoPanel extends JPanel {

        private Image imagen;

        @Override
        public void paint(Graphics g) {
            imagen = new ImageIcon(getClass().getResource("/Imagenes/MyFondo_Color.gif")).getImage();
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            setOpaque(false);
            super.paint(g);
        }
    }
}
