package tk.ljyuan71.webservice.publish;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import javax.xml.ws.Endpoint;

import tk.ljyuan71.webservice.impl.LJYServiceImpl;
/**
 * 使用ServletContextListener监听器发布WebService
 * @author ljyuan
 * 使用Servlet3.0提供的@WebListener注解将实现了ServletContextListener接口的WebServicePublishListener类标注为一个Listener</br>
 * 将Web应用部署到服务器运行时，在初始化Web应用上下文时，就会发布WebService了
 */
@WebListener
public class WebServicePublishListener implements ServletContextListener{

	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		System.out.println("WebServicePublishListener销毁!");
		
	}

	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		//WebService的发布地址
		String address = "http://localhost:10001/Webservice";
		//发布WebService，WebServiceImpl类是WebServie接口的具体实现类
		Endpoint.publish(address , new LJYServiceImpl());
		System.out.println("使用WebServicePublishListener发布webservice成功!");
	}

}
