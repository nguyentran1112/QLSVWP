/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package helper;

import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JPasswordField;

/**
 *
 * @author LENOVO
 */
public class DataValidator {
    public static void validateEmty(JTextField field, StringBuilder sb, String errorMessage){
       if(field.getText().equals("")){
            sb.append(errorMessage).append("\n");
            field.setBackground(Color.red);
            field.requestFocus();
       } 
       else{
            field.setBackground(Color.white);
       
       }
        
        
    }
    public static void validateEmty(JPasswordField field, StringBuilder sb, String errorMessage){
       String password = new String(field.getPassword());
        if(password.equals("")){
            sb.append(errorMessage).append("\n");
            field.setBackground(Color.red);
            field.requestFocus();
       } 
       else{
            field.setBackground(Color.white);
       
       }
        
        
    }
    }

