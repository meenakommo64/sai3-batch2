package com.sageit.interfaces;

public interface OrderService {

	public Object submitOrder(String productName, int quanity);
	
	public Integer cancelOrder(Integer orderId);

	//private String getOrder(Integer orderId);
	
}
