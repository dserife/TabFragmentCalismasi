package com.example.tabfragmentcalismasi.Model;

public class Bulten {

    private String bultenBaslik;
    private String bultenAciklama;
    private int bultenResim;

    //boş constructor
    public Bulten() {
    }

    //dolu constructor
    public Bulten(String bultenBaslik, String bultenAciklama, int bultenResim) {
        this.bultenBaslik = bultenBaslik;
        this.bultenAciklama = bultenAciklama;
        this.bultenResim = bultenResim;
    }


    //getter ve setter metotlar
    public String getBultenBaslik() {
        return bultenBaslik;
    }

    public void setBultenBaslik(String bultenBaslik) {
        this.bultenBaslik = bultenBaslik;
    }

    public String getBultenAciklama() {
        return bultenAciklama;
    }

    public void setBultenAciklama(String bultenAciklama) {
        this.bultenAciklama = bultenAciklama;
    }

    public int getBultenResim() {
        return bultenResim;
    }

    public void setBultenResim(int bultenResim) {
        this.bultenResim = bultenResim;
    }
}
