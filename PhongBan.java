/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.baitaplon.QLDA;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author HANG
 */
public class PhongBan {
      protected String tenPhongBan;
     ArrayList<NhanVien> dsnv = new ArrayList<>();
     NhanVien nv;
      public PhongBan(){
          
      }
   
      public PhongBan(String tenPhongBan){
          this.tenPhongBan=tenPhongBan;
      }
      
      public void nhapPhongBan() throws ParseException{         
          System.out.print("Nhap ten phong ban: ");  
          this.setTenPhongBan(CauHinh.sc.nextLine()); 
          
      }
      
       public void xuatPhongBan(){
          System.out.printf("Ten phong ban: %25s\n",this.getTenPhongBan()); 
      }
       
       
       
        
     

/**
     * @return the tenPhongBan
     */
    public String getTenPhongBan() {
        return tenPhongBan;
    }

    /**
     * @param tenPhongBan the tenPhongBan to set
     */
    public void setTenPhongBan(String tenPhongBan) {
        this.tenPhongBan = tenPhongBan;
    }


}