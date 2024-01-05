package jp.co.internous.ecsite.model.dto;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;

import jp.co.internous.ecsite.model.domain.TblPurchase;

public class HistoryDto {
	private int id;
	private int userId;
	private int goodsId;
	private String goodsName;
	private int itemCount;
	private int total;
	private String createdAt;
	
	public HistoryDto() {}
	
	public HistoryDto(final TblPurchase entity) {
		this.id=entity.getId();
		this.userId=entity.getUserId();
		this.goodsId=entity.getGoodsId();
		this.goodsName=entity.getGoodsName();
		this.total=entity.getTotal();
		
		Timestamp d=entity.getCreatedAt();
		SimpleDateFormat f=new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		this.createdAt=f.format(d);
	}
	
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
	
	public String getCreatedAt() {return createdAt;}
	public void setCreatedAt(final String createdAt) {
		this.createdAt=createdAt;
	}
}
