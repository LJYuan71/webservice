package tk.ljyuan71.webservice.client;

import tk.ljyuan71.webservice.impl.LJYServiceImpl;
import tk.ljyuan71.webservice.impl.LJYServiceImplService;

public class WSClient {
	public static void main(String[] args) {
		LJYServiceImplService factory  = new LJYServiceImplService();
		LJYServiceImpl service = factory.getLJYServiceImplPort();
		String sayHello = service.sayHello("LJYuan71");
		System.out.println("sayHello:"+sayHello);
		String login = service.login("LJYuan71", "123");
		System.out.println("login:"+login);
		login = service.login("LJYuan71", "123456");
		System.out.println("login:"+login);
	}
}
