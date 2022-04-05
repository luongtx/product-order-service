package com.demo.product_order_service.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class ProductOrderItemResponseDTO {
    @JsonProperty("id")
    private String id = null;

    @JsonProperty("quantity")
    private Integer quantity = null;

    @JsonProperty("productOffering")
    private ProductOfferingResponseDTO productOffering = null;

    @JsonProperty("productOrderItems")
    private List<ProductOrderItemResponseDTO> productOrderItems;


    public void setId(String id) {
        this.id = id;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public void setProductOffering(ProductOfferingResponseDTO productOffering) {
        this.productOffering = productOffering;
    }

    public void setProductOrderItems(List<ProductOrderItemResponseDTO> productOrderItems) {
        this.productOrderItems = productOrderItems;
    }
}
