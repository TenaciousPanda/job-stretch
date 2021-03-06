/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tenaciouspanda.jobstretch.frontend;

import com.tenaciouspanda.jobstretch.Session;
import java.awt.Font;
import java.awt.FontFormatException;
import java.io.IOException;
import java.io.InputStream;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

/**
 *
 * @author Simon
 */
public class AddCompanyPanel extends CardSubpanel {

    final private String[] years = new String[220];
    {
        for(int i=0; i < 220; i++){
            years[i] = "" + (2016 - i);
        }
    }

    /**
     * Creates new form AddCompanyPanel
     */
    public AddCompanyPanel(Session session, ViewManager theView) {
        super(session, theView);
        initComponents();
        foundedYearComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(years));
        backBtn1.setIcon(new ImageIcon(this.getClass().getResource("/addCompanyButton.png")));
        backBtn.setIcon(new ImageIcon(this.getClass().getResource("/backButton.png")));
        
        registrationLabel.setFont(view.getFont(32));
        jLabel1.setFont(view.getFont(24));
        jLabel2.setFont(view.getFont(24));
        jLabel3.setFont(view.getFont(24));
        jLabel4.setFont(view.getFont(24));
        jLabel5.setFont(view.getFont(24));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        foundedMonthComboBox = new javax.swing.JComboBox<String>();
        foundedYearComboBox = new javax.swing.JComboBox<String>();
        foundedDayComboBox = new javax.swing.JComboBox<String>();
        backBtn = new javax.swing.JButton();
        registrationLabel = new javax.swing.JLabel();
        backBtn1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        businessNameField = new javax.swing.JTextField();
        industryField = new javax.swing.JTextField();
        websiteField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        summaryField = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();

        setLayout(null);

        foundedMonthComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
        foundedMonthComboBox.setToolTipText("");
        foundedMonthComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                foundedMonthComboBoxActionPerformed(evt);
            }
        });
        add(foundedMonthComboBox);
        foundedMonthComboBox.setBounds(330, 300, 40, 30);

        foundedYearComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2016" }));
        add(foundedYearComboBox);
        foundedYearComboBox.setBounds(380, 300, 60, 30);

        foundedDayComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        add(foundedDayComboBox);
        foundedDayComboBox.setBounds(280, 300, 40, 30);

        backBtn.setBorderPainted(false);
        backBtn.setContentAreaFilled(false);
        backBtn.setFocusPainted(false);
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        add(backBtn);
        backBtn.setBounds(10, 10, 140, 40);

        registrationLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        registrationLabel.setForeground(new java.awt.Color(255, 153, 51));
        registrationLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        registrationLabel.setText("Add Company");
        add(registrationLabel);
        registrationLabel.setBounds(300, 30, 270, 50);

        backBtn1.setBorderPainted(false);
        backBtn1.setContentAreaFilled(false);
        backBtn1.setFocusPainted(false);
        backBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtn1ActionPerformed(evt);
            }
        });
        add(backBtn1);
        backBtn1.setBounds(560, 450, 220, 50);

        jLabel1.setFont(new java.awt.Font("Oswald", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Business Name");
        add(jLabel1);
        jLabel1.setBounds(90, 160, 180, 30);

        jLabel2.setFont(new java.awt.Font("Oswald", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Industry");
        add(jLabel2);
        jLabel2.setBounds(90, 230, 170, 30);

        jLabel3.setFont(new java.awt.Font("Oswald", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Date Founded");
        add(jLabel3);
        jLabel3.setBounds(90, 300, 170, 30);

        jLabel4.setFont(new java.awt.Font("Oswald", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Website");
        add(jLabel4);
        jLabel4.setBounds(90, 360, 120, 40);

        jLabel5.setFont(new java.awt.Font("Oswald", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Summary");
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(jLabel5);
        jLabel5.setBounds(590, 90, 130, 50);

        businessNameField.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        add(businessNameField);
        businessNameField.setBounds(280, 160, 206, 30);

        industryField.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        add(industryField);
        industryField.setBounds(280, 230, 206, 30);

        websiteField.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        add(websiteField);
        websiteField.setBounds(280, 370, 206, 30);

        jScrollPane1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        summaryField.setColumns(20);
        summaryField.setRows(5);
        jScrollPane1.setViewportView(summaryField);

        add(jScrollPane1);
        jScrollPane1.setBounds(540, 150, 230, 250);

        jLabel6.setIcon(new ImageIcon(this.getClass().getResource("/bg.png")));
        jLabel6.setAlignmentY(0.0F);
        add(jLabel6);
        jLabel6.setBounds(0, 0, 870, 544);
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        view.displayView("DashboardPanel");
    }//GEN-LAST:event_backBtnActionPerformed

    private void backBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtn1ActionPerformed
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        Date foundedDate = null;
        try{
            foundedDate = df.parse(
                foundedYearComboBox.getSelectedItem() + "-" +
                foundedMonthComboBox.getSelectedItem() + "-" +
                foundedDayComboBox.getSelectedItem()
            );
        }catch(ParseException e){
            view.setStatus("Unexpected error parsing date");
            return;
        }
        int status = session.addNewBusiness(
                businessNameField.getText(),
                industryField.getText(),
                foundedDate,
                websiteField.getText(),
                summaryField.getText()
        );
        if(status == 0)
            view.displayView("DashboardPanel");
        else
            view.setStatus("Error adding company CODE:" + status);
    }//GEN-LAST:event_backBtn1ActionPerformed

    private void foundedMonthComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_foundedMonthComboBoxActionPerformed
        switch(foundedMonthComboBox.getSelectedIndex()+1) {
            case 1: case 3: case 5:
            case 7: case 8: case 10:
            case 12:
            foundedDayComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
            break;
            case 4: case 6:
            case 9: case 11:
            foundedDayComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30" }));
            break;
            case 2:
            if ((Integer.parseInt(foundedYearComboBox.getSelectedItem().toString()) % 4 == 0)) {
                foundedDayComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29"}));
                break;
            }
            foundedDayComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28"}));
            break;
            default:
            foundedDayComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        }
    }//GEN-LAST:event_foundedMonthComboBoxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JButton backBtn1;
    private javax.swing.JTextField businessNameField;
    private javax.swing.JComboBox<String> foundedDayComboBox;
    private javax.swing.JComboBox<String> foundedMonthComboBox;
    private javax.swing.JComboBox<String> foundedYearComboBox;
    private javax.swing.JTextField industryField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel registrationLabel;
    private javax.swing.JTextArea summaryField;
    private javax.swing.JTextField websiteField;
    // End of variables declaration//GEN-END:variables
}
