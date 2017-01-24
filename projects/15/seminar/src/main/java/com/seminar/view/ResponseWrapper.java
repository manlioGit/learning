package com.seminar.view;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

public class ResponseWrapper {

	private final HttpServletResponse _response;

	public ResponseWrapper(HttpServletResponse response) {
		_response = response;
	}
	
	public void render(View view){
		try {
			_response.getWriter().write(view.render());
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
}
