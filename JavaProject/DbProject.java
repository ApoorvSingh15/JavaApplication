
package JavaProject;
import java.sql.*;
import java.sql.Connection;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class DbProject extends javax.swing.JFrame {
    static Connection con;
   

    public DbProject() {
        initComponents();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        b1 = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        b4 = new javax.swing.JButton();
        t1 = new java.awt.TextField();
        t2 = new java.awt.TextField();
        t3 = new java.awt.TextField();
        t4 = new java.awt.TextField();
        b5 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        t5 = new java.awt.TextField();
        t6 = new java.awt.TextField();
        b6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("NAME");

        jLabel2.setText("ROLL NO.");

        jLabel3.setText("SECTION");

        jLabel4.setText("ADDRESS");

        b1.setText("INSERT");
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        b2.setText("DELETE");
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });

        b3.setText("SHOW ALL");
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });

        b4.setText("SEARCH");
        b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4ActionPerformed(evt);
            }
        });

        t1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t1ActionPerformed(evt);
            }
        });

        t2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t2ActionPerformed(evt);
            }
        });

        t3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t3ActionPerformed(evt);
            }
        });

        b5.setText("UPDATE");
        b5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b5ActionPerformed(evt);
            }
        });

        jLabel5.setText("NEW NAME");

        jLabel6.setText("NEW ROLL");

        b6.setText("RESET");
        b6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b6MouseClicked(evt);
            }
        });
        b6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(t3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(t2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(t1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(t4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(92, 92, 92))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(b2)
                                .addGap(18, 18, 18)
                                .addComponent(b3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                                .addComponent(b4)
                                .addGap(7, 7, 7))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(b1)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(t6, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                            .addComponent(t5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(20, 20, 20)
                .addComponent(b6)
                .addGap(66, 66, 66))
            .addGroup(layout.createSequentialGroup()
                .addGap(244, 244, 244)
                .addComponent(b5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1)
                                    .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(33, 33, 33)
                                .addComponent(jLabel2))
                            .addComponent(t2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(t3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(t4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(65, 65, 65)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(b1)
                            .addComponent(b2)
                            .addComponent(b3)
                            .addComponent(b4)
                            .addComponent(b6))
                        .addGap(34, 34, 34)
                        .addComponent(jLabel5))
                    .addComponent(t5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(t6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(b5)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void t3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t3ActionPerformed

    private void t1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t1ActionPerformed

    private void t2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t2ActionPerformed

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
    try{
        String name=t1.getText();
     int roll=Integer.parseInt(t2.getText());
     String sec=t3.getText();
     String add=t4.getText();
     PreparedStatement p=con.prepareStatement("insert into record values(?,?,?,?)");
     p.setString(1,name);
     p.setInt(2, roll);
     p.setString(3, sec);
     p.setString(4, add);
     int i=p.executeUpdate();
     if(i>0)
     {
         JOptionPane.showMessageDialog(null,"Record Inserted");
     }
    }
    catch(Exception e)
    {
        System.out.println("Error in Inserting "+e.getMessage());
        JOptionPane.showMessageDialog(null,"Exception");
    }
    }//GEN-LAST:event_b1ActionPerformed

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
       try
       { String n1=t1.getText();
           PreparedStatement pst=con.prepareStatement("delete from record where name=?");
           pst.setString(1,n1);
           int i=pst.executeUpdate();
          if(i>0)
     {
         JOptionPane.showMessageDialog(null,"Record Deleted");
     }  
       }
       catch(Exception e)
       {
           System.out.println("Error in deleting"+e.getMessage());
           JOptionPane.showMessageDialog(null,"Exception");
       }
       
    }//GEN-LAST:event_b2ActionPerformed

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed
       try
       {   String ql="select * from record";
           Statement st=con.createStatement();
           ResultSet rs=st.executeQuery(ql);
            String mm="Name  Roll  Sec   Address      \n";
            while(rs.next())
            {
         mm=mm+rs.getString(1)+"  "+rs.getInt(2)+"  "+rs.getString(3)+"    "+rs.getString(4)+"\n";
            }
            JOptionPane.showMessageDialog(null,mm);
            
       }
       catch(Exception e)
       {
           System.out.println("Error in show all"+e.getMessage());
       }
    }//GEN-LAST:event_b3ActionPerformed

    private void b4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b4ActionPerformed
       try
       {
           if(!t1.getText().equals(""))
       {
        PreparedStatement pst=con.prepareStatement("select * from record where name=?");
        String n=t1.getText();
        pst.setString(1,n);
        ResultSet rs=pst.executeQuery();
        if(rs.next()==false)
        {
        JOptionPane.showMessageDialog(null, "No data Relevant");
        }
        rs.previous();
        while(rs.next())
        {
        JOptionPane.showMessageDialog(null,"Name  Roll  Sec  Address    \n"
           +rs.getString(1)+"  "+rs.getInt(2)+"  "+rs.getString(3)+"  "+rs.getString(4));
        }
       }
       else if(!t2.getText().equals(""))
       {
        PreparedStatement pst=con.prepareStatement("select * from record where Rollno=?");
        int n=Integer.parseInt(t2.getText());
        pst.setInt(1,n);
        ResultSet rs=pst.executeQuery();
        if(rs.next()==false)
        {
        JOptionPane.showMessageDialog(null, "No data Relevant");
        }
        rs.previous();
     while(rs.next())
        {
        JOptionPane.showMessageDialog(null,"Name  Roll  Sec  Address    \n"
           +rs.getString(1)+"  "+rs.getInt(2)+"  "+rs.getString(3)+"  "+rs.getString(4));
        }
       }
       else
       {
       JOptionPane.showMessageDialog(null,"The item must be searched by Rollno or Name");
       }
       }
       catch(Exception e)
       {
           System.out.println("Error in search "+e.getMessage());
       }
    }//GEN-LAST:event_b4ActionPerformed

    private void b5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b5ActionPerformed
      try
      {
          if(!t5.getText().equals(""))
          {
       PreparedStatement pst=con.prepareStatement("Update record set Name=? where Rollno=?");
         pst.setString(1,t5.getText());
         pst.setInt(2, Integer.parseInt(t2.getText()));
         int i=pst.executeUpdate();
         if(i>0)
         {
          JOptionPane.showMessageDialog(null,"Updated");
         }
         else
         {
         JOptionPane.showMessageDialog(null,"Not Updated");
         }
      }
          else
          {PreparedStatement pst=con.prepareStatement("Update record set Rollno=? where Name=?");
         pst.setString(1,t6.getText());
          pst.setString(2, t1.getText());
          int i=pst.executeUpdate();
         if(i>0)
         {
          JOptionPane.showMessageDialog(null,"Updated");
         }
         else
         {
         JOptionPane.showMessageDialog(null,"Not Updated");
         }
          }
      }
      catch(Exception e)
      {
          System.out.println("Error in Update "+e.getMessage());
      }
    }//GEN-LAST:event_b5ActionPerformed

    private void b6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b6ActionPerformed
     
       
        
    }//GEN-LAST:event_b6ActionPerformed

    private void b6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b6MouseClicked
        t1.setText(" ");
        t2.setText(" ");
        t3.setText(" ");
         t4.setText(" ");
         t5.setText(" ");
          t6.setText(" ");
    }//GEN-LAST:event_b6MouseClicked

    public static void main(String args[]) {
        try
        {
      Class.forName("com.mysql.jdbc.Driver");
      con=DriverManager.getConnection("jdbc:mysql://localhost:3306/dbase","root","");
      if(con!=null)
      {
          System.out.println("Connection is Ok");
      }
      else
      {
          System.out.println("Connection not created");
      }
      Statement st=con.createStatement();
      String s="show tables";
      ResultSet rs=st.executeQuery(s);
      Boolean flag=false;
      if(rs.next()==false)
      {
          Statement tt=con.createStatement();
          String cq="create table record(name varchar(20),Rollno int,section char(10),Address varchar(20));";
          tt.executeUpdate(cq);
      }
      else
      {
      rs.previous();
      }
      while(rs.next())
      {
          
      if(!rs.getString(1).equalsIgnoreCase("record"))
      { 
          flag=true;
         
      }
     }
      if(flag)
      {
         Statement tt=con.createStatement();
          String cq="create table record(name varchar(20),Rollno int,section char(10),Address varchar(20));";
          tt.executeUpdate(cq);
      }
     
      
        }
        catch(Exception e)
        {
            System.out.println("Error"+e.getMessage());
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DbProject().setVisible(true);
            }
        });
       
    
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JButton b4;
    private javax.swing.JButton b5;
    private javax.swing.JButton b6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private java.awt.TextField t1;
    private java.awt.TextField t2;
    private java.awt.TextField t3;
    private java.awt.TextField t4;
    private java.awt.TextField t5;
    private java.awt.TextField t6;
    // End of variables declaration//GEN-END:variables
}
