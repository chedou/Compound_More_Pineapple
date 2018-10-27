package com.jnshu.backendSystem.pojo;

import com.fasterxml.jackson.databind.annotation.*;

import java.io.*;
import java.util.*;

@JsonSerialize
public class CompanyProduce implements Serializable {

    private static final long serialVersionUID = -6061588304607077280L;

    private Long id;

    private Long companyId;

    private String produceName;

    private String produceSlogan;

    private String produceLogo;

    private String productIntroduction;

    private Long gmtCreate;

    private Long gmtUpdate;

    private String createBy;

    private String updateBy;

    public CompanyProduce(Long id, Long companyId, String produceName, String produceSlogan, String produceLogo, String productIntroduction, Long gmtCreate, Long gmtUpdate, String createBy, String updateBy) {
        this.id = id;
        this.companyId = companyId;
        this.produceName = produceName;
        this.produceSlogan = produceSlogan;
        this.produceLogo = produceLogo;
        this.productIntroduction = productIntroduction;
        this.gmtCreate = gmtCreate;
        this.gmtUpdate = gmtUpdate;
        this.createBy = createBy;
        this.updateBy = updateBy;
    }
    public CompanyProduce(CompanyProduce c) {
        this.id = c.id;
        this.companyId = c.getCompanyId();
        this.produceName = c.getProduceName();
        this.produceSlogan = c.getProduceSlogan();
        this.produceLogo = c.getProduceLogo();
        this.productIntroduction = c.getProductIntroduction();
        this.gmtCreate = getGmtUpdate();
        this.gmtUpdate = getGmtCreate();
        this.createBy = getUpdateBy();
        this.updateBy = getCreateBy();
    }

    public CompanyProduce() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    public String getProduceName() {
        return produceName;
    }

    public void setProduceName(String produceName) {
        this.produceName = produceName == null ? null : produceName.trim();
    }

    public String getProduceSlogan() {
        return produceSlogan;
    }

    public void setProduceSlogan(String produceSlogan) {
        this.produceSlogan = produceSlogan == null ? null : produceSlogan.trim();
    }

    public String getProduceLogo() {
        return produceLogo;
    }

    public void setProduceLogo(String produceLogo) {
        this.produceLogo = produceLogo == null ? null : produceLogo.trim();
    }

    public String getProductIntroduction() {
        return productIntroduction;
    }

    public void setProductIntroduction(String productIntroduction) {
        this.productIntroduction = productIntroduction == null ? null : productIntroduction.trim();
    }

    public Long getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Long gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public Long getGmtUpdate() {
        return gmtUpdate;
    }

    public void setGmtUpdate(Long gmtUpdate) {
        this.gmtUpdate = gmtUpdate;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy == null ? null : createBy.trim();
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy == null ? null : updateBy.trim();
    }

    /**
     * @description  公司产品构造函数
     * @param  number
     * @return  实例
     * @author Mr.HUANG
     * @date
     */
    public CompanyProduce (int number){
        if (number ==1 ){
            this.id = 1L;
            this.companyId = 1L;
            this.produceName = "kindle";
            this.produceSlogan = "阅读神器";
            this.produceLogo = "http://radish-more-pineapple.oss-cn-beijing.aliyuncs.com/backendSystem/head-photo/20151217095148_27905.jpg";
            this.productIntroduction = "是亚马逊公司设计的一系列电子书阅读器。" +
                    "用户可以通过无线网络使用Kindle购买、下载和阅读电子书、报纸、杂志、" +
                    "部落格及其他电子媒体。[2]亚马逊公司旗下Lab126开发的Kindle硬件平台，" +
                    "最早只有一种设备，现在已经发展为一个系列，大部分使用E Ink十六级灰度电子纸显示技术，" +
                    "能在最小化电源消耗的情况下提供类似纸张的阅读体验。";
            this.gmtCreate = System.currentTimeMillis() + new Random().nextInt(10) + 1;
            this.gmtUpdate = System.currentTimeMillis();
            this.createBy = "admin";
            this.updateBy = "admin";
        }if (number == 2 ){
            this.id = 2L;
            this.companyId = 2L;
            this.produceName = "当当优品";
            this.produceSlogan = "互联网优质生活品牌";
            this.produceLogo = "http://radish-more-pineapple.oss-cn-beijing.aliyuncs.com/backendSystem/head-photo/U9425P1387DT20130628082044.jpg";
            this.productIntroduction = "当当优品为当当网旗下自有品牌，价格定位中低，涵盖家居、家纺和服装等品类，" +
                    "定位于“互联网优质生活品牌”，致力于为客户提供低价的好商品。";
            this.gmtCreate = System.currentTimeMillis();
            this.gmtUpdate = System.currentTimeMillis() + new Random().nextInt(10 ) + 1 ;
            this.createBy = "admin";
            this.updateBy = "admin";
        }if (number ==3){
            this.id = 3L;
            this.companyId = 3L;
            this.produceName = "京东金融";
            this.produceSlogan = "以数据为基础，以技术为手段，搭建服务金融机构和非金融机构的开放生态";
            this.produceLogo = "http://radish-more-pineapple.oss-cn-beijing.aliyuncs.com/backendSystem/head-photo/101913ldssd4d7ckc4l67c.jpg";
            this.productIntroduction = "当当优品为当当网旗下自有品牌，价格定位中低，涵盖家居、家纺和服装等品类，" +
                    "定位于“互联网优质生活品牌”，致力于为客户提供低价的好商品。";
            this.gmtCreate = System.currentTimeMillis();
            this.gmtUpdate = System.currentTimeMillis() + new Random().nextInt(10 ) + 1 ;
            this.createBy = "admin";
            this.updateBy = "admin";
        }if (number ==4){
            this.id = 4L;
            this.companyId = 4L;
            this.produceName = "天猫超市";
            this.produceSlogan = "一站式购齐，统一邮寄";
            this.produceLogo = "http://radish-more-pineapple.oss-cn-beijing.aliyuncs.com/backendSystem/head-photo/U9425P1387DT20130628082044.jpg";
            this.productIntroduction = "在供应商甄选、商品质量管理和商品入库等环节上，天猫超市的专业团队严把商品关，" +
                    "保障所有商品都为正品真货，并严格遵照国家三包法规，确保顾客能买到放心商品。";
            this.gmtCreate = System.currentTimeMillis();
            this.gmtUpdate = System.currentTimeMillis() + new Random().nextInt(10 ) + 1 ;
            this.createBy = "admin";
            this.updateBy = "admin";

        }

    }

}