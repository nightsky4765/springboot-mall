package com.yuan.springbootmall.service;

import com.yuan.springbootmall.dto.CreateOrderRequest;
import com.yuan.springbootmall.model.Order;

public interface OrderService {

    Order getOrderById(Integer orderId);

    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);
}
