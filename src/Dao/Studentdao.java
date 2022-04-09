/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;
import Model.People.SV;
import Model.People;
import helper.ConnectDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import UI.MainForm;
import java.sql.Date;
import java.util.ArrayList;

/**
 *
 * @author LENOVO
 */
public class Studentdao {
    public boolean insert(SV sv){
   
    String sql = "INSERT INTO SVm(mssv,name,birthDate,phone,address,id,sex)"+
            "VALUES (?,?,?,?,?,?,?)";
    try{
        Connection conn = ConnectDB.openConnection();
        PreparedStatement ps = conn.prepareStatement(sql);
        
            ps.setString(1,sv.getMssv());
            ps.setString(2,sv.getName());
            ps.setDate(3, new Date(sv.getbirthDate().getTime()));
            ps.setInt(4, sv.getphone());
            ps.setString(5,sv.getaddress());
            ps.setInt(6,sv.getid());
            //ps.setString(8,sv.getcovid());
            ps.setString(7,sv.getsex());
            return ps.executeUpdate()>0;//nhan biet co data vao csdl hay khong
          }
        catch (Exception e)
            {
                e.printStackTrace();

            }
         return false; 
    }
public boolean update(SV sv ) throws Exception{
    
   
    String sql = "UPDATE dbo.SVm"+" SET name = ?,birthDate = ?,phone= ?,address = ?,id = ?,sex = ?"+
            " WHERE mssv= ?";
    try(
        Connection conn = ConnectDB.openConnection();
        PreparedStatement ps = conn.prepareStatement(sql);
            ){
            ps.setString(7,sv.getMssv());
            ps.setString(1,sv.getName());
            ps.setDate(2, new Date(sv.getbirthDate().getTime()));
            ps.setInt(3, sv.getphone());
            ps.setString(4,sv.getaddress());
            ps.setInt(5,sv.getid());
            //ps.setString(8,sv.getcovid());
            ps.setString(6,sv.getsex());
            return ps.executeUpdate()>0;//nhan biet co data vao csdl hay khong
          }
         
    }
public boolean delete(String mssv) throws Exception{
    
   
    String sql = "DELETE FROM SVm where mssv = ?";
    try(
        Connection conn = ConnectDB.openConnection();
        PreparedStatement ps = conn.prepareStatement(sql);
        ){
            ps.setString(1, mssv);
            return ps.executeUpdate()>0;//nhan biet co data vao csdl hay khong
        }
   

}
public People.SV findby(String mssv) throws Exception{
    String sql = "SELECT *FROM SVm where mssv = ?";
    try(
        Connection conn = ConnectDB.openConnection();
        PreparedStatement ps = conn.prepareStatement(sql);
        ){
            ps.setString(1, mssv);
           try(ResultSet rs = ps.executeQuery();){
               if(rs.next()){
               People s = new People();
               SV sv = s.new SV();
               sv.setMssv(rs.getString("mssv"));
               sv.setName(rs.getString("name"));
               sv.setbirthDate(rs.getDate("birthDate"));
               sv.setid(rs.getInt("id"));
               sv.setphone(rs.getInt("phone"));
               sv.setsex(rs.getString("sex"));
               sv.setaddress(rs.getString("address"));
               return sv;
               
               }
           }
           return null;

        }
   

}

public ArrayList< People.SV> findallby() throws Exception{
    String sql = "SELECT *FROM SVm ";
    try(
        Connection conn = ConnectDB.openConnection();
        PreparedStatement ps = conn.prepareStatement(sql);
        ){
            
           try(ResultSet rs = ps.executeQuery();){
               ArrayList<People.SV> list = new ArrayList<>();
               while(rs.next()){
               People s = new People();
               SV sv = s.new SV();
               sv.setMssv(rs.getString("mssv"));
               sv.setName(rs.getString("name"));
               sv.setbirthDate(rs.getDate("birthDate"));
               sv.setid(rs.getInt("id"));
               sv.setphone(rs.getInt("phone"));
               sv.setsex(rs.getString("sex"));
               sv.setaddress(rs.getString("address"));
               list.add(sv);
               
               }
               return list;
           }
           

        }
   

}
public ArrayList< People.SV> sapxep() throws Exception{
    String sql = "SELECT *FROM SVm ORDER BY name ASC ";
    try(
        Connection conn = ConnectDB.openConnection();
        PreparedStatement ps = conn.prepareStatement(sql);
        ){
            
           try(ResultSet rs = ps.executeQuery();){
               ArrayList<People.SV> list = new ArrayList<>();
               while(rs.next()){
               People s = new People();
               SV sv = s.new SV();
               sv.setMssv(rs.getString("mssv"));
               sv.setName(rs.getString("name"));
               sv.setbirthDate(rs.getDate("birthDate"));
               sv.setid(rs.getInt("id"));
               sv.setphone(rs.getInt("phone"));
               sv.setsex(rs.getString("sex"));
               sv.setaddress(rs.getString("address"));
               list.add(sv);
               
               }
               return list;
           }
           

        }
   

}
}
    
    

