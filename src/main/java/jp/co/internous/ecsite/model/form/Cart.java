package jp.co.internous.ecsite.model.form;

import java.io.Serializable;

public class Cart implements Serializable {
	private int id;
	private String goodsName;
	private int price;
	private int count;
	
	public int getId() {return id;}
	public void setId(final int id) {this.id=id;}
	
	public String getGoodsName() {
		return goodsName;
	}
	public void setGoodsName(final String goodsName) {
		this.goodsName=goodsName;
	}
	
	public int getPrice() {return price;}
	public void setPrice(final int price) {
		this.price=price;
	}
	
	public int getCount() {return count;}
	public void setCount(final int count) {
		this.count=count;
	}
}
