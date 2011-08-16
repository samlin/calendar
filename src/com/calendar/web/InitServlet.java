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
 * ����ϵͳ��ʹ��Servlet������ϵͳ�����ò����ɴ��෵��
 * ����ֻ��Ҫ��Config���󷵻ظ�ǰ̨�˿ɣ������Ҫ�޸ģ����޸�Config��Ĭ�ϲ���
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
		//���������cs,ǰ̨js���뽫ͨ��cs��������ȡjson���ݣ�����ת��
		json.put("cs", config);
		//��ǰ�û�ӵ�е�����
		json.put("owned", instance.getCalendars());
		//���������
		json.put("shared", new ArrayList());
		//�ظ�����
		json.put("re", new ArrayList());
		//����ǰ̨������һ��class����������ʽ��java���޷����ã�����style���棬�������滻
		System.out.println("���ò���Ϊ:"+json.toString().replace("style", "class"));
		out.write(json.toString().replace("style", "class"));
		out.flush();
		out.close();
	}

	

}
