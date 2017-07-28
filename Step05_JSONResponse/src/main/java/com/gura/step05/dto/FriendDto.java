package com.gura.step05.dto;

public class FriendDto {
	private int num;
	private String name;
	private boolean isMan;
	
	public FriendDto(){}

	public FriendDto(int num, String name, boolean isMan) {
		super();
		this.num = num;
		this.name = name;
		this.isMan = isMan;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isMan() {
		return isMan;
	}

	public void setMan(boolean isMan) {
		this.isMan = isMan;
	}
	
	
}
