package com.jnshu.backendsystem.pojo;

public class CompanyProduce {
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

    @Override
    public String toString() {
        return "CompanyProduce{" +
                "id=" + id +
                ", companyId=" + companyId +
                ", produceName='" + produceName + '\'' +
                ", produceSlogan='" + produceSlogan + '\'' +
                ", produceLogo='" + produceLogo + '\'' +
                ", productIntroduction='" + productIntroduction + '\'' +
                ", gmtCreate=" + gmtCreate +
                ", gmtUpdate=" + gmtUpdate +
                ", createBy='" + createBy + '\'' +
                ", updateBy='" + updateBy + '\'' +
                '}';
    }
}