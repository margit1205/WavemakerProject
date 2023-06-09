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
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
/**
 * ResponseRate
 */

public class ResponseRate {
  @JsonProperty("limit")
  private Integer limit = null;

  @JsonProperty("reset")
  private Integer reset = null;

  @JsonProperty("remaining")
  private Integer remaining = null;

  public ResponseRate limit(Integer limit) {
    this.limit = limit;
    return this;
  }

   /**
   * Get limit
   * @return limit
  **/
  public Integer getLimit() {
    return limit;
  }

  public void setLimit(Integer limit) {
    this.limit = limit;
  }

  public ResponseRate reset(Integer reset) {
    this.reset = reset;
    return this;
  }

   /**
   * Get reset
   * @return reset
  **/
  public Integer getReset() {
    return reset;
  }

  public void setReset(Integer reset) {
    this.reset = reset;
  }

  public ResponseRate remaining(Integer remaining) {
    this.remaining = remaining;
    return this;
  }

   /**
   * Get remaining
   * @return remaining
  **/
  public Integer getRemaining() {
    return remaining;
  }

  public void setRemaining(Integer remaining) {
    this.remaining = remaining;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponseRate Response_rate = (ResponseRate) o;
    return Objects.equals(this.limit, Response_rate.limit) &&
        Objects.equals(this.reset, Response_rate.reset) &&
        Objects.equals(this.remaining, Response_rate.remaining);
  }

  @Override
  public int hashCode() {
    return Objects.hash(limit, reset, remaining);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseRate {\n");
    
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    reset: ").append(toIndentedString(reset)).append("\n");
    sb.append("    remaining: ").append(toIndentedString(remaining)).append("\n");
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
