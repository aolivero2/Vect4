
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Angela
 */
public class Ejercicio4 extends javax.swing.JFrame {

    /**
     * Creates new form Ejercicio4
     */
    double v[];
    public Ejercicio4() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        cmdLlenarManual = new javax.swing.JButton();
        cmdLlenarAuto = new javax.swing.JButton();
        cmCrear = new javax.swing.JButton();
        cmdMostrar = new javax.swing.JButton();
        cmdBorrar = new javax.swing.JButton();
        cdmBorrarr = new javax.swing.JButton();
        cmdRepetidos = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtResultado = new javax.swing.JTextArea();
        txtLongitud = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Dtos Inicial"));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Longitud");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 35, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 120, 70));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("NUMEROS REPETIDOS");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, -1, -1));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Opciones"));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cmdLlenarManual.setText("Manual");
        cmdLlenarManual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdLlenarManualActionPerformed(evt);
            }
        });
        jPanel2.add(cmdLlenarManual, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 45, -1, -1));

        cmdLlenarAuto.setText("Automatico");
        cmdLlenarAuto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdLlenarAutoActionPerformed(evt);
            }
        });
        jPanel2.add(cmdLlenarAuto, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 74, -1, -1));

        cmCrear.setText("Crear");
        cmCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmCrearActionPerformed(evt);
            }
        });
        jPanel2.add(cmCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 16, -1, -1));

        cmdMostrar.setText("Mostrar");
        cmdMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdMostrarActionPerformed(evt);
            }
        });
        jPanel2.add(cmdMostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, -1, -1));

        cmdBorrar.setText("Borrar");
        jPanel2.add(cmdBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 190, -1, -1));

        cdmBorrarr.setText("Borrar");
        cdmBorrarr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cdmBorrarrActionPerformed(evt);
            }
        });
        jPanel2.add(cdmBorrarr, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, -1, -1));

        cmdRepetidos.setText("Repetidos");
        cmdRepetidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdRepetidosActionPerformed(evt);
            }
        });
        jPanel2.add(cmdRepetidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 80, 170, 210));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Resultado"));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtResultado.setEditable(false);
        txtResultado.setColumns(20);
        txtResultado.setRows(5);
        jScrollPane1.setViewportView(txtResultado);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, 150));

        txtLongitud.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtLongitudKeyTyped(evt);
            }
        });
        getContentPane().add(txtLongitud, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 70, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmdLlenarAutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdLlenarAutoActionPerformed
        // TODO add your handling code here:
        
        double num,n;
        num=Double.parseDouble(JOptionPane.showInputDialog(this,"Digite el numero hasta donde quiere el llenado"));
        while (num<v.length){
        JOptionPane.showMessageDialog(this, "Digite un numero mayor a: "+v.length);
        num  = Double.parseDouble(JOptionPane.showInputDialog(this,"Digite el numero hasta donde quiere el llenado"));
        
        }
        
        for (int i =0;i<v.length;i++){
         n =(int)(Math.random()*num+1);
         
         v[i]=n;
        
        }
        JOptionPane.showMessageDialog(this, "Vector creado exitosamente ");
    }//GEN-LAST:event_cmdLlenarAutoActionPerformed

    private void cmdMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdMostrarActionPerformed
        // TODO add your handling code here:
        
        txtResultado.append ("Los elementos del vector 1 son: ");
        for (int i =0; i<v.length;i++){
        txtResultado.append (v[i]+"\n");
        
        }
    }//GEN-LAST:event_cmdMostrarActionPerformed

    private void cdmBorrarrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cdmBorrarrActionPerformed
        // TODO add your handling code here:
        
         txtLongitud.setText("");
        txtResultado.setText("");
        
        v = null;
        txtLongitud.requestFocusInWindow();
    }//GEN-LAST:event_cdmBorrarrActionPerformed

    private void cmdLlenarManualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdLlenarManualActionPerformed
        // TODO add your handling code here:
        
        double n;
        for (int i=0; i<v.length; i++) {
        n= Double.parseDouble(JOptionPane.showInputDialog(this, "Digite el elemento en la posicion"+i));
        v[i]=n;
        
        }
    }//GEN-LAST:event_cmdLlenarManualActionPerformed

    private void cmCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmCrearActionPerformed
        // TODO add your handling code here:
        
        int longitud;
        if (txtLongitud.getText().trim().isEmpty()){
        JOptionPane.showMessageDialog(this,"Digite la longitud","ERROR",JOptionPane.ERROR_MESSAGE);
        
        txtLongitud.requestFocusInWindow();
        } else if (Integer.parseInt(txtLongitud.getText().trim())==0){
        JOptionPane.showMessageDialog(this, "La longitud no puede ser cero","ERROR",JOptionPane.ERROR_MESSAGE);
        txtLongitud.requestFocusInWindow();
        txtLongitud.selectAll();
        
        }else{
        longitud = Integer.parseInt(txtLongitud.getText().trim());
        v= new double [longitud];
        JOptionPane.showMessageDialog (this, "El vector se ha creado exitosamente");
        
        
        }
    }//GEN-LAST:event_cmCrearActionPerformed

    private void cmdRepetidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdRepetidosActionPerformed
        // TODO add your handling code here:
        
        double conta1=0, num =0;
        
        for (int i = 0; i<v.length;i++){
        
            double conta2=0;
            
           for (int j = 0; j<v.length;j++){ 
            if (v[i] == v[j]){
            
                conta2++;
            }
            if (conta2>conta1){
            num = v[i];
            
            conta2=conta2;
            }
           }
        
        }
        txtResultado.setText("El Número que se repite es "+num);
        
        

    }//GEN-LAST:event_cmdRepetidosActionPerformed

    private void txtLongitudKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLongitudKeyTyped
        // TODO add your handling code here:
        
        char c=evt.getKeyChar();
          if (!Character.isDigit(c)){
          
          getToolkit().beep();
          evt.consume();
          }
    }//GEN-LAST:event_txtLongitudKeyTyped

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Ejercicio4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ejercicio4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ejercicio4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ejercicio4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ejercicio4().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cdmBorrarr;
    private javax.swing.JButton cmCrear;
    private javax.swing.JButton cmdBorrar;
    private javax.swing.JButton cmdLlenarAuto;
    private javax.swing.JButton cmdLlenarManual;
    private javax.swing.JButton cmdMostrar;
    private javax.swing.JButton cmdRepetidos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtLongitud;
    private javax.swing.JTextArea txtResultado;
    // End of variables declaration//GEN-END:variables
}
