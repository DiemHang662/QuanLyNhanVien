/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.baitaplon.QLDA;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 *
 * @author HANG
 */
public class QuanLiNhanVien {

    private ArrayList<NhanVien> dsnv = new ArrayList<>();

    public void themNhanVien(NhanVien nv) {
        dsnv.add(nv);
    }
     
    public void themNhanVien(NhanVien... a) {
        this.getDs().addAll(Arrays.asList(a));
    }

    public void nhapDsNhanVien(int n) throws ParseException {
        for (int i = 0; i < n; i++) {
            System.out.printf("== Nhap nhan vien thu %d\n", i + 1);
            NhanVien nv = new NhanVien();

            nv.nhapNhanVien();
            this.dsnv.add(nv);
        }
    }

    public void xuatDsNhanVien() {
        this.dsnv.forEach(h -> h.xuatNhanVien());
        System.out.println();
    }

    public void xoaNhanVienTheoMa(Scanner sc) {
        System.out.print("Nhap ma nhan vien can xoa: ");
        String maNhanVien = CauHinh.sc.nextLine();
        NhanVien nvFound = null;
        for (NhanVien nv : dsnv) {
            if (nv.getMaNhanVien().equalsIgnoreCase(maNhanVien)) {
                nvFound = nv;
                break;
            }
        }
        if (nvFound != null) {
            dsnv.remove(nvFound);
            System.out.println("Nhan vien da duoc xoa\n");
        }
    }

    public void suaThongTinNhanVien() throws ParseException {
        System.out.print("Nhap ma nhan vien can sua thong tin: ");
        String maNhanVien = CauHinh.sc.nextLine();
        NhanVien nvFound = null;
        for (NhanVien nv : dsnv) {
            if (nv.getMaNhanVien().equalsIgnoreCase(maNhanVien)) {
                nvFound = nv;
                break;
            }
        }
        if (nvFound != null) {
            System.out.print("Nhap thong tin ban muon sua\n"
                    + "1/Ma nhan vien\n"
                    + "2/Ngay sinh cua nhan vien\n"
                    + "3/Ho ten cua nhan vien\n"
                    + "4/Email\n"
                    + "5/Gioi tinh\n"
                    + "6/Loai nhan vien. Nhap: ");
            int n = CauHinh.sc.nextInt();
            CauHinh.sc.nextLine();
            switch (n) {
                case 1 -> {
                    System.out.print("Nhap ma nhan vien can sua: ");
                    String maNv = CauHinh.sc.nextLine();
                    nvFound.setMaNhanVien(maNv);
                }
                case 2 -> {
                    System.out.print("Nhap ngay sinh can sua: ");
                    String ngaySinh = CauHinh.sc.nextLine();
                    nvFound.setNgaySinh(CauHinh.f.parse(ngaySinh));

                }
                case 3 -> {
                    System.out.print("Nhap ho ten can sua: ");
                    String hoTen = CauHinh.sc.nextLine();
                    nvFound.setHoTen(hoTen);
                }
                case 4 -> {
                    System.out.print("Nhap email can sua: ");
                    String email = CauHinh.sc.nextLine();
                    nvFound.seteMail(email);
                }
                case 5 -> {
                    System.out.print("Nhap gioi tinh: ");
                    String gioiTinh = CauHinh.sc.nextLine();
                    nvFound.setGioiTinh(gioiTinh);
                }
                case 6 -> {
                    System.out.print("Nhap loai nhan vien: ");
                    String loaiNhanVien = CauHinh.sc.nextLine();
                    nvFound.setLoaiNhanVien(loaiNhanVien);
                }

                default -> {
                }
            }
        }
    }
    
    public void xuatDsLuong() {
        this.dsnv.forEach(h -> h.xuatLuong());
        System.out.println();
    }

    public List<NhanVien> traCuuDuAn(String kw) {
        return this.dsnv.stream().filter(t -> t.getThuocDuAn().contains(kw)).collect(Collectors.toList());
    }
    
     public List<NhanVien> traCuuNhanVien(String k) {
        return this.dsnv.stream().filter(t -> t.getHoTen().contains(k)).collect(Collectors.toList());
    }
     
     public List<NhanVien> traCuuNhanVienTheoMa(String k) {
        return this.dsnv.stream().filter(t -> t.getMaNhanVien().contains(k)).collect(Collectors.toList());
    }
     
     public List<NhanVien> traCuuNhanVienTheoLoai(String k) {
        return this.dsnv.stream().filter(t -> t.getLoaiNhanVien().contains(k)).collect(Collectors.toList());
    }
     
      public void sapXepTheoTen(){
  Collections.sort(dsnv, (nv1, nv2) -> nv1.getHoTen().compareTo(nv2.getHoTen()));
    }
     
 public List<NhanVien> traCuuNgaySinh(Date ns) {
        return this.dsnv.stream().filter(t -> t.getNgaySinh().equals(ns)).collect(Collectors.toList());
 }
 

    public ArrayList<NhanVien> getDs() {
        return dsnv;
    }

    public void setDs(ArrayList<NhanVien> ds) {
        this.dsnv = ds;
    }
}
