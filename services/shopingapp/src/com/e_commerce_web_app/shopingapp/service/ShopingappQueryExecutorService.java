/*Copyright (c) 2023-2024 wavemaker.com All Rights Reserved.
 This software is the confidential and proprietary information of wavemaker.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with wavemaker.com*/
package com.e_commerce_web_app.shopingapp.service;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/

import java.io.OutputStream;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.wavemaker.runtime.data.export.ExportOptions;

import com.e_commerce_web_app.shopingapp.models.query.*;

public interface ShopingappQueryExecutorService {

    Page<CartIdFromUseridResponse> executeCartIdFromUserid(String loginuserid, Pageable pageable);

    void exportCartIdFromUserid(String loginuserid, ExportOptions exportOptions, Pageable pageable, OutputStream outputStream);

    Integer executeUpdateOrder(UpdateOrderRequest updateOrderRequest);

    Page<CartItemCountResponse> executeCartItemCount(String userid, Pageable pageable);

    void exportCartItemCount(String userid, ExportOptions exportOptions, Pageable pageable, OutputStream outputStream);

    Integer executeAddToCart(AddToCartRequest addToCartRequest);

    Integer executeRemoveProduct(String itemid);

    Page<GetProductByIdResponse> executeGetProductById(Integer proudctid, Pageable pageable);

    void exportGetProductById(Integer proudctid, ExportOptions exportOptions, Pageable pageable, OutputStream outputStream);

}