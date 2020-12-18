/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.AcademicSystem_Presentation_Desktop;

import br.edu.ifnmg.AcademicSystem_LogicaAplicacao.Client;
import br.edu.ifnmg.AcademicSystem_LogicaAplicacao.ClientRepository;
import br.edu.ifnmg.AcademicSystem_LogicaAplicacao.ProductRepository;
import br.edu.ifnmg.AcademicSystem_LogicaAplicacao.Purchase;
import br.edu.ifnmg.AcademicSystem_LogicaAplicacao.PurchaseRepository;
import br.edu.ifnmg.AcademicSystem_LogicaAplicacao.RepositoryFactory;
import br.edu.ifnmg.AcademicSystem_LogicaAplicacao.Sale;
import br.edu.ifnmg.AcademicSystem_LogicaAplicacao.SaleRepository;
import br.edu.ifnmg.AcademicSystem_LogicaAplicacao.Supplier;
import br.edu.ifnmg.AcademicSystem_LogicaAplicacao.SupplierRepository;
import br.edu.ifnmg.AcademicSystem_LogicaAplicacao.User;
import br.edu.ifnmg.AcademicSystem_LogicaAplicacao.UserRepository;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author diego
 */
public class PurchaseSaleSearch extends javax.swing.JInternalFrame {

    PurchaseRepository repositoryPurchase = RepositoryFactory.getPurchaseRepository();
    SupplierRepository repositorySupplier = RepositoryFactory.getSupplierRepository();
    ProductRepository repositoryProduct = RepositoryFactory.getProductRepository();
    ClientRepository repositoryClient = RepositoryFactory.getClientRepository();
    SaleRepository repositorySale = RepositoryFactory.getSaleRepository();
    UserRepository repositoryUser = RepositoryFactory.getUserRepository();
    
    private Supplier supplier;
    private User user;
    private Purchase purchase;
    private Sale sale;
    private Client client;
    
    /**
     * Creates new form PurchaseSaleSearch
     */
    public PurchaseSaleSearch() {
        this.supplier = new Supplier();
        this.user = new User();
        this.client =  new Client();
        this.purchase = new Purchase();
        this.sale = new Sale();
        
        initComponents();
    }

    public void setSale(List<Sale> list){
        
        
        DefaultTableModel model = new DefaultTableModel();
        
        model.addColumn("Type");
        model.addColumn("Date");
        model.addColumn("User");
        model.addColumn("Client");
        model.addColumn("Supplier");
        model.addColumn("Value");
        
        for(Sale item : list){
            Vector line = new Vector();
            line.add("Sale");
            line.add(item.getDatetime().toString());
            line.add(item.getUser().getName());
            line.add(item.getClient().getName());
            line.add("");
            line.add(item.getTotalvalue());
            
            model.addRow(line);
        }
        this.tblTransaction.setModel(model);
    }
    
    public void setPurchase(List<Purchase> list){
        
        
        DefaultTableModel model = new DefaultTableModel();
        
        model.addColumn("Type");
        model.addColumn("Date");
        model.addColumn("User");
        model.addColumn("Client");
        model.addColumn("Supplier");
        model.addColumn("Value");
        
        for(Purchase item : list){
            Vector line = new Vector();
            line.add("Purchase");
            line.add(item.getDatetime().toString());
            line.add(item.getUser().getName());
            line.add("");
            line.add(item.getSupplier().getName());
            line.add(item.getTotalvalue());
            
            model.addRow(line);
        }
        this.tblTransaction.setModel(model);
    }
    
