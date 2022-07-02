/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package guis;

import classesAndInterfaces.Student;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;

import classesAndInterfaces.CollegeClient;
import classesAndInterfaces.ICollege;
import com.mysql.cj.protocol.Resultset;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;

public class CollegeForm extends javax.swing.JFrame {

    /**
     * Creates new form ShowRoomForm
     */
    public CollegeForm() {
        initComponents();
        scaledImage();
        setSize(700, 550);
        buttonsEnabled(false);
        try {
            getStudents();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    public DefaultTableModel getModel() {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("First Name");
        model.addColumn("Last Name");
        model.addColumn("Age");
        model.addColumn("Reg Number");
        model.addColumn("Semester Number");
        return model;
    }

    public void getStudents() {
        try {
            CollegeClient client = new CollegeClient();
            ICollege collegeStub = client.getStub();
            ArrayList<Student> students = collegeStub.getStudents();
            DefaultTableModel model = new DefaultTableModel();
            model = getModel();
            for (Student student : students) {
//                car.display();
                Object[] obj = new Object[]{student.getFirstName(), student.getLastName(), student.getAge(), student.getRegNumber(), student.getSemesterNumber()};
                model.addRow(obj);
            }
            table.setModel(model);
        } catch (RemoteException e) {
            errorLabel.setText(e.getMessage());
            System.err.println(e.getMessage());
        }

    }

    public void buttonsEnabled(Boolean status) {
        deleteButton.setEnabled(status);
        updateButton.setEnabled(status);
    }

    public void scaledImage() {
        try {
            ImageIcon icon = new ImageIcon(getClass().getResource("college.jpg"));
            Image img = icon.getImage();
            Image scaleImg = img.getScaledInstance(imageLabel.getWidth(), imageLabel.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon scaledIcon = new ImageIcon(scaleImg);
            imageLabel.setIcon(scaledIcon);
        } catch (Exception e) {
            System.out.println(e.getMessage());
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
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        addButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();
        errorLabel = new javax.swing.JLabel();
        imageLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("NSimSun", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("College");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(281, 11, 134, 42);

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "First Name", "Last Name", "Age", "Reg Number", "Semester Number"
            }
        ));
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(100, 120, 500, 402);

        addButton.setText("Add Student");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });
        getContentPane().add(addButton);
        addButton.setBounds(110, 80, 120, 30);

        deleteButton.setText("Delete Student");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });
        getContentPane().add(deleteButton);
        deleteButton.setBounds(280, 80, 120, 30);

        updateButton.setText("Update Student");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });
        getContentPane().add(updateButton);
        updateButton.setBounds(440, 80, 130, 30);

        errorLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        errorLabel.setForeground(new java.awt.Color(255, 51, 51));
        getContentPane().add(errorLabel);
        errorLabel.setBounds(330, 60, 0, 0);

        imageLabel.setBackground(new java.awt.Color(255, 102, 102));
        imageLabel.setForeground(new java.awt.Color(255, 51, 51));
        imageLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/guis/college.jpg"))); // NOI18N
        imageLabel.setText("Rayyan");
        getContentPane().add(imageLabel);
        imageLabel.setBounds(0, 0, 750, 560);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    String regNumberSelected = "";

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        // TODO add your handling code here:
        try {
            CollegeClient client = new CollegeClient();
            ICollege collegeStub = client.getStub();
            System.out.println(regNumberSelected);

            collegeStub.deleteStudent(regNumberSelected);
            getStudents();
        } catch (Exception e) {
            System.err.println(e.getMessage());
            errorLabel.setText(e.getMessage());
        }

    }//GEN-LAST:event_deleteButtonActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_updateButtonActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        // TODO add your handling code here:
        AddStudentForm obj = new AddStudentForm();
        this.dispose();
        obj.setVisible(true);
    }//GEN-LAST:event_addButtonActionPerformed
    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        // TODO add your handling code here:
        try {

            buttonsEnabled(true);
            int row = table.getSelectedRow();
            regNumberSelected = table.getModel().getValueAt(row, 3).toString();
        } catch (Exception e) {
            System.err.println(e.getMessage());
            errorLabel.setText(e.getMessage());
        }


    }//GEN-LAST:event_tableMouseClicked

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
            java.util.logging.Logger.getLogger(CollegeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CollegeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CollegeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CollegeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CollegeForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JLabel errorLabel;
    private javax.swing.JLabel imageLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables
}
