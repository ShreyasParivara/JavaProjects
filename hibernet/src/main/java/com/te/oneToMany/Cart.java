package com.te.oneToMany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity 
public class Cart {
	
	@Id
	private int CardId;
	private String cartName;
	@OneToMany(mappedBy = "cart")
	private List<Items> list;
	public int getCardId() {
		return CardId;
	}
	public void setCardId(int cardId) {
		CardId = cardId;
	}
	public String getCartName() {
		return cartName;
	}
	public void setCartName(String cartName) {
		this.cartName = cartName;
	}
	public List<Items> getList() {
		return list;
	}
	public void setList(List<Items> list) {
		this.list = list;
	}

	
}
