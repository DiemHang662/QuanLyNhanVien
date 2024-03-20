/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.baitaplon.QLDA;

import java.text.ParseException;
import java.util.Date;

public class DuAn {

    private String maDuAn;
    private String tenDuAn;
    private Date tgBatDau, tgKetThuc;
    private double tongKinhPhi;
    private String nguoiChuNhiem;

    public DuAn() {
    }

    public DuAn(String maDuAn) {
        this.maDuAn = maDuAn;
    }
   

    public DuAn(String maDuAn, String tenDuAn, Date tgBatDau, Date tgKetThuc, double tongKinhPhi, String nguoiChuNhiem) {
        this.maDuAn = maDuAn;
        this.tenDuAn = tenDuAn;
        this.tgBatDau = tgBatDau;
        this.tgKetThuc = tgKetThuc;
        this.tongKinhPhi = tongKinhPhi;
        this.nguoiChuNhiem = nguoiChuNhiem;
    }
    
     public DuAn(String maDuAn, String tenDuAn, String tgBatDau, String tgKetThuc, double tongKinhPhi, String nguoiChuNhiem) throws ParseException {
        this(maDuAn, tenDuAn, CauHinh.f.parse(tgBatDau), CauHinh.f.parse(tgKetThuc), tongKinhPhi, nguoiChuNhiem);
    }

    public void nhapDuAn() throws ParseException {
        System.out.print("Nhap ma du an: ");
        this.setMaDuAn(CauHinh.sc.nextLine());
        System.out.print("Nhap ten du an: ");
        this.setTenDuAn(CauHinh.sc.nextLine());
        System.out.print("Nhap thoi gian bat dau(dd/MM/yyyy): ");
        String bd = CauHinh.sc.nextLine();
        this.setTgBatDau(CauHinh.f.parse(bd));
        System.out.print("Nhap thoi gian ket thuc(dd/MM/yyyy): ");
        String kt = CauHinh.sc.nextLine();
        this.setTgKetThuc(CauHinh.f.parse(kt));
        System.out.print("Nhap tong kinh phi: ");
        this.setTongKinhPhi(CauHinh.sc.nextDouble());
        System.out.print("Nhap ten nguoi chu nhiem: ");
        this.setNguoiChuNhiem(CauHinh.sc.nextLine());
                
    }

    public void xuatDuAn() {
        System.out.println();
        System.out.printf("%-10s %-20s %12s %18s \t\t %,.3f \t%-20s\n", this.getMaDuAn(), this.getTenDuAn(), CauHinh.f.format(this.getTgBatDau()), CauHinh.f.format(this.getTgKetThuc()), this.getTongKinhPhi(), this.getNguoiChuNhiem());
    }

    /**
     * @return the maDuAn
     */
    public String getMaDuAn() {
        return maDuAn;
    }

    /**
     * @param maDuAn the maDuAn to set
     */
    public void setMaDuAn(String maDuAn) {
        this.maDuAn = maDuAn;
    }

    /**
     * @return the tenDuAn
     */
    public String getTenDuAn() {
        return tenDuAn;
    }

    /**
     * @param tenDuAn the tenDuAn to set
     */
    public void setTenDuAn(String tenDuAn) {
        this.tenDuAn = tenDuAn;
    }

    /**
     * @return the tgBatDau
     */
    public Date getTgBatDau() {
        return tgBatDau;
    }

    /**
     * @param tgBatDau the tgBatDau to set
     */
    public void setTgBatDau(Date tgBatDau) {
        this.tgBatDau = tgBatDau;
    }

    /**
     * @return the tgKetThuc
     */
    public Date getTgKetThuc() {
        return tgKetThuc;
    }

    /**
     * @param tgKetThuc the tgKetThuc to set
     */
    public void setTgKetThuc(Date tgKetThuc) {
        this.tgKetThuc = tgKetThuc;
    }

    /**
     * @return the tongKinhPhi
     */
    public double getTongKinhPhi() {
        return tongKinhPhi;
    }

    /**
     * @param tongKinhPhi the tongKinhPhi to set
     */
    public void setTongKinhPhi(double tongKinhPhi) {
        this.tongKinhPhi = tongKinhPhi;
    }
 
    public String getNguoiChuNhiem() {
        return nguoiChuNhiem;
    }
    
    public void setNguoiChuNhiem(String ngChuNhiem) {
        this.nguoiChuNhiem = ngChuNhiem;
    }

}
