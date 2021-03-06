
import javax.swing.JOptionPane;
import java.sql.*;
import javax.swing.*;
import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.TableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chinm
 */
public class EditArts extends javax.swing.JFrame {
     Connection con=null;
    PreparedStatement ps=null,ps2=null;
    ResultSet rs=null;
    String s;
    /**
     * Creates new form EditArts
     */
    public EditArts() {
        initComponents();
        this.setLocationRelativeTo(null);
        showTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        type = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        title = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        cost = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jButtonSignup = new javax.swing.JButton();
        DELETE = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        artist = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        Browse = new javax.swing.JButton();
        browse = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 77, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Perpetua Titling MT", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("EDIT ARTS");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 50, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/editarts.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, 100, 100));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 140));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 77, 0), 5));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("TYPE:");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, 100, -1));

        type.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        type.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        type.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                typeMouseClicked(evt);
            }
        });
        jPanel3.add(type, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 210, 20));
        jPanel3.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 82, 220, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("TITLE:");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 70, -1));

        title.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        title.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                titleMouseClicked(evt);
            }
        });
        title.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                titleActionPerformed(evt);
            }
        });
        jPanel3.add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, 220, 20));
        jPanel3.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, 220, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("ARTIST:");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, -1, -1));
        jPanel3.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 220, 220, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("COST:");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, 100, -1));

        cost.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cost.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        cost.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                costMouseClicked(evt);
            }
        });
        cost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                costActionPerformed(evt);
            }
        });
        jPanel3.add(cost, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 270, 220, -1));
        jPanel3.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 290, 220, 10));

        jButtonSignup.setText("ADD");
        jButtonSignup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSignupActionPerformed(evt);
            }
        });
        jPanel3.add(jButtonSignup, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 420, -1, -1));

        DELETE.setText("DELETE");
        DELETE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DELETEActionPerformed(evt);
            }
        });
        jPanel3.add(DELETE, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 420, -1, -1));

        jButton1.setText("BACK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 420, -1, -1));

        artist.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        artist.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                artistMouseClicked(evt);
            }
        });
        jPanel3.add(artist, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, 220, -1));

        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ARTS_ID", "TYPE_ID", "TITLE", "ARTIST", "COST", "ARTS_IMG"
            }
        ));
        jTable.setGridColor(new java.awt.Color(255, 153, 51));
        jTable.setRowHeight(300);
        jTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 40, 550, 350));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("IMAGE:");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 305, 50, 30));

        Browse.setText("BROWSE");
        Browse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BrowseActionPerformed(evt);
            }
        });
        jPanel3.add(Browse, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 340, -1, -1));
        jPanel3.add(browse, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 320, 120, 60));

        jButton2.setText("UPDATE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 420, -1, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 1030, 470));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Admin a = new Admin();
        a.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void DELETEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DELETEActionPerformed
        con=MySqlConnect.ConnectDB();
        try{
            String t= title.getText();
            CallableStatement cStmt = con.prepareCall("{call artsdel(?)}");
            cStmt.setString(1,t);

            cStmt.execute();
            JOptionPane.showMessageDialog(null,"Deleted successfully");
            type.setText("");
            title.setText("");
            artist.setText("");
            cost.setText("");
            browse.setIcon(null);
        }
        catch (Exception ex) {
            JOptionPane.showMessageDialog(null,ex);
        }
        showTable();
    }//GEN-LAST:event_DELETEActionPerformed

    public String getDate()
    {
        DateFormat df=new SimpleDateFormat("yyyy/MM/dd");
            Date d=new Date();
            return df.format(d);
    }
    private void jButtonSignupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSignupActionPerformed
        con=MySqlConnect.ConnectDB();
        String q1="insert into arts(ARTS_ID,TYPE_ID,TITLE,ARTIST,ARTS_COST,ARTS_IMG) values(DEFAULT,?,?,?,?,?)";
        String q2="insert into purchases(pur_id,pur_title,pur_date,pur_cost) values(DEFAULT,?,NOW(),?)";
        try{
            ps=con.prepareStatement(q1);
            String i=type.getText();
            if(i.equals("Abstract") || i.equals("abstract") || i.equals("ABSTRACT"))
            ps.setString(1,"1");
            else if(i.equals("Portrait") || i.equals("portrait") || i.equals("PORTRAIT"))
            ps.setString(1,"2");
            else
            JOptionPane.showMessageDialog(null,"Please enter a valid type");
            InputStream is=new FileInputStream(new File(s));
            ps.setString(2,title.getText());
            ps.setString(3,artist.getText());
            ps.setString(4,cost.getText());
            ps.setBlob(5,is);
            ps.execute();
            
            ps2=con.prepareStatement(q2);
            ps2.setString(1,title.getText());
            ps2.setString(2,cost.getText());
            ps2.execute();
            type.setText("");
            title.setText("");
            artist.setText("");
            cost.setText("");
            browse.setIcon(null);
        }
       catch (Exception ex) {
             JOptionPane.showMessageDialog(null,ex);
        }
        showTable();
    }//GEN-LAST:event_jButtonSignupActionPerformed

    private void costActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_costActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_costActionPerformed

    private void titleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_titleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_titleActionPerformed

    private void BrowseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BrowseActionPerformed
       JFileChooser file=new JFileChooser();
       file.setCurrentDirectory(new File(System.getProperty("user.home")));
       FileNameExtensionFilter filter=new FileNameExtensionFilter("*.Images","jpg","gif","png");
       file.addChoosableFileFilter(filter);
       int result=file.showSaveDialog(null);
       if(result==JFileChooser.APPROVE_OPTION)
       {
           File selectedfile= file.getSelectedFile();
           String path=selectedfile.getAbsolutePath();
           browse.setIcon(ResizeImage(path));
           s=path;
       }
       else
       {
           System.out.println("No file selected");
       }
       
    }//GEN-LAST:event_BrowseActionPerformed

    private void jTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableMouseClicked
        int index=jTable.getSelectedRow();
        TableModel model=jTable.getModel();
        String imageName=model.getValueAt(index,0).toString();
        ImageIcon image1=(ImageIcon)jTable.getValueAt(index,5);
        Image image2=image1.getImage().getScaledInstance(browse.getWidth(),browse.getHeight(),Image.SCALE_SMOOTH);
        ImageIcon image3=new ImageIcon(image2);
        browse.setIcon(image3);
        
        String s1=model.getValueAt(index,1).toString();
        String s2=model.getValueAt(index,2).toString();
        String s3=model.getValueAt(index,3).toString();
        String s4=model.getValueAt(index,4).toString();
        if(s1.equals("1"))
            type.setText("Abstract");
        if(s1.equals("2"))
            type.setText("Portrait");
        title.setText(s2);
        artist.setText(s3);
        cost.setText(s4);                                  
    }//GEN-LAST:event_jTableMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        con=MySqlConnect.ConnectDB();
        TableModel m=jTable.getModel();
        int index=jTable.getSelectedRow();
        String q1="update arts set TYPE_ID=?,TITLE=?,ARTIST=?,ARTS_COST=? where ARTS_ID='"+m.getValueAt(index,0).toString()+"'";
        try{
            ps=con.prepareStatement(q1);
            String i=type.getText();
            if(i.equals("Abstract") || i.equals("abstract") || i.equals("ABSTRACT"))
            ps.setString(1,"1");
            else if(i.equals("Portrait") || i.equals("portrait") || i.equals("PORTRAIT"))
            ps.setString(1,"2");
            else
            JOptionPane.showMessageDialog(null,"Please enter a valid type");
            ps.setString(2,title.getText());
            ps.setString(3,artist.getText());
            ps.setString(4,cost.getText());
            

            ps.execute();
        }
        catch (Exception ex) {
            JOptionPane.showMessageDialog(null,ex);
        }
        showTable();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void typeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_typeMouseClicked
        if(type.getText()!=null)
        {
            type.setText("");
            repaint();
            revalidate();
        }
    }//GEN-LAST:event_typeMouseClicked

    private void titleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_titleMouseClicked
        if(title.getText()!=null)
        {
            title.setText("");
            repaint();
            revalidate();
        }
    }//GEN-LAST:event_titleMouseClicked

    private void artistMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_artistMouseClicked
        if(artist.getText()!=null)
        {
            artist.setText("");
            repaint();
            revalidate();
        }
    }//GEN-LAST:event_artistMouseClicked

    private void costMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_costMouseClicked
        if(cost.getText()!=null)
        {
            cost.setText("");
            repaint();
            revalidate();
        }
    }//GEN-LAST:event_costMouseClicked

     public void showTable(){
        Query q=new Query();
        ArrayList<artsdb> list=q.BindTable();
        String[] columnName={"ID","TYPE","TITLE","ARTIST","COST","IMAGE"};
        Object[][] rows=new Object[list.size()][6];
        for(int i=0;i<list.size();i++)
        {
            rows[i][0]=list.get(i).getId();
            rows[i][1]=list.get(i).getType();
            rows[i][2]=list.get(i).getTitle();
            rows[i][3]=list.get(i).getArtist();
            rows[i][4]=list.get(i).getCost();
            if(list.get(i).getImg()!=null)
            {
                ImageIcon image=new ImageIcon(new ImageIcon(list.get(i).getImg()).getImage().getScaledInstance(150,120,Image.SCALE_SMOOTH));
                rows[i][5]=image;
            }
            else
                rows[i][5]=null;
        } 
         
        TheModel model=new TheModel(rows,columnName);
        jTable.setModel(model);
        jTable.setRowHeight(120);
        jTable.getColumnModel().getColumn(5).setPreferredWidth(150);
        
        
    }
     public ImageIcon ResizeImage(String ImagePath)
     {
         ImageIcon MyImage=new ImageIcon(ImagePath);
         Image img=MyImage.getImage();
         Image newImg = img.getScaledInstance(browse.getWidth(),browse.getHeight(),Image.SCALE_SMOOTH);
         ImageIcon image=new ImageIcon(newImg);
         return image;
     }
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
            java.util.logging.Logger.getLogger(EditArts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditArts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditArts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditArts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditArts().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Browse;
    private javax.swing.JButton DELETE;
    private javax.swing.JTextField artist;
    private javax.swing.JLabel browse;
    private javax.swing.JTextField cost;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButtonSignup;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTable jTable;
    private javax.swing.JTextField title;
    private javax.swing.JTextField type;
    // End of variables declaration//GEN-END:variables
}
