package com.demo.product_order_service.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ProductOfferingResponseDTO {
    @JsonProperty("id")
    private String id = null;

    @JsonProperty("href")
    private String href = null;

    @JsonProperty("name")
    private String name = null;

    @JsonProperty("description")
    private String description = null;

    @JsonProperty("isBundle")
    private Boolean isBundle = null;

    @JsonProperty("version")
    private String version = null;

    @JsonProperty("@type")
    private String type = null;

    @JsonProperty("@baseType")
    private String baseType = null;

    @JsonProperty("@schemaLocation")
    private String schemaLocation = null;
}
