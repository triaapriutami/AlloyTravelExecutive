package mobile.skripsi.alloytravelexecutive.model;

/**
 * Created by Apri on 7/22/2018.
 */

public class Tikeet3 {
    private String nama;
    private String alamat;
    private String notelpn;
    private String keberangkatan;
    private String jumlah;

    public Tikeet3() {
    }

    public Tikeet3(String nama, String alamat, String notelpn, String keberangkatan, String jumlah) {
        this.nama = nama;
        this.alamat = alamat;
        this.notelpn= notelpn;
        this.keberangkatan = keberangkatan;
        this.jumlah= jumlah;
    }


    public String getNama() {return nama;}
    public void setNama(String nama) {this.nama = nama;}

    public String getAlamat() {return alamat;}
    public void setAlamat(String alamat) {
        this.alamat= alamat;
    }

    public String getNotelpn() {
        return notelpn;
    }
    public void setNotelpn(String notelpn) {
        this.notelpn = notelpn;
    }

    public String getKeberangkatan() {return keberangkatan;}
    public void setKeberangkatan(String keberangkatan) {
        this.keberangkatan= keberangkatan;
    }

    public String getJumlah() {return jumlah;}
    public void setJumlah(String jumlah) {this.jumlah = jumlah;}
}
