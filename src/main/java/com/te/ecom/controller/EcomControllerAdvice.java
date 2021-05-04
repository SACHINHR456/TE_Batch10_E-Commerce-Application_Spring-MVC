package com.te.ecom.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.te.ecom.custExcep.EcomException;

@ControllerAdvice
public class EcomControllerAdvice {

	

		@ExceptionHandler(EcomException.class)
		public String handleExp(EcomException exception, HttpServletRequest request) {
			request.setAttribute("expMsg", exception.getMessage());
			return "header";
		}
}
