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

public class DeleteEventSevlet extends HttpServlet {

	
	private static final long serialVersionUID = 6066854180574288580L;
	static Log log = LogFactory.getLog(DeleteEventSevlet.class);

	public DeleteEventSevlet() {
		super();
	}

	
	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
	}

	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * ɾ��ĳ���¼������ָ�����¼���Ŵ��룬���в�����Ϊ:id
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		log.debug("����ɾ���¼�������ʼ,�������Ϊ:"+ParamterUtil.formatParamters(request));
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		Context.getInstance().deleteEvent(request.getParameter("id"));
		out.print("{success:true}");
		out.close();
	}


}
