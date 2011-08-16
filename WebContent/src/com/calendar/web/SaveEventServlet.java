package com.calendar.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;
import java.util.UUID;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONObject;

import com.calendar.bean.Event;
import com.sun.org.apache.commons.beanutils.BeanUtils;

public class SaveEventServlet extends HttpServlet {

	private static final long serialVersionUID = 9161528704795993721L;

	public SaveEventServlet() {
		super();
	}

	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}
	
	/**
	 * 保存或者更新日历时，如果更新成功，则返回数据为"{'success':'true', 'id':".$bid."}";
	 */
	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		
		Event event = new Event();
		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");
		PrintWriter out = response.getWriter();
		try {
			Map<String, Object> params = request.getParameterMap();
			BeanUtils.populate(event, params);
			event.setId(UUID.randomUUID().toString());
			event.setYmd(request.getParameter("startDay"));
			event.setEymd(request.getParameter("endDay"));
			Context.getInstance().addEvent(event);
			System.out.println("添加一个新事件:" + event+"返回成功");
			
			JSONObject json = JSONObject.fromObject(event);
			out.print(json.toString());
			
		} catch (IllegalAccessException e) {
			System.out.println("error:" + e.getMessage());
		} catch (InvocationTargetException e) {
			System.out.println("error:" + e.getMessage());
		}
	}

	
}
