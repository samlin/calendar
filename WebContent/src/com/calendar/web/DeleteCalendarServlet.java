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

/**
 * ɾ������
 * @author Administrator
 *
 */
public class DeleteCalendarServlet extends HttpServlet {

	
	private static final long serialVersionUID = 2238125323048835201L;
	static Log log = LogFactory.getLog(DeleteCalendarServlet.class);

	public DeleteCalendarServlet() {
		super();
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request,response);
	}

	/**
	 * ɾ���������ᴫ��һ���������id
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		log.debug("����ɾ������������ʼ,�������Ϊ:"+ParamterUtil.formatParamters(request));
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		Context.getInstance().deleteCalendar(request.getParameter("id"));
		out.print("{success:true}");
		out.flush();
		out.close();
	}

}
