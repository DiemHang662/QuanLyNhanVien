/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.baitaplon.QLDA;
import static com.mycompany.baitaplon.QLDA.CauHinh.f;
import static com.mycompany.baitaplon.QLDA.CauHinh.sc;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author HANG
 */


public class NhanVien {
    protected String maNhanVien, hoTen, eMail, gioiTinh;
    private String loaiNhanVien;
    private String thuocDuAn;
    protected Date ngaySinh;
    protected double luongCoBan=8000,heSoLuong;
    
    public NhanVien() {
        
    }
    
    public NhanVien(String maNhanVien) {
        this.maNhanVien = maNhanVien;
    }
    
    public NhanVien(Date ngaySinh){
        this.ngaySinh=ngaySinh;
    }
    
    
    
    public NhanVien(String maNhanVien, Date ngaySinh, String hoTen, String eMail, String gioiTinh, String loaiNhanVien,String thuocDuAn) {
        this.maNhanVien = maNhanVien;
        this.ngaySinh = ngaySinh;
        this.hoTen = hoTen;
        this.eMail = eMail;
        this.gioiTinh = gioiTinh;
        this.loaiNhanVien=loaiNhanVien;
        this.thuocDuAn=thuocDuAn;
    }
    
    public NhanVien(String maNhanVien, String ngaySinh, String hoTen, String eMail, String gioiTinh, String loaiNhanVien,String thuocDuAn) throws ParseException {
        this(maNhanVien, CauHinh.f.parse(ngaySinh),hoTen,eMail,gioiTinh,loaiNhanVien,thuocDuAn);
    }
    
    public void hienThi() {
        System.out.printf("Ma nhan vien: %s\n Ngay sinh: %s\n Ho va ten: %s\nEmail: %s\n Gioi tinh: %s\nLoai nhan vien: %s\nThuoc du an:%s\n", this.getMaNhanVien(), this.ngaySinh, this.hoTen, this.eMail, this.gioiTinh, this.getLoaiNhanVien(),this.getThuocDuAn());
    }

    public void nhapNhanVien() throws ParseException{
        System.out.print("Nhap ma nhan vien: ");
        this.setMaNhanVien(CauHinh.sc.nextLine());           
        System.out.print("Nhap ngay sinh nhan vien(dd/MM/yyyy): ");
        String ngaySinh = CauHinh.sc.nextLine();
        this.setNgaySinh(CauHinh.f.parse(ngaySinh));
        System.out.print("Nhap ho ten nhan vien: ");
       this.setHoTen(CauHinh.sc.nextLine());
       System.out.print("Nhap email nhan vien: ");
       this.seteMail(CauHinh.sc.nextLine());
       System.out.print("Nhap gioi tinh nhan vien: ");
       this.setGioiTinh(CauHinh.sc.nextLine());
       System.out.print("Nhap loai nhan vien: ");
       this.setLoaiNhanVien(CauHinh.sc.nextLine());
        System.out.print("Nhap du an thu: ");
       this.setThuocDuAn(CauHinh.sc.nextLine());
    }
    public void xuatNhanVien(){
        System.out.println();
         System.out.printf("%-5s %24s %22s %20s %12s %25s %35s\n", this.getMaNhanVien(), CauHinh.f.format(this.getNgaySinh()),this.getHoTen(),this.geteMail(),this.getGioiTinh(),this.getLoaiNhanVien(),this.getThuocDuAn());
    }
    
    public void xuatLuong(){
        System.out.println(layTenNhanVien()+"\t ------------ \t"+ layLoaiNhanVien()+"\t ----------- \t"+this.tinhLuong()+"\n");
    }
    
    public String layTenNhanVien(){
        return this.getHoTen();
    }
    
    public String layLoaiNhanVien(){
        return this.getLoaiNhanVien();
    }

public double tinhLuong() {
    return luongCoBan;
}
   
public double heSo(){
    return 1;
}


    public String getMaNhanVien() {
        return maNhanVien;
    }

    /**
     * @param maNhanVien the maNhanVien to set
     */
    public void setMaNhanVien(String maNhanVien) {
        this.maNhanVien = maNhanVien;
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
     * @return the eMail
     */
    public String geteMail() {
        return eMail;
    }

    /**
     * @param eMail the eMail to set
     */
    public void seteMail(String eMail) {
        this.eMail = eMail;
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
     * @return the luongCoBan
     */
    public double getLuongCoBan() {
        return luongCoBan;
    }

    /**
     * @param luongCoBan the luongCoBan to set
     */
    public void setLuongCoBan(double luongCoBan) {
        this.luongCoBan = luongCoBan;
    }

    /**
     * @return the heSoLuong
     */
    public double getHeSoLuong() {
        return heSoLuong;
    }

    /**
     * @param heSoLuong the heSoLuong to set
     */
    public void setHeSoLuong(double heSoLuong) {
        this.heSoLuong = heSoLuong;
    }
    
       /**
     * @return the loaiNhanVien
     */
    public String getLoaiNhanVien() {
        return loaiNhanVien;
    }

    /**
     * @param loaiNhanVien the loaiNhanVien to set
     */
    public void setLoaiNhanVien(String loaiNhanVien) {
        this.loaiNhanVien = loaiNhanVien;
    }
      /**
     * @return the thuocDuAn
     */
    public String getThuocDuAn() {
        return thuocDuAn;
    }

    /**
     * @param thuocDuAn the thuocDuAn to set
     */
    public void setThuocDuAn(String thuocDuAn) {
        this.thuocDuAn = thuocDuAn;
    }


}
