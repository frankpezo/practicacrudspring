package com.gibosa.practicacrud.response;

public class ApiResponse<Data> {
	private String status;
	private String message;
	private Data data;
	
	public ApiResponse(String status, String message) {
		  this.status = status;
		  this.message = message; 
	}
	
	public ApiResponse(String status, Data data) {
		  this.status = status;
		  this.data = data; 
	}
	
	public ApiResponse(String status,String message ,Data data) {
		  this.status = status;
		  this.message = message;
		  this.data = data; 
	}
	
	
	
	public static <Data> ApiResponse<Data> successMessage(String message){
		return new ApiResponse<>("success", message);
	}
	
	public static <Data> ApiResponse<Data> errorMessage(String message){
		return new ApiResponse<>("error", message);
	}
	
	public static <Data> ApiResponse<Data> successData(Data data){
		return new ApiResponse<>("success", data);
	}
	
	
	public String getStatus() {return status; }
	public String getMessage() {return message; }
	public Data getData() {return data; }
	
}
