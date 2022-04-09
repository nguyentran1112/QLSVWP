/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;
import java.util.ArrayList;
import java.io.Serializable; //chuyển dữ liệu của object thành các chuỗi byte có thể trả ngược về, ví dụ các thuộc tính trong đối tượng.
import java.util.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;


/**
 * Trần Chí Nguyên 19435411
 * @author LENOVO
 */
public class People implements Serializable{
    public String name;
    private Date birthDate;
    private String address;
    private int phone;
    private int id;
    private String sex;
    private String covid;
  //getter and setter;
    public String getcovid(){
    	return covid;
    }
    public String getsex(){
        return sex;
    }
    public int getid(){
        return id;
    }
    public String getName() {  //constructor mặc định.
        return name;
    }
    
     public Date getbirthDate() {
        return birthDate;
    }
    public String getaddress(){
        
        return address;
    }
    public int getphone(){
        return phone;
    }
    public void setaddress(String address)
    {
        this.address = address;
    }
    public void setphone(int phone){
        
        this.phone = phone;
    }
    public void setName(String name) {  //constructor có tham số.
        this.name = name;
    }
    
    public void setbirthDate(Date birthDate) { //constructor}   
        this.birthDate = birthDate;
    }
    public void setid(int id){
        this.id = id;
    }
    public void setsex(String sex){
        this.sex = sex;
    }
    public void setcovid(String covid) {
    	this.covid = covid;
    }
    public class SV extends People implements Serializable{
        public String mssv;
        public String pass;
        public String user;
        public SV() {
            super();
        }
        public SV(String mssv, String pass,String user) {
            this.mssv = mssv;
            this.pass = pass;
            this.user = user;
        }

        public String getMssv() {
            return mssv;
        }

        public void setMssv(String mssv) {
            this.mssv = mssv;
        }

        public String getPass() {
            return pass;
        }

        public void setPass(String pass) {
            this.pass = pass;
        } 
        public String getUser() {
            return user;
        }

        public void setUser(String user) {
            this.user= user;
        } 
    }
}
