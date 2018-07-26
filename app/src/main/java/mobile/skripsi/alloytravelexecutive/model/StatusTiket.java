package mobile.skripsi.alloytravelexecutive.model;

import android.widget.TextView;

/**
 * Created by Apri on 7/23/2018.
 */

public class StatusTiket {
    private String tujuan;
    private String tujuan2;
    private String mobil;
    private String mobil2;
    private String jenismobil;
    private String jenismobil2;
    private String harga;
    private String harga2;
    private String jam;
    private String jam2;
    private String platmobil;
    private String platmobil2;
    private String status;
    private String status2;

    public StatusTiket() {
    }

    public StatusTiket(String tujuan, String tujuan2, String mobil, String mobil2, String jenismobil, String jenismobil2,
                       String harga, String harga2, String jam, String jam2, String platmobil, String platmobil2, String status, String status2) {
        this.tujuan = tujuan;
        this.tujuan2 = tujuan2;
        this.mobil= mobil;
        this.mobil2 = mobil2;
        this.jenismobil= jenismobil;
        this.jenismobil2 = jenismobil2;
        this.harga = harga;
        this.harga2= harga2;
        this.jam = jam;
        this.jam2= jam2;
        this.platmobil = platmobil;
        this.platmobil2 = platmobil2;
        this.status = status;
        this.status2 = status2;
    }


    public String getTujuan() {return tujuan;}
    public void setTujuan(String tujuan) {this.tujuan = tujuan;}

    public String getTujuan2() {return tujuan2;}
    public void setTujuan2(String tujuan2) {this.tujuan2= tujuan2;}

    public String getMobil() {return mobil;}
    public void setMobil(String mobil) {this.mobil = mobil;}

    public String getMobil2() {return mobil2;}
    public void setMobil2(String mobil2) {this.mobil2= mobil2;}

    public String getJenismobil() {return jenismobil;}
    public void setJenismobil(String jenismobil) {this.jenismobil = jenismobil;}

    public String getJenismobil2() {return jenismobil2;}
    public void setJenismobil2(String jenismobil2) {this.jenismobil2 = jenismobil2;}

    public String getHarga() {return harga;}
    public void setHarga(String harga) {this.harga= harga;}

    public String getHarga2() {return harga2;}
    public void setHarga2(String harga2) {this.harga2 = harga2;}

    public String getJam() {return jam;}
    public void setJam(String jam) {this.jam= jam;}

    public String getJam2() {return jam2;}
    public void setJam2(String jam2) {this.jam2 = jam2;}

    public String getPlatmobil() {return platmobil;}
    public void setPlatmobil(String palatmobil) {this.platmobil= palatmobil;}

    public String getPlatmobil2() {return platmobil2;}
    public void setPlatmobil2(String platmobil2) {this.platmobil2 = platmobil2;}

    public String getStatus() {return status;}
    public void setStatus(String status) {this.status= status;}

    public String getStatus2() {return platmobil2;}
    public void setStatus2(String status2) {this.status2 = status2;}
}

