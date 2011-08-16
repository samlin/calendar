package com.calendar;

import java.util.Enumeration;

import javax.servlet.http.HttpServletRequest;

public final class ParamterUtil {

	public static String formatParamters(HttpServletRequest request) {
		StringBuffer buffer = new StringBuffer("{");
		Enumeration en = request.getParameterNames();
		while (en.hasMoreElements()) {
			String key = en.nextElement().toString();
			String value = request.getParameter(key);
			buffer.append(key).append(":").append(value);
			if (en.hasMoreElements()) {
				buffer.append(",");
			}
		}
		buffer.append("}");
		return buffer.toString();
	}

}
