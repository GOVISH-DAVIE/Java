/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

/**
 *
 * @author nkotieno
 */
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.TableView;
import static newpackage.Menu23.h1;
import static newpackage.Menu23.h2;
import static newpackage.Menu23.h3;
import static newpackage.Menu23.m1;
import static newpackage.Menu23.m2;
import static newpackage.Menu23.m3;
import static newpackage.Menu23.m4;
import static newpackage.Menu23.c1;
import static newpackage.Menu23.c2;
import static newpackage.Menu23.c3;
import static newpackage.Menu23.c4;
import static newpackage.Menu23.v1;
import static newpackage.Menu23.v2;
import static newpackage.Menu23.v3;
import static newpackage.Menu23.v4;
import static newpackage.Menu2.chicken;

public class Checkout extends javax.swing.JFrame {

    static String[][] basess, salads, soups, milshake, Juices, herb, mea, chees, veggi;
    static String[][][] foods;

    //(checkoutTextArea.setText());
    /**
     * Creates new form Checkout
     *
     * @param food
     * @param prop
     * @param j
     * @param herbs
     * @param meat
     * @param cheese
     * @param veggies
     */
    public Checkout(String[][][] food, String[][] prop, String[][] j, String[][] herbs, String[][] meat, String[][] cheese, String[][] veggies) {
        milshake = prop;
        Juices = j;
        herb = herbs;
        mea = meat;
        chees = cheese;
        veggi = veggies;
        foods = food;
        basess = food[0];
        salads = food[1];
        soups = food[2];
        System.out.println(food);
        initComponents();
        addRowToTable();

    }

//    create a model to feed the table;
    public class Items {

        public String item;
        public String q;
        public String Price;
        public Integer total;

        public Items(String i, String q, String p) {
            this.item = i;
            this.q = q;
            this.Price = p;
            this.total = Integer.parseInt(p) * Integer.parseInt(q);
        }
    }

    public ArrayList ListItems() {
        ArrayList<Items> list = new ArrayList<Items>();
//        Items ul = new Items("34", "4334");

        for (int i = 0; i < milshake[0].length; i++) {
            System.out.println(i);
            Items ul = new Items(milshake[0][i], milshake[1][i], milshake[2][i]);
            list.add(ul);
        }
        for (int i = 0; i < Juices[0].length; i++) {
            System.out.println(i);
            Items ul = new Items(Juices[0][i], Juices[1][i], Juices[2][i]);
            list.add(ul);
        }

        for (int i = 0; i < herb[0].length; i++) {

            Items ul = new Items(herb[0][i], herb[1][i], "0");
            list.add(ul);
        }
        for (int i = 0; i < mea[0].length; i++) {

            Items ul = new Items(mea[0][i], "1", mea[1][i]);
            list.add(ul);
        }
        for (int i = 0; i < veggi[0].length; i++) {

            Items ul = new Items(veggi[0][i], "1", veggi[1][i]);
            list.add(ul);
        }
        for (int i = 0; i < chees[0].length; i++) {

            Items ul = new Items(chees[0][i], "1", chees[1][i]);
            list.add(ul);
        }
        for (int i = 0; i < basess[0].length; i++) {

            Items ul = new Items(basess[0][i], "1", basess[1][i]);
            list.add(ul);
        }
        for (int i = 0; i < salads[0].length; i++) {

            Items ul = new Items(salads[0][i], salads[1][i], salads[2][i]);
            list.add(ul);
        }
        for (int i = 0; i < soups[0].length; i++) {

            Items ul = new Items(soups[0][i], soups[1][i], soups[2][i]);
            list.add(ul);
        }

//        
        System.out.println(list);
        return list;
    }

    public void addRowToTable() { 
        int tot = 0;
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
         ArrayList<Items> list = ListItems();

        
        if (list.isEmpty()) {
            
        } else {
            Object rowData[] = new Object[4]; 
             for (int i = 0; i < list.size()+1; i++) {
            if (i< list.size()) {
                 rowData[1] = list.get(i).q;
            rowData[0] = list.get(i).item;
            rowData[2] = list.get(i).Price;
            rowData[3] = list.get(i).total; 
            tot = tot +list.get(i).total;
            
            model.addRow(rowData); 
                
            } else if (i== list.size()) {
                    rowData[1] = "-";
            rowData[0] ="Total";
            rowData[2] = "-";
            rowData[3] = tot; 
            
            model.addRow(rowData); 
                
            }else{
                
            }
            
            
           
        }
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

        jLabel1 = new javax.swing.JLabel();
        gobackmenuButton = new javax.swing.JButton();
        payButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Noteworthy", 1, 18)); // NOI18N
        jLabel1.setText("Checkout");

        gobackmenuButton.setText("Go Back ");
        gobackmenuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gobackmenuButtonActionPerformed(evt);
            }
        });

        payButton.setText("Pay");
        payButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payButtonActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "item", "quantity", "price(Rs)", "total(Rs)"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setColumnSelectionAllowed(true);
        jScrollPane2.setViewportView(jTable1);
        jTable1.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(payButton)
                .addGap(22, 22, 22))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(gobackmenuButton)))
                .addContainerGap(171, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(12, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(21, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(gobackmenuButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 231, Short.MAX_VALUE)
                .addComponent(payButton)
                .addGap(17, 17, 17))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(90, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(139, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void payButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payButtonActionPerformed
        new Payment().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_payButtonActionPerformed

    private void gobackmenuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gobackmenuButtonActionPerformed
        new Menu23().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_gobackmenuButtonActionPerformed

    public String[] vals() {
        String[] v = {
            "hello",
            "new"
        };
        return v;
    }

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
            java.util.logging.Logger.getLogger(Checkout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Checkout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Checkout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Checkout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Checkout(foods, milshake, Juices, herb, mea, chees, veggi).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton gobackmenuButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JTable jTable1;
    private javax.swing.JButton payButton;
    // End of variables declaration//GEN-END:variables
}
