package com.demo.product_order_service.controller;

import com.demo.product_order_service.api.ProductOrderApi;
import com.demo.product_order_service.integration.ProductOfferingClient;
import com.demo.product_order_service.model.ProductOfferingRef;
import com.demo.product_order_service.model.ProductOrder;
import com.demo.product_order_service.model.ProductOrderCreate;
import com.demo.product_order_service.model.ProductOrderUpdate;
import com.fasterxml.jackson.databind.ObjectMapper;
import feign.FeignException;
import io.swagger.annotations.ApiParam;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.util.Arrays;
import java.util.List;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-04-01T16:09:59.293+07:00")

@Controller
public class ProductOrderApiController implements ProductOrderApi {

    private static final Logger log = LoggerFactory.getLogger(ProductOrderApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @Autowired
    ProductOfferingClient productOfferingClient;

    @Autowired
    public ProductOrderApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<ProductOrder> createProductOrder(@ApiParam(value = "The ProductOrder to be created", required = true) @Valid @RequestBody ProductOrderCreate productOrder) {
        return new ResponseEntity<ProductOrder>(new ProductOrder(), HttpStatus.OK);
    }

    public ResponseEntity<Void> deleteProductOrder(@ApiParam(value = "Identifier of the ProductOrder", required = true) @PathVariable("id") String id) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<ProductOrder>> listProductOrder(@ApiParam(value = "Comma-separated properties to be provided in response") @Valid @RequestParam(value = "fields", required = false) String fields, @ApiParam(value = "Requested index for start of resources to be provided in response") @Valid @RequestParam(value = "offset", required = false) Integer offset, @ApiParam(value = "Requested number of resources to be provided in response") @Valid @RequestParam(value = "limit", required = false) Integer limit) {
        return new ResponseEntity<List<ProductOrder>>(Arrays.asList(new ProductOrder()), HttpStatus.OK);
    }

    public ResponseEntity<ProductOrder> patchProductOrder(@ApiParam(value = "Identifier of the ProductOrder", required = true) @PathVariable("id") String id, @ApiParam(value = "The ProductOrder to be updated", required = true) @Valid @RequestBody ProductOrderUpdate productOrder) {
        return new ResponseEntity<>(new ProductOrder(), HttpStatus.OK);
    }

    public ResponseEntity<ProductOrder> retrieveProductOrder(@ApiParam(value = "Identifier of the ProductOrder", required = true) @PathVariable("id") String id, @ApiParam(value = "Comma-separated properties to provide in response") @Valid @RequestParam(value = "fields", required = false) String fields) {
        ProductOrder productOrder = new ProductOrder();
        ProductOfferingRef productOfferingRef = null;
        try {
            productOfferingRef = productOfferingClient.retrieveProductOffering(id, fields);
        } catch (FeignException e) {
            log.error(e.getLocalizedMessage());
        }
        if (productOfferingRef != null) {
            productOrder.setId(productOfferingRef.getId());
            productOrder.setHref(productOfferingRef.getHref());
            productOrder.setBaseType(productOfferingRef.getBaseType());
            productOrder.setSchemaLocation(productOfferingRef.getSchemaLocation());
            productOrder.setType(productOfferingRef.getType());
        }
        return new ResponseEntity<ProductOrder>(productOrder, HttpStatus.OK);
    }

}
