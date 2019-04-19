package com.mumu.houserent.entity;

import java.io.Serializable;

public class Counter implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int cnt;
	
	public Counter(int cnt) {
		this.cnt = cnt;
	}
	
	public int getCnt() {
		return cnt;
	}
	
	public void setCnt(int cnt) {
		this.cnt = cnt;
	}
}
