package com.seminar.controller;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.StringContains.containsString;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

import com.seminar.route.Context;

public class ControllerTest {

	private FakeResponse _response;
	
	@Before
	public void setUp() {
		_response = new FakeResponse();
	}
	
	@Test
	public void html() throws Exception {
		new HtmlController().execute(new Context( _response));
		
		assertThat(_response.getContentType(), is("text/html;charset=UTF-8"));
		assertThat(_response.getContent(), containsString("<!DOCTYPE html><html><head><title>Software Engineering</title></head>"));
	}
	
	@Test
	public void raw() throws Exception {
		new RawController().execute(new Context( _response));
		
		assertThat(_response.getContent(), containsString("Software Engineering a123: cool stuff"));
	}
	
	@Test
	public void csv() throws Exception {
		new CsvController().execute(new Context( _response));
		
		assertThat(_response.getContent(), containsString("\"a123\";\"cool stuff\";\"somewhere\";\"13\";\"19.01.2017\""));
	}
}
