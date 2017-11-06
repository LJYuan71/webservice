package tk.ljyuan71.cxfwebservice.impl;

import javax.jws.WebParam;
import javax.jws.WebService;

import tk.ljyuan71.cxfwebservice.CxfWebService;
/**
 * CxfWebService实现类
 * @author ljyuan
 * endpointInterface服务类接口全路径
 */
@WebService(endpointInterface="tk.ljyuan71.cxfwebservice.CxfWebService",serviceName="cxfWebServiceImpl") 
public class CxfWebServiceImpl implements CxfWebService{

	@Override
	public String sayHello(@WebParam(name="name")String name) {
		return "Hello World,Hello "+name+"!";
	}

	@Override
	public String login(@WebParam(name="name")String name, @WebParam(name="pwd")String pwd) {
		if ("LJYuan71".equalsIgnoreCase(name) && "123456".equals(pwd)) {
			return "登录成功";
		}
		return "不匹配";
	}

}
