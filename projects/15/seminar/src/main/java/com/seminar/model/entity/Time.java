package com.seminar.model.entity;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Time  {

	private static final String FORMAT = "dd.MM.yyyy";
	private final Date _time;
	
	public Time(String time) {
		try {
			_time = new SimpleDateFormat(FORMAT).parse(time);
		} catch (ParseException e) {
			throw new RuntimeException(e);
		}
	}

	@Override
	public String toString() {
		return new SimpleDateFormat(FORMAT).format(_time);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((_time == null) ? 0 : _time.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Time other = (Time) obj;
		if (_time == null) {
			if (other._time != null)
				return false;
		} else if (!_time.equals(other._time))
			return false;
		return true;
	}
}
