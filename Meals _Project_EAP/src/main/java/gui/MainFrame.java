package gui;


import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;


public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    public MainFrame() {

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

        jFrame1 = new javax.swing.JFrame();
        menuBar1 = new java.awt.MenuBar();
        menu1 = new java.awt.Menu();
        menu2 = new java.awt.Menu();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        mealSearchBtn = new javax.swing.JButton();
        manageDataBtn = new javax.swing.JButton();
        showStatsBtn = new javax.swing.JButton();
        exitBtn = new javax.swing.JButton();
        showMealsByCategotyBtn = new javax.swing.JButton();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
                jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
                jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 300, Short.MAX_VALUE)
        );

        menu1.setLabel("File");
        menu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu1ActionPerformed(evt);
            }
        });
        menuBar1.add(menu1);

        menu2.setLabel("Edit");
        menuBar1.add(menu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Meals App");
        setMinimumSize(new java.awt.Dimension(800, 500));
        setPreferredSize(new java.awt.Dimension(800, 500));

        jPanel2.setBackground(new java.awt.Color(0, 204, 204));
        jPanel2.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        jPanel2.setPreferredSize(new java.awt.Dimension(500, 439));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 51));
        jLabel1.setText("ANOIΚΤΟ");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 51));
        jLabel2.setText("ΠΑΝΕΠΙΣΤΗΜΙΟ");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 51));
        jLabel3.setText("ΣΧΕΔΙΑΣΜΟΣ ΛΟΓΙΣΜΙΚΟΥ");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 51, 51));
        jLabel4.setText("ΕΛΛΗΝΙΚΟ");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 51, 51));
        jLabel5.setText("ΣΥΣΤΗΜΑ Meals App");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 51, 51));
        jLabel6.setText("ΥΛΟΠΟΙΗΘΗΚΕ ΑΠΟ:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 51, 51));
        jLabel7.setText("ΧΑΡΙΣΤΟΣ ΜΑΝΩΛΗΣ");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 51, 51));
        jLabel8.setText("ΠΑΣΧΑΛΗΣ ΧΡΙΣΤΟΔΟΥΛΟΣ");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 51, 51));
        jLabel9.setText("ΜΑΝΙΑΤΟΠΟΥΛΟΣ ΣΟΦΟΚΛΗΣ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel9)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel1)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel7)
                                        .addComponent(jLabel8))
                                .addContainerGap(213, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2)
                                .addGap(28, 28, 28)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel5)
                                .addGap(39, 39, 39)
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel9)
                                .addContainerGap(86, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setPreferredSize(new java.awt.Dimension(450, 439));

        mealSearchBtn.setBackground(new java.awt.Color(0, 204, 204));
        mealSearchBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        mealSearchBtn.setForeground(new java.awt.Color(0, 102, 102));
        mealSearchBtn.setText("ΑΝΑΖΗΤΗΣΗ ΓΕΥΜΑΤΟΣ");
        mealSearchBtn.setMaximumSize(new java.awt.Dimension(350, 50));
        mealSearchBtn.setMinimumSize(new java.awt.Dimension(350, 50));
        mealSearchBtn.setPreferredSize(new java.awt.Dimension(350, 50));

        mealSearchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new MealFrame("random");
                dispose();
            }

        });

        manageDataBtn.setBackground(new java.awt.Color(0, 204, 204));
        manageDataBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        manageDataBtn.setForeground(new java.awt.Color(0, 102, 102));
        manageDataBtn.setText("ΔΙΑΧΕΙΡΙΣΗ ΔΕΔΟΜΕΝΩΝ");
        manageDataBtn.setMaximumSize(new java.awt.Dimension(350, 50));
        manageDataBtn.setMinimumSize(new java.awt.Dimension(350, 50));
        manageDataBtn.setPreferredSize(new java.awt.Dimension(350, 50));
        /*
        manageDataBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageDataBtnActionPerformed(evt);

        });
        */


        showMealsByCategotyBtn.setBackground(new java.awt.Color(0, 204, 204));
        showMealsByCategotyBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        showMealsByCategotyBtn.setForeground(new java.awt.Color(0, 102, 102));
        showMealsByCategotyBtn.setText("ΠΡΟΒΟΛΗ ΓΕΥΜΑΤΩΝ ΑΝΑ ΚΑΤΗΓΟΡΙΑ");
        showMealsByCategotyBtn.setMaximumSize(new java.awt.Dimension(350, 50));
        showMealsByCategotyBtn.setMinimumSize(new java.awt.Dimension(350, 50));
        showMealsByCategotyBtn.setPreferredSize(new java.awt.Dimension(350, 50));
        showMealsByCategotyBtn.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                new SearchByCategoryFrame();
                dispose();
            }
        });

        showStatsBtn.setBackground(new java.awt.Color(0, 204, 204));
        showStatsBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        showStatsBtn.setForeground(new java.awt.Color(0, 102, 102));
        showStatsBtn.setText("ΠΡΟΒΟΛΗ ΣΤΑΤΙΣΤΙΚΩΝ ΓΕΥΜΑΤΩΝ");
        showStatsBtn.setMaximumSize(new java.awt.Dimension(350, 50));
        showStatsBtn.setMinimumSize(new java.awt.Dimension(350, 50));
        showStatsBtn.setPreferredSize(new java.awt.Dimension(350, 50));
        showStatsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                new StatisticsFrame();
                dispose();
            }
        });

        exitBtn.setBackground(new java.awt.Color(0, 204, 204));
        exitBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        exitBtn.setForeground(new java.awt.Color(0, 102, 102));
        exitBtn.setText("ΕΞΟΔΟΣ");
        exitBtn.setMaximumSize(new java.awt.Dimension(350, 50));
        exitBtn.setMinimumSize(new java.awt.Dimension(350, 50));
        exitBtn.setPreferredSize(new java.awt.Dimension(350, 50));
        exitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(mealSearchBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(showMealsByCategotyBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(manageDataBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(showStatsBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(exitBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap(50, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addComponent(mealSearchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(showMealsByCategotyBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(showStatsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(manageDataBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(exitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(97, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.LINE_END);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu1ActionPerformed
        // TODO add your handling code here:
    }

    private void exitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBtnActionPerformed

        Object[] options = {"Ναι", "Όχι"};
        int x = JOptionPane.showOptionDialog(null, "Θέλετε να αποχωρήσετε από την εφαρμογή;", "ΕΞΟΔΟΣ",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
        if (x == JOptionPane.YES_OPTION) {

            System.exit(0);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_exitBtnActionPerformed


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
    private javax.swing.JButton exitBtn;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton manageDataBtn;
    private javax.swing.JButton mealSearchBtn;
    private java.awt.Menu menu1;
    private java.awt.Menu menu2;
    private java.awt.MenuBar menuBar1;
    private javax.swing.JButton showMealsByCategotyBtn;
    private javax.swing.JButton showStatsBtn;
    // End of variables declaration//GEN-END:variables
}


