
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.sql.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chinm
 */
public class Query {
    
    Connection con;
    ResultSet rs=null;
    PreparedStatement ps=null;
    public ArrayList<artsdb> BindTable(){
      ArrayList<artsdb> list;
        list = new ArrayList<artsdb>();
      con=MySqlConnect.ConnectDB();
      String q1="select * from arts ";
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
