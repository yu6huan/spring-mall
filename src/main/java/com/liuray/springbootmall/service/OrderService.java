package com.liuray.springbootmall.service;

import com.liuray.springbootmall.dto.CreateOrderRequest;
import com.liuray.springbootmall.dto.OrderQueryParams;
import com.liuray.springbootmall.model.Order;

import java.util.List;

public interface OrderService {

    Integer countOrder(OrderQueryParams orderQueryParams);

    List<Order> getOrders(OrderQueryParams orderQueryParams);
    Order getOrderById(Integer orderId);

    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);
}
