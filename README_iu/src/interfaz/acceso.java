/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;
import interfazadmin.Conector;
import static interfazadmin.Conector.con;
import static interfazadmin.Conector.sentencia;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.ResultSet;
import java.sql.Statement;
/**
 *
 * @author emilio
 */
public class acceso extends javax.swing.JFrame {

    /**
     * Creates new form acceso
     */
    String password;
    Conector con;
    public static int puesto=0;
    public static int nE=0;
    public acceso() {
        initComponents();
        this.setLocationRelativeTo(null);
        
    }
    public Image getIconImage(){
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenes/auto.jpg"));
        return retValue;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        salir = new javax.swing.JButton();
        ingresar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        juser = new javax.swing.JTextField();
        jpass = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setMaximumSize(new java.awt.Dimension(345, 200));
        setMinimumSize(new java.awt.Dimension(345, 200));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        salir.setBackground(new java.awt.Color(0, 0, 102));
        salir.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        salir.setForeground(new java.awt.Color(255, 255, 255));
        salir.setText("Salir");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        getContentPane().add(salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 420, 100, 30));

        ingresar.setBackground(new java.awt.Color(0, 0, 102));
        ingresar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        ingresar.setForeground(new java.awt.Color(255, 255, 255));
        ingresar.setText("Ingresar");
        ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresarActionPerformed(evt);
            }
        });
        getContentPane().add(ingresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 420, 100, 30));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Usuario:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, -1, -1));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Contraseña:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, -1, -1));

        juser.setBackground(new java.awt.Color(0, 0, 51));
        juser.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        juser.setForeground(new java.awt.Color(255, 255, 255));
        juser.setCaretColor(new java.awt.Color(255, 255, 255));
        getContentPane().add(juser, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 290, 170, 28));

        jpass.setBackground(new java.awt.Color(0, 0, 51));
        jpass.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jpass.setForeground(new java.awt.Color(255, 255, 255));
        jpass.setCaretColor(new java.awt.Color(255, 255, 255));
        getContentPane().add(jpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 340, 170, 27));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cwm.jpg"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Sistema de administración"); // NOI18N
        jLabel5.setToolTipText("");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, 30));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("de usuarios.");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 240, -1, -1));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/blue2.jpg"))); // NOI18N
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 345, 500));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_salirActionPerformed

    private void ingresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresarActionPerformed
        if(con==null){
            con = new Conector();
        }
        con.conectar();
        this.password = new String(jpass.getPassword());
        int login=con.login(this.juser.getText(), this.password);
        switch (login){
            case 0:
            case 1:
                adminSolicitudes solicitudesInterfaz = new adminSolicitudes();
                solicitudesInterfaz.setVisible(true);
                this.setVisible(false);
                break;
            case 2:
                adminTrabajadores trabajadoresInterfaz = new adminTrabajadores(this.puesto, this.nE);
                trabajadoresInterfaz.setVisible(true);
                this.setVisible(false);
                break;
            default:
        } 
    }//GEN-LAST:event_ingresarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JButton ingresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPasswordField jpass;
    private javax.swing.JTextField juser;
    private javax.swing.JButton salir;
    // End of variables declaration//GEN-END:variables

}
