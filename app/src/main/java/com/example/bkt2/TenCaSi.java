package com.example.bkt2;

public class TenCaSi {
    private String tenkhoahoc;
    private int img;
    private String tenthuong;
    private String dactinh;

    public TenCaSi(String tenKhoahoc, int img, String tenthuong, String dactinh) {
        this.tenkhoahoc = tenKhoahoc;
        this.img = img;
        this.tenthuong = tenthuong;
        this.dactinh = dactinh;
    }

    public String getMoTa() {

        return dactinh;
    }

    public void setMoTa(String moTa) {
        this.dactinh = moTa;
    }

    public TenCaSi() {
    }

    public String getTenCa() {
        return tenkhoahoc;
    }

    public void setTenThuong(String tenThuong) {
        this.tenkhoahoc = tenThuong;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getDactinh() {
        return tenthuong;
    }

    public void setTenCaSi(String tenDiaDiem) {
        this.tenthuong = tenDiaDiem;
    }


    @Override
    public String toString() {
        return "TenCaSi{" +
                "tenCasi='" + tenkhoahoc + '\'' +
                ", img=" + img +
                ", tenNgheDanh='" + tenthuong + '\'' +
                ", tenQuocgia='" + dactinh + '\'' +
                '}';
    }
}
