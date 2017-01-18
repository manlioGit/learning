package com;

import static java.util.Arrays.asList;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.seminar.controller.Controller;
import com.seminar.controller.CsvController;
import com.seminar.controller.HtmlController;
import com.seminar.controller.RawController;
import com.seminar.route.Context;

public class Servlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		if(req.getRequestURI().equals("/try/me")){
			resp.getWriter().write("<h1>you did it!</h1>");
		}
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		List<Controller> controllers = asList(new HtmlController(), new RawController(), new CsvController());
		for (Controller controller : controllers) {
			if(controller.handles(req.getRequestURI())){
				try {
					controller.execute(new Context(req, resp));
				} catch (Exception e) {
				}
			}
		}
	}
}
