package com.demo.product_order_service.integration;

import com.demo.product_order_service.model.ProductOfferingRef;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("product-catalog-service")
public interface ProductOfferingClient {

    @RequestMapping(value = "/productOffering/{id}", method = RequestMethod.GET)
    ProductOfferingRef retrieveProductOffering(@PathVariable("id") String id, @RequestParam(value = "fields", required = false) String fields);
}
