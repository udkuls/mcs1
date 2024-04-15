package com.pridanov.mcs1.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Schema(description = "DTO representing an order number")
public class OrderNumberDto {
    @Schema(description = "The generated order number (date&nine-digit random number)")
    private Long orderNumber;
    @Schema(description = "The date and time when the order number was generated")
    private LocalDateTime orderDate;
}
