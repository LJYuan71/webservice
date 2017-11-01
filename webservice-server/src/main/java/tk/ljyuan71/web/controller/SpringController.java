package tk.ljyuan71.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
/**
 * SpringController提供调用入口
 * @author ljyuan
 *
 */
@Controller
@RequestMapping("/web")
public class SpringController {
	private static Logger log = Logger.getLogger(SpringController.class);
	
	@RequestMapping("/spring")
	@ResponseBody
	public String springWeb(HttpServletRequest request,HttpServletResponse response){
	log.info("=======进入了SpringController的springWeb方法=======");
	
	return "Hello World,Hello ljyuan71!";
	}
	
	@RequestMapping("/viewResolver")
	@ResponseBody
	public ModelAndView viewResolver(HttpServletRequest request,HttpServletResponse response){
	log.info("=======进入了SpringController的viewResolver方法=======");
	//通过spring-mvc.xml中的jsp视图解析器配置解析成/WEB-INF/views/+jspPath+.jsp
	String jspPath = "/index";
	ModelAndView mv = new ModelAndView(jspPath);
	return mv;
	}
	
}