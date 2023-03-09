package com.mycompany.hoaqua;

import java.util.Scanner;

public class Hoaqua {
        private int gia_ban;
        private String nguon_goc;
        private String ngay_nhap;
        private int so_luong;
        
        public Hoaqua(int gia_ban, String nguon_goc, String ngay_nhap, int so_luong){
            this.gia_ban = gia_ban;
            this.nguon_goc = nguon_goc;
            this.ngay_nhap = ngay_nhap;
            this.so_luong = so_luong;
        }
        
        public int getGiaBan(){
            return gia_ban;
        }
        public String getNguonGoc(){
            return nguon_goc;
        }
        public String getNgayNhap(){
            return ngay_nhap;
        }
        public int getSoLuong(){
            return so_luong;
        }
        
        class QuaCam extends Hoaqua{
            public QuaCam ( int gia_ban, String nguon_goc, String ngay_nhap, int so_luong){
            super (gia_ban, nguon_goc, ngay_nhap, so_luong);
               
            }
        class QuaTao extends Hoaqua{
            public QuaTao (int gia_ban, String nguon_goc, String ngay_nhap, int so_luong){
            super ( gia_ban,nguon_goc,ngay_nhap ,so_luong);
            }
        }  
        class CamCaoPhong extends QuaCam{
            public CamCaoPhong(int gia_ban, String nguon_goc, String ngay_nhap, int so_luong){
                super ( gia_ban, nguon_goc,ngay_nhap,so_luong);
            }
        }
        class CamSanh extends QuaCam{
            public CamSanh (int gia_ban, String nguon_goc, String ngay_nhap, int so_luong){
                super (gia_ban,nguon_goc,ngay_nhap,so_luong);
        }
        }
        }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap gia ban Qua Cam ");
        int giaBanCam = scanner.nextInt();
        System.out.println("Nhap ngay nhap");
        String NgayNhapCam = scanner.next();
        System.out.println("Nhap nguon goc");
        String NguonGocCam = scanner.nextLine();
        System.out.println("Nhap so luong");
        int SoLuongCam = scanner.nextInt();
        System.out.println("Qua cam co gia la "+ giaBanCam); 
        System.out.println("Ngay nhap la: "+ NgayNhapCam);
        System.out.println("nguon goc cam : "+ NguonGocCam);
        System.out.println("so luong cam nhap : "+ SoLuongCam);
    }
}
