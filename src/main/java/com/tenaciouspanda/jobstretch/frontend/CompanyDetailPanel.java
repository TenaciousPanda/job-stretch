/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tenaciouspanda.jobstretch.frontend;

import com.tenaciouspanda.jobstretch.Session;
import com.tenaciouspanda.jobstretch.database.BusLocations;
import com.tenaciouspanda.jobstretch.database.Business;
import java.awt.Color;
import java.awt.Font;
import java.awt.FontFormatException;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

/**
 *
 * @author Simon
 */
public class CompanyDetailPanel extends CardSubpanel {
    
    /**
     * Creates new form CompanyDetailForm
     * @param session
     * @param theView
     */
    public CompanyDetailPanel(Session session, ViewManager theView) {
        super(session, theView);
        initComponents();
        backButton.setIcon(new ImageIcon(this.getClass().getResource("/backButton.png")));
        jPanel2.setBackground(new Color(0,0,0,50));
        addLocationBtn.setIcon(new ImageIcon(this.getClass().getResource("/addLocationButton.png")));

        
        Font sizedFont = view.getFont(32);
        Font sizedFont2 = view.getFont(24);
        Font sizedFont3 = view.getFont(18);
        Font sizedFont4 = view.getFont(14);
        jLabel1.setFont(sizedFont);
        summaryLabel.setFont(sizedFont2);
        businessNameLbl.setFont(sizedFont2);
        industryLabel.setFont(sizedFont3);
        foundedLabel.setFont(sizedFont3);
        websiteLabel.setFont(sizedFont3);
        jLabel2.setFont(sizedFont3);
        industryLbl.setFont(sizedFont4);
        foundedLbl.setFont(sizedFont4);
        websiteLbl.setFont(sizedFont4);
        locationsListBox.setFont(sizedFont4);
        summaryTextBox.setFont(sizedFont4);

    }
    
    @Override
    public void onShow(){
        if(session.getSelected() instanceof Business){
            Business b = (Business)session.getSelected();
            b.update();
            businessNameLbl.setText(b.getName());
            industryLbl.setText(b.getIndustry());
            foundedLbl.setText(b.getFounded().toString());
            websiteLbl.setText(b.getWebsite());
            summaryTextBox.setText(b.getSummary());
            
            BusLocations[] locs = new BusLocations[b.getLocations().size()];
            b.getLocations().toArray(locs);
            locationsListBox.setListData(locs);
            
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
        backButton = new javax.swing.JButton();
        summaryLabel = new javax.swing.JLabel();
        addLocationBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        summaryTextBox = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        industryLabel = new javax.swing.JLabel();
        foundedLabel = new javax.swing.JLabel();
        websiteLabel = new javax.swing.JLabel();
        industryLbl = new javax.swing.JLabel();
        foundedLbl = new javax.swing.JLabel();
        websiteLbl = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        locationsListBox = new javax.swing.JList<BusLocations>();
        jLabel2 = new javax.swing.JLabel();
        businessNameLbl = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setLayout(null);

        jLabel1.setFont(new java.awt.Font("Oswald", 0, 32)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 153, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Company Profile");
        add(jLabel1);
        jLabel1.setBounds(280, 0, 310, 50);

        backButton.setBorderPainted(false);
        backButton.setContentAreaFilled(false);
        backButton.setFocusPainted(false);
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        add(backButton);
        backButton.setBounds(20, 10, 130, 30);

        summaryLabel.setFont(new java.awt.Font("Oswald", 0, 24)); // NOI18N
        summaryLabel.setForeground(new java.awt.Color(255, 255, 255));
        summaryLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        summaryLabel.setText("Summary");
        add(summaryLabel);
        summaryLabel.setBounds(130, 70, 130, 30);

        addLocationBtn.setBorderPainted(false);
        addLocationBtn.setContentAreaFilled(false);
        addLocationBtn.setFocusPainted(false);
        addLocationBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addLocationBtnActionPerformed(evt);
            }
        });
        add(addLocationBtn);
        addLocationBtn.setBounds(630, 410, 176, 36);

