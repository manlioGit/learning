package com.seminar.route;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Context {

	private final HttpServletResponse _response;
	private final HttpServletRequest _request;

	public Context(HttpServletRequest request, HttpServletResponse response) {
		_response = response;
		_request = request;
	}
	
	public HttpServletRequest request() {
		return _request;
	}
	
	public HttpServletResponse response() {
		return _response;
	}

}
