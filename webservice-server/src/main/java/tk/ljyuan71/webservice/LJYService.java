package tk.ljyuan71.webservice;

import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 *定义一个interface，使用@WebService注解标注接口，
 *使用@WebMethod注解标注接口中定义的所有方法
 * @author ljyuan
 *
 */
@WebService
public interface LJYService {
	/**
	 * 使用@WebMethod注解标注WebServiceI接口中的方法
	 * @param name
	 * @return
	 */
	@WebMethod
	String sayHello(String name);
	/**
	 * 
	 * @param name
	 * @param pwd
	 * @return
	 */
	@WebMethod
	String login(String name,String pwd);
}
