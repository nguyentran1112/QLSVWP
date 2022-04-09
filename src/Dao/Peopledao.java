/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;
import Model.People;
import Model.People.SV;
import helper.ConnectDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import UI.MainForm;
import java.sql.Date;

/**
 * 19435411_TranChiNguyen
 * @author LENOVO
 */
public  class Peopledao {
    public SV checkLogin(String user, String pass)
    throws Exception{
    String sql = "select *from loginm where us=? and pass=?";
    try(
        Connection conn = ConnectDB.openConnection();
        PreparedStatement ps = conn.prepareStatement(sql);
        ){
            ps.setString(1,user);
            ps.setString(2, pass);
            try(ResultSet rs = ps.executeQuery();){
                if(rs.next()){
                    People s = new People();
                    SV sv = s.new SV();
                    sv.setUser(user);
                    MainForm m = new MainForm();
                    m.show();
                   return sv;
                } 
                }
          }
    return null;
    }  
    public boolean insertus(SV sv){
   
    String sql = "INSERT INTO loginm(us, pass)"+
            "VALUES (?,?)";
    try{
        Connection conn = ConnectDB.openConnection();
        PreparedStatement ps = conn.prepareStatement(sql);
        
            ps.setString(1,sv.getUser());
            ps.setString(2,sv.getPass());
            
            return ps.executeUpdate()>0;//nhan biet co data vao csdl hay khong
          }
        catch (Exception e)
            {
                e.printStackTrace();

            }
         return false; 
    }
}
