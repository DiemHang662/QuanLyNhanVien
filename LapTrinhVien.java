/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.baitaplon.QLDA;

import java.text.ParseException;
import java.util.Date;

/**
 *
 * @author HANG
 */
public class LapTrinhVien extends NhanVien {

    private double luongOT=5000;
    
    protected double heSo=3.5;

    public LapTrinhVien() {
    }

    public LapTrinhVien(String maNhanVien, String ngaySinh, String hoTen, String eMail, String gioiTinh, String loaiNhanVien,String thuocDuAn) throws ParseException {
     super(maNhanVien,ngaySinh,hoTen,eMail,gioiTinh,loaiNhanVien,thuocDuAn);
        this.luongOT = luongOT;
    }

  @Override
    public String layLoaiNhanVien(){
        return "Lap trinh vien";
    }
 
    @Override
    public double tinhLuong() {
        return luongCoBan*heSo+luongOT;
    }
     

     

    /**
     * @return the luongOT
     */
    public double getLuongOT() {
        return luongOT;
    }

    /**
     * @param luongOT the luongOT to set
     */
    public void setLuongOT(double luongOT) {
        this.luongOT = luongOT;
    } 

}
