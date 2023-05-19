/*Copyright (c) 2023-2024 wavemaker.com All Rights Reserved.
 This software is the confidential and proprietary information of wavemaker.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with wavemaker.com*/
package com.e_commerce_web_app.shopingapp.controller;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wavemaker.commons.wrapper.StringWrapper;
import com.wavemaker.runtime.commons.file.manager.ExportedFileManager;
import com.wavemaker.runtime.commons.file.model.Downloadable;
import com.wavemaker.runtime.data.export.DataExportOptions;
import com.wavemaker.runtime.data.export.ExportType;
import com.wavemaker.runtime.data.expression.QueryFilter;
import com.wavemaker.runtime.data.model.AggregationInfo;
import com.wavemaker.tools.api.core.annotations.MapTo;
import com.wavemaker.tools.api.core.annotations.WMAccessVisibility;
import com.wavemaker.tools.api.core.models.AccessSpecifier;
import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import com.wordnik.swagger.annotations.ApiParam;

import com.e_commerce_web_app.shopingapp.OrderItem;
import com.e_commerce_web_app.shopingapp.Orderlist;
import com.e_commerce_web_app.shopingapp.service.OrderlistService;


/**
 * Controller object for domain model class Orderlist.
 * @see Orderlist
 */
@RestController("shopingapp.OrderlistController")
@Api(value = "OrderlistController", description = "Exposes APIs to work with Orderlist resource.")
@RequestMapping("/shopingapp/Orderlist")
public class OrderlistController {

    private static final Logger LOGGER = LoggerFactory.getLogger(OrderlistController.class);

    @Autowired
	@Qualifier("shopingapp.OrderlistService")
	private OrderlistService orderlistService;

	@Autowired
	private ExportedFileManager exportedFileManager;

	@ApiOperation(value = "Creates a new Orderlist instance.")
    @PostMapping
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Orderlist createOrderlist(@RequestBody Orderlist orderlist) {
		LOGGER.debug("Create Orderlist with information: {}" , orderlist);

		orderlist = orderlistService.create(orderlist);
		LOGGER.debug("Created Orderlist with information: {}" , orderlist);

	    return orderlist;
	}

    @ApiOperation(value = "Returns the Orderlist instance associated with the given id.")
    @GetMapping(value = "/{id:.+}")
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Orderlist getOrderlist(@PathVariable("id") Integer id) {
        LOGGER.debug("Getting Orderlist with id: {}" , id);

        Orderlist foundOrderlist = orderlistService.getById(id);
        LOGGER.debug("Orderlist details with id: {}" , foundOrderlist);

        return foundOrderlist;
    }

    @ApiOperation(value = "Updates the Orderlist instance associated with the given id.")
    @PutMapping(value = "/{id:.+}")
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Orderlist editOrderlist(@PathVariable("id") Integer id, @RequestBody Orderlist orderlist) {
        LOGGER.debug("Editing Orderlist with id: {}" , orderlist.getId());

        orderlist.setId(id);
        orderlist = orderlistService.update(orderlist);
        LOGGER.debug("Orderlist details with id: {}" , orderlist);

        return orderlist;
    }
    
    @ApiOperation(value = "Partially updates the Orderlist instance associated with the given id.")
    @PatchMapping(value = "/{id:.+}")
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Orderlist patchOrderlist(@PathVariable("id") Integer id, @RequestBody @MapTo(Orderlist.class) Map<String, Object> orderlistPatch) {
        LOGGER.debug("Partially updating Orderlist with id: {}" , id);

        Orderlist orderlist = orderlistService.partialUpdate(id, orderlistPatch);
        LOGGER.debug("Orderlist details after partial update: {}" , orderlist);

        return orderlist;
    }

    @ApiOperation(value = "Deletes the Orderlist instance associated with the given id.")
    @DeleteMapping(value = "/{id:.+}")
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public boolean deleteOrderlist(@PathVariable("id") Integer id) {
        LOGGER.debug("Deleting Orderlist with id: {}" , id);

        Orderlist deletedOrderlist = orderlistService.delete(id);

        return deletedOrderlist != null;
    }

