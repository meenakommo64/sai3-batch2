package com.sageit.exceptions;

public class Order {

	public Order() {
		// TODO Auto-generated constructor stub
	}

	private Integer quanity; 
	private String item;
	private String comments; 
	private String address;
	
	public Integer getQuanity() {
		return quanity;
	}
	public void setQuanity(Integer quanity) {
		if(quanity>1000) {
			this.quanity = 1000;
		}
	}
	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
	

}
