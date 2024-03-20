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
public class KiemThuVien extends NhanVien {
private final double heSo=2.0;
    private int soLoi;

    public KiemThuVien() {

    }

    public KiemThuVien(String maNhanVien, String ngaySinh, String hoTen, String eMail, String gioiTinh, String loaiNhanVien,int soLoi,String thuocDuAn) throws ParseException {
        super(maNhanVien,ngaySinh,hoTen,eMail,gioiTinh,loaiNhanVien,thuocDuAn);
        this.soLoi = soLoi;
    }
    
     @Override
    public String layLoaiNhanVien(){
        return "Kiem thu vien";
    }
 
    @Override
    public double tinhLuong() {
        return luongCoBan*heSo+soLoi*200;
    }
     
     
    
    
    public int getSoLoi() {
        return soLoi;
    }

    /**
     * @param soLoi the soLoi to set
     */
    public void setSoLoi(int soLoi) {
        this.soLoi = soLoi;
    }

   

}
