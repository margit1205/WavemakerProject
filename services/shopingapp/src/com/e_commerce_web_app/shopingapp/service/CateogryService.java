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

import com.e_commerce_web_app.shopingapp.Cateogry;
import com.e_commerce_web_app.shopingapp.Product;

/**
 * Service object for domain model class {@link Cateogry}.
 */
public interface CateogryService {

    /**
     * Creates a new Cateogry. It does cascade insert for all the children in a single transaction.
     *
     * This method overrides the input field values using Server side or database managed properties defined on Cateogry if any.
     *
     * @param cateogry Details of the Cateogry to be created; value cannot be null.
     * @return The newly created Cateogry.
     */
    Cateogry create(@Valid Cateogry cateogry);


	/**
     * Returns Cateogry by given id if exists.
     *
     * @param cateogryId The id of the Cateogry to get; value cannot be null.
     * @return Cateogry associated with the given cateogryId.
	 * @throws EntityNotFoundException If no Cateogry is found.
     */
    Cateogry getById(Integer cateogryId);

    /**
     * Find and return the Cateogry by given id if exists, returns null otherwise.
     *
     * @param cateogryId The id of the Cateogry to get; value cannot be null.
     * @return Cateogry associated with the given cateogryId.
     */
    Cateogry findById(Integer cateogryId);

	/**
     * Find and return the list of Cateogries by given id's.
     *
     * If orderedReturn true, the return List is ordered and positional relative to the incoming ids.
     *
     * In case of unknown entities:
     *
     * If enabled, A null is inserted into the List at the proper position(s).
     * If disabled, the nulls are not put into the return List.
     *
     * @param cateogryIds The id's of the Cateogry to get; value cannot be null.
     * @param orderedReturn Should the return List be ordered and positional in relation to the incoming ids?
     * @return Cateogries associated with the given cateogryIds.
     */
    List<Cateogry> findByMultipleIds(List<Integer> cateogryIds, boolean orderedReturn);


    /**
     * Updates the details of an existing Cateogry. It replaces all fields of the existing Cateogry with the given cateogry.
     *
     * This method overrides the input field values using Server side or database managed properties defined on Cateogry if any.
     *
     * @param cateogry The details of the Cateogry to be updated; value cannot be null.
     * @return The updated Cateogry.
     * @throws EntityNotFoundException if no Cateogry is found with given input.
     */
    Cateogry update(@Valid Cateogry cateogry);


    /**
     * Partially updates the details of an existing Cateogry. It updates only the
     * fields of the existing Cateogry which are passed in the cateogryPatch.
     *
     * This method overrides the input field values using Server side or database managed properties defined on Cateogry if any.
     *
     * @param cateogryId The id of the Cateogry to be deleted; value cannot be null.
     * @param cateogryPatch The partial data of Cateogry which is supposed to be updated; value cannot be null.
     * @return The updated Cateogry.
     * @throws EntityNotFoundException if no Cateogry is found with given input.
     */
    Cateogry partialUpdate(Integer cateogryId, Map<String, Object> cateogryPatch);

    /**
     * Deletes an existing Cateogry with the given id.
     *
     * @param cateogryId The id of the Cateogry to be deleted; value cannot be null.
     * @return The deleted Cateogry.
     * @throws EntityNotFoundException if no Cateogry found with the given id.
     */
    Cateogry delete(Integer cateogryId);

    /**
     * Deletes an existing Cateogry with the given object.
     *
     * @param cateogry The instance of the Cateogry to be deleted; value cannot be null.
     */
    void delete(Cateogry cateogry);

    /**
     * Find all Cateogries matching the given QueryFilter(s).
     * All the QueryFilter(s) are ANDed to filter the results.
     * This method returns Paginated results.
     *
     * @deprecated Use {@link #findAll(String, Pageable)} instead.
     *
     * @param queryFilters Array of queryFilters to filter the results; No filters applied if the input is null/empty.
     * @param pageable Details of the pagination information along with the sorting options. If null returns all matching records.
     * @return Paginated list of matching Cateogries.
     *
     * @see QueryFilter
     * @see Pageable
     * @see Page
     */
    @Deprecated
    Page<Cateogry> findAll(QueryFilter[] queryFilters, Pageable pageable);

    /**
     * Find all Cateogries matching the given input query. This method returns Paginated results.
     * Note: Go through the documentation for <u>query</u> syntax.
     *
     * @param query The query to filter the results; No filters applied if the input is null/empty.
     * @param pageable Details of the pagination information along with the sorting options. If null returns all matching records.
     * @return Paginated list of matching Cateogries.
     *
     * @see Pageable
     * @see Page
     */
    Page<Cateogry> findAll(String query, Pageable pageable);

    /**
     * Exports all Cateogries matching the given input query to the given exportType format.
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
     * Exports all Cateogries matching the given input query to the given exportType format.
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
     * Retrieve the count of the Cateogries in the repository with matching query.
     * Note: Go through the documentation for <u>query</u> syntax.
     *
     * @param query query to filter results. No filters applied if the input is null/empty.
     * @return The count of the Cateogry.
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
     * Returns the associated products for given Cateogry id.
     *
     * @param id value of id; value cannot be null
     * @param pageable Details of the pagination information along with the sorting options. If null returns all matching records.
     * @return Paginated list of associated Product instances.
     *
     * @see Pageable
     * @see Page
     */
    Page<Product> findAssociatedProducts(Integer id, Pageable pageable);

}