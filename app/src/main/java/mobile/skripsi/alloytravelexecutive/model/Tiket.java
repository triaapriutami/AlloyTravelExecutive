package mobile.skripsi.alloytravelexecutive.model;

public class Tiket {
    private String namaKota;
    private String merkMobil;
    private String jenisMobil;
    private String hargaMobil;
    private String jam;
    private String platmobil;

    public Tiket() {
    }

    public Tiket(String namaKota, String merkMobil, String jenisMobil, String hargaMobil, String jam, String platmobil) {
        this.namaKota = namaKota;
        this.merkMobil = merkMobil;
        this.jenisMobil = jenisMobil;
        this.hargaMobil = hargaMobil;
        this.jam = jam;
        this.platmobil = platmobil;
    }

    public String getNamaKota() {
        return namaKota;
    }

    public void setNamaKota(String namaKota) {
        this.namaKota = namaKota;
    }

    public String getMerkMobil() {
        return merkMobil;
    }

    public void setMerkMobil(String merkMobil) {
        this.merkMobil = merkMobil;
    }

    public String getJenisMobil() {
        return jenisMobil;
    }

    public void setJenisMobil(String jenisMobil) {
        this.jenisMobil = jenisMobil;
    }

    public String getHargaMobil() {
        return hargaMobil;
    }

    public void setHargaMobil(String hargaMobil) {
        this.hargaMobil = hargaMobil;
    }

    public String getJam() {
        return jam;
    }

    public void setJam(String jam) {
        this.jam = jam;
    }

    public String getPlatmobill() {
        return platmobil;
    }

    public void setPlatmobil(String platmobil) {this.platmobil = platmobil;}

}