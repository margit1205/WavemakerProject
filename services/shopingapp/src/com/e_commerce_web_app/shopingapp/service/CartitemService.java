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

import com.e_commerce_web_app.shopingapp.Cartitem;

/**
 * Service object for domain model class {@link Cartitem}.
 */
public interface CartitemService {

    /**
     * Creates a new Cartitem. It does cascade insert for all the children in a single transaction.
     *
     * This method overrides the input field values using Server side or database managed properties defined on Cartitem if any.
     *
     * @param cartitem Details of the Cartitem to be created; value cannot be null.
     * @return The newly created Cartitem.
     */
    Cartitem create(@Valid Cartitem cartitem);


	/**
     * Returns Cartitem by given id if exists.
     *
     * @param cartitemId The id of the Cartitem to get; value cannot be null.
     * @return Cartitem associated with the given cartitemId.
	 * @throws EntityNotFoundException If no Cartitem is found.
     */
    Cartitem getById(Integer cartitemId);

    /**
     * Find and return the Cartitem by given id if exists, returns null otherwise.
     *
     * @param cartitemId The id of the Cartitem to get; value cannot be null.
     * @return Cartitem associated with the given cartitemId.
     */
    Cartitem findById(Integer cartitemId);

	/**
     * Find and return the list of Cartitems by given id's.
     *
     * If orderedReturn true, the return List is ordered and positional relative to the incoming ids.
     *
     * In case of unknown entities:
     *
     * If enabled, A null is inserted into the List at the proper position(s).
     * If disabled, the nulls are not put into the return List.
     *
     * @param cartitemIds The id's of the Cartitem to get; value cannot be null.
     * @param orderedReturn Should the return List be ordered and positional in relation to the incoming ids?
     * @return Cartitems associated with the given cartitemIds.
     */
    List<Cartitem> findByMultipleIds(List<Integer> cartitemIds, boolean orderedReturn);


    /**
     * Updates the details of an existing Cartitem. It replaces all fields of the existing Cartitem with the given cartitem.
     *
     * This method overrides the input field values using Server side or database managed properties defined on Cartitem if any.
     *
     * @param cartitem The details of the Cartitem to be updated; value cannot be null.
     * @return The updated Cartitem.
     * @throws EntityNotFoundException if no Cartitem is found with given input.
     */
    Cartitem update(@Valid Cartitem cartitem);


    /**
     * Partially updates the details of an existing Cartitem. It updates only the
     * fields of the existing Cartitem which are passed in the cartitemPatch.
     *
     * This method overrides the input field values using Server side or database managed properties defined on Cartitem if any.
     *
     * @param cartitemId The id of the Cartitem to be deleted; value cannot be null.
     * @param cartitemPatch The partial data of Cartitem which is supposed to be updated; value cannot be null.
     * @return The updated Cartitem.
     * @throws EntityNotFoundException if no Cartitem is found with given input.
     */
    Cartitem partialUpdate(Integer cartitemId, Map<String, Object> cartitemPatch);

    /**
     * Deletes an existing Cartitem with the given id.
     *
     * @param cartitemId The id of the Cartitem to be deleted; value cannot be null.
     * @return The deleted Cartitem.
     * @throws EntityNotFoundException if no Cartitem found with the given id.
     */
    Cartitem delete(Integer cartitemId);

    /**
     * Deletes an existing Cartitem with the given object.
     *
     * @param cartitem The instance of the Cartitem to be deleted; value cannot be null.
     */
    void delete(Cartitem cartitem);

    /**
     * Find all Cartitems matching the given QueryFilter(s).
     * All the QueryFilter(s) are ANDed to filter the results.
     * This method returns Paginated results.
     *
     * @deprecated Use {@link #findAll(String, Pageable)} instead.
     *
     * @param queryFilters Array of queryFilters to filter the results; No filters applied if the input is null/empty.
     * @param pageable Details of the pagination information along with the sorting options. If null returns all matching records.
     * @return Paginated list of matching Cartitems.
     *
     * @see QueryFilter
     * @see Pageable
     * @see Page
     */
    @Deprecated
    Page<Cartitem> findAll(QueryFilter[] queryFilters, Pageable pageable);

    /**
     * Find all Cartitems matching the given input query. This method returns Paginated results.
     * Note: Go through the documentation for <u>query</u> syntax.
     *
     * @param query The query to filter the results; No filters applied if the input is null/empty.
     * @param pageable Details of the pagination information along with the sorting options. If null returns all matching records.
     * @return Paginated list of matching Cartitems.
     *
     * @see Pageable
     * @see Page
     */
    Page<Cartitem> findAll(String query, Pageable pageable);

    /**
     * Exports all Cartitems matching the given input query to the given exportType format.
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
     * Exports all Cartitems matching the given input query to the given exportType format.
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
     * Retrieve the count of the Cartitems in the repository with matching query.
     * Note: Go through the documentation for <u>query</u> syntax.
     *
     * @param query query to filter results. No filters applied if the input is null/empty.
     * @return The count of the Cartitem.
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


}