/*Copyright (c) 2023-2024 wavemaker.com All Rights Reserved.
 This software is the confidential and proprietary information of wavemaker.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with wavemaker.com*/
package com.e_commerce_web_app.shopingapp.service;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/

import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wavemaker.runtime.data.dao.query.WMQueryExecutor;
import com.wavemaker.runtime.data.export.ExportOptions;
import com.wavemaker.runtime.data.model.QueryProcedureInput;

import com.e_commerce_web_app.shopingapp.models.query.*;

@Service
public class ShopingappQueryExecutorServiceImpl implements ShopingappQueryExecutorService {

    private static final Logger LOGGER = LoggerFactory.getLogger(ShopingappQueryExecutorServiceImpl.class);

    @Autowired
    @Qualifier("shopingappWMQueryExecutor")
    private WMQueryExecutor queryExecutor;

    @Transactional(value = "shopingappTransactionManager", readOnly = true)
    @Override
    public Page<CartIdFromUseridResponse> executeCartIdFromUserid(String loginuserid, Pageable pageable) {
        Map<String, Object> params = new HashMap<>(1);

        params.put("loginuserid", loginuserid);

        return queryExecutor.executeNamedQuery("CartIdFromUserid", params, CartIdFromUseridResponse.class, pageable);
    }

    @Transactional(value = "shopingappTransactionManager", timeout = 300, readOnly = true)
    @Override
    public void exportCartIdFromUserid(String loginuserid, ExportOptions exportOptions, Pageable pageable, OutputStream outputStream) {
        Map<String, Object> params = new HashMap<>(1);

        params.put("loginuserid", loginuserid);

        QueryProcedureInput<CartIdFromUseridResponse> queryInput = new QueryProcedureInput<>("CartIdFromUserid", params, CartIdFromUseridResponse.class);

        queryExecutor.exportNamedQueryData(queryInput, exportOptions, pageable, outputStream);
    }

    @Transactional(value = "shopingappTransactionManager")
    @Override
    public Integer executeUpdateOrder(UpdateOrderRequest updateOrderRequest) {
        Map<String, Object> params = new HashMap<>(3);

        params.put("order_status", updateOrderRequest.getOrderStatus());
        params.put("orderid", updateOrderRequest.getOrderid());
        params.put("userid", updateOrderRequest.getUserid());

        return queryExecutor.executeNamedQueryForUpdate("updateOrder", params);
    }

    @Transactional(value = "shopingappTransactionManager", readOnly = true)
    @Override
    public Page<CartItemCountResponse> executeCartItemCount(String userid, Pageable pageable) {
        Map<String, Object> params = new HashMap<>(1);

        params.put("userid", userid);

        return queryExecutor.executeNamedQuery("CartItemCount", params, CartItemCountResponse.class, pageable);
    }

    @Transactional(value = "shopingappTransactionManager", timeout = 300, readOnly = true)
    @Override
    public void exportCartItemCount(String userid, ExportOptions exportOptions, Pageable pageable, OutputStream outputStream) {
        Map<String, Object> params = new HashMap<>(1);

        params.put("userid", userid);

        QueryProcedureInput<CartItemCountResponse> queryInput = new QueryProcedureInput<>("CartItemCount", params, CartItemCountResponse.class);

        queryExecutor.exportNamedQueryData(queryInput, exportOptions, pageable, outputStream);
    }

    @Transactional(value = "shopingappTransactionManager")
    @Override
    public Integer executeAddToCart(AddToCartRequest addToCartRequest) {
        Map<String, Object> params = new HashMap<>(4);

        params.put("id", addToCartRequest.getId());
        params.put("cartid", addToCartRequest.getCartid());
        params.put("productId", addToCartRequest.getProductId());
        params.put("quantity", addToCartRequest.getQuantity());

        return queryExecutor.executeNamedQueryForUpdate("AddToCart", params);
    }

    @Transactional(value = "shopingappTransactionManager")
    @Override
    public Integer executeRemoveProduct(String itemid) {
        Map<String, Object> params = new HashMap<>(1);

        params.put("itemid", itemid);

        return queryExecutor.executeNamedQueryForUpdate("RemoveProduct", params);
    }

    @Transactional(value = "shopingappTransactionManager", readOnly = true)
    @Override
    public Page<GetProductByIdResponse> executeGetProductById(Integer proudctid, Pageable pageable) {
        Map<String, Object> params = new HashMap<>(1);

        params.put("proudctid", proudctid);

        return queryExecutor.executeNamedQuery("getProductById", params, GetProductByIdResponse.class, pageable);
    }

    @Transactional(value = "shopingappTransactionManager", timeout = 300, readOnly = true)
    @Override
    public void exportGetProductById(Integer proudctid, ExportOptions exportOptions, Pageable pageable, OutputStream outputStream) {
        Map<String, Object> params = new HashMap<>(1);

        params.put("proudctid", proudctid);

        QueryProcedureInput<GetProductByIdResponse> queryInput = new QueryProcedureInput<>("getProductById", params, GetProductByIdResponse.class);

        queryExecutor.exportNamedQueryData(queryInput, exportOptions, pageable, outputStream);
    }

}