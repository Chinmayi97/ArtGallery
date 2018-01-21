
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
public class Sales {
     private int ord_id;
    private int ord_cus_id;
    private int ord_arts_id;
    private String ord_date;
    private float ord_cost;
    
    public Sales(int Id,int cusid,int artsid,String date,float Cost)
    {
        ord_id=Id;
        ord_cus_id=cusid;
        ord_arts_id=artsid;
        ord_date=date;
        ord_cost= Cost;
    }
    
    public Sales(){}
    
    public int getId()
    {
        return this.ord_id;
    }
   
    public int getCus()
    {
        return this.ord_cus_id;
    }
    public String getDate()
    {
        return ord_date;
    }
    public void setDate(String date)
    {
        this.ord_date=date;
    }
    public float getCost()
    {
        return ord_cost;
    }
    public void setCost(float cost)
    {
        this.ord_cost=cost;
    }
    public int getArts()
    {
        return ord_arts_id;
    }
    
    Connection con;
    ResultSet rs=null;
    PreparedStatement ps=null;
    public ArrayList<Sales> BindTable(){
      ArrayList<Sales> list;
        list = new ArrayList<Sales>();
      con=MySqlConnect.ConnectDB();
      String q1="select * from sales";
      try{
          ps=con.prepareStatement(q1);
          rs=ps.executeQuery();
           Sales a;
           while(rs.next())
           {
               a=new Sales(rs.getInt("ord_id"),rs.getInt("ord_cus_id"),rs.getInt("ord_arts_id"),rs.getString("ord_date"),rs.getFloat("ord_cost"));
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
