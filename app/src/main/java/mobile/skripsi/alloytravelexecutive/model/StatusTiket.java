package mobile.skripsi.alloytravelexecutive.model;

/**
 * Created by Apri on 7/23/2018.
 */

public class StatusTiket {
    private String nama;
    private String kotaasal;
    private String kotatujuan;
    private String nokursi;
    private String total;

    public StatusTiket() {
    }

    public StatusTiket(String nama, String kotaasal, String kotatujuan, String nokursi, String total) {
        this.nama = nama;
        this.kotaasal = kotaasal;
        this.kotatujuan= kotatujuan;
        this.nokursi = nokursi;
        this.total= total;
    }


    public String getNama() {return nama;}
    public void setNama(String nama) {this.nama = nama;}

    public String getKotaasal() {return kotaasal;}
    public void setKotaasal(String kotaasal) {this.kotaasal= kotaasal;}

    public String getKotatujuan() {return kotatujuan;}
    public void setKotatujuan(String kotatujuan) {this.kotatujuan = kotatujuan;}

    public String getNokursi() {return nokursi;}
    public void setNokursi(String nokursi) {this.nokursi= nokursi;}

    public String getTotal() {return total;}
    public void setTotal(String total) {this.total = total;};}
