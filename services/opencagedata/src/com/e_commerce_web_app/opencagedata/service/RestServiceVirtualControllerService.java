package com.e_commerce_web_app.opencagedata.service;


import com.e_commerce_web_app.opencagedata.model.*;
import com.e_commerce_web_app.opencagedata.model.RootResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.lang.Object;
import org.springframework.util.MultiValueMap;
import feign.*;

public interface RestServiceVirtualControllerService {

  /**
   * 
   * 
    * @param query query (optional)
    * @param key key (optional)
   * @return RootResponse
   */
  @RequestLine("GET /v1/json?query={query}&key={key}")
  @Headers({
    "Accept: application/json",  })
  RootResponse restServiceVirtualControllerInvoke(@Param("query") String query, @Param("key") String key);


    /**
     * 
     * 
     * Note, this is equivalent to the other <code>restServiceVirtualControllerInvoke</code> method,
     * but with the query parameters collected into a single Map parameter. This
     * is convenient for services with optional query parameters, especially when
     * used with the {@link RestServiceVirtualControllerInvokeQueryParams} class that allows for
     * building up this map in a fluent style.
     * @param queryParams Map of query parameters as name-value pairs
     *   <p>The following elements may be specified in the query map:</p>
     *   <ul>
     *   <li>query - query (optional)</li>
     *   <li>key - key (optional)</li>
     *   </ul>
     * @return RootResponse
     */
    @RequestLine("GET /v1/json?query={query}&key={key}")
    @Headers({
    "Accept: application/json",    })
    RootResponse restServiceVirtualControllerInvoke
    (@QueryMap(encoded=true)
    MultiValueMap<String, String> queryParams);

}
