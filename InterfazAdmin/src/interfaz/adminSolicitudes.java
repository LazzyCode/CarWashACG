/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import interfazadmin.Conector;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.IOException;
/**
 *
 * @author emilio
 */
public class adminSolicitudes extends javax.swing.JFrame {

    /**
     * Creates new form admin
     */
    String num;
    Connection conexion;
    DefaultTableModel m;
    Conector con;
    public adminSolicitudes() {
        initComponents();
        this.con = new Conector();
        this.setLocationRelativeTo(null);
        tabla.getTableHeader().setReorderingAllowed(false) ;
        this.setExtendedState(MAXIMIZED_BOTH);
        mostrarTabla();
    }
    public Image getIconImage(){
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenes/auto.jpg"));
        return retValue;
    }
    public void mostrarTabla(){
        
        DefaultTableModel m = new DefaultTableModel();
        m.addColumn("Numero solicitud");
        m.addColumn("idUsuario");
        m.addColumn("Nombre");
        m.addColumn("Apellido");
        m.addColumn("Colonia");
        m.addColumn("Calle y numero");
        m.addColumn("Telefono");
        m.addColumn("Cantidad servicio");
        m.addColumn("Costo");
        m.addColumn("Fecha requerida");
        m.addColumn("Orden status");
        m.addColumn("Fecha realizada");
        tabla.setModel(m);
        
        String sql = "SELECT * FROM solicitudes WHERE ordenStatus='Espera' ORDER BY fechaRequerida ASC";
        
        String datos[]=new String[12];
        try{
            Conector.sentencia=Conector.con.createStatement();
            ResultSet r=Conector.sentencia.executeQuery(sql);
            while(r.next()){
                datos[0]=r.getString("numeroSolicitud");
                datos[1]=r.getString("idUsuario");
                datos[2]=r.getString("Nombre");
                datos[3]=r.getString("Apellido");
                datos[4]=r.getString("colonia");
                datos[5]=r.getString("calleYnumero");
                datos[6]=r.getString("tel");
                datos[7]=r.getString("cantidadServicio");
                datos[8]=r.getString("costo");
                datos[9]=r.getString("fechaRequerida");
                datos[10]=r.getString("ordenStatus");
                datos[11]=r.getString("fechaOrden");
                m.addRow(datos);
            }
            tabla.setModel(m);
        }catch(SQLException ex){
            Logger.getLogger(adminSolicitudes.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSalir = new javax.swing.JButton();
        jActualiza = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jEliminar = new javax.swing.JButton();
        Imprimir = new javax.swing.JButton();
        imprimirLista = new javax.swing.JButton();
        Agregar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de administración de solicitudes de clientes.");
        setIconImage(getIconImage());
        setLocationByPlatform(true);
        setMinimumSize(new java.awt.Dimension(750, 350));
        setPreferredSize(new java.awt.Dimension(750, 350));

        jSalir.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jSalir.setText("Salir");
        jSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSalirActionPerformed(evt);
            }
        });

