package com.company.project.model;

import javax.persistence.*;

public class Ddd {
    @Id
    private String ddd;

    private String xxx;

    private String yyy;

    private String zzz;

    private String kkk;

    /**
     * @return ddd
     */
    public String getDdd() {
        return ddd;
    }

    /**
     * @param ddd
     */
    public void setDdd(String ddd) {
        this.ddd = ddd;
    }

    /**
     * @return xxx
     */
    public String getXxx() {
        return xxx;
    }

    /**
     * @param xxx
     */
    public void setXxx(String xxx) {
        this.xxx = xxx;
    }

    /**
     * @return yyy
     */
    public String getYyy() {
        return yyy;
    }

    /**
     * @param yyy
     */
    public void setYyy(String yyy) {
        this.yyy = yyy;
    }

    /**
     * @return zzz
     */
    public String getZzz() {
        return zzz;
    }

    /**
     * @param zzz
     */
    public void setZzz(String zzz) {
        this.zzz = zzz;
    }

    /**
     * @return kkk
     */
    public String getKkk() {
        return kkk;
    }

    /**
     * @param kkk
     */
    public void setKkk(String kkk) {
        this.kkk = kkk;
    }
}