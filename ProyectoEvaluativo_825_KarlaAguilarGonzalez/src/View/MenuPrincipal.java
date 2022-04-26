package View;

import Funciones.Funciones_Botton;
import Model.ArbolBinarioBusqueda;
import Model.FondoPanel_Menu;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author Karla Bricelda Aguilar González
 */
public class MenuPrincipal extends javax.swing.JFrame {

    FondoPanel_Menu fondo = new FondoPanel_Menu();
    ArbolBinarioBusqueda arbol = new ArbolBinarioBusqueda();
    int cantidad = 0;

    public MenuPrincipal() {
        this.setContentPane(fondo);
        initComponents();
        this.setLocationRelativeTo(null);//Para centrar la ventana al ejecutar el programa
        this.setTitle("Proyecto Evaluativo - 825  |  Karla Aguilar González "); //Para agregar un titulo a la ventana
        Image icono = new ImageIcon(getClass().getResource("/Images/MyIcon.png")).getImage(); //Para agregar el icono a la ventana
        setIconImage(icono); //Para mostrar el icono 
        JButton botones[] = {btnPreOrden, btnPosOrden, btnInOrden};
        Funciones_Botton.DesactivarBotones(botones);
        btnInsertar.setEnabled(false);
        btnAltura.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnTerminar = new javax.swing.JButton();
        btnInOrden = new javax.swing.JButton();
        btnCantidad = new javax.swing.JButton();
        btnAltura = new javax.swing.JButton();
        btnInsertar = new javax.swing.JButton();
        btnPosOrden = new javax.swing.JButton();
        btnPreOrden = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        preorden = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        DatosInOrden = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        DatosPosOrden = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 51));
        jLabel3.setText("Proyecto Evaluativo - Árboles Binarios de Búsqueda");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Logo_UNED.png"))); // NOI18N

        btnTerminar.setBackground(new java.awt.Color(102, 0, 0));
        btnTerminar.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnTerminar.setForeground(new java.awt.Color(204, 255, 255));
        btnTerminar.setText("TERMINAR");
        btnTerminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTerminarActionPerformed(evt);
            }
        });

        btnInOrden.setBackground(new java.awt.Color(102, 153, 255));
        btnInOrden.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnInOrden.setForeground(new java.awt.Color(0, 0, 51));
        btnInOrden.setText("IN-ORDEN");
        btnInOrden.setBorder(null);
        btnInOrden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInOrdenActionPerformed(evt);
            }
        });

        btnCantidad.setBackground(new java.awt.Color(102, 153, 255));
        btnCantidad.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnCantidad.setForeground(new java.awt.Color(0, 0, 51));
        btnCantidad.setText("INDIQUE LA CANTIDAD DE NODOS ");
        btnCantidad.setBorder(null);
        btnCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCantidadActionPerformed(evt);
            }
        });

        btnAltura.setBackground(new java.awt.Color(102, 153, 255));
        btnAltura.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnAltura.setForeground(new java.awt.Color(0, 0, 51));
        btnAltura.setText("MOSTRAR ALTURA DEL ÁRBOL");
        btnAltura.setBorder(null);
        btnAltura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlturaActionPerformed(evt);
            }
        });

        btnInsertar.setBackground(new java.awt.Color(102, 153, 255));
        btnInsertar.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnInsertar.setForeground(new java.awt.Color(0, 0, 51));
        btnInsertar.setText("INSERTAR ELEMENTO EN EL ÁRBOL");
        btnInsertar.setBorder(null);
        btnInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertarActionPerformed(evt);
            }
        });

        btnPosOrden.setBackground(new java.awt.Color(102, 153, 255));
        btnPosOrden.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnPosOrden.setForeground(new java.awt.Color(0, 0, 51));
        btnPosOrden.setText("POS-ORDEN");
        btnPosOrden.setBorder(null);
        btnPosOrden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPosOrdenActionPerformed(evt);
            }
        });

        btnPreOrden.setBackground(new java.awt.Color(102, 153, 255));
        btnPreOrden.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnPreOrden.setForeground(new java.awt.Color(0, 0, 51));
        btnPreOrden.setText("PRE-ORDEN");
        btnPreOrden.setBorder(null);
        btnPreOrden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPreOrdenActionPerformed(evt);
            }
        });

        jScrollPane1.setEnabled(false);
        jScrollPane1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        preorden.setEditable(false);
        preorden.setColumns(20);
        preorden.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        preorden.setRows(5);
        jScrollPane1.setViewportView(preorden);

        DatosInOrden.setEditable(false);
        DatosInOrden.setColumns(20);
        DatosInOrden.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        DatosInOrden.setRows(5);
        jScrollPane2.setViewportView(DatosInOrden);

        DatosPosOrden.setEditable(false);
        DatosPosOrden.setColumns(20);
        DatosPosOrden.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        DatosPosOrden.setRows(5);
        jScrollPane3.setViewportView(DatosPosOrden);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnTerminar, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(173, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 819, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(129, 129, 129))
            .addGroup(layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnInsertar, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(92, 92, 92)
                        .addComponent(btnAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(71, 71, 71))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnPosOrden, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnPreOrden, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnInOrden, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE)
                                .addComponent(jScrollPane2))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(80, 80, 80))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jLabel3)
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnInsertar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnPreOrden, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnPosOrden, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnInOrden, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(17, 17, 17))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnTerminar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTerminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTerminarActionPerformed
        JOptionPane.showMessageDialog(null, "Programa finalizado con éxito!");
        System.exit(0);//Se termina de ejecutar el programa y se cierra
    }//GEN-LAST:event_btnTerminarActionPerformed

    private void btnInOrdenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInOrdenActionPerformed
        arbol.Imprimir_InOrden(DatosInOrden);
        btnInOrden.setEnabled(false);
    }//GEN-LAST:event_btnInOrdenActionPerformed

    private void btnCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCantidadActionPerformed
        try {
            cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de nodos del árbol: "));
            JOptionPane.showMessageDialog(null, "Elemento agregado con éxito!");
            btnCantidad.setEnabled(false);
            btnInsertar.setEnabled(true);
            btnAltura.setEnabled(true);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Debe ingresar un elemento de tipo entero!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnCantidadActionPerformed

    private void btnAlturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlturaActionPerformed
        JOptionPane.showMessageDialog(null, "La altura del árbol es: " + arbol.AlturaArbol());
    }//GEN-LAST:event_btnAlturaActionPerformed

    private void btnInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertarActionPerformed
        try {
            int cont = 0;
            
            if (cantidad == cont) {
                JOptionPane.showMessageDialog(null, "Ha excedido el límite", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                for (int i = 0; i < cantidad; i++) {
                    Integer dato = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un elemento: "));
                    arbol.Add(dato);
                    cont++;
                    JOptionPane.showMessageDialog(null, "Elemento agregado con éxito!");
                }
                btnInsertar.setEnabled(false);
                JButton botones[] = {btnPreOrden, btnPosOrden, btnInOrden};
                Funciones_Botton.ActivarBotones(botones);
            }
            
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Debe ingresar un elemento de tipo entero!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnInsertarActionPerformed

    private void btnPosOrdenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPosOrdenActionPerformed
        arbol.Imprimir_PosOrden(DatosPosOrden);
        btnPosOrden.setEnabled(false);
    }//GEN-LAST:event_btnPosOrdenActionPerformed

    private void btnPreOrdenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPreOrdenActionPerformed
        arbol.Imprimir_PreOrden(preorden);
        btnPreOrden.setEnabled(false);
    }//GEN-LAST:event_btnPreOrdenActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea DatosInOrden;
    private javax.swing.JTextArea DatosPosOrden;
    public static javax.swing.JButton btnAltura;
    public static javax.swing.JButton btnCantidad;
    public static javax.swing.JButton btnInOrden;
    public static javax.swing.JButton btnInsertar;
    public static javax.swing.JButton btnPosOrden;
    public static javax.swing.JButton btnPreOrden;
    private javax.swing.JButton btnTerminar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea preorden;
    // End of variables declaration//GEN-END:variables
}