        jActualiza.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jActualiza.setText("Actualizar");
        jActualiza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jActualizaActionPerformed(evt);
            }
        });

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tabla.setAutoscrolls(false);
        tabla.setCellSelectionEnabled(true);
        tabla.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tabla.setMaximumSize(new java.awt.Dimension(750, 350));
        tabla.setMinimumSize(new java.awt.Dimension(750, 350));
        jScrollPane1.setViewportView(tabla);
        if (tabla.getColumnModel().getColumnCount() > 0) {
            tabla.getColumnModel().getColumn(0).setResizable(false);
            tabla.getColumnModel().getColumn(0).setPreferredWidth(5);
            tabla.getColumnModel().getColumn(1).setResizable(false);
            tabla.getColumnModel().getColumn(2).setResizable(false);
            tabla.getColumnModel().getColumn(3).setResizable(false);
            tabla.getColumnModel().getColumn(4).setResizable(false);
            tabla.getColumnModel().getColumn(5).setResizable(false);
        }

        jEliminar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jEliminar.setText("Actualizar Status");
        jEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jEliminarActionPerformed(evt);
            }
        });

        Imprimir.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Imprimir.setText("Imprimir recibo");
        Imprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ImprimirActionPerformed(evt);
            }
        });

        imprimirLista.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        imprimirLista.setText("Imprimir lista");
        imprimirLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imprimirListaActionPerformed(evt);
            }
        });

        Agregar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Agregar.setText("Agregar solicitud");
        Agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jActualiza)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
            .addGroup(layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addComponent(Agregar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Imprimir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(imprimirLista)
                .addContainerGap(125, Short.MAX_VALUE))
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 273, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Agregar)
                    .addComponent(jEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Imprimir)
                    .addComponent(imprimirLista))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSalir)
                    .addComponent(jActualiza))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jSalirActionPerformed

    private void jActualizaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jActualizaActionPerformed
       mostrarTabla();
    }//GEN-LAST:event_jActualizaActionPerformed

    private void jEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jEliminarActionPerformed
        //Falta validar cuando no se selecciona nada
            int fila=tabla.getSelectedRow();
            String numSol=tabla.getValueAt(fila, 0).toString();
            int opcion=JOptionPane.showOptionDialog(
                                     null,
                                    "Que desea hacer con este solicitud?", 
                                    "Selector de opciones",
                                    JOptionPane.YES_NO_CANCEL_OPTION,
                                    JOptionPane.QUESTION_MESSAGE,
                                    null,
                                    new Object[] { "Completada", "Cancelada", "Nada"},
                                    "Administrador de empleados");

            if(opcion==0 || opcion==1){
                if(opcion==0){
                    opcion=JOptionPane.showOptionDialog(null, 
                        "Seguro que desea realiazar esta operacion?", 
                        "Seguro?", 
                        JOptionPane.YES_NO_OPTION, 
                        JOptionPane.QUESTION_MESSAGE, 
                        null, null, null);
                    if(opcion==0){
                        con.actualizar("Completada", "solicitudes", numSol);    
                    }
                }else{
                    opcion=JOptionPane.showOptionDialog(null, 
                        "Seguro que desea realiazar esta operacion?", 
                        "Seguro?", 
                        JOptionPane.YES_NO_OPTION, 
                        JOptionPane.QUESTION_MESSAGE, 
                        null, null, null);
                    if(opcion==0){
                        con.actualizar("Cancelada", "solicitudes", numSol);
                    }
                }
            }
            mostrarTabla();
        
    }//GEN-LAST:event_jEliminarActionPerformed

    private void ImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ImprimirActionPerformed
      Document document = new Document();
      int fila=tabla.getSelectedRow();
      String numID=tabla.getValueAt(fila, 0).toString();
      int id=Integer.parseInt(numID);
    try {
               String titulo="Recibo"+String.valueOf(id)+".pdf";
      PdfWriter.getInstance(document, new FileOutputStream(titulo));
      document.open();
      String sql = "SELECT *"
                   + " FROM solicitudes WHERE numeroSolicitud="+id;
      PdfPTable table = new PdfPTable(3);  
      
       pdf.addImagen(document);
       table.addCell(" ");        
       PdfPCell celdaTitulo = new PdfPCell(new Paragraph("Recibo CW-ACG"));
       table.addCell(celdaTitulo);
       table.addCell(" ");
        
        try{
            Conector.sentencia=Conector.con.createStatement();
            ResultSet r=Conector.sentencia.executeQuery(sql);
            while(r.next()){
                PdfPCell vacio = new PdfPCell(new Paragraph(" "));
                
                PdfPCell solicitud = new PdfPCell(new Paragraph("Id pedido: "+r.getString("numeroSolicitud")));
                table.addCell(solicitud);
                
                vacio.setColspan(2);
                table.addCell(vacio);
                vacio.setColspan(3);
                
                PdfPCell celdaId = new PdfPCell(new Paragraph("NumUsuario: "+r.getString("idUsuario")));
                table.addCell(celdaId);
                
                
                PdfPCell celdaNombre = new PdfPCell(new Paragraph("Cliente: "+r.getString("nombre")+" "+r.getString("apellido")));
                celdaNombre.setColspan(2);
                table.addCell(celdaNombre);
                         
                table.addCell(vacio);
                
                table.addCell("NumUsuario:");
                PdfPCell colonia = new PdfPCell(new Paragraph(r.getString("colonia")));
                colonia.setColspan(2);
                table.addCell(colonia);
                
                table.addCell("Calle y numero:");
                PdfPCell calleYnum = new PdfPCell(new Paragraph(r.getString("calleYnumero")));
                calleYnum.setColspan(2);
                table.addCell(calleYnum);

                table.addCell("Telefono:");
                PdfPCell tel = new PdfPCell(new Paragraph(r.getString("tel")));
                tel.setColspan(2);
                table.addCell(tel);

                table.addCell(vacio);
                
                table.addCell("Servicios:"+r.getString("CantidadServicio"));
                table.addCell("Costo servicio:80");
                table.addCell("Costo total:"+r.getString("costo"));
                
                table.addCell(vacio);
                
                table.addCell("Recibe:\n\n\n");
                PdfPCell fecha = new PdfPCell(new Paragraph("\nFecha servicio:  "+r.getString("fechaRequerida")+"\n\n"));
                fecha.setColspan(2);
                table.addCell(fecha);

            }
            document.add(table);
            document.close();
        }catch(SQLException ex){
            Logger.getLogger(adminSolicitudes.class.getName()).log(Level.SEVERE, null, ex);
        }
        
      
    } catch (DocumentException de) {
      System.err.println(de.getMessage());
    } catch (IOException ioe) {
      System.err.println(ioe.getMessage());
    }
    JOptionPane.showMessageDialog(null, "Pdf creado exitosamente"); 

    }//GEN-LAST:event_ImprimirActionPerformed

    private void AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarActionPerformed
        nuevaSolicitud NS = new nuevaSolicitud();
        NS.setVisible(true);
        mostrarTabla();
    }//GEN-LAST:event_AgregarActionPerformed

    private void imprimirListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imprimirListaActionPerformed
        Document document = new Document();
    try {
       String titulo="ListaSolicitudes.pdf";
      PdfWriter.getInstance(document, new FileOutputStream(titulo));
      document.open();
      String sql = "SELECT * FROM solicitudes WHERE OrdenStatus='Espera'";
      PdfPTable table = new PdfPTable(4);  
      
       pdf.addImagen(document);
       table.addCell(" ");        
       PdfPCell celdaTitulo = new PdfPCell(new Paragraph(titulo));
       celdaTitulo.setColspan(2);
       table.addCell(celdaTitulo);
       table.addCell(" ");
       PdfPCell vacio = new PdfPCell(new Paragraph(" "));
       vacio.setColspan(4);
        try{
            Conector.sentencia=Conector.con.createStatement();
            ResultSet r=Conector.sentencia.executeQuery(sql);
            while(r.next()){
                table.addCell(vacio);
           
                PdfPCell solicitud = new PdfPCell(new Paragraph("Id solicitud: "+r.getString("numeroSolicitud")));
                table.addCell(solicitud);
                PdfPCell idUser = new PdfPCell(new Paragraph("Id usuario: "+r.getString("idUsuario")));
                table.addCell(idUser);
                PdfPCell name = new PdfPCell(new Paragraph("Nombre: "+r.getString("nombre")+r.getString("apellido")));
                name.setColspan(2);
                table.addCell(name);
                
                
                PdfPCell colonia = new PdfPCell(new Paragraph("Colonia: "+r.getString("colonia")));
                colonia.setColspan(2);
                table.addCell(colonia);
                PdfPCell celdaNombre = new PdfPCell(new Paragraph("Calle y numero: "+r.getString("calleYnumero")));
                celdaNombre.setColspan(2);
                table.addCell(celdaNombre);
                
                PdfPCell tel = new PdfPCell(new Paragraph("Telefono: "+r.getString("tel")));
                tel.setColspan(2);
                table.addCell(tel);               
                PdfPCell cant = new PdfPCell(new Paragraph("Cantidad servicio: "+r.getString("cantidadServicio")));
                table.addCell(cant);
                PdfPCell costo = new PdfPCell(new Paragraph("Costo: "+r.getString("costo")));
                table.addCell(costo);
                
                PdfPCell fReque = new PdfPCell(new Paragraph("Fecha requerida: "+r.getString("fechaRequerida")));
                fReque.setColspan(2);
                table.addCell(fReque);
                table.addCell("Orden status:  ");
                PdfPCell status = new PdfPCell(new Paragraph(r.getString("ordenStatus")));
                table.addCell(status);
               
                               
            }
            document.add(table);
            document.close();
        }catch(SQLException ex){
            Logger.getLogger(adminSolicitudes.class.getName()).log(Level.SEVERE, null, ex);
        }
        
      
    } catch (DocumentException de) {
      System.err.println(de.getMessage());
    } catch (IOException ioe) {
      System.err.println(ioe.getMessage());
    }
    JOptionPane.showMessageDialog(null, "Pdf creado exitosamente"); 

    }//GEN-LAST:event_imprimirListaActionPerformed
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Agregar;
    private javax.swing.JButton Imprimir;
    private javax.swing.JButton imprimirLista;
    private javax.swing.JButton jActualiza;
    private javax.swing.JButton jEliminar;
    private javax.swing.JButton jSalir;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
}
