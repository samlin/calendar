package com.calendar.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONObject;

import com.calendar.bean.Config;
/**
 * 日历系统初使化Servlet，日历系统的配置参数由此类返回
 * 这里只需要将Config对象返回给前台退可，如果需要修改，请修改Config类默认参数
 * @author Administrator
 *
 */
public class InitServlet extends HttpServlet {


	private static final long serialVersionUID = -4708104093236616374L;


	public InitServlet() {
		super();
	}

	
	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doPost(request,response);
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");
		PrintWriter out = response.getWriter();
		
		Context instance = Context.getInstance();
		List<Config> config= instance.getConfig();
		JSONObject json = new JSONObject();
		//这里必须是cs,前台js代码将通过cs属性来获取json数据，进行转换
		json.put("cs", config);
		//当前用户拥有的日历
		json.put("owned", instance.getCalendars());
		//分享的日历
		json.put("shared", new ArrayList());
		//重复类型
		json.put("re", new ArrayList());
		//由于前台必须有一个class属性设置样式，java中无法设置，故用style代替，最后进行替换
		System.out.println("配置参数为:"+json.toString().replace("style", "class"));
		out.write(json.toString().replace("style", "class"));
		out.flush();
		out.close();
	}

	

}
