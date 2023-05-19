/*
 * 
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 2.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.e_commerce_web_app.opencagedata.model;

import java.util.Objects;
import java.util.Arrays;
import com.e_commerce_web_app.opencagedata.model.ResponseLicensesEntryItem;
import com.e_commerce_web_app.opencagedata.model.ResponseRate;
import com.e_commerce_web_app.opencagedata.model.ResponseResultsEntryItem;
import com.e_commerce_web_app.opencagedata.model.ResponseStatus;
import com.e_commerce_web_app.opencagedata.model.ResponseStayInformed;
import com.e_commerce_web_app.opencagedata.model.ResponseTimestamp;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.List;
/**
 * RootResponse
 */

public class RootResponse {
  @JsonProperty("thanks")
  private String thanks = null;

  @JsonProperty("licenses")
  private List<ResponseLicensesEntryItem> licenses = new ArrayList<>();

  @JsonProperty("rate")
  private ResponseRate rate = null;

  @JsonProperty("documentation")
  private String documentation = null;

  @JsonProperty("stay_informed")
  private ResponseStayInformed stay_informed = null;

  @JsonProperty("results")
  private List<ResponseResultsEntryItem> results = new ArrayList<>();

  @JsonProperty("status")
  private ResponseStatus status = null;

  @JsonProperty("timestamp")
  private ResponseTimestamp timestamp = null;

  @JsonProperty("total_results")
  private Integer total_results = null;

  public RootResponse thanks(String thanks) {
    this.thanks = thanks;
    return this;
  }

   /**
   * Get thanks
   * @return thanks
  **/
  public String getThanks() {
    return thanks;
  }

  public void setThanks(String thanks) {
    this.thanks = thanks;
  }

  public RootResponse licenses(List<ResponseLicensesEntryItem> licenses) {
    this.licenses = licenses;
    return this;
  }

  public RootResponse addLicensesItem(ResponseLicensesEntryItem licensesItem) {
    this.licenses.add(licensesItem);
    return this;
  }

   /**
   * Get licenses
   * @return licenses
  **/
  public List<ResponseLicensesEntryItem> getLicenses() {
    return licenses;
  }

  public void setLicenses(List<ResponseLicensesEntryItem> licenses) {
    this.licenses = licenses;
  }

  public RootResponse rate(ResponseRate rate) {
    this.rate = rate;
    return this;
  }

   /**
   * Get rate
   * @return rate
  **/
  public ResponseRate getRate() {
    return rate;
  }

  public void setRate(ResponseRate rate) {
    this.rate = rate;
  }

  public RootResponse documentation(String documentation) {
    this.documentation = documentation;
    return this;
  }

   /**
   * Get documentation
   * @return documentation
  **/
  public String getDocumentation() {
    return documentation;
  }

  public void setDocumentation(String documentation) {
    this.documentation = documentation;
  }

  public RootResponse stay_informed(ResponseStayInformed stay_informed) {
    this.stay_informed = stay_informed;
    return this;
  }

   /**
   * Get stay_informed
   * @return stay_informed
  **/
  public ResponseStayInformed getStayInformed() {
    return stay_informed;
  }

  public void setStayInformed(ResponseStayInformed stay_informed) {
    this.stay_informed = stay_informed;
  }

  public RootResponse results(List<ResponseResultsEntryItem> results) {
    this.results = results;
    return this;
  }

  public RootResponse addResultsItem(ResponseResultsEntryItem resultsItem) {
    this.results.add(resultsItem);
    return this;
  }

   /**
   * Get results
   * @return results
  **/
  public List<ResponseResultsEntryItem> getResults() {
    return results;
  }

  public void setResults(List<ResponseResultsEntryItem> results) {
    this.results = results;
  }

  public RootResponse status(ResponseStatus status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  public ResponseStatus getStatus() {
    return status;
  }

  public void setStatus(ResponseStatus status) {
    this.status = status;
  }

  public RootResponse timestamp(ResponseTimestamp timestamp) {
    this.timestamp = timestamp;
    return this;
  }

   /**
   * Get timestamp
   * @return timestamp
  **/
  public ResponseTimestamp getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(ResponseTimestamp timestamp) {
    this.timestamp = timestamp;
  }

  public RootResponse total_results(Integer total_results) {
    this.total_results = total_results;
    return this;
  }

   /**
   * Get total_results
   * @return total_results
  **/
  public Integer getTotalResults() {
    return total_results;
  }

  public void setTotalResults(Integer total_results) {
    this.total_results = total_results;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RootResponse RootResponse = (RootResponse) o;
    return Objects.equals(this.thanks, RootResponse.thanks) &&
        Objects.equals(this.licenses, RootResponse.licenses) &&
        Objects.equals(this.rate, RootResponse.rate) &&
        Objects.equals(this.documentation, RootResponse.documentation) &&
        Objects.equals(this.stay_informed, RootResponse.stay_informed) &&
        Objects.equals(this.results, RootResponse.results) &&
        Objects.equals(this.status, RootResponse.status) &&
        Objects.equals(this.timestamp, RootResponse.timestamp) &&
        Objects.equals(this.total_results, RootResponse.total_results);
  }

  @Override
  public int hashCode() {
    return Objects.hash(thanks, licenses, rate, documentation, stay_informed, results, status, timestamp, total_results);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RootResponse {\n");
    
    sb.append("    thanks: ").append(toIndentedString(thanks)).append("\n");
    sb.append("    licenses: ").append(toIndentedString(licenses)).append("\n");
    sb.append("    rate: ").append(toIndentedString(rate)).append("\n");
    sb.append("    documentation: ").append(toIndentedString(documentation)).append("\n");
    sb.append("    stay_informed: ").append(toIndentedString(stay_informed)).append("\n");
    sb.append("    results: ").append(toIndentedString(results)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    total_results: ").append(toIndentedString(total_results)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}