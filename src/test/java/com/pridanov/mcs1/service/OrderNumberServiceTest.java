package com.pridanov.mcs1.service;

import com.pridanov.mcs1.Mcs1Application;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(classes = Mcs1Application.class)
public class OrderNumberServiceTest {

    @Autowired
    protected OrderNumberService orderNumberService;

    @Test
    public void testGen(){
        String id = orderNumberService.generateOrderNumber().getOrderNumber().toString();
        assertEquals(LocalDate.now().format(DateTimeFormatter.ofPattern("yyMMdd")), id.substring(0, 6));
        assertEquals(id.length(), 15);
    }
}
