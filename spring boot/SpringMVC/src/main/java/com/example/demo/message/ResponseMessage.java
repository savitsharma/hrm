package com.example.demo.message;




public class ResponseMessage<T> {
	


	private T responseClassType;
	
	
	private String message;
	
	private String messageType;
	
	

	public ResponseMessage(T classType, String message2, String messageType2) {
		// TODO Auto-generated constructor stub
	}



	public static <T> ResponseMessage<T> withResponseData(T classType, String message,String messageType){
		return new ResponseMessage<T>(classType,message,messageType);
	}
	
	
	
	

}
