package com.calendar.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.calendar.ParamterUtil;

import net.sf.json.JSONObject;

public class ListEventServlet extends HttpServlet {

	
	private static final long serialVersionUID = 5463058487201130263L;
	static Log log = LogFactory.getLog(ListEventServlet.class);
	
	public ListEventServlet() {
		super();
	}

	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * 返回的JSON数据类型为:{total:总记录数,results:结果集}
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		log.debug("调用查找事件方法开始,传入参数为:"+ParamterUtil.formatParamters(request));
		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");

		PrintWriter out = response.getWriter();
		JSONObject json = new JSONObject();
		json.put("total", Context.getInstance().getCount());
		json.put("results", Context.getInstance().selectAll());
		out.write(json.toString().replace("'false'", "false"));

	}

}
