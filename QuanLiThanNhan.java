/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.baitaplon.QLDA;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


/**
 *
 * @author HANG
 */
public class QuanLiThanNhan {
     private ArrayList<ThanNhan> dstn = new ArrayList<>();
     
   public void themThanNhan(ThanNhan... a) {
        this.getDstn().addAll(Arrays.asList(a));
    }
   public void xuatDsThanNhan() {
       
         this.dstn.forEach(h -> h.xuatThanNhan());
          System.out.println();
        }
       
    
   
   public List<ThanNhan> traCuuThanNhan(String maNhanVien) {
        return this.dstn.stream().filter(t -> t.getMaNhanVien().contains(maNhanVien)).collect(Collectors.toList());
    }

 
    public ArrayList<ThanNhan> getDstn() {
        return dstn;
    }

    /**
     * @param dstn the dstn to set
     */
    public void setDstn(ArrayList<ThanNhan> dstn) {
        this.dstn = dstn;
    }
}

   
  

