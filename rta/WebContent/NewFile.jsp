<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <!--  in first.jsp(old) -->
	<div>
		<div >
			<tiles:insertAttribute name="header"></tiles:insertAttribute>
		</div>
		<div style="height: 100%;width:20%; float: left;">
			<tiles:insertAttribute name="lhs"></tiles:insertAttribute>
		</div>
		
		<div id="thumbContainter" >
		<b style="color: yellow;">&nbsp;&nbsp;Developed &nbsp; By&nbsp;:</b><br/>
		<a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Umesh Sohaliya</a>
		</div>
		<div style="width: 60%;height: 100%;">
		<tiles:insertAttribute name="content"></tiles:insertAttribute> 
		</div>
		
		<div style="float: right;">
		<tiles:insertAttribute name="rhs"></tiles:insertAttribute>
		</div>
		
		<div style="display: none;" >
			<tiles:insertAttribute name="footer"></tiles:insertAttribute>
		</div>
	
	</div>      
</body>
</html>