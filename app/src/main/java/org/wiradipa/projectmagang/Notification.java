package org.wiradipa.projectmagang;

/**
 * Created by AndhikaEffendy on 1/6/2018.
 */

public class Notification {
    private String mnamaBarang, mmerekBarang, mjam, mTotalBarang;
    private int mAvailable;

    public Notification(String mnamaBarang, String mmerekBarang, String mjam, String mTotalBarang, int mAvailable) {
        this.mnamaBarang = mnamaBarang;
        this.mmerekBarang = mmerekBarang;
        this.mjam = mjam;
        this.mTotalBarang = mTotalBarang;
        this.mAvailable = mAvailable;
    }

    public int getmAvailable() {
        return mAvailable;
    }

    public void setmAvailable(int mAvailable) {
        this.mAvailable = mAvailable;
    }

    public void setMnamaBarang(String namaBarang) {
        this.mnamaBarang = namaBarang;
    }

    public void setMmerekBarang(String merekBarang) {
        this.mmerekBarang = merekBarang;
    }

    public void setMjam(String jam) {
        this.mjam = jam;
    }

    public void setmTotalBarang(String TotalBarang) {
        this.mTotalBarang = TotalBarang;
    }

    public String getMnamaBarang() {
        return mnamaBarang;
    }

    public String getMmerekBarang() {
        return mmerekBarang;
    }

    public String getMjam() {
        return mjam;
    }

    public String getmTotalBarang() {
        return mTotalBarang;
    }
}
