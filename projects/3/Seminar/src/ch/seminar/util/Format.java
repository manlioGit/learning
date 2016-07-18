package ch.seminar.util;

import static java.lang.System.getProperty;

public class Format {

	public static String line(String line){
		return line + getProperty("line.separator");
	}
}
