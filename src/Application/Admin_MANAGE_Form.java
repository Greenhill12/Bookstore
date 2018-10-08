package Application;

import CLASS.Books;
import Application.Index_Form;

import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

public class Admin_MANAGE_Form extends javax.swing.JFrame {

    public Admin_MANAGE_Form() {
        initComponents();
        
        populateJtable();
        
        jTable_BOOKLIST_.setShowGrid(true);
        
        jTable_BOOKLIST_.setGridColor(Color.YELLOW);
        
        jTable_BOOKLIST_.setSelectionBackground(Color.gray);
        
        JTableHeader th = jTable_BOOKLIST_.getTableHeader();

        th.setFont(new Font("Tahoma", Font.PLAIN, 16));
    }
    
    // function to populate the jtable with customers data
    public void populateJtable(){
        
        Books book = new Books();
        ArrayList<Books> BooksList = book.booksList();
        
        String[] colNames = {"ID","Name","Author","Year"};
        Object[][] rows = new Object[BooksList.size()][4];
        DefaultTableModel model = (DefaultTableModel) jTable_BOOKLIST_.getModel();
        
        for(int i = 0; i < BooksList.size(); i++){
            rows[i][0] = BooksList.get(i).getId();
            rows[i][1] = BooksList.get(i).getName();
            rows[i][2] = BooksList.get(i).getAuthor();
            rows[i][3] = BooksList.get(i).getYear();
        }
        
        model.setDataVector(rows, colNames);

        jTable_BOOKLIST_.setModel(model);
        jTable_BOOKLIST_.setRowHeight(45);
        jTable_BOOKLIST_.getColumnModel().getColumn(0).setPreferredWidth(50);
        jTable_BOOKLIST_.getColumnModel().getColumn(1).setPreferredWidth(300);
        jTable_BOOKLIST_.getColumnModel().getColumn(2).setPreferredWidth(300);
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_BOOKLIST_ = new javax.swing.JTable();
        jTextField_ID = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField_NAME = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField_AUTHOR = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField_YEAR = new javax.swing.JTextField();
        jButton_INSERT_ = new javax.swing.JButton();
        jButton_REMOVE_ = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 204, 0));

        jTable_BOOKLIST_.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable_BOOKLIST_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_BOOKLIST_MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_BOOKLIST_);

        jTextField_ID.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ID:");

        jLabel4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Name:");

        jTextField_NAME.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Author:");

        jTextField_AUTHOR.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Year:");

        jTextField_YEAR.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jButton_INSERT_.setBackground(new java.awt.Color(30, 130, 76));
        jButton_INSERT_.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jButton_INSERT_.setForeground(new java.awt.Color(255, 255, 255));
        jButton_INSERT_.setText("Insert");
        jButton_INSERT_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_INSERT_ActionPerformed(evt);
            }
        });

        jButton_REMOVE_.setBackground(new java.awt.Color(246, 36, 89));
        jButton_REMOVE_.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jButton_REMOVE_.setForeground(new java.awt.Color(255, 255, 255));
        jButton_REMOVE_.setText("Remove");
        jButton_REMOVE_.setMaximumSize(new java.awt.Dimension(60, 30));
        jButton_REMOVE_.setMinimumSize(new java.awt.Dimension(60, 30));
        jButton_REMOVE_.setPreferredSize(new java.awt.Dimension(60, 30));
        jButton_REMOVE_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_REMOVE_ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel6)
                                .addComponent(jLabel3)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField_NAME, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
                            .addComponent(jTextField_ID, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextField_AUTHOR, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextField_YEAR, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton_REMOVE_, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton_INSERT_, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jTextField_ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jTextField_NAME, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTextField_AUTHOR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jTextField_YEAR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(64, 64, 64)
                        .addComponent(jButton_INSERT_, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton_REMOVE_, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // button delete
    private void jButton_REMOVE_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_REMOVE_ActionPerformed

        try{
            Integer id = Integer.valueOf(jTextField_ID.getText());
            Books.deleteBook(id);
            populateJtable();
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Select a Book Before Removing", "No Book Selected", 1);
        }
    }//GEN-LAST:event_jButton_REMOVE_ActionPerformed

    // button insert
    private void jButton_INSERT_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_INSERT_ActionPerformed

        if(verifFields())
        {
            String name = jTextField_NAME.getText();
            String author = jTextField_AUTHOR.getText();
            Integer year = Integer.valueOf(jTextField_YEAR.getText());

            Books book = new Books(null, name, author, year);
            Books.insertBook(book);
            populateJtable();
        }
    }//GEN-LAST:event_jButton_INSERT_ActionPerformed

    // get selected customer from jtable to textfields
    private void jTable_BOOKLIST_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_BOOKLIST_MouseClicked

        try{

            Integer rowIndex = jTable_BOOKLIST_.getSelectedRow();
            jTextField_ID.setText(jTable_BOOKLIST_.getValueAt(rowIndex, 0).toString());
            jTextField_NAME.setText(jTable_BOOKLIST_.getValueAt(rowIndex, 1).toString());
            jTextField_AUTHOR.setText(jTable_BOOKLIST_.getValueAt(rowIndex, 2).toString());
            jTextField_YEAR.setText(jTable_BOOKLIST_.getValueAt(rowIndex, 3).toString());
           
        }catch(Exception ex){

        }
    }//GEN-LAST:event_jTable_BOOKLIST_MouseClicked

    // function to check empty fields
    public boolean verifFields()
    {
        if(jTextField_NAME.getText().equals("") || jTextField_AUTHOR.getText().equals("") || jTextField_YEAR.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null, "One Or More Fields Are Empty", "Empty Fields", 0);
            return false;
        }else{
            return true;
        }
    } 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_INSERT_;
    private javax.swing.JButton jButton_REMOVE_;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_BOOKLIST_;
    private javax.swing.JTextField jTextField_AUTHOR;
    private javax.swing.JTextField jTextField_ID;
    private javax.swing.JTextField jTextField_NAME;
    private javax.swing.JTextField jTextField_YEAR;
    // End of variables declaration//GEN-END:variables
}
