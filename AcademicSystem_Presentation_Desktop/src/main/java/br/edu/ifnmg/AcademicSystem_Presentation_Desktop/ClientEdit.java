/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.AcademicSystem_Presentation_Desktop;

import br.edu.ifnmg.AcademicSystem_LogicaAplicacao.Client;
import br.edu.ifnmg.AcademicSystem_LogicaAplicacao.ClientRepository;
import br.edu.ifnmg.AcademicSystem_LogicaAplicacao.RepositoryFactory;
import br.edu.ifnmg.AcademicSystem_LogicaAplicacao.Sex;
import javax.swing.JOptionPane;

/**
 *
 * @author diego
 */
public class ClientEdit extends javax.swing.JInternalFrame {

    private Client client;
    ClientRepository repository = RepositoryFactory.getClientRepository();
    
    /**
     * Creates new form ClientEdit
     */
    public ClientEdit() {
        
        initComponents();
    }
    
    public void setClient(Client client){
        this.client = client;
        this.setComponent();
    }

    public void setComponent(){
        this.lblID.setText(client.getId().toString());
        this.txtCPF.setText(client.getCpf());
        this.txtEmail.setText(client.getEmail());
        this.txtName.setText(client.getName());
        this.txtNeighborhood.setText(client.getNeighborhood());
        this.txtNumberHouse.setText(String.valueOf(client.getNumberhouse()));
        this.txtStreet.setText(client.getStreet());
        this.txttelefone1.setText(client.getTelephone());
        if(client.getSex() == Sex.Female){
            this.cbbSex.setSelectedIndex(1);
        }else{
            this.cbbSex.setSelectedIndex(0);
        }
        if(client.getStatus() == 1){
            this.cbbStatus.setSelectedIndex(0);
        }else{
            this.cbbStatus.setSelectedIndex(1);
        }
    }
    
    public void getComponent(){
        client.setCpf(this.txtCPF.getText());
        client.setEmail(this.txtEmail.getText());
        client.setName(this.txtName.getText());
        client.setNeighborhood(this.txtNeighborhood.getText());
        client.setNumberhouse(Integer.valueOf(this.txtNumberHouse.getText()));
        client.setStreet(this.txtStreet.getText());
        client.setTelephone(this.txttelefone1.getText());
        client.setSex(Sex.valueOf(this.cbbSex.getSelectedItem().toString()));
        if(this.cbbStatus.getSelectedItem().toString() == "Activate"){
            client.setStatus(1);
        }else{
            client.setStatus(0);
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
        lblID = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtCPF = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txttelefone1 = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        txtStreet = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtNeighborhood = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtNumberHouse = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        cbbStatus = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        cbbSex = new javax.swing.JComboBox<>();
        jSeparator2 = new javax.swing.JSeparator();
        btnSave = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        btnRemove = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Client Edit");

        jLabel1.setText("ID:");

        lblID.setText("0");

        jLabel3.setText("Name:");

        jLabel4.setText("CPF:");

        jLabel5.setText("Phone:");

        jLabel6.setText("Email:");

        jLabel7.setText("Street:");

        jLabel8.setText("Neighborhood:");

        jLabel9.setText("Number House:");

        jLabel10.setText("Status:");

        cbbStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Activate", "Deactivate" }));

        jLabel11.setText("Sex:");

        cbbSex.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        btnRemove.setText("Remove");
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtName))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEmail))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtStreet))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtNeighborhood, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtNumberHouse, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(txtCPF))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txttelefone1)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cbbStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cbbSex, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jSeparator2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(lblID)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnSave)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRemove)
                        .addGap(87, 87, 87)
                        .addComponent(btnCancel)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lblID))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(cbbSex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txttelefone1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(cbbStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtStreet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtNeighborhood, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(txtNumberHouse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSave)
                    .addComponent(btnCancel)
                    .addComponent(btnRemove))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        
        if(!this.txtCPF.getText().isEmpty() && !this.txtName.getText().isEmpty()){
            if(JOptionPane.showConfirmDialog(this, "Really want to save?", "Confirm", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION){
                this.getComponent();
                if(repository.Save(client)){
                    JOptionPane.showMessageDialog(this, "Client saved!","Information", JOptionPane.INFORMATION_MESSAGE);
                    if(JOptionPane.showConfirmDialog(this, "Do you want to edit another client?", "Confirm", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION){
                        ClientSelect screen = new ClientSelect();
                        this.getParent().add(screen);
                        screen.setVisible(true);
                        this.setVisible(false);
                    }else{
                        this.setVisible(false);
                    }
                }else{
                    JOptionPane.showMessageDialog(this, "Client is not saved!","Erro", JOptionPane.ERROR_MESSAGE);
                }
            }else{
                JOptionPane.showMessageDialog(this, "Operation canceled!","Information", JOptionPane.INFORMATION_MESSAGE);
            }
        }else{
            JOptionPane.showMessageDialog(null, "The CPF and name must be completed!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
        if(JOptionPane.showConfirmDialog(this, "Do you want to remove a client?", "Confirm", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION){
            if(this.repository.Delete(client)){
                JOptionPane.showMessageDialog(this, "Client removed!","Information", JOptionPane.INFORMATION_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(this, "Client is not removed!","Erro", JOptionPane.ERROR_MESSAGE);
            }
        }else{
            JOptionPane.showMessageDialog(this, "Operation canceled!","Information", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnRemoveActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        if(JOptionPane.showConfirmDialog(this, "Do you really want to cancel?", "Confirm", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION){
            this.setVisible(false);
        }
    }//GEN-LAST:event_btnCancelActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnRemove;
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox<String> cbbSex;
    private javax.swing.JComboBox<String> cbbStatus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblID;
    private javax.swing.JTextField txtCPF;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtNeighborhood;
    private javax.swing.JTextField txtNumberHouse;
    private javax.swing.JTextField txtStreet;
    private javax.swing.JTextField txttelefone1;
    // End of variables declaration//GEN-END:variables
}
