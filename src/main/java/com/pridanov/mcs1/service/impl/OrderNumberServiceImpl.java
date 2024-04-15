package com.pridanov.mcs1.service.impl;

import com.pridanov.mcs1.dto.OrderNumberDto;
import com.pridanov.mcs1.service.OrderNumberService;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Random;

@Service
public class OrderNumberServiceImpl implements OrderNumberService {
    @Override
    public OrderNumberDto generateOrderNumber() {
        String currentDate = new SimpleDateFormat("yyMMdd").format(new Date());
        long token = new Random().nextLong(900000000) + 100000000;
        return new OrderNumberDto(Long.parseLong(currentDate + token), LocalDateTime.now());
    }
}
