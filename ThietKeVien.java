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
public class ThietKeVien extends NhanVien {
protected double heSo=1.2;
    private double tienThuong=2000;

    public ThietKeVien() {
     
    }

    public ThietKeVien(String maNhanVien, String ngaySinh, String hoTen, String eMail, String gioiTinh, String loaiNhanVien,String thuocDuAn) throws ParseException {
        super(maNhanVien,ngaySinh,hoTen,eMail,gioiTinh,loaiNhanVien,thuocDuAn);
        this.tienThuong = tienThuong;
    }

    
      @Override
    public String layLoaiNhanVien(){
        return "Thiet ke vien";
    }
 
    @Override
    public double tinhLuong() {
        return luongCoBan*heSo+tienThuong;
    }
     
     

    
    
    /**
     * @return the tienThuong
     */
    public double getTienThuong() {
        return tienThuong;
    } 

    /**
     * @param tienThuong the tienThuong to set
     */
    public void setTienThuong(double tienThuong) {
        this.tienThuong = tienThuong;
    }

    //@Override
   
}
