package com.yuan.springbootmall.service;

import com.yuan.springbootmall.dto.CreateOrderRequest;
import com.yuan.springbootmall.dto.OrderQueryParams;
import com.yuan.springbootmall.model.Order;

import java.util.List;

public interface OrderService {

    Integer countOrder(OrderQueryParams orderQueryParams);

    List<Order> getOrders(OrderQueryParams orderQueryParams);

    Order getOrderById(Integer orderId);

    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);
}
