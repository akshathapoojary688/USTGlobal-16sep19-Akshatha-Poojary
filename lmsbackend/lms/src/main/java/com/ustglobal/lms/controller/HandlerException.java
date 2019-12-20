package com.ustglobal.lms.controller;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.ustglobal.lms.dto.LmsResponse;

@RestControllerAdvice
public class HandlerException {

	@ExceptionHandler(Exception.class)
	public LmsResponse getException() {
		LmsResponse response = new LmsResponse();
		response.setStatusCode(501);
		response.setMessage("Error in code");
		response.setDescription("Got an Exception");
		return response;
	}
}
