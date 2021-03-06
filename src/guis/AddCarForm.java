/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package guis;

import classesAndInterfaces.Car;
import java.awt.Image;
import javax.swing.ImageIcon;

import classesAndInterfaces.ShowRoomClient;
import classesAndInterfaces.ICarShowRoom;
import com.mysql.cj.protocol.Resultset;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;

public class AddCarForm extends javax.swing.JFrame {

    /**
     * Creates new form ShowRoomForm
     */
    public AddCarForm() {
        initComponents();
        scaledImage();
        setSize(700, 550);        
    }


    public void scaledImage() {
        try {
            ImageIcon icon = new ImageIcon(getClass().getResource("showRoomWallpaper.jpg"));
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
        nameLabel = new javax.swing.JLabel();
        modelLabel = new javax.swing.JLabel();
        colorLabel = new javax.swing.JLabel();
        plateNumberLabel = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        model = new javax.swing.JTextField();
        color = new javax.swing.JTextField();
        plateNumber = new javax.swing.JTextField();
        addButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        imageLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        errorLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        errorLabel.setForeground(new java.awt.Color(255, 51, 51));
        getContentPane().add(errorLabel);
        errorLabel.setBounds(270, 90, 200, 20);

        jLabel1.setFont(new java.awt.Font("NSimSun", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Show Room ");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(281, 11, 189, 42);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Add Car");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(310, 60, 180, 22);

        nameLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        nameLabel.setForeground(new java.awt.Color(255, 255, 255));
        nameLabel.setText("Name");
        getContentPane().add(nameLabel);
        nameLabel.setBounds(180, 130, 90, 17);

        modelLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        modelLabel.setForeground(new java.awt.Color(255, 255, 255));
        modelLabel.setText("Model");
        getContentPane().add(modelLabel);
        modelLabel.setBounds(180, 190, 100, 17);

        colorLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        colorLabel.setForeground(new java.awt.Color(255, 255, 255));
        colorLabel.setText("Color");
        getContentPane().add(colorLabel);
        colorLabel.setBounds(180, 240, 80, 17);

        plateNumberLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        plateNumberLabel.setForeground(new java.awt.Color(255, 255, 255));
        plateNumberLabel.setText("Plate Number");
        getContentPane().add(plateNumberLabel);
        plateNumberLabel.setBounds(130, 300, 100, 17);
        getContentPane().add(name);
        name.setBounds(270, 120, 180, 30);

        model.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modelActionPerformed(evt);
            }
        });
        getContentPane().add(model);
        model.setBounds(270, 180, 180, 30);
        getContentPane().add(color);
        color.setBounds(270, 240, 180, 30);
        getContentPane().add(plateNumber);
        plateNumber.setBounds(270, 290, 180, 30);

        addButton.setText("Add");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });
        getContentPane().add(addButton);
        addButton.setBounds(300, 360, 90, 40);

        backButton.setText("Go Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        getContentPane().add(backButton);
        backButton.setBounds(40, 60, 100, 23);

        imageLabel.setBackground(new java.awt.Color(255, 102, 102));
        imageLabel.setForeground(new java.awt.Color(255, 51, 51));
        imageLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/guis/showRoomWallpaper.jpg"))); // NOI18N
        imageLabel.setText("Rayyan");
        getContentPane().add(imageLabel);
        imageLabel.setBounds(10, 0, 750, 560);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void modelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_modelActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        ShowRoomForm obj = new ShowRoomForm();
        this.dispose();
        obj.setVisible(true);
    }//GEN-LAST:event_backButtonActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        // TODO add your handling code here:
        try {
            if(name.getText().trim().isEmpty() || model.getText().trim().isEmpty() || color.getText().trim().isEmpty() || plateNumber.getText().trim().isEmpty()){
                errorLabel.setText("Please enter all fields !!!");
                return;
            }
            ShowRoomClient client = new ShowRoomClient();
            ICarShowRoom showRoomStub = client.getStub();
            Car car = new Car();
            car.setName(name.getText());
            car.setModel(model.getText());
            car.setColor(color.getText());
            car.setPlateNumber(plateNumber.getText());
            showRoomStub.addCar(car);
            errorLabel.setText("Car Added Successfully....");
            name.setText("");
            model.setText("");
            color.setText("");
            plateNumber.setText("");
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
            java.util.logging.Logger.getLogger(AddCarForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddCarForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddCarForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddCarForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddCarForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JButton backButton;
    private javax.swing.JTextField color;
    private javax.swing.JLabel colorLabel;
    private javax.swing.JLabel errorLabel;
    private javax.swing.JLabel imageLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField model;
    private javax.swing.JLabel modelLabel;
    private javax.swing.JTextField name;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField plateNumber;
    private javax.swing.JLabel plateNumberLabel;
    // End of variables declaration//GEN-END:variables
}
