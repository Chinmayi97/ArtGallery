
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
public class Purchase {
    private int pur_id;
    private String pur_title;
    private String pur_date;
    private float pur_cost;
    private int pur_arts_id;
    
    public Purchase(int Id,String Title,String date,float Cost,int artsid)
    {
        pur_id=Id;
        pur_title=Title;
        pur_date=date;
        pur_cost= Cost;
        pur_arts_id=artsid;
    }
    
    public Purchase(){}
    
    public int getId()
    {
        return this.pur_id;
    }
    public String getTitle()
    {
        return pur_title;
    }
    public void setTitle(String title)
    {
        this.pur_title=title;
    }
    public String getDate()
    {
        return pur_date;
    }
    public void setDate(String date)
    {
        this.pur_date=date;
    }
    public float getCost()
    {
        return pur_cost;
    }
    public void setCost(float cost)
    {
        this.pur_cost=cost;
    }
    public int getartsid()
    {
        return pur_arts_id;
    }
    public void setartsid(int artsid)
    {
       this.pur_arts_id=artsid;
    }
    
    Connection con;
    ResultSet rs=null;
    PreparedStatement ps=null,ps2=null;
    public ArrayList<Purchase> BindTable(){
      ArrayList<Purchase> list;
        list = new ArrayList<Purchase>();
      con=MySqlConnect.ConnectDB();
      String q2="update purchases,arts set pur_arts_id=ARTS_ID where pur_title=TITLE";
      String q1="select * from purchases ";
      try{
          ps2=con.prepareStatement(q2);
          ps2.execute();
          ps=con.prepareStatement(q1);
          rs=ps.executeQuery();
          
           Purchase a;
           while(rs.next())
           {
               a=new Purchase(rs.getInt("pur_id"),rs.getString("pur_title"),rs.getString("pur_date"),rs.getFloat("pur_cost"),rs.getInt("pur_arts_id"));
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
