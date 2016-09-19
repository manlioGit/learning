package ch.seminar.util;

import static java.lang.System.getProperty;

public class Format {

	public static String newLine(String token){
		return token + getProperty("line.separator");
	}
	
	public static String component(String token){
		return "\"" + token + "\";";
	}
	
	public static String component(Integer token){
		return component(token.toString());
	}
}
