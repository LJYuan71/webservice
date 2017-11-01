<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>默认首页</title>
</head>
<body>
	<script type="text/javascript">
		function excel(){
			window.location.href="web/exportExcel.do";
		}
	</script>
    <h3>这里是应用的首页对应web.xml中对应的welcome-file-list配置</h3>
    <h4>尝试发送/web/spring.do 测试SpringMVC是否搭建成功!</h4>
    <input type="button"  value="点击" onclick="excel();"/>
</body>
</html>
