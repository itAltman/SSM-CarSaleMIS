package com.vo;

/**
 * @description: 销售数据的vo展示类
 * @author: Altman
 * @date: 2018-05-11 11:21
 */
public class SaleData {
    private String name;
    private Double value;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "SaleData{" +
                "name='" + name + '\'' +
                ", value=" + value +
                '}';
    }
}
