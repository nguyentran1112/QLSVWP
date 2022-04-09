/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import Model.People;
import helper.ConnectDB;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import Model.GPAclass;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author LENOVO
 */
public class GPAdao {
    public boolean insert(GPAclass gp){
   
    String sql = "INSERT INTO Learn(mssv,OOP,ImageP,PSD,SOC)"+
            "VALUES (?,?,?,?,?)";
    try{
        Connection conn = ConnectDB.openConnection();
        PreparedStatement ps = conn.prepareStatement(sql);
        
            ps.setString(1,gp.getMssv());
            ps.setFloat(2,gp.getOOP());
            ps.setFloat(3, gp.getImageP());
            ps.setFloat(4, gp.getPSD());
            ps.setFloat(5,gp.getSOC());
            
            return ps.executeUpdate()>0;//nhan biet co data vao csdl hay khong
          }
        catch (Exception e)
            {
                e.printStackTrace();

            }
         return false; 
    
}
    public boolean update(GPAclass gp){
   
    String sql = "update Learn" + " set OOP= ?,ImageP= ?,PSD= ?,SOC= ?" +
            " where mssv= ?";
    try{
        Connection conn = ConnectDB.openConnection();
        PreparedStatement ps = conn.prepareStatement(sql);
        
            ps.setString(5,gp.getMssv());
            ps.setFloat(1,gp.getOOP());
            ps.setFloat(2, gp.getImageP());
            ps.setFloat(3, gp.getPSD());
            ps.setFloat(4,gp.getSOC());
            
            return ps.executeUpdate()>0;//nhan biet co data vao csdl hay khong
          }
        catch (Exception e)
            {
                e.printStackTrace();

            }
         return false; 
    
}
    public boolean deleteby(String mssv){
   
    String sql = "delete from Learn where mssv= ?";
    try{
        Connection conn = ConnectDB.openConnection();
        PreparedStatement ps = conn.prepareStatement(sql);
        
           ps.setString(1, mssv);
            
            return ps.executeUpdate()>0;//nhan biet co data vao csdl hay khong
          }
        catch (Exception e)
            {
                e.printStackTrace();

            }
         return false; 
    
}
    public GPAclass findby(String mssv)throws Exception{
   
    String sql = "select *from Learn where mssv= ?";
    try(
        Connection conn = ConnectDB.openConnection();
        PreparedStatement ps = conn.prepareStatement(sql);
            ){
           ps.setString(1, mssv);
           try(ResultSet rs = ps.executeQuery();){
               if(rs.next()){ //co du lieu trong bd hay k
                  GPAclass gp = new GPAclass();
                  gp.setMa(rs.getInt("ma"));
                  gp.setMssv(rs.getString("mssv"));
                  gp.setOOP(rs.getFloat("OOP"));
                  gp.setPSD(rs.getFloat("PSD"));
                  gp.setSOC(rs.getFloat("SOC"));
                  gp.setImageP(rs.getFloat("ImageP"));
                  return gp;
               }
           }
           return null;
        }  
    }
    public ArrayList< GPAclass > findallby() throws Exception{
    String sql = "SELECT *FROM Learn";
    try(
        Connection conn = ConnectDB.openConnection();
        PreparedStatement ps = conn.prepareStatement(sql);
        ){
            
           try(ResultSet rs = ps.executeQuery();){
               ArrayList<GPAclass> list = new ArrayList<>();
               //GPAclass gp = new GPAclass();
                  while(rs.next()){ //co du lieu trong bd hay k
                  GPAclass gp = new GPAclass();
                  gp.setMa(rs.getInt("ma"));
                  gp.setMssv(rs.getString("mssv"));
                  gp.setOOP(rs.getFloat("OOP"));
                  gp.setPSD(rs.getFloat("PSD"));
                  gp.setSOC(rs.getFloat("SOC"));
                  gp.setImageP(rs.getFloat("ImageP"));
                  list.add(gp);list.add(gp);
               } 
               return list;
               }   
           }
           
        }
    public ArrayList< GPAclass > findtopby(int top) throws Exception{
    String sql = "SELECT top "+ top +" *, (OOP + PSD + ImageP + SOC)/4 as AVG" + " from Learn order by AVG desc ";
    try(
        Connection conn = ConnectDB.openConnection();
        PreparedStatement ps = conn.prepareStatement(sql);
        ){
            
           try(ResultSet rs = ps.executeQuery();){
               ArrayList<GPAclass> list = new ArrayList<>();
                  while(rs.next()){ 
                  GPAclass gp = new GPAclass();
                  gp.setMa(rs.getInt("ma"));
                  gp.setMssv(rs.getString("mssv"));
                  gp.setOOP(rs.getFloat("OOP"));
                  gp.setPSD(rs.getFloat("PSD"));
                  gp.setSOC(rs.getFloat("SOC"));
                  gp.setImageP(rs.getFloat("ImageP"));
                  list.add(gp);
               } 
               return list;
               }   
           }
           
        }

}
