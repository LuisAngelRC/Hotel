package escritorio;

import baseDatos.MySqlConn;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Graphics;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Set;

public class CheckIn extends javax.swing.JInternalFrame {

    MySqlConn conn = new MySqlConn();

    public CheckIn(MySqlConn conn) {
        this.conn = conn;
        initComponents();
    }

    public CheckIn() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextFieldNombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldCiudad = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldNumPersonas = new javax.swing.JTextField();
        jButtonIngresar = new javax.swing.JButton();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();
        ImageIcon icon = new ImageIcon(getClass().getResource("/imagenes/ayaye_logo.png"));
        Image image = icon.getImage();
        jPanel1 = new javax.swing.JPanel(){
            public void paintComponent(Graphics g){
                g.drawImage(image,0,0,getWidth(),getHeight(),this);
            }
        };
        jComboBoxTipoHab = new javax.swing.JComboBox();
        jButtonLimpiar = new javax.swing.JButton();

        setBackground(new java.awt.Color(102, 102, 102));
        setClosable(true);
        setForeground(new java.awt.Color(255, 255, 153));
        setMaximizable(true);
        setTitle("Check-In");

        jLabel1.setText("Escribe el nombre del huésped:");

        jTextFieldNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldNombreKeyTyped(evt);
            }
        });

        jLabel2.setText("Escribe la ciudad de origen del huésped:");

        jTextFieldCiudad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldCiudadKeyTyped(evt);
            }
        });

        jLabel3.setText("Escribe el tipo de habitación a hospedar:");

        jLabel4.setText("Escribe el numero de personas que la ocupan:");

        jTextFieldNumPersonas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldNumPersonasKeyTyped(evt);
            }
        });

        jButtonIngresar.setText("Ingresar");
        jButtonIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIngresarActionPerformed(evt);
            }
        });

        jLabel5.setText("Escribe la fecha de ingreso:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 165, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jComboBoxTipoHab.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Hunn", "Itza", "Kauil" }));
        jComboBoxTipoHab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxTipoHabActionPerformed(evt);
            }
        });

        jButtonLimpiar.setText("Limpiar");
        jButtonLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(580, 580, 580)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addGap(34, 34, 34)
                                    .addComponent(jTextFieldNumPersonas))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel1)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel3))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(25, 25, 25)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jTextFieldNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)
                                                .addComponent(jTextFieldCiudad)))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addGap(67, 67, 67)
                                            .addComponent(jComboBoxTipoHab, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(53, 53, 53)
                                .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonIngresar)
                        .addGap(120, 120, 120)
                        .addComponent(jButtonLimpiar)
                        .addGap(137, 137, 137)))
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jComboBoxTipoHab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextFieldNumPersonas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonIngresar)
                    .addComponent(jButtonLimpiar))
                .addGap(23, 23, 23))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldNumPersonasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNumPersonasKeyTyped
        // TODO add your handling code here:

        char validar = evt.getKeyChar();

        if (Character.isLetter(validar)) {
            getToolkit().beep();
            evt.consume();

            JOptionPane.showMessageDialog(this, "Escribe solamente numeros");
        }

    }//GEN-LAST:event_jTextFieldNumPersonasKeyTyped

    private void jTextFieldNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNombreKeyTyped
        // TODO add your handling code here:
        char validar = evt.getKeyChar();

        if (Character.isDigit(validar)) {
            getToolkit().beep();
            evt.consume();

            JOptionPane.showMessageDialog(this, "Escribe solamente texto");
        }
    }//GEN-LAST:event_jTextFieldNombreKeyTyped

    private void jTextFieldCiudadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldCiudadKeyTyped
        // TODO add your handling code here:
        char validar = evt.getKeyChar();

        if (Character.isDigit(validar)) {
            getToolkit().beep();
            evt.consume();

            JOptionPane.showMessageDialog(this, "Escribe solamente texto");
        }
    }//GEN-LAST:event_jTextFieldCiudadKeyTyped

    private void jButtonIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIngresarActionPerformed
        // TODO add your handling code here:

        SimpleDateFormat formato = new SimpleDateFormat("YYYY-MM-dd");
        String fechaIngreso = formato.format(this.jDateChooser1.getDate());
        int dias = (int) (Math.random() * (7 - 3 + 1) + 3), numero = 0;

        String nombre, ciudad, numPersonas, fechaSalida;
        String tipoHab;

        nombre = this.jTextFieldNombre.getText().trim();
        ciudad = this.jTextFieldCiudad.getText().trim();
        numPersonas = this.jTextFieldNumPersonas.getText().trim();
        tipoHab = (String) jComboBoxTipoHab.getSelectedItem();

        SimpleDateFormat Formato = new SimpleDateFormat("dd-MM-YYYY");
        Calendar aux = Calendar.getInstance();

        aux.setTime(this.jDateChooser1.getDate());
        aux.add(Calendar.DATE, dias);

        System.out.println(Formato.format(aux.getTime()));

        int numP = Integer.parseInt(numPersonas);

        if ("Hunn".equals(tipoHab)) {

            if (!(numP >= 1 && numP <= 3)) {
                JOptionPane.showMessageDialog(this, "LA CANTIDAD DE PERSONAS SELECCIONADA NO ES CORRECTA");
                return;
            }
        }

        if ("Itza".equals(tipoHab)) {

            if (!(numP >= 2 && numP <= 4)) {
                JOptionPane.showMessageDialog(this, "LA CANTIDAD DE PERSONAS SELECCIONADA NO ES CORRECTA");
                return;
            }
        }

        if ("Kauil".equals(tipoHab)) {

            if (!(numP >= 3 && numP <= 5)) {
                JOptionPane.showMessageDialog(this, "LA CANTIDAD DE PERSONAS SELECCIONADA NO ES CORRECTA");
                return;
            }
        }

        Set<Integer> generados = new HashSet<>();
        for (int i = 1; i <= 30; i++) {
            int aleatorio = -1;
            boolean generado = false;
            while (!generado) {
                int numHab = (int) (Math.random() * (30 - 1 + 1) + 1);
                if (!generados.contains(numHab)) {
                    generados.add(numHab);
                    aleatorio = numHab;
                    generado = true;
                }
            }
            numero = aleatorio;
        }

        String parte1 = "INSERT INTO huespedes (nombre, ciudad, fechaE, fechaS, tipoH, numPersonas, numHab) VALUES (";
        String parte2 = "'" + nombre + "','" + ciudad + "','" + formato.format(this.jDateChooser1.getDate()) + "','" + formato.format(aux.getTime()) + "','" + tipoHab + "','" + numPersonas + "','" + numero + "')";
        String query = parte1 + parte2;
        int j = this.conn.Update(query); //Ejecuta accion de alta en la base de datos

        if (j > 0) {
            System.out.println("Numero de registros afectados por la accion: " + j);
            JOptionPane.showMessageDialog(this, "REGISTRO EXITOSO, su numero de habitacion es: " + numero);
        }
    }//GEN-LAST:event_jButtonIngresarActionPerformed

    private void jComboBoxTipoHabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxTipoHabActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxTipoHabActionPerformed

    private void jButtonLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimpiarActionPerformed
        // TODO add your handling code here:
        this.jTextFieldNombre.setText("");
        this.jTextFieldCiudad.setText("");
        this.jTextFieldNumPersonas.setText("");
    }//GEN-LAST:event_jButtonLimpiarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonIngresar;
    private javax.swing.JButton jButtonLimpiar;
    private javax.swing.JComboBox jComboBoxTipoHab;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldCiudad;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JTextField jTextFieldNumPersonas;
    // End of variables declaration//GEN-END:variables
}
