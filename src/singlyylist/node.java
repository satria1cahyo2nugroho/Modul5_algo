/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singlyylist;

/**
 *
 * @author User
 */
public class node {
protected int data;
    protected node link;
    
    public node()
    {
        link = null;
        data = 0;
    }        
    
    public node(int d,node n)
    {
        data = d;
        link = n;
    }        
    
    public void setLink(node n)
    {
        link = n;
    }        
    
    public void setData(int d)
    {
        data = d;
    }        
    
    public node getLink()
    {
        return link;
    }        
    
    public int getData()
    {
        return data;
    } 
}
