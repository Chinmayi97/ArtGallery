
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
public class Customer {
    private int cus_id;
    private String cus_name;
    private String cus_username;
    private int cus_phone;
    private String cus_password;
    private String cus_address;
    
    public Customer(int Id,String name,String username,int phone,String password,String address)
    {
        cus_id=Id;
        cus_name=name;
        cus_username=username;
        cus_phone=phone;
        cus_password= password;
        cus_address=address;
    }
    public Customer(){}
    
    public int getId()
    {
        return this.cus_id;
    }
    public void setId(int id)
    {
        this.cus_id=id;
    }
    public String getType()
    {
        return this.cus_name;
    }
    public void setType(String name )
    {
        this.cus_name=name;
    }
    public String getTitle()
    {
        return cus_username;
    }
    public void setTitle(String title)
    {
        this.cus_username=title;
    }
    public String getArtist()
    {
        return cus_password;
    }
    public void setArtist(String artist)
    {
        this.cus_password=artist;
    }
    public int getCost()
    {
        return cus_phone;
    }
    public void setCost(int cost)
    {
        this.cus_phone=cost;
    }
    public String getAdd()
    {
        return cus_address;
    }
    public void setAdd(String address)
    {
        this.cus_address=address;
    }
    Connection con;
    ResultSet rs=null;
    PreparedStatement ps=null;
    public ArrayList<Customer> BindTable(){
      ArrayList<Customer> list;
        list = new ArrayList<Customer>();
      con=MySqlConnect.ConnectDB();
      String q1="select * from customer ";
      try{
          ps=con.prepareStatement(q1);
          rs=ps.executeQuery();
           Customer c;
           while(rs.next())
           {
               c=new Customer(rs.getInt("CUS_ID"),rs.getString("CUS_NAME"),rs.getString("CUS_USRNAME"),rs.getInt("CUS_PHONE"),rs.getString("CUS_PASSWORD"),rs.getString("CUS_ADDRESS"));
               list.add(c);
           }   
      }
      catch(Exception e)
      {
          JOptionPane.showMessageDialog(null, e);
      }
      return list;
    }
}
