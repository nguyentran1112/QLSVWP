/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 * 19435411_Trần Chí Nguyên
 * @author LENOVO
 */
public class GPAclass {
    private String mssv;
    private float OOP,ImageP, PSD, SOC;
    private int ma;

    public String getMssv() {
        return mssv;
    }

    public void setMssv(String mssv) {
        this.mssv = mssv;
    }

    public float getOOP() {
        return OOP;
    }

    public void setOOP(float OOP) {
        this.OOP = OOP;
    }

    public float getImageP() {
        return ImageP;
    }

    public void setImageP(float ImageP) {
        this.ImageP = ImageP;
    }

    public float getPSD() {
        return PSD;
    }

    public void setPSD(float PSD) {
        this.PSD = PSD;
    }

    public float getSOC() {
        return SOC;
    }

    public void setSOC(float SOC) {
        this.SOC = SOC;
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public GPAclass(String mssv, float OOP, float ImageP, float PSD, float SOC, int ma) {
        this.mssv = mssv;
        this.OOP = OOP;
        this.ImageP = ImageP;
        this.PSD = PSD;
        this.SOC = SOC;
        this.ma = ma;
    }

    public GPAclass() {
    }
    
}
