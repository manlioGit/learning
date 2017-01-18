package com.seminar.controller;

import com.seminar.route.Context;

public interface Controller {

	boolean handles(String route);
	
	void execute(Context context) throws Exception;
}
