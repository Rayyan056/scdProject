/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package guis;

import classesAndInterfaces.Car;
import classesAndInterfaces.CollegeClient;
import java.awt.Image;
import javax.swing.ImageIcon;

import classesAndInterfaces.Student;
import classesAndInterfaces.ICollege;
import com.mysql.cj.protocol.Resultset;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;

public class AddStudentForm extends javax.swing.JFrame {

    /**
     * Creates new form ShowRoomForm
     */
    public AddStudentForm() {
        initComponents();
        scaledImage();
        setSize(700, 550);        
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

        errorLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        firstNameLabel = new javax.swing.JLabel();
        lastNameLabel = new javax.swing.JLabel();
        ageLabel = new javax.swing.JLabel();
        regNumberLabel = new javax.swing.JLabel();
        firstName = new javax.swing.JTextField();
        lastName = new javax.swing.JTextField();
        age = new javax.swing.JTextField();
        regNumber = new javax.swing.JTextField();
        addButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        semesterLabel = new javax.swing.JLabel();
        semesterNumber = new javax.swing.JTextField();
        imageLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        errorLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        errorLabel.setForeground(new java.awt.Color(255, 51, 51));
        getContentPane().add(errorLabel);
        errorLabel.setBounds(270, 90, 200, 20);

        jLabel1.setFont(new java.awt.Font("NSimSun", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("College");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(281, 11, 134, 42);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Add Student");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(310, 60, 180, 22);

        firstNameLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        firstNameLabel.setForeground(new java.awt.Color(255, 255, 255));
        firstNameLabel.setText("First Name");
        getContentPane().add(firstNameLabel);
        firstNameLabel.setBounds(180, 130, 90, 17);

        lastNameLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lastNameLabel.setForeground(new java.awt.Color(255, 255, 255));
        lastNameLabel.setText("Last Name");
        getContentPane().add(lastNameLabel);
        lastNameLabel.setBounds(180, 190, 100, 17);

        ageLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ageLabel.setForeground(new java.awt.Color(255, 255, 255));
        ageLabel.setText("Age");
        getContentPane().add(ageLabel);
        ageLabel.setBounds(220, 240, 80, 17);

        regNumberLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        regNumberLabel.setForeground(new java.awt.Color(255, 255, 255));
        regNumberLabel.setText("Reg Number");
        getContentPane().add(regNumberLabel);
        regNumberLabel.setBounds(160, 300, 100, 17);
        getContentPane().add(firstName);
        firstName.setBounds(270, 120, 180, 30);

        lastName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastNameActionPerformed(evt);
            }
        });
        getContentPane().add(lastName);
        lastName.setBounds(270, 180, 180, 30);
        getContentPane().add(age);
        age.setBounds(270, 240, 180, 30);
        getContentPane().add(regNumber);
        regNumber.setBounds(270, 290, 180, 30);

        addButton.setText("Add");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });
        getContentPane().add(addButton);
        addButton.setBounds(300, 420, 90, 40);

        backButton.setText("Go Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        getContentPane().add(backButton);
        backButton.setBounds(40, 60, 100, 23);

        semesterLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        semesterLabel.setForeground(new java.awt.Color(255, 255, 255));
        semesterLabel.setText("Semester Number");
        getContentPane().add(semesterLabel);
        semesterLabel.setBounds(134, 360, 130, 17);
        getContentPane().add(semesterNumber);
        semesterNumber.setBounds(270, 350, 180, 30);

        imageLabel.setBackground(new java.awt.Color(255, 102, 102));
        imageLabel.setForeground(new java.awt.Color(255, 51, 51));
        imageLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/guis/college.jpg"))); // NOI18N
        getContentPane().add(imageLabel);
        imageLabel.setBounds(0, -60, 770, 610);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lastNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lastNameActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        CollegeForm obj = new CollegeForm();
        this.dispose();
        obj.setVisible(true);
    }//GEN-LAST:event_backButtonActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        // TODO add your handling code here:
        try {
            if(firstName.getText().trim().isEmpty() || lastName.getText().trim().isEmpty() || age.getText().trim().isEmpty() || regNumber.getText().trim().isEmpty() || semesterNumber.getText().trim().isEmpty()){
                errorLabel.setText("Please enter all fields !!!");
                return;
            }
            CollegeClient client = new CollegeClient();
            ICollege collegeStub = client.getStub();
            Student student = new Student();
            student.setFirstName(firstName.getText().trim());
            student.setLastName(lastName.getText().trim());
            student.setAge(Integer.parseInt(age.getText()));
            student.setRegNumber(regNumber.getText().trim());
            student.setSemesterNumber(Integer.parseInt(semesterNumber.getText().trim()));
            collegeStub.addStudent(student);
            errorLabel.setText("Student Added Successfully....");
            firstName.setText("");
            lastName.setText("");
            age.setText("");
            regNumber.setText("");
            semesterNumber.setText("");
        } catch (Exception e) {
            errorLabel.setText(e.getMessage());
        }
    }//GEN-LAST:event_addButtonActionPerformed

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
            java.util.logging.Logger.getLogger(AddStudentForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddStudentForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddStudentForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddStudentForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddStudentForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JTextField age;
    private javax.swing.JLabel ageLabel;
    private javax.swing.JButton backButton;
    private javax.swing.JLabel errorLabel;
    private javax.swing.JTextField firstName;
    private javax.swing.JLabel firstNameLabel;
    private javax.swing.JLabel imageLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField lastName;
    private javax.swing.JLabel lastNameLabel;
    private javax.swing.JTextField regNumber;
    private javax.swing.JLabel regNumberLabel;
    private javax.swing.JLabel semesterLabel;
    private javax.swing.JTextField semesterNumber;
    // End of variables declaration//GEN-END:variables
}
