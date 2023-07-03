package com.test.demo.beanlifecycle;

public class BeanCompany {

    private String companyName;

    private BeanAddress beanAddress;

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public BeanAddress getBeanAddress() {
        return beanAddress;
    }

    public void setBeanAddress(BeanAddress beanAddress) {
        this.beanAddress = beanAddress;
    }
}
