package com.calendar.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONObject;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.calendar.ParamterUtil;

public class ListCalendarServlet extends HttpServlet {

	static Log log = LogFactory.getLog(ListCalendarServlet.class);
	private static final long serialVersionUID = 6483530271258489225L;

	public ListCalendarServlet() {
		super();
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doPost(request, response);
	}
	
	/**
	 * 加载日历数据，格式为:{data:数据列表,total:总记录数}
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		log.debug("调用查找日历方法开始,传入参数为:"+ParamterUtil.formatParamters(request));
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		JSONObject json = new JSONObject();
		json.put("results", Context.getInstance().getCalendars());
		json.put("total", Context.getInstance().getCalendars().size());
		out.write(json.toString());
		out.close();
	}



}
