/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tenaciouspanda.jobstretch.frontend;

import com.tenaciouspanda.jobstretch.Session;
import java.awt.Color;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.Toolkit;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;


/**
 *
 * @author Simon
 */
public class LoginPanel extends CardSubpanel {

    /**
     * Creates new form LoginPanel
     * @param session
     * @param theView
     */
    public LoginPanel(Session session, ViewManager theView) {
        super(session, theView);
        initComponents();
        jLabel5.setIcon(new ImageIcon(this.getClass().getResource("/bg.png")));
        jLabel1.setIcon(new ImageIcon(this.getClass().getResource("/logo.png")));
        loginButton.setIcon(new ImageIcon(this.getClass().getResource("/LoginButton.png")));
        loginButton.setBackground(new Color(0,0,0,0));
        jLabel2.setFont(view.getFont(24));
        jLabel3.setFont(view.getFont(24));
        registerButton.setFont(view.getFont(18));
        loginButton.setFont(view.getFont(24));

    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        usernameInput = new javax.swing.JTextField();
        loginButton = new javax.swing.JButton();
        registerButton = new javax.swing.JButton();
        passwordField = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setLayout(null);

        usernameInput.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        usernameInput.setToolTipText("");
        usernameInput.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        usernameInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameInputActionPerformed(evt);
            }
        });
        add(usernameInput);
        usernameInput.setBounds(350, 360, 200, 30);

        loginButton.setBorderPainted(false);
        loginButton.setContentAreaFilled(false);
        loginButton.setFocusPainted(false);
        loginButton.setPreferredSize(new java.awt.Dimension(312, 71));
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });
        add(loginButton);
        loginButton.setBounds(320, 450, 250, 60);

        registerButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        registerButton.setForeground(new java.awt.Color(255, 153, 51));
        registerButton.setText("Register");
        registerButton.setBorder(null);
        registerButton.setBorderPainted(false);
        registerButton.setContentAreaFilled(false);
        registerButton.setFocusPainted(false);
        registerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerButtonActionPerformed(evt);
            }
        });
        add(registerButton);
        registerButton.setBounds(770, 470, 90, 50);

        passwordField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        passwordField.setToolTipText("");
        passwordField.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        passwordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordFieldActionPerformed(evt);
            }
        });
        add(passwordField);
        passwordField.setBounds(350, 390, 200, 30);

        jLabel2.setFont(new java.awt.Font("Oswald", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Username");
        add(jLabel2);
        jLabel2.setBounds(220, 360, 130, 29);

        jLabel3.setFont(new java.awt.Font("Oswald", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Password");
        add(jLabel3);
        jLabel3.setBounds(220, 390, 130, 30);

        jLabel1.setPreferredSize(new java.awt.Dimension(233, 310));
        add(jLabel1);
        jLabel1.setBounds(330, 20, 233, 310);

        jLabel5.setIcon(new ImageIcon(this.getClass().getResource("/bg.png")));
        jLabel5.setAlignmentY(0.0F);
        add(jLabel5);
        jLabel5.setBounds(0, 0, 867, 544);
    }// </editor-fold>//GEN-END:initComponents

    private void usernameInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameInputActionPerformed

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        view.setStatus("Authenticating...");
        if(session.authenticate(usernameInput.getText(), new String(passwordField.getPassword()))){
            view.displayView("DashboardPanel");
            view.setStatus("Authenticated.");
            usernameInput.setText("");
            passwordField.setText("");
        }else{
            passwordField.setText("");
            view.setStatus("Error Authenticating. Try different credentials.");
        }
           
    }//GEN-LAST:event_loginButtonActionPerformed

    private void registerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerButtonActionPerformed
        view.displayView("RegistrationPanel");
    }//GEN-LAST:event_registerButtonActionPerformed

    private void passwordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordFieldActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton loginButton;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JButton registerButton;
    private javax.swing.JTextField usernameInput;
    // End of variables declaration//GEN-END:variables
}
