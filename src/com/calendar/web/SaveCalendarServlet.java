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

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.calendar.ParamterUtil;
import com.calendar.bean.Calendar;

/**
 * 保存或者修改日历
 * @author Administrator
 *
 */
public class SaveCalendarServlet extends HttpServlet {

	
	static Log log = LogFactory.getLog(SaveCalendarServlet.class);
	
	private static final long serialVersionUID = 763250190705114499L;

	public SaveCalendarServlet() {
		super();
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doPost(request, response);
	}

	/**
	 * 保存或者更新日历时，如果更新成功，则返回数据为"{'success':'true',
	 * 'id':".$bid."}";失败则{'success':'false'}
	 */

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		log.debug("开始更新或者添加日历,传入参数为:"+ParamterUtil.formatParamters(request));
		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");
		PrintWriter out = response.getWriter();
		Map params = request.getParameterMap();
		Calendar calendar = new Calendar();
		try {
			BeanUtils.populate(calendar, params);
			if (!"".equals(calendar.getId())) {
				Context.getInstance().deleteCalendar(request.getParameter("id"));
				Context.getInstance().addCalendar(calendar);
			} else {
				calendar.setId(UUID.randomUUID().toString());
				Context.getInstance().addCalendar(calendar);
			}
			out.write("{success:true,id:'" + calendar.getId() + "'}");
		} catch (IllegalAccessException e) {
			System.out.println("error:" + e.getMessage());
		} catch (InvocationTargetException e) {
			System.out.println("error:" + e.getMessage());
		}
		out.close();
	}

}
