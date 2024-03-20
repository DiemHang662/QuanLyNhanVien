/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.baitaplon.QLDA;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 *
 * @author HANG
 */
public class QuanLiDuAn {

    private ArrayList<DuAn> ds = new ArrayList<>();

    public void themDuAn(DuAn da) {
        this.ds.add(da);
    }

    public void nhapDsDuAn(int n) throws ParseException {
        for (int i = 0; i < n; i++) {
            System.out.printf("== Nhap du an thu: %d\n", i + 1);
            DuAn da = new DuAn();
            da.nhapDuAn();
            this.ds.add(da);
        }
    }

    public void xuatDsDuAn() {
        this.ds.forEach(da -> da.xuatDuAn());
        System.out.println();
    }

    public void xoaDuAnTheoMa(Scanner sc) {
        System.out.print("Nhap ma du an can xoa: ");
        String maDuAn = CauHinh.sc.nextLine();
        DuAn daFound = null;
        for (DuAn da : ds) {
            if (da.getMaDuAn().equalsIgnoreCase(maDuAn)) {
                daFound = da;
                break;
            }
        }
        if (daFound != null) {
            ds.remove(daFound);
            System.out.println("Du an da duoc xoa\n");
        }
    }

    public void suaDuAn() throws ParseException {
        System.out.print("Nhap ma du an cua du an can sua thong tin: ");
        String maDuAn = CauHinh.sc.nextLine();
        DuAn daFound = null;
        for (DuAn da : ds) {
            if (da.getMaDuAn().equalsIgnoreCase(maDuAn)) {
                daFound = da;
                break;
            }
        }
        if (daFound != null) {
            System.out.print("Nhap thong tin ban muon sua\n"
                    + "1/Ma du an\n"
                    + "2/Ten du an\n"
                    + "3/Ngay bat dau\n"
                    + "4/Ngay ket thuc\n"
                    + "5/Tong kinh phi\n"
                    + "6/Ten nguoi chu nhiem. Nhap: ");
            int n = CauHinh.sc.nextInt();
            CauHinh.sc.nextLine();
            switch (n) {
                case 1 -> {
                    System.out.print("Nhap ma du an can sua: ");
                    String ma = CauHinh.sc.nextLine();
                    daFound.setMaDuAn(ma);
                }
                case 2 -> {
                    System.out.print("Nhap ten du an can sua: ");
                    String ten = CauHinh.sc.nextLine();
                    daFound.setTenDuAn(ten);
                }
                case 3 -> {
                    System.out.print("Nhap ngay bat dau du an can sua: ");
                    String bd = CauHinh.sc.nextLine();
                    daFound.setTgBatDau(CauHinh.f.parse(bd));
                }
                case 4 -> {
                    System.out.print("Nhap ngay ket thuc can sua: ");
                    String kt = CauHinh.sc.nextLine();
                    daFound.setTgKetThuc(CauHinh.f.parse(kt));
                }
                case 5 -> {
                    System.out.print("Nhap tong kinh phi du an: ");
                    double kp = CauHinh.sc.nextDouble();
                    daFound.setTongKinhPhi(kp);
                }
                case 6 -> {
                    System.out.print("Nhap ten nguoi chu nhiem du an moi: ");
                    String ngCn = CauHinh.sc.nextLine();
                    daFound.setNguoiChuNhiem(ngCn);
                }
                default -> {
                }
            }
        }
    }

    public List<DuAn> timDuAnTheoTen(String tenDa) {
        return this.ds.stream().filter(da -> da.getTenDuAn().contains(tenDa)).collect(Collectors.toList());
    }

    public List<DuAn> timKiemTgBatDauDuAn(Date time) {
        return this.ds.stream().filter(da -> da.getTgBatDau().equals(time)).collect(Collectors.toList());
    }

    public List<DuAn> sapXepTheoKinhPhi() {
        this.ds.sort((da1, da2) -> {
            double kp1 = da1.getTongKinhPhi();
            double kp2 = da2.getTongKinhPhi();
            return -(kp1 > kp2 ? 1 : (kp1 > kp2 ? -1 : 0));
        });
        return null;
    }

    public ArrayList<DuAn> getDs() {
        return ds;
    }

    public void setDs(ArrayList<DuAn> ds) {
        this.ds = ds;
    }
}