    /**
     * @deprecated Use {@link #findOrderlists(String, Pageable)} instead.
     */
    @Deprecated
    @ApiOperation(value = "Returns the list of Orderlist instances matching the search criteria.")
    @PostMapping(value = "/search")
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Page<Orderlist> searchOrderlistsByQueryFilters( Pageable pageable, @RequestBody QueryFilter[] queryFilters) {
        LOGGER.debug("Rendering Orderlists list by query filter:{}", (Object) queryFilters);
        return orderlistService.findAll(queryFilters, pageable);
    }

    @ApiOperation(value = "Returns the paginated list of Orderlist instances matching the optional query (q) request param. If there is no query provided, it returns all the instances. Pagination & Sorting parameters such as page& size, sort can be sent as request parameters. The sort value should be a comma separated list of field names & optional sort order to sort the data on. eg: field1 asc, field2 desc etc ")
    @GetMapping
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Page<Orderlist> findOrderlists(@ApiParam("conditions to filter the results") @RequestParam(value = "q", required = false) String query, Pageable pageable) {
        LOGGER.debug("Rendering Orderlists list by filter:", query);
        return orderlistService.findAll(query, pageable);
    }

    @ApiOperation(value = "Returns the paginated list of Orderlist instances matching the optional query (q) request param. This API should be used only if the query string is too big to fit in GET request with request param. The request has to made in application/x-www-form-urlencoded format.")
    @PostMapping(value="/filter", consumes= "application/x-www-form-urlencoded")
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Page<Orderlist> filterOrderlists(@ApiParam("conditions to filter the results") @RequestParam(value = "q", required = false) String query, Pageable pageable) {
        LOGGER.debug("Rendering Orderlists list by filter", query);
        return orderlistService.findAll(query, pageable);
    }

    @ApiOperation(value = "Returns downloadable file for the data matching the optional query (q) request param.")
    @GetMapping(value = "/export/{exportType}", produces = "application/octet-stream")
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Downloadable exportOrderlists(@PathVariable("exportType") ExportType exportType, @ApiParam("conditions to filter the results") @RequestParam(value = "q", required = false) String query, Pageable pageable) {
         return orderlistService.export(exportType, query, pageable);
    }

    @ApiOperation(value = "Returns a URL to download a file for the data matching the optional query (q) request param and the required fields provided in the Export Options.") 
    @PostMapping(value = "/export", consumes = "application/json")
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public StringWrapper exportOrderlistsAndGetURL(@RequestBody DataExportOptions exportOptions, Pageable pageable) {
        String exportedFileName = exportOptions.getFileName();
        if(exportedFileName == null || exportedFileName.isEmpty()) {
            exportedFileName = Orderlist.class.getSimpleName();
        }
        exportedFileName += exportOptions.getExportType().getExtension();
        String exportedUrl = exportedFileManager.registerAndGetURL(exportedFileName, outputStream -> orderlistService.export(exportOptions, pageable, outputStream));
        return new StringWrapper(exportedUrl);
    }

	@ApiOperation(value = "Returns the total count of Orderlist instances matching the optional query (q) request param.")
	@GetMapping(value = "/count")
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
	public Long countOrderlists( @ApiParam("conditions to filter the results") @RequestParam(value = "q", required = false) String query) {
		LOGGER.debug("counting Orderlists");
		return orderlistService.count(query);
	}

    @ApiOperation(value = "Returns aggregated result with given aggregation info")
	@PostMapping(value = "/aggregations")
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
	public Page<Map<String, Object>> getOrderlistAggregatedValues(@RequestBody AggregationInfo aggregationInfo, Pageable pageable) {
        LOGGER.debug("Fetching aggregated results for {}", aggregationInfo);
        return orderlistService.getAggregatedValues(aggregationInfo, pageable);
    }

    @GetMapping(value="/{id:.+}/orderItems")
    @ApiOperation(value = "Gets the orderItems instance associated with the given id.")
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Page<OrderItem> findAssociatedOrderItems(@PathVariable("id") Integer id, Pageable pageable) {

        LOGGER.debug("Fetching all associated orderItems");
        return orderlistService.findAssociatedOrderItems(id, pageable);
    }

    /**
	 * This setter method should only be used by unit tests
	 *
	 * @param service OrderlistService instance
	 */
	protected void setOrderlistService(OrderlistService service) {
		this.orderlistService = service;
	}

}