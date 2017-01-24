package com.seminar.controller;

import com.seminar.model.entity.CourseRepository;
import com.seminar.route.Context;
import com.seminar.view.Csv;
import com.seminar.view.ResponseWrapper;

public class CsvController implements Controller {

	@Override
	public boolean handles(String route) {
		return "/course/csv".equals(route);
	}

	@Override
	public void execute(Context context) throws Exception {
		
		context.response().setContentType("text/plain");
		context.response().setHeader("Content-Disposition","attachment;filename=course.csv");
		
		new ResponseWrapper(context.response()).render(new Csv(new CourseRepository().get()));
	}
}
