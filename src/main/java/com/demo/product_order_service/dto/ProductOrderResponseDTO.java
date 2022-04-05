package com.demo.product_order_service.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class ProductOrderResponseDTO {
    @JsonProperty("id")
    private String id = null;

    @JsonProperty("href")
    private String href = null;

    @JsonProperty("productOrderItems")
    private List<ProductOrderItemResponseDTO> productOrderItems;

    public void setProductOrderItems(List<ProductOrderItemResponseDTO> productOrderItems) {
        this.productOrderItems = productOrderItems;
    }
}
