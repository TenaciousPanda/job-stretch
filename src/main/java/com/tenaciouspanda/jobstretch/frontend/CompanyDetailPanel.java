/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tenaciouspanda.jobstretch.frontend;

import com.tenaciouspanda.jobstretch.Session;
import com.tenaciouspanda.jobstretch.database.BusLocations;
import com.tenaciouspanda.jobstretch.database.Business;

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
        jScrollPane1 = new javax.swing.JScrollPane();
        summaryTextBox = new javax.swing.JTextArea();
        dataLabel = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        industryLabel = new javax.swing.JLabel();
        foundedLabel = new javax.swing.JLabel();
        websiteLabel = new javax.swing.JLabel();
        industryLbl = new javax.swing.JLabel();
        foundedLbl = new javax.swing.JLabel();
        websiteLbl = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        locationsListBox = new javax.swing.JList<>();
        jLabel2 = new javax.swing.JLabel();
        addLocationBtn = new javax.swing.JButton();
        businessNameLbl = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Company Profile");

        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        summaryLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        summaryLabel.setText("Summary");

        summaryTextBox.setEditable(false);
        summaryTextBox.setBackground(new java.awt.Color(240, 240, 240));
        summaryTextBox.setColumns(20);
        summaryTextBox.setRows(5);
        summaryTextBox.setBorder(null);
        jScrollPane1.setViewportView(summaryTextBox);

        dataLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        dataLabel.setText("Data");

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        industryLabel.setText("Industry");

        foundedLabel.setText("Founded");

        websiteLabel.setText("Website");

        industryLbl.setText("jLabel2");

        foundedLbl.setText("jLabel2");

        websiteLbl.setText("jLabel2");

        jScrollPane2.setViewportView(locationsListBox);

        jLabel2.setText("Locations");

        addLocationBtn.setText("Add Location");
        addLocationBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addLocationBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 370, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(industryLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(industryLbl))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(foundedLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(foundedLbl))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(websiteLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(websiteLbl)))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(addLocationBtn)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(industryLabel)
                    .addComponent(industryLbl))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(foundedLabel)
                    .addComponent(foundedLbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(websiteLabel)
                    .addComponent(websiteLbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(3, 3, 3)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addLocationBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        businessNameLbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        businessNameLbl.setText("CompanyName");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(138, 138, 138)
                            .addComponent(summaryLabel)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(backButton)
                        .addGap(118, 118, 118)
                        .addComponent(jLabel1)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(dataLabel)
                        .addGap(198, 198, 198))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(61, 61, 61)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(businessNameLbl)))
                        .addGap(0, 10, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backButton)
                    .addComponent(jLabel1)
                    .addComponent(businessNameLbl))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(summaryLabel)
                    .addComponent(dataLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(40, Short.MAX_VALUE))
        );
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
    private javax.swing.JLabel dataLabel;
    private javax.swing.JLabel foundedLabel;
    private javax.swing.JLabel foundedLbl;
    private javax.swing.JLabel industryLabel;
    private javax.swing.JLabel industryLbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
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
