package jp.co.internous.ecsite.model.form;

import java.io.Serializable;

public class HistoryForm implements Serializable {
	private int userId;
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(final int userId) {
		this.userId=userId;
	}
}
