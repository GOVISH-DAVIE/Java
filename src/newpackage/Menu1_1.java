package newpackage;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nkotieno
 */
public class Menu1_1 extends javax.swing.JFrame {
 static String h1,h2,h3,m1,m2,m3,m4,c1,c2,c3,c4,v1,v2,v3,v4;
    /**
     * Creates new form Menu1
     */
    public Menu1_1() {
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

        jLabel1 = new javax.swing.JLabel();
        herbs = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        cheddar = new javax.swing.JCheckBox();
        mozarella = new javax.swing.JCheckBox();
        gorgonzola = new javax.swing.JCheckBox();
        straccino = new javax.swing.JCheckBox();
        rosemary = new javax.swing.JCheckBox();
        chives = new javax.swing.JCheckBox();
        basil = new javax.swing.JCheckBox();
        beef = new javax.swing.JCheckBox();
        pepperoni = new javax.swing.JCheckBox();
        chicken = new javax.swing.JCheckBox();
        lamb = new javax.swing.JCheckBox();
        continuemenuButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        broccolli = new javax.swing.JCheckBox();
        onions = new javax.swing.JCheckBox();
        zucchini = new javax.swing.JCheckBox();
        tomato = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Noteworthy", 2, 24)); // NOI18N
        jLabel1.setText("Toppings ");

        herbs.setFont(new java.awt.Font("Lucida Grande", 3, 18)); // NOI18N
        herbs.setText("HERBS (free)");

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 3, 18)); // NOI18N
        jLabel5.setText("MEAT");

        jLabel10.setFont(new java.awt.Font("Lucida Grande", 3, 18)); // NOI18N
        jLabel10.setText("More Cheese please !");

        cheddar.setText("Cheddar (free)");
        cheddar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cheddarActionPerformed(evt);
            }
        });

        mozarella.setText("Mozarella (R12)");
        mozarella.setToolTipText("");

        gorgonzola.setText("Gorgonzola  (R5)");

        straccino.setText("Straccino (R7)");
        straccino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                straccinoActionPerformed(evt);
            }
        });

        rosemary.setText("Rosemary ");
        rosemary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rosemaryActionPerformed(evt);
            }
        });

        chives.setText("Chives");

        basil.setText("Basil ");

        beef.setText("Beef (R10)");

        pepperoni.setText("Pepperoni (R10)");

        chicken.setText("Chicken  (R10)");

        lamb.setText("Lamb (R10)");

        continuemenuButton.setText("Continue ");
        continuemenuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                continuemenuButtonActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 3, 18)); // NOI18N
        jLabel2.setText("VEGGIES");

        broccolli.setText("Broccolli (R7)");
        broccolli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                broccolliActionPerformed(evt);
            }
        });

        onions.setText("Onions (R5)");

        zucchini.setText("Zucchini (R10)");

        tomato.setText("Tomato (R5)");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(continuemenuButton)
                .addGap(63, 63, 63))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rosemary)
                                    .addComponent(chives)
                                    .addComponent(basil))
                                .addGap(125, 125, 125))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(herbs)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(beef)
                            .addComponent(pepperoni)
                            .addComponent(chicken)
                            .addComponent(lamb)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(mozarella)
                                    .addComponent(cheddar)
                                    .addComponent(gorgonzola)
                                    .addComponent(straccino))
                                .addGap(88, 88, 88)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(broccolli)
                                    .addComponent(onions)
                                    .addComponent(zucchini)
                                    .addComponent(tomato)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(81, 81, 81)
                                .addComponent(jLabel2))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(jLabel1)))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel1)
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addComponent(herbs)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rosemary)
                            .addComponent(beef))
                        .addGap(28, 28, 28))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(chives)
                        .addComponent(pepperoni)))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(basil)
                    .addComponent(chicken))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lamb)
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(mozarella)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(gorgonzola)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(straccino)
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cheddar)
                            .addComponent(broccolli))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(onions)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(zucchini)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tomato)
                        .addGap(23, 23, 23)))
                .addComponent(continuemenuButton)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cheddarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cheddarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cheddarActionPerformed

    private void straccinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_straccinoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_straccinoActionPerformed

    private void continuemenuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_continuemenuButtonActionPerformed
         
       //Menu 1 
     
         
     
        // Vegetable section  
        if (rosemary.isSelected()){
              h1= h1+rosemary.getText()+"\n";  
            
        } if (chives.isSelected()){
            h2= h2+chives.getText()+"\n";  
           
        }if (basil.isSelected()){
            h3= h3+basil.getText()+"\n";  
            
        }
        // Meat Section 
        if (beef.isSelected()){
            m1= m1+beef.getText()+"\n";  
        }if (pepperoni.isSelected()){
            m2= m2+pepperoni.getText()+"\n";  
        }if (chicken.isSelected()){
            m3= m3+chicken.getText()+"\n";  
            
        }if (lamb.isSelected()){
            m4= m4+basil.getText()+"\n";  
            
        }
        // Cheese section
        if (cheddar.isSelected()){
            c1= c1+basil.getText()+"\n"; 
            
        }if (mozarella.isSelected()){
            c2= c2+basil.getText()+"\n"; 
            
        }if (gorgonzola.isSelected()){
            c3= c3+basil.getText()+"\n"; 
            
        }if (straccino.isSelected()){
            c4= c4+basil.getText()+"\n"; 
            
        }
        //Veggies 
        if (broccolli.isSelected()){
            v1= v1+basil.getText()+"\n"; 
            
        }if (onions.isSelected()){
            v2= v2+basil.getText()+"\n"; 
            
        }if (zucchini.isSelected()){
             v3= v3+basil.getText()+"\n"; 
            
        }if (tomato.isSelected()){
            v4= v4+basil.getText()+"\n"; 
            
        }
    
        String[] x ={};
//        new Menu2(x).setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_continuemenuButtonActionPerformed

    private void rosemaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rosemaryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rosemaryActionPerformed

    private void broccolliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_broccolliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_broccolliActionPerformed

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
            java.util.logging.Logger.getLogger(Menu1_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu1_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu1_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu1_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu1_1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox basil;
    private javax.swing.JCheckBox beef;
    private javax.swing.JCheckBox broccolli;
    private javax.swing.JCheckBox cheddar;
    private javax.swing.JCheckBox chicken;
    private javax.swing.JCheckBox chives;
    private javax.swing.JButton continuemenuButton;
    private javax.swing.JCheckBox gorgonzola;
    private javax.swing.JLabel herbs;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JCheckBox lamb;
    private javax.swing.JCheckBox mozarella;
    private javax.swing.JCheckBox onions;
    private javax.swing.JCheckBox pepperoni;
    private javax.swing.JCheckBox rosemary;
    private javax.swing.JCheckBox straccino;
    private javax.swing.JCheckBox tomato;
    private javax.swing.JCheckBox zucchini;
    // End of variables declaration//GEN-END:variables
}