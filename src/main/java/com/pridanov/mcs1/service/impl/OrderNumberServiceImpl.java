package com.pridanov.mcs1.service.impl;

import com.pridanov.mcs1.dto.OrderNumberDto;
import com.pridanov.mcs1.service.OrderNumberService;
import org.springframework.stereotype.Service;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.concurrent.ThreadLocalRandom;

@Service
public class OrderNumberServiceImpl implements OrderNumberService {
    @Override
    public OrderNumberDto generateOrderNumber() {
        String currentDate = new SimpleDateFormat("yyMMdd").format(new Date());
        long token = ThreadLocalRandom.current().nextLong(100000000, 1000000000);
        String orderNumberString = currentDate + token;
        return new OrderNumberDto(Long.parseLong(orderNumberString), LocalDateTime.now());
    }
}
