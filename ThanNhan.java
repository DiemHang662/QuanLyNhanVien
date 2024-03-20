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
public class ThanNhan extends ConNguoi {

    private String moiQuanHe;

    public ThanNhan() {

    }

    public ThanNhan(String maNhanVien, Date ngaySinh, String hoTen, String gioiTinh, String moiQuanHe) {
        super(maNhanVien, ngaySinh, hoTen, gioiTinh);
        this.moiQuanHe = moiQuanHe;
    }

    public ThanNhan(String maNhanVien, String ngaySinh, String hoTen, String gioiTinh, String moiQuanHe) throws ParseException {
        this(maNhanVien, CauHinh.f.parse(ngaySinh), hoTen, gioiTinh, moiQuanHe);
    }

    public void xuatThanNhan() {
        System.out.println();
        System.out.printf("%5s %15s %25s %20s %15s\n", this.getMaNhanVien(), CauHinh.f.format(this.getNgaySinh()), this.getHoTen(), this.getGioiTinh(), this.getMoiQuanHe());
    }

    /**
     * @return the moiQuanHe
     */
    public String getMoiQuanHe() {
        return moiQuanHe;
    }

    /**
     * @param moiQuanHe the moiQuanHe to set
     */
    public void setMoiQuanHe(String moiQuanHe) {
        this.moiQuanHe = moiQuanHe;
    }

}
