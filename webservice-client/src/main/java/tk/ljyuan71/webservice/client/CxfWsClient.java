package tk.ljyuan71.webservice.client;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

import http.www_ljyuan71_tk._interface.wsdl.CxfWebService;
/**
 * cxf webservice客户端测试
 * @author ljyuan
 *
 */

public class CxfWsClient {
	public static void main(String[] args) {
		JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
		factory.setAddress("http://localhost:8080/cxfws-server/services/cxfWebService");
		factory.setServiceClass(CxfWebService.class);
		CxfWebService webService = (CxfWebService) factory.create();//创建服务
		System.out.println("sayHello:"+webService.sayHello("LJYuan71"));
		System.out.println("login:"+webService.login("ljyuan71", "123"));
		System.out.println("login:"+webService.login("ljyuan71", "123456"));
	}
}
