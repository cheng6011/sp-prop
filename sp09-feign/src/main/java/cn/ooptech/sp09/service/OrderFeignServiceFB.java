package cn.ooptech.sp09.service;

import org.springframework.stereotype.Component;

import cn.ooptech.sp01.pojo.Order;
import cn.ooptech.web.util.JsonResult;

@Component
public class OrderFeignServiceFB implements OrderFeignService {

	@Override
	public JsonResult<Order> getOrder(String orderId) {
		return JsonResult.err("无法获取商品订单");
	}

	@Override
	public JsonResult addOrder() {
		return JsonResult.err("无法保存订单");
	}

}
