package com.jnshu.backendsystem.vo;

import java.util.Arrays;

public class CompanfInfoVo {
    private String[] resquestcompanyInfo;
    private Integer size;

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "CompanfInfoVo{" +
                "resquestcompanyInfo=" + Arrays.toString(resquestcompanyInfo) +
                ", size=" + size +
                '}';
    }

    public String[] getResquestcompanyInfo() {
        return resquestcompanyInfo;
    }

    public void setResquestcompanyInfo(String[] resquestcompanyInfo) {
        this.resquestcompanyInfo = resquestcompanyInfo;
    }
}
