package com.te.exception;

public class CustomException extends RuntimeException {
      String message;
      CustomException(String message){
    	  this.message=message;
      }
}
