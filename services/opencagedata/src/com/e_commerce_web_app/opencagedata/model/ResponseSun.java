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
import com.e_commerce_web_app.opencagedata.model.ResponseRise;
import com.e_commerce_web_app.opencagedata.model.ResponseSet;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
/**
 * ResponseSun
 */

public class ResponseSun {
  @JsonProperty("set")
  private ResponseSet set = null;

  @JsonProperty("rise")
  private ResponseRise rise = null;

  public ResponseSun set(ResponseSet set) {
    this.set = set;
    return this;
  }

   /**
   * Get set
   * @return set
  **/
  public ResponseSet getSet() {
    return set;
  }

  public void setSet(ResponseSet set) {
    this.set = set;
  }

  public ResponseSun rise(ResponseRise rise) {
    this.rise = rise;
    return this;
  }

   /**
   * Get rise
   * @return rise
  **/
  public ResponseRise getRise() {
    return rise;
  }

  public void setRise(ResponseRise rise) {
    this.rise = rise;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponseSun Response_sun = (ResponseSun) o;
    return Objects.equals(this.set, Response_sun.set) &&
        Objects.equals(this.rise, Response_sun.rise);
  }

  @Override
  public int hashCode() {
    return Objects.hash(set, rise);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseSun {\n");
    
    sb.append("    set: ").append(toIndentedString(set)).append("\n");
    sb.append("    rise: ").append(toIndentedString(rise)).append("\n");
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