package com.seminar.controller;

import com.seminar.model.entity.CourseRepository;
import com.seminar.route.Context;
import com.seminar.view.Html;
import com.seminar.view.ResponseWrapper;

public class HtmlController implements Controller {

	@Override
	public boolean handles(String route) {
		return "/course/html".equals(route);
	}

	@Override
	public void execute(Context context) throws Exception {

	    context.response().setContentType("text/html;charset=UTF-8");
		
		new ResponseWrapper(context.response()).render(new Html(new CourseRepository().get()));
	}
}
