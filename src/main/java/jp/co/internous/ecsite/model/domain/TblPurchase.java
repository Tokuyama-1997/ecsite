package jp.co.internous.ecsite.model.domain;

import java.sql.Timestamp;

public class TblPurchase {
	private int id;
	private int userId;
	private int goodsId;
	private String goodsName;
	private int itemCount;
	private int total;
	private Timestamp createdAt;
	
	public int getId() {return id;}
	public void setId(final int id) {this.id=id;}
	
	public int getUserId() {return userId;}
	public void setUserId(final int userId) {
		this.userId=userId;
	}
	
	public int getGoodsId() {return goodsId;}
	public void setGoodsId(final int goodsId) {
		this.goodsId=goodsId;
	}
	
	public String getGoodsName() {return goodsName;}
	public void setGoodsName(final String goodsName) {
		this.goodsName=goodsName;
	}
	
	public int getItemCount() {return itemCount;}
	public void setItemCount(final int itemCount) {
		this.itemCount=itemCount;
	}
	
	public int getTotal() {return total;}
	public void setTotal(final int total) {
		this.total=total;
	}
	
	public Timestamp getCreatedAt() {return createdAt;}
	public void setCreatedAt(final Timestamp createdAt) {
		this.createdAt=createdAt;
	}
}
