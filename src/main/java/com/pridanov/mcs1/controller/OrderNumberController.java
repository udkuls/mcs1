package com.pridanov.mcs1.controller;

import com.pridanov.mcs1.dto.OrderNumberDto;
import com.pridanov.mcs1.service.OrderNumberService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
@Tag(name = "Order Number Management", description = "Endpoints for managing order numbers")
public class OrderNumberController {

    private final OrderNumberService orderNumberService;

    @Autowired
    public OrderNumberController(OrderNumberService orderNumberService) {
        this.orderNumberService = orderNumberService;
    }
    @Operation(summary = "Generates a new order number")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "The order number has been successfully generated",
                    content = @Content(mediaType = "application/json",
                            schema = @Schema(implementation = OrderNumberDto.class)))
    })
    @GetMapping("/order-numbers")
    private ResponseEntity<OrderNumberDto> getOrderNumber(){
        return ResponseEntity.ok(orderNumberService.generateOrderNumber());
    }
}
