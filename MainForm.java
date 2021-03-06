package potatobeetlesapp;
public class MainForm extends javax.swing.JFrame {

    //Конструктор
    public MainForm() {
        initComponents();
        userPanel.setField(field);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backgroundPanel = new javax.swing.JPanel();
        titleLabel = new javax.swing.JLabel();
        userPanel = new potatobeetlesapp.UserPanel();
        field = new potatobeetlesapp.Field();
        beetlePicture = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Колорадские жуки");
        setLocationByPlatform(true);
        setName("mainForm"); // NOI18N
        setResizable(false);

        backgroundPanel.setBackground(new java.awt.Color(207, 244, 170));
        backgroundPanel.setName(""); // NOI18N
        backgroundPanel.setPreferredSize(new java.awt.Dimension(1200, 720));
        backgroundPanel.setLayout(null);

        titleLabel.setFont(new java.awt.Font("Trebuchet MS", 3, 24)); // NOI18N
        titleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLabel.setText("Модель распространения колорадского жука на картофельном поле");
        backgroundPanel.add(titleLabel);
        titleLabel.setBounds(0, 0, 1202, 45);
        backgroundPanel.add(userPanel);
        userPanel.setBounds(10, 40, 450, 724);

        javax.swing.GroupLayout fieldLayout = new javax.swing.GroupLayout(field);
        field.setLayout(fieldLayout);
        fieldLayout.setHorizontalGroup(
            fieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 736, Short.MAX_VALUE)
        );
        fieldLayout.setVerticalGroup(
            fieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 724, Short.MAX_VALUE)
        );

        backgroundPanel.add(field);
        field.setBounds(470, 40, 736, 724);

        beetlePicture.setIcon(new javax.swing.ImageIcon(getClass().getResource("/potatobeetlesapp/pictures/bug.png"))); // NOI18N
        backgroundPanel.add(beetlePicture);
        beetlePicture.setBounds(150, -20, 50, 80);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(backgroundPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 1212, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(backgroundPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 770, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new MainForm().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel backgroundPanel;
    private javax.swing.JLabel beetlePicture;
    private potatobeetlesapp.Field field;
    private javax.swing.JLabel titleLabel;
    private potatobeetlesapp.UserPanel userPanel;
    // End of variables declaration//GEN-END:variables

}
