/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.baitaplon.QLDA;

import java.text.ParseException;

/**
 *
 * @author HANG
 */
public class NhanVienQuanLi extends NhanVien {
    private String ngayNhanChuc;
    
    public NhanVienQuanLi(String maNhanVien, String ngaySinh, String hoTen, String eMail, String gioiTinh, String loaiNhanVien,String ngayNhanChuc,String thuocDuAn) throws ParseException{
        
     super(maNhanVien,ngaySinh,hoTen,eMail,gioiTinh,loaiNhanVien,thuocDuAn);
        this.ngayNhanChuc=ngayNhanChuc;
    }

  @Override
    public String layLoaiNhanVien(){
        return "Nhan vien quan li";
    }
 
    @Override
    public double tinhLuong() {
        return luongCoBan;
    }
     
    
    
    
    
    

    /**
     * @return the ngayNhanChuc
     */
    public String getNgayNhanChuc() {
        return ngayNhanChuc;
    }

    /**
     * @param ngayNhanChuc the ngayNhanChuc to set
     */
    public void setNgayNhanChuc(String ngayNhanChuc) {
        this.ngayNhanChuc = ngayNhanChuc;
    }
    
}
