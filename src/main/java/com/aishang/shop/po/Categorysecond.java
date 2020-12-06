package com.aishang.shop.po;

import javax.persistence.*;

@Table(name = "spring..categorysecond")
public class Categorysecond {
    @Id
    private Integer csid;

    private String csname;

    private Integer cid;

    /**
     * @return csid
     */
    public Integer getCsid() {
        return csid;
    }

    /**
     * @param csid
     */
    public void setCsid(Integer csid) {
        this.csid = csid;
    }

    /**
     * @return csname
     */
    public String getCsname() {
        return csname;
    }

    /**
     * @param csname
     */
    public void setCsname(String csname) {
        this.csname = csname;
    }

    /**
     * @return cid
     */
    public Integer getCid() {
        return cid;
    }

    /**
     * @param cid
     */
    public void setCid(Integer cid) {
        this.cid = cid;
    }
}