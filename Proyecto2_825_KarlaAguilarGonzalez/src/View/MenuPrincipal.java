package View;

import Model.Cola;
import Model.Funciones;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Karla Bricelda Aguilar González
 */
public class MenuPrincipal extends javax.swing.JFrame {

//-------------------------------------OBJETO---------------------------------------//
    Cola cola = new Cola();
//----------------------------------------------------------------------------------//

    public MenuPrincipal() {
        initComponents();
        this.setLocationRelativeTo(null);//Para centrar la ventana al ejecutar el programa
        this.setTitle("Proyecto 2 - 825  |  Karla Aguilar González "); //Para agregar un titulo a la ventana
        Image icono = new ImageIcon(getClass().getResource("/Images/MyIcon.png")).getImage(); //Para agregar el icono a la ventana
        setIconImage(icono); //Para mostrar el icono 
        MyPanel.setVisible(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel2 = new keeptoo.KGradientPanel();
        btnTerminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        MyPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        btnVaciar = new javax.swing.JButton();
        btnObtener = new javax.swing.JButton();
        btnExtraer = new javax.swing.JButton();
        btnTam = new javax.swing.JButton();
        btnInsertar = new javax.swing.JButton();
        btnColaVacia = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Lista = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        kGradientPanel2.setEndColor(new java.awt.Color(102, 0, 102));
        kGradientPanel2.setGradientFocus(600);
        kGradientPanel2.setStartColor(new java.awt.Color(51, 255, 255));
        kGradientPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnTerminar.setBackground(new java.awt.Color(102, 0, 0));
        btnTerminar.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnTerminar.setForeground(new java.awt.Color(204, 255, 255));
        btnTerminar.setText("TERMINAR");
        btnTerminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnTerminarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnTerminarMouseExited(evt);
            }
        });
        btnTerminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTerminarActionPerformed(evt);
            }
        });
        kGradientPanel2.add(btnTerminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 690, 150, 40));

        kGradientPanel1.setEndColor(new java.awt.Color(102, 0, 102));
        kGradientPanel1.setGradientFocus(500);
        kGradientPanel1.setStartColor(new java.awt.Color(51, 255, 255));
        kGradientPanel1.setLayout(new java.awt.FlowLayout());
        kGradientPanel1.add(MyPanel);

        jScrollPane1.setViewportView(kGradientPanel1);

        kGradientPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 470, 880, 180));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 51));
        jLabel1.setText("*Una vez agregados los elementos en la cola, puede hacer uso del scroll hacia el final para ver toda la lista");
        kGradientPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 440, 830, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Logo_UNED.png"))); // NOI18N
        kGradientPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 660, 80, 80));

        jSeparator1.setBackground(new java.awt.Color(153, 153, 255));
        jSeparator1.setForeground(new java.awt.Color(255, 0, 204));
        jSeparator1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        kGradientPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 890, 280));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 51));
        jLabel3.setText("Proyecto #2 - Listas enlazadas y Colas (FIFO)");
        kGradientPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, 730, -1));

        btnVaciar.setBackground(new java.awt.Color(102, 153, 255));
        btnVaciar.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnVaciar.setForeground(new java.awt.Color(0, 0, 51));
        btnVaciar.setText("VACIAR COLA");
        btnVaciar.setBorder(null);
        btnVaciar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnVaciarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnVaciarMouseExited(evt);
            }
        });
        btnVaciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVaciarActionPerformed(evt);
            }
        });
        kGradientPanel2.add(btnVaciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 330, 360, 40));

        btnObtener.setBackground(new java.awt.Color(102, 153, 255));
        btnObtener.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnObtener.setForeground(new java.awt.Color(0, 0, 51));
        btnObtener.setText("OBTENER UN ELEMENTO DE LA COLA");
        btnObtener.setBorder(null);
        btnObtener.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnObtenerMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnObtenerMouseExited(evt);
            }
        });
        btnObtener.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnObtenerActionPerformed(evt);
            }
        });
        kGradientPanel2.add(btnObtener, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 330, 360, 40));

        btnExtraer.setBackground(new java.awt.Color(102, 153, 255));
        btnExtraer.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnExtraer.setForeground(new java.awt.Color(0, 0, 51));
        btnExtraer.setText("EXTRAER UN ELEMENTO DE LA COLA");
        btnExtraer.setBorder(null);
        btnExtraer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnExtraerMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnExtraerMouseExited(evt);
            }
        });
        btnExtraer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExtraerActionPerformed(evt);
            }
        });
        kGradientPanel2.add(btnExtraer, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 260, 360, 40));

        btnTam.setBackground(new java.awt.Color(102, 153, 255));
        btnTam.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnTam.setForeground(new java.awt.Color(0, 0, 51));
        btnTam.setText("TAMAÑO ACTUAL DE LA COLA");
        btnTam.setBorder(null);
        btnTam.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnTamMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnTamMouseExited(evt);
            }
        });
        btnTam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTamActionPerformed(evt);
            }
        });
        kGradientPanel2.add(btnTam, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 260, 360, 40));

        btnInsertar.setBackground(new java.awt.Color(102, 153, 255));
        btnInsertar.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnInsertar.setForeground(new java.awt.Color(0, 0, 51));
        btnInsertar.setText("INSERTAR ELEMENTO EN LA COLA");
        btnInsertar.setBorder(null);
        btnInsertar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnInsertarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnInsertarMouseExited(evt);
            }
        });
        btnInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertarActionPerformed(evt);
            }
        });
        kGradientPanel2.add(btnInsertar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, 360, 40));

        btnColaVacia.setBackground(new java.awt.Color(102, 153, 255));
        btnColaVacia.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnColaVacia.setForeground(new java.awt.Color(0, 0, 51));
        btnColaVacia.setText("¿LA COLA ESTÁ VACÍA?");
        btnColaVacia.setBorder(null);
        btnColaVacia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnColaVaciaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnColaVaciaMouseExited(evt);
            }
        });
        btnColaVacia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnColaVaciaActionPerformed(evt);
            }
        });
        kGradientPanel2.add(btnColaVacia, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 190, 360, 40));

        jSeparator2.setBackground(new java.awt.Color(153, 153, 255));
        jSeparator2.setForeground(new java.awt.Color(255, 0, 204));
        jSeparator2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        kGradientPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 430, 900, 230));

        jSeparator3.setBackground(new java.awt.Color(153, 153, 255));
        jSeparator3.setForeground(new java.awt.Color(255, 0, 204));
        jSeparator3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        kGradientPanel2.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, 890, 10));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 51));
        jLabel4.setText("MENÚ : ");
        kGradientPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, -1, -1));

        Lista.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(Lista);

        kGradientPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 120, 110, 530));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(kGradientPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1159, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 757, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTerminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTerminarActionPerformed
        JOptionPane.showMessageDialog(null, "Programa finalizado con éxito!");
        System.exit(0);//Se termina de ejecutar el programa y se cierra  
    }//GEN-LAST:event_btnTerminarActionPerformed

    private void btnTerminarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTerminarMouseEntered
        Funciones.ButtonInput(btnTerminar, 255, 51, 51, 0, 0, 0);
    }//GEN-LAST:event_btnTerminarMouseEntered

    private void btnTerminarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTerminarMouseExited
        Funciones.ButtonOutput(btnTerminar, 102, 0, 0, 204, 255, 255);
    }//GEN-LAST:event_btnTerminarMouseExited

    private void btnColaVaciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnColaVaciaActionPerformed
        if (cola.isEmpty()) {
            JOptionPane.showMessageDialog(null, "    Sí", "¿La cola está vacía?", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "    No", "¿La cola está vacía?", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnColaVaciaActionPerformed

    private void btnColaVaciaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnColaVaciaMouseExited
        Funciones.ButtonOutput(btnColaVacia, 102, 153, 255, 0, 0, 51);
    }//GEN-LAST:event_btnColaVaciaMouseExited

    private void btnColaVaciaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnColaVaciaMouseEntered
        Funciones.ButtonInput(btnColaVacia, 0, 204, 204, 0, 0, 0);
    }//GEN-LAST:event_btnColaVaciaMouseEntered

    private void btnTamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTamActionPerformed
        JOptionPane.showMessageDialog(null, "El tamaño actual de la cola es  " + cola.getSize(), "Mostrar tamaño", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnTamActionPerformed

    private void btnTamMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTamMouseExited
        Funciones.ButtonOutput(btnTam, 102, 153, 255, 0, 0, 51);
    }//GEN-LAST:event_btnTamMouseExited

    private void btnTamMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTamMouseEntered
        Funciones.ButtonInput(btnTam, 0, 204, 204, 0, 0, 0);
    }//GEN-LAST:event_btnTamMouseEntered

    private void btnVaciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVaciarActionPerformed
        if (cola.isEmpty()) {
            JOptionPane.showMessageDialog(null, "La cola se encuentra vacía", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            cola.EmptyQueue();
            cola.ShowQueue(MyPanel);
            this.repaint(); 
            this.setVisible(true);
            JOptionPane.showMessageDialog(null, "La cola ha sido vaciada con éxito!");
        }
    }//GEN-LAST:event_btnVaciarActionPerformed

    private void btnVaciarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVaciarMouseExited
        Funciones.ButtonOutput(btnVaciar, 102, 153, 255, 0, 0, 51);
    }//GEN-LAST:event_btnVaciarMouseExited

    private void btnVaciarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVaciarMouseEntered
        Funciones.ButtonInput(btnVaciar, 0, 204, 204, 0, 0, 0);
    }//GEN-LAST:event_btnVaciarMouseEntered

    private void btnObtenerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnObtenerActionPerformed
        try {
            if (cola.isEmpty()) {
                JOptionPane.showMessageDialog(null, "No hay elementos en la cola para mostrar", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                int posicion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la posición del elemento que desea buscar: \n\n*Aviso: la posición de inicio es 0"));
                cola.getPositionValue(posicion);
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Debe ingresar un dato de tipo entero!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnObtenerActionPerformed

    private void btnObtenerMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnObtenerMouseExited
        Funciones.ButtonOutput(btnObtener, 102, 153, 255, 0, 0, 51);
    }//GEN-LAST:event_btnObtenerMouseExited

    private void btnObtenerMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnObtenerMouseEntered
        Funciones.ButtonInput(btnObtener, 0, 204, 204, 0, 0, 0);
    }//GEN-LAST:event_btnObtenerMouseEntered

    private void btnExtraerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExtraerActionPerformed
        if (cola.isEmpty()) {
            JOptionPane.showMessageDialog(null, "La cola esta vacía, no se pueden extraer elementos ", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Se va a extraer el elemento " + cola.Remove());
            cola.ShowQueue(MyPanel);  
            this.repaint(); 
            this.setVisible(true);
        }
    }//GEN-LAST:event_btnExtraerActionPerformed

    private void btnExtraerMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExtraerMouseExited
        Funciones.ButtonOutput(btnExtraer, 102, 153, 255, 0, 0, 51);
    }//GEN-LAST:event_btnExtraerMouseExited

    private void btnExtraerMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExtraerMouseEntered
        Funciones.ButtonInput(btnExtraer, 0, 204, 204, 0, 0, 0);
    }//GEN-LAST:event_btnExtraerMouseEntered

    private void btnInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertarActionPerformed
        try {
            int dato = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un elemento: "));
            cola.Push(dato);
            JOptionPane.showMessageDialog(null, "Elemento agregado con éxito!");
            cola.ShowQueue(MyPanel);         
            this.repaint(); 
            this.setVisible(true); 
            cola.Mostrar(Lista);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Debe ingresar un elemento de tipo entero!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnInsertarActionPerformed

    private void btnInsertarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInsertarMouseExited
        Funciones.ButtonOutput(btnInsertar, 102, 153, 255, 0, 0, 51);
    }//GEN-LAST:event_btnInsertarMouseExited

    private void btnInsertarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInsertarMouseEntered
        Funciones.ButtonInput(btnInsertar, 0, 204, 204, 0, 0, 0);
    }//GEN-LAST:event_btnInsertarMouseEntered


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> Lista;
    private javax.swing.JPanel MyPanel;
    public static javax.swing.JButton btnColaVacia;
    public static javax.swing.JButton btnExtraer;
    public static javax.swing.JButton btnInsertar;
    public static javax.swing.JButton btnObtener;
    public static javax.swing.JButton btnTam;
    private javax.swing.JButton btnTerminar;
    public static javax.swing.JButton btnVaciar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private keeptoo.KGradientPanel kGradientPanel1;
    private keeptoo.KGradientPanel kGradientPanel2;
    // End of variables declaration//GEN-END:variables
}
