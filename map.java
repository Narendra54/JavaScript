import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import java.sql.*;


public class map extends javax.swing.JFrame {

    public int x,y;
    Connection conn = null;
    ResultSet rs = null;
    //ResultSet rs1 = null;
   // ResultSet rs11 = null;
   // ResultSet rs2 = null;
    //ResultSet rs22 = null;

    Statement s = null;
   // Statement s1 = null;
    PreparedStatement pst = null;
    public map() {
        setVisible(true);
        initComponents();
        conn = javaConnect.ConnectDb();
        jComboBox1.removeAllItems();
        jComboBox2.removeAllItems();
    }

    

    public void update_database(int xcoordi,int ycoordi) throws SQLException{
        try{
            String sql = "Insert into Station(CityName,xCoordinate,yCoordinate) values (?,?,?)";
            pst = conn.prepareStatement(sql);
            pst.setString(1,  JOptionPane.showInputDialog("Name of the Station"));
            pst.setInt(2, xcoordi);
            pst.setInt(3, ycoordi);

            pst.execute();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox();
        jButton2 = new javax.swing.JButton();
        jComboBox2 = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 255, 255));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
        });
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("HONG KONG CAB SERVICE MAP");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(20, 10, 380, 30);

        jButton1.setText("JOIN STATIONS");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(460, 130, 120, 30);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox1);
        jComboBox1.setBounds(440, 80, 80, 30);

        jButton2.setText("DONE ADDING STATIONS");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(150, 290, 160, 30);

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(jComboBox2);
        jComboBox2.setBounds(530, 80, 70, 30);

        jLabel2.setText("JOIN STATIONS");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(470, 50, 80, 20);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 605, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 385, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
        x = evt.getX();
        y = evt.getY();

       this.jPanel1.getGraphics().fillOval(x, y, 10, 10);
        try {
            update_database(x,y);
            JOptionPane.showMessageDialog(null,"Station successfully added!!!");
            
        } catch (SQLException ex) {
            Logger.getLogger(roadMap.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jPanel1MouseClicked

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed

    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int x1=0,y1=0,x2=10,y2=10;
        // Update_table();
        String tmp1 =(String)jComboBox1.getSelectedItem();
            String sql1="select * from station where CityName=?";
           try{
            pst=conn.prepareStatement(sql1);
            pst.setString(1, tmp1);
            rs=pst.executeQuery();
            if(rs.next()){
            String X1 =rs.getString("xCoordinate");
            x1=Integer.parseInt(X1);
            String Y1 =rs.getString("yCoordinate");
            y1=Integer.parseInt(Y1);
            }
            }

           catch(Exception e)
    {
           JOptionPane.showMessageDialog(null, e);

    }
        
        String tmp2 =(String)jComboBox2.getSelectedItem();
            String sql2="select * from station where CityName=?";
           try{
            pst=conn.prepareStatement(sql2);
            pst.setString(1, tmp2);
            rs=pst.executeQuery();
            if(rs.next()){
            String X2 =rs.getString("xCoordinate");
            x2=Integer.parseInt(X2);
            String Y2 =rs.getString("yCoordinate");
            y2=Integer.parseInt(Y2);
            }
            }

           catch(Exception e)
    {
           JOptionPane.showMessageDialog(null, e);

    }
            this.jPanel1.getGraphics().drawLine(x1, y1, x2, y2);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try{

            s = conn.createStatement();
            String query = "select * from station";
            rs = s.executeQuery(query);
            
             while(rs.next()){
                        String city = rs.getString("CityName");

                        jComboBox1.addItem(city);
                        jComboBox2.addItem(city);
                    }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
    * @param args the command line arguments
    */
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

}
