package com.pridanov.mcs1.service;

import com.pridanov.mcs1.dto.OrderNumberDto;

public interface OrderNumberService {
    /**
     * Generate order number which contains date and token(
     * @return orderNumberDto with fields orderNumber and orderDate
     */
    OrderNumberDto generateOrderNumber();
}
