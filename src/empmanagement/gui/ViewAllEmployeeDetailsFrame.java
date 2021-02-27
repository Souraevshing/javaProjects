/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empmanagement.gui;

import empmanagement.dbutil.DBConnection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.Statement;

public class ViewAllEmployeeDetailsFrame extends javax.swing.JFrame {

    /**
     * Creates new form ViewAllEmployeeDetailsFrame
     */
    public ViewAllEmployeeDetailsFrame() {
        initComponents();
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Details of Employee");
        setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        viewEmployeeDetailsPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtViewDetails = new javax.swing.JTextArea();
        btnViewDetailsShowRecords = new javax.swing.JButton();
        btnViewDetailsBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("<html>\n<body>\n<h3>View all the details of Employee</h3>\n</body>\n</html>");

        viewEmployeeDetailsPanel.setBackground(new java.awt.Color(0, 0, 0));
        viewEmployeeDetailsPanel.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("View All Employee Details");

        txtViewDetails.setBackground(new java.awt.Color(0, 0, 0));
        txtViewDetails.setColumns(20);
        txtViewDetails.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        txtViewDetails.setForeground(new java.awt.Color(255, 255, 255));
        txtViewDetails.setRows(5);
        jScrollPane1.setViewportView(txtViewDetails);

        btnViewDetailsShowRecords.setBackground(new java.awt.Color(0, 51, 51));
        btnViewDetailsShowRecords.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        btnViewDetailsShowRecords.setForeground(new java.awt.Color(255, 51, 0));
        btnViewDetailsShowRecords.setText("Show All Records");
        btnViewDetailsShowRecords.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewDetailsShowRecordsActionPerformed(evt);
            }
        });

        btnViewDetailsBack.setBackground(new java.awt.Color(0, 51, 51));
        btnViewDetailsBack.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        btnViewDetailsBack.setForeground(new java.awt.Color(255, 51, 0));
        btnViewDetailsBack.setText("Back");
        btnViewDetailsBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewDetailsBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout viewEmployeeDetailsPanelLayout = new javax.swing.GroupLayout(viewEmployeeDetailsPanel);
        viewEmployeeDetailsPanel.setLayout(viewEmployeeDetailsPanelLayout);
        viewEmployeeDetailsPanelLayout.setHorizontalGroup(
            viewEmployeeDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewEmployeeDetailsPanelLayout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(btnViewDetailsShowRecords)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnViewDetailsBack, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
            .addGroup(viewEmployeeDetailsPanelLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 561, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, viewEmployeeDetailsPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(166, 166, 166))
        );
        viewEmployeeDetailsPanelLayout.setVerticalGroup(
            viewEmployeeDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewEmployeeDetailsPanelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(viewEmployeeDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnViewDetailsShowRecords, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnViewDetailsBack, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(viewEmployeeDetailsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(viewEmployeeDetailsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnViewDetailsBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewDetailsBackActionPerformed
        this.dispose();
        OptionsFrame opt = new OptionsFrame();
        opt.setVisible(true);
    }//GEN-LAST:event_btnViewDetailsBackActionPerformed

    private void btnViewDetailsShowRecordsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewDetailsShowRecordsActionPerformed
        try
        {
            Connection con = DBConnection.getConnection();
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("Select * from emp order by id");
            StringBuilder sb=new StringBuilder();
            sb.append("EmpID"+"\t"+"Emp Name"+"\t"+"Emp Age"+"\t"+"Emp Salary"+"\t"+"Emp Address"+"\n");
            System.out.println("\n");
            txtViewDetails.setText("");
            while(rs.next())
            {
               
                int eno=rs.getInt(1);
                String ename=rs.getString(2);
                int eage=rs.getInt(3);
                double sal=rs.getDouble(4);
                String eadd=rs.getString(5);
                sb.append(eno+"\t"+ename+"\t"+eage+"\t"+sal+"\t"+eadd+"\n");
            }
            txtViewDetails.setText(sb.toString()+"\n");
        }
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null, "DB Error!");
            ex.printStackTrace();
        }
    }//GEN-LAST:event_btnViewDetailsShowRecordsActionPerformed

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
            java.util.logging.Logger.getLogger(ViewAllEmployeeDetailsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewAllEmployeeDetailsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewAllEmployeeDetailsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewAllEmployeeDetailsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewAllEmployeeDetailsFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnViewDetailsBack;
    private javax.swing.JButton btnViewDetailsShowRecords;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtViewDetails;
    private javax.swing.JPanel viewEmployeeDetailsPanel;
    // End of variables declaration//GEN-END:variables
}
