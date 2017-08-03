
package com.gura.step08.exception;

public class CustomException extends Exception{
	private String message="사용자 정의 Exception";
	
	//생성자 
	public CustomException(String message){
		this.message=message;
	}
	//setter
	public void setMessage(String message) {
		this.message = message;
	}
	//getter
	public String getMessage() {
		
		return message;
	}
}
