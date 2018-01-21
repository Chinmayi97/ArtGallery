/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chinm
 */
public class artsdb {
    private int arts_id;
    private int type_id;
    private String arts_title;
    private String artist;
    private float arts_cost;
    private byte[] arts_img;
    
    public artsdb(int Id,int type_Id,String Title,String Artist,float Cost,byte[] Img)
    {
        arts_id=Id;
        type_id=type_Id;
        arts_title=Title;
        artist=Artist;
        arts_cost= Cost;
        arts_img=Img;
    }
    
    public int getId()
    {
        return this.arts_id;
    }
    public void setId(int id)
    {
        this.arts_id=id;
    }
    public int getType()
    {
        return type_id;
    }
    public void setType(int type )
    {
        this.type_id=type;
    }
    public String getTitle()
    {
        return arts_title;
    }
    public void setTitle(String title)
    {
        this.arts_title=title;
    }
    public String getArtist()
    {
        return artist;
    }
    public void setArtist(String artist)
    {
        this.artist=artist;
    }
    public float getCost()
    {
        return arts_cost;
    }
    public void setCost(float cost)
    {
        this.arts_cost=cost;
    }
    public byte[] getImg()
    {
        return arts_img;
    }
}