    public void setAll(List<Purchase> list, List<Sale> lists){
        
        
        DefaultTableModel model = new DefaultTableModel();
        
        model.addColumn("Type");
        model.addColumn("Date");
        model.addColumn("User");
        model.addColumn("Client");
        model.addColumn("Supplier");
        model.addColumn("Value");
        
        for(Purchase item : list){
            Vector line = new Vector();
            line.add("Purchase");
            line.add(item.getDatetime().toString());
            line.add(item.getUser().getName());
            line.add("");
            line.add(item.getSupplier().getName());
            line.add(item.getTotalvalue());
            
            model.addRow(line);
        }
        for(Sale item : lists){
            Vector line = new Vector();
            line.add("Sale");
            line.add(item.getDatetime().toString());
            line.add(item.getUser().getName());
            line.add(item.getClient().getName());
            line.add("");
            line.add(item.getTotalvalue());
            
            model.addRow(line);
        }
        this.tblTransaction.setModel(model);
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
        txtUser = new javax.swing.JTextField();
        btnPurchase = new javax.swing.JButton();
        btnSale = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTransaction = new javax.swing.JTable();
        btnAll = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Search Transaction");

        jLabel1.setText("User ID:");

        btnPurchase.setText("Purchase");
        btnPurchase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPurchaseActionPerformed(evt);
            }
        });

        btnSale.setText("Sale");
        btnSale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaleActionPerformed(evt);
            }
        });

        tblTransaction.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Type", "Date", "User", "Client", "Supplier", "Value"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Float.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblTransaction);
        if (tblTransaction.getColumnModel().getColumnCount() > 0) {
            tblTransaction.getColumnModel().getColumn(0).setResizable(false);
            tblTransaction.getColumnModel().getColumn(1).setResizable(false);
            tblTransaction.getColumnModel().getColumn(2).setResizable(false);
            tblTransaction.getColumnModel().getColumn(3).setResizable(false);
            tblTransaction.getColumnModel().getColumn(4).setResizable(false);
            tblTransaction.getColumnModel().getColumn(5).setResizable(false);
        }

        btnAll.setText("All");
        btnAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAllActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtUser)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(btnPurchase)
                .addGap(128, 128, 128)
                .addComponent(btnAll)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSale)
                .addGap(33, 33, 33))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 502, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPurchase)
                    .addComponent(btnSale)
                    .addComponent(btnAll))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPurchaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPurchaseActionPerformed

            List<Purchase> list = repositoryPurchase.SearchAll();
            List<Purchase> listP = new ArrayList<>();
            int value = 0;
            
            if(!this.txtUser.getText().isEmpty()){
                User user = this.repositoryUser.Open(Long.valueOf(this.txtUser.getText()));
                if(user != null){
                    for(Purchase purchase : list){
                        if(purchase.getUser().getId().equals(Long.valueOf(this.txtUser.getText()))){
                            value = 1;
                            listP.add(purchase);
                            System.out.println(purchase.getUser().getId());
                        }
                    }
                }
            }
            
            if(value == 1){
                this.setPurchase(listP);
                
            }else{
                this.setPurchase(list);
            
            }
    }//GEN-LAST:event_btnPurchaseActionPerformed

    private void btnSaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaleActionPerformed

            List<Sale> list = repositorySale.SearchAll();
            List<Sale> listP = new ArrayList<>();
            int value = 0;
            
            if(!this.txtUser.getText().isEmpty()){
                User user = this.repositoryUser.Open(Long.valueOf(this.txtUser.getText()));
                if(user != null){
                    for(Sale sale : list){
                        if(sale.getUser().getId().equals(Long.valueOf(this.txtUser.getText()))){
                            value = 1;
                            listP.add(sale);
                            System.out.println(sale.getUser().getId());
                        }
                    }
                }
            }
            
            if(value == 1){
                this.setSale(listP);
                
            }else{
                this.setSale(list);
            
           }
    }//GEN-LAST:event_btnSaleActionPerformed

    private void btnAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAllActionPerformed
        
        
        List<Purchase> list = repositoryPurchase.SearchAll();
        List<Sale> lists = repositorySale.SearchAll();
            List<Purchase> listP = new ArrayList<>();
            List<Sale> listS = new ArrayList<>();
            int value = 0;
            int valueb = 0;
            
            if(!this.txtUser.getText().isEmpty()){
                User user = this.repositoryUser.Open(Long.valueOf(this.txtUser.getText()));
                if(user != null){
                    for(Purchase purchase : list){
                        if(purchase.getUser().getId().equals(Long.valueOf(this.txtUser.getText()))){
                            value = 1;
                            listP.add(purchase);
                            System.out.println(purchase.getUser().getId());
                        }
                    }
                    for(Sale sale : lists){
                        if(sale.getUser().getId().equals(Long.valueOf(this.txtUser.getText()))){
                            valueb = 1;
                            listS.add(sale);
                            System.out.println(sale.getUser().getId());
                        }
                    }
                    
                }
            }
            
            if(value == 1 && valueb == 1){
                this.setAll(listP,listS);
            }    
            if(value == 1 && valueb == 0){
                this.setAll(listP,lists);
            }
            if(value == 0 && valueb == 1){
                this.setAll(list,listS);
            }  
            if(value == 0 && valueb == 0){
                this.setAll(list,lists);
            }  
        
    }//GEN-LAST:event_btnAllActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAll;
    private javax.swing.JButton btnPurchase;
    private javax.swing.JButton btnSale;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblTransaction;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
