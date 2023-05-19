/*Copyright (c) 2023-2024 wavemaker.com All Rights Reserved.
 This software is the confidential and proprietary information of wavemaker.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with wavemaker.com*/
package com.e_commerce_web_app.shopingapp.models.query;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/


import java.io.Serializable;
import java.util.Objects;

import com.wavemaker.runtime.data.annotations.ColumnAlias;

public class GetProductByIdResponse implements Serializable {


    @ColumnAlias("id")
    private Long id;

    @ColumnAlias("p_name")
    private String pname;

    @ColumnAlias("description")
    private String description;

    @ColumnAlias("price")
    private Integer price;

    @ColumnAlias("image_url")
    private String imageUrl;

    @ColumnAlias("cateogry_id")
    private Long cateogryId;

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPname() {
        return this.pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getPrice() {
        return this.price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getImageUrl() {
        return this.imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Long getCateogryId() {
        return this.cateogryId;
    }

    public void setCateogryId(Long cateogryId) {
        this.cateogryId = cateogryId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof GetProductByIdResponse)) return false;
        final GetProductByIdResponse getProductByIdResponse = (GetProductByIdResponse) o;
        return Objects.equals(getId(), getProductByIdResponse.getId()) &&
                Objects.equals(getPname(), getProductByIdResponse.getPname()) &&
                Objects.equals(getDescription(), getProductByIdResponse.getDescription()) &&
                Objects.equals(getPrice(), getProductByIdResponse.getPrice()) &&
                Objects.equals(getImageUrl(), getProductByIdResponse.getImageUrl()) &&
                Objects.equals(getCateogryId(), getProductByIdResponse.getCateogryId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(),
                getPname(),
                getDescription(),
                getPrice(),
                getImageUrl(),
                getCateogryId());
    }
}