        summaryTextBox.setEditable(false);
        summaryTextBox.setBackground(new java.awt.Color(0, 0, 0));
        summaryTextBox.setColumns(20);
        summaryTextBox.setForeground(new java.awt.Color(255, 255, 255));
        summaryTextBox.setRows(5);
        summaryTextBox.setBorder(null);
        jScrollPane1.setViewportView(summaryTextBox);

        add(jScrollPane1);
        jScrollPane1.setBounds(50, 110, 292, 341);

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        industryLabel.setFont(new java.awt.Font("Oswald", 0, 18)); // NOI18N
        industryLabel.setForeground(new java.awt.Color(255, 255, 255));
        industryLabel.setText("Industry");

        foundedLabel.setFont(new java.awt.Font("Oswald", 0, 18)); // NOI18N
        foundedLabel.setForeground(new java.awt.Color(255, 255, 255));
        foundedLabel.setText("Founded");

        websiteLabel.setFont(new java.awt.Font("Oswald", 0, 18)); // NOI18N
        websiteLabel.setForeground(new java.awt.Color(255, 255, 255));
        websiteLabel.setText("Website");

        industryLbl.setFont(new java.awt.Font("Oswald", 0, 14)); // NOI18N
        industryLbl.setForeground(new java.awt.Color(255, 255, 255));
        industryLbl.setText("jLabel2");

        foundedLbl.setFont(new java.awt.Font("Oswald", 0, 14)); // NOI18N
        foundedLbl.setForeground(new java.awt.Color(255, 255, 255));
        foundedLbl.setText("jLabel2");

        websiteLbl.setFont(new java.awt.Font("Oswald", 0, 14)); // NOI18N
        websiteLbl.setForeground(new java.awt.Color(255, 255, 255));
        websiteLbl.setText("jLabel2");

        locationsListBox.setBackground(new java.awt.Color(0, 0, 0));
        locationsListBox.setForeground(new java.awt.Color(255, 255, 255));
        jScrollPane2.setViewportView(locationsListBox);

        jLabel2.setFont(new java.awt.Font("Oswald", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Locations");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 370, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(websiteLabel)
                        .addGap(18, 18, 18)
                        .addComponent(websiteLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(foundedLabel)
                        .addGap(18, 18, 18)
                        .addComponent(foundedLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(industryLabel)
                        .addGap(17, 17, 17)
                        .addComponent(industryLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(industryLabel)
                    .addComponent(industryLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(foundedLabel)
                    .addComponent(foundedLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(websiteLabel)
                    .addComponent(websiteLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(3, 3, 3)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(jPanel2);
        jPanel2.setBounds(400, 110, 407, 290);

        businessNameLbl.setFont(new java.awt.Font("Oswald", 0, 24)); // NOI18N
        businessNameLbl.setForeground(new java.awt.Color(255, 255, 255));
        businessNameLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        businessNameLbl.setText("CompanyName");
        add(businessNameLbl);
        businessNameLbl.setBounds(450, 70, 300, 32);

        jLabel5.setIcon(new ImageIcon(this.getClass().getResource("/bg.png")));
        jLabel5.setAlignmentY(0.0F);
        add(jLabel5);
        jLabel5.setBounds(0, 0, 867, 544);
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        this.view.displayView("DashboardPanel");
    }//GEN-LAST:event_backButtonActionPerformed

    private void addLocationBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addLocationBtnActionPerformed
        this.view.displayView("AddCompanyLocationPanel");
    }//GEN-LAST:event_addLocationBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addLocationBtn;
    private javax.swing.JButton backButton;
    private javax.swing.JLabel businessNameLbl;
    private javax.swing.JLabel foundedLabel;
    private javax.swing.JLabel foundedLbl;
    private javax.swing.JLabel industryLabel;
    private javax.swing.JLabel industryLbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<BusLocations> locationsListBox;
    private javax.swing.JLabel summaryLabel;
    private javax.swing.JTextArea summaryTextBox;
    private javax.swing.JLabel websiteLabel;
    private javax.swing.JLabel websiteLbl;
    // End of variables declaration//GEN-END:variables
}
