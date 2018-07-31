package mobile.skripsi.alloytravelexecutive.model;

/**
 * Created by Apri on 7/29/2018.
 */

public class Tiket2 {
    private String nama;
    private String nama2;
    private String notelepon;
    private String notelepon2;
    private String kotaasal;
    private String kotaasal2;
    private String kotatujuan;
    private String kotatujuan2;
    private String pergi;
    private String pergi2;

    public Tiket2() {
    }

    public Tiket2(String nama, String nama2,  String notelepon, String notelepon2,String kotaasal,
                  String kotaasal2, String kotatujuan, String kotatujuan2, String pergi, String pergi2) {
        this.nama = nama;
        this.nama2 = nama2;
        this.notelepon= notelepon;
        this.notelepon2 = notelepon2;
        this.kotaasal= kotaasal;
        this.kotaasal2 = kotaasal2;
        this.kotatujuan = kotatujuan;
        this.kotatujuan2= kotatujuan2;
        this.pergi = pergi;
        this.pergi2= pergi2;
    }


    public String getNama1() {return nama;}
    public void setNama1(String nama) {this.nama = nama;}

    public String getNama2() {return nama2;}
    public void setNama2(String nama2) {this.nama2 = nama2;}

    public String getNoTelpon() {return notelepon;}
    public void setNoTelpon(String notelepon) {this.notelepon = notelepon;}

    public String getNoTelpon2() {return notelepon2;}
    public void setNoTelpon2(String notelepon2) {this.notelepon2 = notelepon2;}

    public String getKotasal1() {return kotaasal;}
    public void setKotasal1(String kotaasal) {this.kotaasal = kotaasal;}

    public String getKotasal2() {return kotaasal2;}
    public void getKotasal2(String kotaasal2) {this.kotaasal2 = kotaasal2;}

    public String getKotaTujuan1() {return kotatujuan;}
    public void getKotaTujuan1(String kotatujuan) {this.kotatujuan= kotatujuan;}

    public String getKotaTujuan2() {return kotatujuan2;}
    public void getKotaTujuan2(String kotatujuan2) {this.kotatujuan2 = kotatujuan2;}

    public String getPergi1() {return pergi;}
    public void setPergi1(String pergi) {this.pergi= pergi;}

    public String getPergii2() {return pergi2;}
    public void setPergii2(String pergi2) {this.pergi2= pergi2;}
}
