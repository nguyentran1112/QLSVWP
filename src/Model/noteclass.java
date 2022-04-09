/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;
import java.io.Serializable;


/**
 * Chí Nguyên
 * @author LENOVO
 */
public class noteclass implements Serializable{
    private String note;

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public noteclass(String note) {
        this.note = note;
    }

    public noteclass() {
    }
    
}
