package http.www_ljyuan71_tk._interface.wsdl;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.1.13
 * 2017-11-06T09:51:17.790+08:00
 * Generated source version: 3.1.13
 * 
 */
@WebService(targetNamespace = "http//www.ljyuan71.tk/interface/wsdl", name = "CxfWebService")
@XmlSeeAlso({ObjectFactory.class})
public interface CxfWebService {

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "sayHello", targetNamespace = "http//www.ljyuan71.tk/interface/wsdl", className = "http.www_ljyuan71_tk._interface.wsdl.SayHello")
    @WebMethod
    @ResponseWrapper(localName = "sayHelloResponse", targetNamespace = "http//www.ljyuan71.tk/interface/wsdl", className = "http.www_ljyuan71_tk._interface.wsdl.SayHelloResponse")
    public java.lang.String sayHello(
        @WebParam(name = "name", targetNamespace = "")
        java.lang.String name
    );

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "login", targetNamespace = "http//www.ljyuan71.tk/interface/wsdl", className = "http.www_ljyuan71_tk._interface.wsdl.Login")
    @WebMethod
    @ResponseWrapper(localName = "loginResponse", targetNamespace = "http//www.ljyuan71.tk/interface/wsdl", className = "http.www_ljyuan71_tk._interface.wsdl.LoginResponse")
    public java.lang.String login(
        @WebParam(name = "name", targetNamespace = "")
        java.lang.String name,
        @WebParam(name = "pwd", targetNamespace = "")
        java.lang.String pwd
    );
}
