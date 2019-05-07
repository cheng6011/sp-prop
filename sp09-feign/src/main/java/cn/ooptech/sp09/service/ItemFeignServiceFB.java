package cn.ooptech.sp09.service;

import java.util.List;
import org.springframework.stereotype.Component;

import cn.ooptech.sp01.pojo.Item;
import cn.ooptech.web.util.JsonResult;

@Component
public class ItemFeignServiceFB implements ItemFeignService {

	@Override
	public JsonResult<List<Item>> getItems(String orderId) {
		return JsonResult.err("无法获取订单商品列表");
	}

	@Override
	public JsonResult decreaseNumber(List<Item> items) {
		return JsonResult.err("无法修改商品库存");
	}

}
