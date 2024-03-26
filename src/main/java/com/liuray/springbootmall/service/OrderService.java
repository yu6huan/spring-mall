package com.liuray.springbootmall.service;

import com.liuray.springbootmall.dto.CreateOrderRequest;
import com.liuray.springbootmall.model.Order;

public interface OrderService {

    Order getOrderById(Integer orderId);

    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);
}
