package KahveMakinesi;

public class pojo {
    private String kahveAdi;
    private String bardakBoy;
    private int sekerMiktari;
    private Boolean sutMiktari;
    private int fiyat;

    public pojo() {
    }

    public pojo(String kahveAdi, String bardakBoy, int sekerMiktari, Boolean sutMiktari, int fiyat) {
        this.kahveAdi = kahveAdi;
        this.bardakBoy = bardakBoy;
        this.sekerMiktari = sekerMiktari;
        this.sutMiktari = sutMiktari;
        this.fiyat = fiyat;

    }

    public String getKahveAdi() {
        return kahveAdi;
    }

    public void setKahveAdi(String kahveAdi) {
        this.kahveAdi = kahveAdi;
    }

    public String getBardakBoy() {
        return bardakBoy;
    }

    public void setBardakBoy(String bardakBoy) {
        this.bardakBoy = bardakBoy;
    }

    public int getSekerMiktari() {
        return sekerMiktari;
    }

    public void setSekerMiktari(int sekerMiktari) {
        this.sekerMiktari = sekerMiktari;
    }

    public Boolean getSutMiktari() {
        return sutMiktari;
    }

    public void setSutMiktari(Boolean sutMiktari) {
        this.sutMiktari = sutMiktari;
    }

    public int getFiyat() {
        return fiyat;
    }

    public void setFiyat(int fiyat) {
        this.fiyat = fiyat;
    }

    @Override
    public String toString() {
        return "siparis" +
                ", kahveAdı='" + kahveAdi + '\'' +
                ", bardak ='" + bardakBoy+ '\'' +
                ", seker ='" + sekerMiktari + '\'' +
                ", süt =" + sutMiktari + '\'' +
                ", fiyat =" +fiyat+ '\'' + '\n' ;
    }
}

