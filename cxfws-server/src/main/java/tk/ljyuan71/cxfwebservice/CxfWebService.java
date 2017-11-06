package tk.ljyuan71.cxfwebservice;

import javax.jws.WebParam;
import javax.jws.WebService;

/**
 * 使用Spring+CXF编写webservice服务
 * @author ljyuan71
 * 指定你想要的名称空间，默认是使用接口实现类的包名的反缀
 */
@WebService(targetNamespace = "http//www.ljyuan71.tk/interface/wsdl")
public interface CxfWebService {
	
	String sayHello(@WebParam(name="name")String name);
	
	String login(@WebParam(name="name")String name, @WebParam(name="pwd")String pwd);
}
