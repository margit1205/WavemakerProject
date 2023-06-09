/*Copyright (c) 2023-2024 wavemaker.com All Rights Reserved.
 This software is the confidential and proprietary information of wavemaker.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with wavemaker.com*/
package com.e_commerce_web_app.shopingapp.service;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/

import java.io.OutputStream;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.wavemaker.runtime.commons.file.model.Downloadable;
import com.wavemaker.runtime.data.exception.EntityNotFoundException;
import com.wavemaker.runtime.data.export.DataExportOptions;
import com.wavemaker.runtime.data.export.ExportType;
import com.wavemaker.runtime.data.expression.QueryFilter;
import com.wavemaker.runtime.data.model.AggregationInfo;

import com.e_commerce_web_app.shopingapp.OrderItem;
import com.e_commerce_web_app.shopingapp.Orderlist;

/**
 * Service object for domain model class {@link Orderlist}.
 */
public interface OrderlistService {

    /**
     * Creates a new Orderlist. It does cascade insert for all the children in a single transaction.
     *
     * This method overrides the input field values using Server side or database managed properties defined on Orderlist if any.
     *
     * @param orderlist Details of the Orderlist to be created; value cannot be null.
     * @return The newly created Orderlist.
     */
    Orderlist create(@Valid Orderlist orderlist);


	/**
     * Returns Orderlist by given id if exists.
     *
     * @param orderlistId The id of the Orderlist to get; value cannot be null.
     * @return Orderlist associated with the given orderlistId.
	 * @throws EntityNotFoundException If no Orderlist is found.
     */
    Orderlist getById(Integer orderlistId);

    /**
     * Find and return the Orderlist by given id if exists, returns null otherwise.
     *
     * @param orderlistId The id of the Orderlist to get; value cannot be null.
     * @return Orderlist associated with the given orderlistId.
     */
    Orderlist findById(Integer orderlistId);

	/**
     * Find and return the list of Orderlists by given id's.
     *
     * If orderedReturn true, the return List is ordered and positional relative to the incoming ids.
     *
     * In case of unknown entities:
     *
     * If enabled, A null is inserted into the List at the proper position(s).
     * If disabled, the nulls are not put into the return List.
     *
     * @param orderlistIds The id's of the Orderlist to get; value cannot be null.
     * @param orderedReturn Should the return List be ordered and positional in relation to the incoming ids?
     * @return Orderlists associated with the given orderlistIds.
     */
    List<Orderlist> findByMultipleIds(List<Integer> orderlistIds, boolean orderedReturn);


    /**
     * Updates the details of an existing Orderlist. It replaces all fields of the existing Orderlist with the given orderlist.
     *
     * This method overrides the input field values using Server side or database managed properties defined on Orderlist if any.
     *
     * @param orderlist The details of the Orderlist to be updated; value cannot be null.
     * @return The updated Orderlist.
     * @throws EntityNotFoundException if no Orderlist is found with given input.
     */
    Orderlist update(@Valid Orderlist orderlist);


    /**
     * Partially updates the details of an existing Orderlist. It updates only the
     * fields of the existing Orderlist which are passed in the orderlistPatch.
     *
     * This method overrides the input field values using Server side or database managed properties defined on Orderlist if any.
     *
     * @param orderlistId The id of the Orderlist to be deleted; value cannot be null.
     * @param orderlistPatch The partial data of Orderlist which is supposed to be updated; value cannot be null.
     * @return The updated Orderlist.
     * @throws EntityNotFoundException if no Orderlist is found with given input.
     */
    Orderlist partialUpdate(Integer orderlistId, Map<String, Object> orderlistPatch);

    /**
     * Deletes an existing Orderlist with the given id.
     *
     * @param orderlistId The id of the Orderlist to be deleted; value cannot be null.
     * @return The deleted Orderlist.
     * @throws EntityNotFoundException if no Orderlist found with the given id.
     */
    Orderlist delete(Integer orderlistId);

    /**
     * Deletes an existing Orderlist with the given object.
     *
     * @param orderlist The instance of the Orderlist to be deleted; value cannot be null.
     */
    void delete(Orderlist orderlist);

    /**
     * Find all Orderlists matching the given QueryFilter(s).
     * All the QueryFilter(s) are ANDed to filter the results.
     * This method returns Paginated results.
     *
     * @deprecated Use {@link #findAll(String, Pageable)} instead.
     *
     * @param queryFilters Array of queryFilters to filter the results; No filters applied if the input is null/empty.
     * @param pageable Details of the pagination information along with the sorting options. If null returns all matching records.
     * @return Paginated list of matching Orderlists.
     *
     * @see QueryFilter
     * @see Pageable
     * @see Page
     */
    @Deprecated
    Page<Orderlist> findAll(QueryFilter[] queryFilters, Pageable pageable);

    /**
     * Find all Orderlists matching the given input query. This method returns Paginated results.
     * Note: Go through the documentation for <u>query</u> syntax.
     *
     * @param query The query to filter the results; No filters applied if the input is null/empty.
     * @param pageable Details of the pagination information along with the sorting options. If null returns all matching records.
     * @return Paginated list of matching Orderlists.
     *
     * @see Pageable
     * @see Page
     */
    Page<Orderlist> findAll(String query, Pageable pageable);

    /**
     * Exports all Orderlists matching the given input query to the given exportType format.
     * Note: Go through the documentation for <u>query</u> syntax.
     *
     * @param exportType The format in which to export the data; value cannot be null.
     * @param query The query to filter the results; No filters applied if the input is null/empty.
     * @param pageable Details of the pagination information along with the sorting options. If null exports all matching records.
     * @return The Downloadable file in given export type.
     *
     * @see Pageable
     * @see ExportType
     * @see Downloadable
     */
    Downloadable export(ExportType exportType, String query, Pageable pageable);

    /**
     * Exports all Orderlists matching the given input query to the given exportType format.
     *
     * @param options The export options provided by the user; No filters applied if the input is null/empty.
     * @param pageable Details of the pagination information along with the sorting options. If null exports all matching records.
     * @param outputStream The output stream of the file for the exported data to be written to.
     *
     * @see DataExportOptions
     * @see Pageable
     * @see OutputStream
     */
    void export(DataExportOptions options, Pageable pageable, OutputStream outputStream);

    /**
     * Retrieve the count of the Orderlists in the repository with matching query.
     * Note: Go through the documentation for <u>query</u> syntax.
     *
     * @param query query to filter results. No filters applied if the input is null/empty.
     * @return The count of the Orderlist.
     */
    long count(String query);

    /**
     * Retrieve aggregated values with matching aggregation info.
     *
     * @param aggregationInfo info related to aggregations.
     * @param pageable Details of the pagination information along with the sorting options. If null exports all matching records.
     * @return Paginated data with included fields.
     *
     * @see AggregationInfo
     * @see Pageable
     * @see Page
	 */
    Page<Map<String, Object>> getAggregatedValues(AggregationInfo aggregationInfo, Pageable pageable);

    /*
     * Returns the associated orderItems for given Orderlist id.
     *
     * @param id value of id; value cannot be null
     * @param pageable Details of the pagination information along with the sorting options. If null returns all matching records.
     * @return Paginated list of associated OrderItem instances.
     *
     * @see Pageable
     * @see Page
     */
    Page<OrderItem> findAssociatedOrderItems(Integer id, Pageable pageable);

}