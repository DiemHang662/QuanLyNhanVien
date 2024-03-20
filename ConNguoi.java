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
public class ConNguoi {
    protected String maNhanVien,hoTen, gioiTinh;
    protected Date ngaySinh;
    
    public ConNguoi(){
        
    }
    public ConNguoi( String maNhanVien,Date ngaySinh ,String hoTen, String gioiTinh){
        this.maNhanVien=maNhanVien;
        this.ngaySinh=ngaySinh; 
        this.hoTen=hoTen;  
        this.gioiTinh=gioiTinh;
    }
    
    public ConNguoi(String maNhanVien,String ngaySinh,String hoTen, String gioiTinh) throws ParseException{
        this(maNhanVien,CauHinh.f.parse(ngaySinh),hoTen,gioiTinh);
    }
    
    /**
     * @return the hoTen
     */
    public String getHoTen() {
        return hoTen;
    }

    /**
     * @param hoTen the hoTen to set
     */
    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    /**
     * @return the gioiTinh
     */
    public String getGioiTinh() {
        return gioiTinh;
    }

    /**
     * @param gioiTinh the gioiTinh to set
     */
    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    /**
     * @return the ngaySinh
     */
    public Date getNgaySinh() {
        return ngaySinh;
    }

    /**
     * @param ngaySinh the ngaySinh to set
     */
    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    /**
     * @return the maNhanVien
     */
    public String getMaNhanVien() {
        return maNhanVien;
    }

    /**
     * @param maNhanVien the maNhanVien to set
     */
    public void setMaNhanVien(String maNhanVien) {
        this.maNhanVien = maNhanVien;
    }
}
