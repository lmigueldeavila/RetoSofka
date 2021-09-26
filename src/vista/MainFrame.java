package vista;

public class MainFrame extends javax.swing.JFrame {
    
    private ConfigurarPanel cp;
    private Ronda1Panel r1p;
    private HistorialPanel hp;
    
    
    public MainFrame() {
        initComponents();
        cp = new ConfigurarPanel();
        r1p = new Ronda1Panel();
        hp = new HistorialPanel();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        Configurar = new javax.swing.JMenu();
        configurarJMI = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jugarJMI = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        historialJMI = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new java.awt.BorderLayout());

        Configurar.setText("configurar");

        configurarJMI.setText("configurar");
        configurarJMI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                configurarJMIActionPerformed(evt);
            }
        });
        Configurar.add(configurarJMI);

        jMenuBar1.add(Configurar);

        jMenu2.setText("Jugar");

        jugarJMI.setText("jugar");
        jugarJMI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jugarJMIActionPerformed(evt);
            }
        });
        jMenu2.add(jugarJMI);

        jMenuBar1.add(jMenu2);

        jMenu1.setText("Historial");

        historialJMI.setText("Historial");
        historialJMI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                historialJMIActionPerformed(evt);
            }
        });
        jMenu1.add(historialJMI);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 816, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 428, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void configurarJMIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_configurarJMIActionPerformed
        jPanel1.setVisible(false);
        jPanel1.removeAll();
        jPanel1.add(cp);
        jPanel1.setVisible(true);
    }//GEN-LAST:event_configurarJMIActionPerformed

    private void jugarJMIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jugarJMIActionPerformed
        jPanel1.setVisible(false);
        jPanel1.removeAll();
        jPanel1.add(r1p);
        jPanel1.setVisible(true);
    }//GEN-LAST:event_jugarJMIActionPerformed

    private void historialJMIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_historialJMIActionPerformed
        jPanel1.setVisible(false);
        jPanel1.removeAll();
        jPanel1.add(hp);
        jPanel1.setVisible(true);
    }//GEN-LAST:event_historialJMIActionPerformed

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Configurar;
    private javax.swing.JMenuItem configurarJMI;
    private javax.swing.JMenuItem historialJMI;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenuItem jugarJMI;
    // End of variables declaration//GEN-END:variables
}
