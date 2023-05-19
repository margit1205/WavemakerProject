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
import com.e_commerce_web_app.opencagedata.model.ResponseRegions;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.List;
/**
 * ResponseUNM49
 */

public class ResponseUNM49 {
  @JsonProperty("regions")
  private ResponseRegions regions = null;

  @JsonProperty("statistical_groupings")
  private List<String> statistical_groupings = new ArrayList<>();

  public ResponseUNM49 regions(ResponseRegions regions) {
    this.regions = regions;
    return this;
  }

   /**
   * Get regions
   * @return regions
  **/
  public ResponseRegions getRegions() {
    return regions;
  }

  public void setRegions(ResponseRegions regions) {
    this.regions = regions;
  }

  public ResponseUNM49 statistical_groupings(List<String> statistical_groupings) {
    this.statistical_groupings = statistical_groupings;
    return this;
  }

  public ResponseUNM49 addStatisticalGroupingsItem(String statistical_groupingsItem) {
    this.statistical_groupings.add(statistical_groupingsItem);
    return this;
  }

   /**
   * Get statistical_groupings
   * @return statistical_groupings
  **/
  public List<String> getStatisticalGroupings() {
    return statistical_groupings;
  }

  public void setStatisticalGroupings(List<String> statistical_groupings) {
    this.statistical_groupings = statistical_groupings;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponseUNM49 Response_UN_M49 = (ResponseUNM49) o;
    return Objects.equals(this.regions, Response_UN_M49.regions) &&
        Objects.equals(this.statistical_groupings, Response_UN_M49.statistical_groupings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(regions, statistical_groupings);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseUNM49 {\n");
    
    sb.append("    regions: ").append(toIndentedString(regions)).append("\n");
    sb.append("    statistical_groupings: ").append(toIndentedString(statistical_groupings)).append("\n");
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
