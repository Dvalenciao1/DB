package javaapplication19;

import clases.Base_De_Datos;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Insets;
import javax.swing.JOptionPane;
import javax.swing.JToggleButton;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

public class ventanaPrincipal extends javax.swing.JFrame {

    //Al momento de iniciar el programa se llenan los jtables con los datos
    public ventanaPrincipal() {
        initComponents();
        this.setLocationRelativeTo(null);
        tableCobro.setModel(db.listarDatosServicio());
        jToggleButton1.setSelected(true);
        panelTabla.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED), "Servicio", TitledBorder.LEFT, TitledBorder.DEFAULT_POSITION, new Font("Dialog", Font.BOLD, 14)));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        menu = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        btnConsultar = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        panelTabla = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableCobro = new javax.swing.JTable();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jToggleButton1 = new javax.swing.JToggleButton();
        jToggleButton2 = new javax.swing.JToggleButton();
        jToggleButton3 = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(51, 255, 102));
        jPanel1.setAutoscrolls(true);
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
        });

        menu.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
        menu.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        menu.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        menu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuMouseClicked(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 102, 0));

        jButton1.setText("Servicio");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton5.setText("Tipo Cobro");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Cobro");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        btnConsultar.setBackground(new java.awt.Color(255, 51, 51));
        btnConsultar.setText("Listar");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnConsultar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(30, 30, 30))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnConsultar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(412, 412, 412)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(393, 393, 393))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(144, 144, 144))
        );

        menu.addTab("Menu", jPanel2);
        jPanel2.getAccessibleContext().setAccessibleDescription("");

        jPanel6.setBackground(new java.awt.Color(255, 102, 0));
        jPanel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel6MouseClicked(evt);
            }
        });
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelTabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelTablaMouseClicked(evt);
            }
        });

        tableCobro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tableCobro.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(tableCobro);

        javax.swing.GroupLayout panelTablaLayout = new javax.swing.GroupLayout(panelTabla);
        panelTabla.setLayout(panelTablaLayout);
        panelTablaLayout.setHorizontalGroup(
            panelTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTablaLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 788, Short.MAX_VALUE)
                .addGap(16, 16, 16))
        );
        panelTablaLayout.setVerticalGroup(
            panelTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTablaLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 289, Short.MAX_VALUE)
                .addGap(15, 15, 15))
        );

        jPanel6.add(panelTabla, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, 820, 320));

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        jPanel6.add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 460, 90, -1));

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel6.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 470, 90, -1));

        buttonGroup1.add(jToggleButton1);
        jToggleButton1.setText("Servicio");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        jPanel6.add(jToggleButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, 120, -1));

        buttonGroup1.add(jToggleButton2);
        jToggleButton2.setText("Tipo De Cobro");
        jToggleButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton2ActionPerformed(evt);
            }
        });
        jPanel6.add(jToggleButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 30, 120, -1));

        buttonGroup1.add(jToggleButton3);
        jToggleButton3.setText("Cobro");
        jToggleButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton3ActionPerformed(evt);
            }
        });
        jPanel6.add(jToggleButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 30, 120, -1));

        menu.addTab("Listados", jPanel6);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(menu)
                .addGap(36, 36, 36))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(95, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Al presionar el boton nos envia a la 2da pagina donde se encuentran los jtables y carga los datos
    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        menu.setSelectedIndex(1);
    }//GEN-LAST:event_btnConsultarActionPerformed

    //Al presionar el boton elimina los datos de las filas selecionadas de alguna tabla
    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int nfilaT1 = -1;
        int nfilaT2 = -1;
        int nfilaT3 = -1;

        if (jToggleButton1.isSelected()) {
            nfilaT1 = tableCobro.getSelectedRow();
        } else if (jToggleButton2.isSelected()) {
            nfilaT2 = tableCobro.getSelectedRow();
        } else if (jToggleButton3.isSelected()) {
            nfilaT3 = tableCobro.getSelectedRow();
        }

        if (nfilaT1 >= 0) {
            eliminarTablaCobro(nfilaT1);
            tableCobro.setModel(db.listarDatosServicio());
        }
        if (nfilaT2 >= 0) {
            eliminarTablaCobro(nfilaT2);
            tableCobro.setModel(db.listarDatosTipoCobro());
        }
        if (nfilaT3 >= 0) {
            eliminarTablaCobro(nfilaT3);
            tableCobro.setModel(db.listarDatosCobro());
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    //Metodo para eliminar datos de la tabla cobro de la base de datos
    public void eliminarTablaCobro(int nfila) {
        int id = Integer.valueOf(tableCobro.getValueAt(nfila, 0).toString());
        if (jToggleButton1.isSelected()) {
            db.eliminarServicio("DELETE FROM servicio WHERE  idServicio='" + id + "';", id);
        } else if (jToggleButton2.isSelected()) {
            db.eliminarServicio("DELETE FROM tipocobro WHERE  idTipoCobro='" + id + "';", id);
        } else if (jToggleButton3.isSelected()) {
            db.eliminarServicio("DELETE FROM cobro WHERE  idCobro='" + id + "';", id);
        }
    }

    //Al presionar modifica las tablas con los datos nuevos ingresados
    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        int nfilaT1 = -1;
        int nfilaT2 = -1;
        int nfilaT3 = -1;
        if (jToggleButton1.isSelected()) {
            nfilaT1 = tableCobro.getSelectedRow();
        } else if (jToggleButton2.isSelected()) {
            nfilaT2 = tableCobro.getSelectedRow();
        } else if (jToggleButton3.isSelected()) {
            nfilaT3 = tableCobro.getSelectedRow();
        }

        if (nfilaT1 >= 0) {
            listarTablaServicio(nfilaT1);
        }
        if (nfilaT2 >= 0) {
            listarTablaTipoCobro(nfilaT2);
        }
        if (nfilaT3 >= 0) {
            listarTablaCobro(nfilaT3);
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    //Metodo para listar las tablas de la base de datos en el jtable
    public void listarTablaServicio(int nfila) {
        int id = Integer.parseInt(tableCobro.getValueAt(nfila, 0).toString());
        String desc = tableCobro.getValueAt(nfila, 1).toString();
        float precio = Float.parseFloat(tableCobro.getValueAt(nfila, 2).toString());
        db.ActualizarDatos("UPDATE servicio SET descripcion='" + desc + "',precio='" + precio + "' WHERE idServicio='" + id + "'", 1, tableCobro);
    }

    //Metodo para listar las tablas de la base de datos en el jtable
    public void listarTablaTipoCobro(int nfila) {
        int id = Integer.parseInt(tableCobro.getValueAt(nfila, 0).toString());
        String desc = tableCobro.getValueAt(nfila, 1).toString();
        float precio = Float.parseFloat(tableCobro.getValueAt(nfila, 2).toString());
        db.ActualizarDatos("UPDATE tipocobro SET descripcion='" + desc + "',porDscto='" + precio + "' WHERE idTipoCobro='" + id + "'", 2, tableCobro);
    }

    //Metodo para listar las tablas de la base de datos en el jtable
    public void listarTablaCobro(int nfila) {
        int idCobro = Integer.parseInt(tableCobro.getValueAt(nfila, 0).toString());
        int idServicio = Integer.parseInt(tableCobro.getValueAt(nfila, 1).toString());
        int idTipoCobro = Integer.parseInt(tableCobro.getValueAt(nfila, 2).toString());
        float[] datos = db.ActualizarDatosCobro(idServicio, idTipoCobro);
        db.ActualizarDatos("UPDATE cobro SET idServicio='" + idServicio + "',idTipoCobro='" + idTipoCobro + "', subtotal='" + datos[0] + "',descuento='" + datos[1] + "',total='" + datos[2] + "' WHERE idCobro='" + idCobro + "'", 3, tableCobro);
    }

    //Al dar clic fuera de los jtables de borra la seleccion de las filas
    private void jPanel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MouseClicked
        deseleccion();
    }//GEN-LAST:event_jPanel6MouseClicked

    //Al dar clic fuera de los jtables de borra la seleccion de las filas
    private void panelTablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelTablaMouseClicked
        tableCobro.clearSelection();
    }//GEN-LAST:event_panelTablaMouseClicked

    //Al dar clic fuera de los jtables de borra la seleccion de las filas
    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
        deseleccion();
    }//GEN-LAST:event_jPanel1MouseClicked

    //Al cambiar de ventana manualmente se actualizan los datos y se listan
    private void menuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuMouseClicked
        DefaultTableModel modelCobro = db.listarDatosServicio();
        tableCobro.setModel(modelCobro);
    }//GEN-LAST:event_menuMouseClicked

    //Abre una ventana emergente de servicio
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        vtnServicio vtnSer = new vtnServicio();
        if (!activa) {
            vtnSer.setVisible(true);
            activa = vtnSer.isShowing();
        } else {
            JOptionPane.showMessageDialog(this, "Se encuentra abierta una ventana\n"
                    + "cierre primero para abrir otra ventana");
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    //Abre una ventana emergente de tipocobro
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        vtnTipoCobro vtnTipo = new vtnTipoCobro();
        if (!activa) {
            vtnTipo.setVisible(true);
            activa = vtnTipo.isShowing();
        } else {
            JOptionPane.showMessageDialog(this, "Se encuentra abierta una ventana\n"
                    + "cierre primero para abrir otra ventana");
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    //Abre una ventana emergente de cobro
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        vtnCobro vtnCobrar = new vtnCobro();
        if (!activa) {
            vtnCobrar.setVisible(true);
            activa = vtnCobrar.isShowing();
        } else {
            JOptionPane.showMessageDialog(this, "Se encuentra abierta una ventana\n"
                    + "cierre primero para abrir otra ventana");
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        tableCobro.setModel(db.listarDatosServicio());
        panelTabla.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED), "Servicio", TitledBorder.LEFT, TitledBorder.DEFAULT_POSITION, new Font("Dialog", Font.BOLD, 14)));

    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jToggleButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton2ActionPerformed
        tableCobro.setModel(db.listarDatosTipoCobro());
        panelTabla.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED), "TipoCobro", TitledBorder.LEFT, TitledBorder.DEFAULT_POSITION, new Font("Dialog", Font.BOLD, 14)));
    }//GEN-LAST:event_jToggleButton2ActionPerformed

    private void jToggleButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton3ActionPerformed
        tableCobro.setModel(db.listarDatosCobro());
        panelTabla.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED), "Cobro", TitledBorder.LEFT, TitledBorder.DEFAULT_POSITION, new Font("Dialog", Font.BOLD, 14)));
    }//GEN-LAST:event_jToggleButton3ActionPerformed

    //Metodo que deselecciona la fila de un jtable
    public void deseleccion() {
        tableCobro.clearSelection();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnModificar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JToggleButton jToggleButton3;
    private javax.swing.JTabbedPane menu;
    private javax.swing.JPanel panelTabla;
    private javax.swing.JTable tableCobro;
    // End of variables declaration//GEN-END:variables
    private Base_De_Datos db = new Base_De_Datos();
    private static boolean activa = false;
    DefaultTableModel model = new DefaultTableModel();

    //Metodo para devolver si la ventana esta activa
    public static void setActiva(boolean activa) {
        ventanaPrincipal.activa = activa;
    }
}
