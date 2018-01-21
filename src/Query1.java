
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chinm
 */
public class Query1{
    
    Connection con;
    ResultSet rs=null;
    PreparedStatement ps=null;
    public ArrayList<artsdb> BindTable(String i){
      ArrayList<artsdb> list=new ArrayList<artsdb>();
      con=MySqlConnect.ConnectDB();
      String q1="select * from arts where TITLE='"+i+"' or ARTIST='"+i+"'";
      try{
          ps=con.prepareStatement(q1);
          rs=ps.executeQuery();
           artsdb a;
           while(rs.next())
           {
               a=new artsdb(rs.getInt("ARTS_ID"),rs.getInt("TYPE_ID"),rs.getString("TITLE"),rs.getString("ARTIST"),rs.getFloat("ARTS_COST"),rs.getBytes("ARTS_IMG"));
               list.add(a);
           }   
      }
      catch(Exception e)
      {
          JOptionPane.showMessageDialog(null, e);
      }
      return list;
    }
}
