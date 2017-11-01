package tk.ljyuan71.webservice.impl;

import javax.jws.WebService;

import tk.ljyuan71.webservice.LJYService;
/**
 * WebService实现类
 * @author ljyuan
 *
 */
@WebService
public class LJYServiceImpl implements LJYService{

	@Override
	public String sayHello(String name) {
		return "Hello World,Hello "+name+"!";
	}

	@Override
	public String login(String name, String pwd) {
		if ("LJYuan71".equalsIgnoreCase(name) && "123456".equals(pwd)) {
			return "登录成功";
		}
		return "不匹配";
	}

}
