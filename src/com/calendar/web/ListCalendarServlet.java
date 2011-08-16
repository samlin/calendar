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
	 * �����������ݣ���ʽΪ:{data:�����б�,total:�ܼ�¼��}
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		log.debug("���ò�������������ʼ,�������Ϊ:"+ParamterUtil.formatParamters(request));
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		JSONObject json = new JSONObject();
		json.put("results", Context.getInstance().getCalendars());
		json.put("total", Context.getInstance().getCalendars().size());
		out.write(json.toString());
		out.close();
	}



}
