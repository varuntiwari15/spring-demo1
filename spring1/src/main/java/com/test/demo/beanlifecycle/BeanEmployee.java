package com.test.demo.beanlifecycle;

public class BeanEmployee {

    private String name;
    private BeanCompany beanCompany;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BeanCompany getBeanCompany() {
        return beanCompany;
    }

    public void setBeanCompany(BeanCompany beanCompany) {
        this.beanCompany = beanCompany;
    }
}
