/*Copyright (c) 2023-2024 wavemaker.com All Rights Reserved.
 This software is the confidential and proprietary information of wavemaker.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with wavemaker.com*/
package com.e_commerce_web_app.shopingapp.models.query;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/


import java.io.Serializable;
import java.util.Objects;

import com.wavemaker.runtime.data.annotations.ColumnAlias;

public class CartIdFromUseridResponse implements Serializable {


    @ColumnAlias("id")
    private Long id;

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CartIdFromUseridResponse)) return false;
        final CartIdFromUseridResponse cartIdFromUseridResponse = (CartIdFromUseridResponse) o;
        return Objects.equals(getId(), cartIdFromUseridResponse.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}