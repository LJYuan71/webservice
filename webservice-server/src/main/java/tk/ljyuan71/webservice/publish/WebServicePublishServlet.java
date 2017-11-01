package tk.ljyuan71.webservice.publish;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.xml.ws.Endpoint;

import tk.ljyuan71.webservice.impl.LJYServiceImpl;

/**
 * 使用Servlet发布WebService
 * @author ljyuan
 * 使用Servlet3.0提供的@WebServlet注解将继承HttpServlet类的普通Java类标注为一个Servlet
 * 将value属性设置为空字符串，这样WebServicePublishServlet就不提供对外访问的路径
 * loadOnStartup属性设置WebServicePublishServlet的初始化时机
 */
@WebServlet(value="",loadOnStartup=0)
public class WebServicePublishServlet extends HttpServlet{

	private static final long serialVersionUID = 1L;

	/**
	 * 来自于 javax.servlet.GenericServlet#init()
	 * 在WebServicePublishServlet初始化时发布WebService
	 */
	@Override
	public void init() throws ServletException {
		 //WebService的发布地址
		String address = "http://localhost:10002/Webservice";
		//发布WebService，WebServiceImpl类是WebServie接口的具体实现类
		Endpoint.publish(address , new LJYServiceImpl());
		System.out.println("使用WebServicePublishServlet发布webservice成功!");
	}
	
	

}
