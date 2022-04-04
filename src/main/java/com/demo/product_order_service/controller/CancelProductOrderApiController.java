package com.demo.product_order_service.controller;


import com.demo.product_order_service.api.CancelProductOrderApi;
import com.demo.product_order_service.model.CancelProductOrder;
import com.demo.product_order_service.model.CancelProductOrderCreate;
import com.fasterxml.jackson.databind.ObjectMapper;
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
import java.io.IOException;
import java.util.List;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-04-01T16:09:59.293+07:00")

@Controller
public class CancelProductOrderApiController implements CancelProductOrderApi {

    private static final Logger log = LoggerFactory.getLogger(CancelProductOrderApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @Autowired
    public CancelProductOrderApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<CancelProductOrder> createCancelProductOrder(@ApiParam(value = "The CancelProductOrder to be created", required = true) @Valid @RequestBody CancelProductOrderCreate cancelProductOrder) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<CancelProductOrder>(objectMapper.readValue("{  \"requestedCancellationDate\" : \"2000-01-23T04:56:07.000+00:00\",  \"@baseType\" : \"@baseType\",  \"cancellationReason\" : \"cancellationReason\",  \"@type\" : \"@type\",  \"productOrder\" : {    \"@referredType\" : \"@referredType\",    \"@baseType\" : \"@baseType\",    \"@type\" : \"@type\",    \"name\" : \"name\",    \"id\" : \"id\",    \"href\" : \"href\",    \"@schemaLocation\" : \"http://example.com/aeiou\"  },  \"id\" : \"id\",  \"href\" : \"href\",  \"state\" : { },  \"@schemaLocation\" : \"http://example.com/aeiou\",  \"effectiveCancellationDate\" : \"2000-01-23T04:56:07.000+00:00\"}", CancelProductOrder.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<CancelProductOrder>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<CancelProductOrder>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<CancelProductOrder>> listCancelProductOrder(@ApiParam(value = "Comma-separated properties to be provided in response") @Valid @RequestParam(value = "fields", required = false) String fields, @ApiParam(value = "Requested index for start of resources to be provided in response") @Valid @RequestParam(value = "offset", required = false) Integer offset, @ApiParam(value = "Requested number of resources to be provided in response") @Valid @RequestParam(value = "limit", required = false) Integer limit) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<CancelProductOrder>>(objectMapper.readValue("[ {  \"requestedCancellationDate\" : \"2000-01-23T04:56:07.000+00:00\",  \"@baseType\" : \"@baseType\",  \"cancellationReason\" : \"cancellationReason\",  \"@type\" : \"@type\",  \"productOrder\" : {    \"@referredType\" : \"@referredType\",    \"@baseType\" : \"@baseType\",    \"@type\" : \"@type\",    \"name\" : \"name\",    \"id\" : \"id\",    \"href\" : \"href\",    \"@schemaLocation\" : \"http://example.com/aeiou\"  },  \"id\" : \"id\",  \"href\" : \"href\",  \"state\" : { },  \"@schemaLocation\" : \"http://example.com/aeiou\",  \"effectiveCancellationDate\" : \"2000-01-23T04:56:07.000+00:00\"}, {  \"requestedCancellationDate\" : \"2000-01-23T04:56:07.000+00:00\",  \"@baseType\" : \"@baseType\",  \"cancellationReason\" : \"cancellationReason\",  \"@type\" : \"@type\",  \"productOrder\" : {    \"@referredType\" : \"@referredType\",    \"@baseType\" : \"@baseType\",    \"@type\" : \"@type\",    \"name\" : \"name\",    \"id\" : \"id\",    \"href\" : \"href\",    \"@schemaLocation\" : \"http://example.com/aeiou\"  },  \"id\" : \"id\",  \"href\" : \"href\",  \"state\" : { },  \"@schemaLocation\" : \"http://example.com/aeiou\",  \"effectiveCancellationDate\" : \"2000-01-23T04:56:07.000+00:00\"} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<CancelProductOrder>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<CancelProductOrder>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<CancelProductOrder> retrieveCancelProductOrder(@ApiParam(value = "Identifier of the CancelProductOrder", required = true) @PathVariable("id") String id, @ApiParam(value = "Comma-separated properties to provide in response") @Valid @RequestParam(value = "fields", required = false) String fields) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<CancelProductOrder>(objectMapper.readValue("{  \"requestedCancellationDate\" : \"2000-01-23T04:56:07.000+00:00\",  \"@baseType\" : \"@baseType\",  \"cancellationReason\" : \"cancellationReason\",  \"@type\" : \"@type\",  \"productOrder\" : {    \"@referredType\" : \"@referredType\",    \"@baseType\" : \"@baseType\",    \"@type\" : \"@type\",    \"name\" : \"name\",    \"id\" : \"id\",    \"href\" : \"href\",    \"@schemaLocation\" : \"http://example.com/aeiou\"  },  \"id\" : \"id\",  \"href\" : \"href\",  \"state\" : { },  \"@schemaLocation\" : \"http://example.com/aeiou\",  \"effectiveCancellationDate\" : \"2000-01-23T04:56:07.000+00:00\"}", CancelProductOrder.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<CancelProductOrder>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<CancelProductOrder>(HttpStatus.NOT_IMPLEMENTED);
    }

}
