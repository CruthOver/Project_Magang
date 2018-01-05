package org.wiradipa.projectmagang;

/**
 * Created by CruthOvr on 05/01/2018.
 */

public class Recents {

    private String mNamaBarang,mKodeBarang,mTanggal,mJam;

    public Recents(String mNamaBarang, String mKodeBarang, String mTanggal, String mJam) {
        this.mNamaBarang = mNamaBarang;
        this.mKodeBarang = mKodeBarang;
        this.mTanggal = mTanggal;
        this.mJam = mJam;
    }

    public void setmNamaBarang(String namaBarang) {
        this.mNamaBarang = namaBarang;
    }

    public void setKodeBarang(String kodeBarang) {
        this.mKodeBarang = kodeBarang;
    }

    public void setTanggal(String tanggal) {
        this.mTanggal = tanggal;
    }

    public void setJam(String jam) {
        this.mTanggal = jam;
    }

    public String getNamaBarang() {
        return mNamaBarang;
    }

    public String getKodeBarang() {
        return mKodeBarang;
    }

    public String getTanggal() {
        return mTanggal;
    }

    public String getJam(){
        return mJam;
    }
}
