package cn.ooptech.sp01.service;

import cn.ooptech.sp01.pojo.Order;

public interface OrderService {

	Order getOrder(String orderId);
	void addOrder(Order order);
}
