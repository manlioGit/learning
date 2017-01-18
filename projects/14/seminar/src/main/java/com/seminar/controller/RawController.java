package com.seminar.controller;

import com.seminar.model.entity.CourseRepository;
import com.seminar.route.Context;
import com.seminar.view.Raw;
import com.seminar.view.ResponseWrapper;

public class RawController implements Controller {

	@Override
	public boolean handles(String route) {
		return "/course/raw".equals(route);
	}

	@Override
	public void execute(Context context) throws Exception {

		new ResponseWrapper(context.response()).render(new Raw(new CourseRepository().get()));
	}
}
