<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="/struts-tags" prefix="s" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<br/><br/><br/><br/>
<font style="font-family: Algerian;font-style: Algerian">
<div align="center" style="margin-top: 0px; " >
	<form action="pagesearch.action">

	<input type="text" name="pname">
	
	
	<input type="submit">
	</form>
	
	
	
	
<s:iterator value="list">
	
<form action="show.action">
	
	<table border="0" width="250px">
		<tr>
			<td rowspan="2"><img style="height: 80px;width: 80px;" src="image/page/<s:property value="pictur"/> "  /></td>
			<td><s:property value="pgname"/></td>
		</tr>
		<tr>
			<td><s:property value="type"/></td>
			
		</tr>
		<tr>
			<td colspan="3">
			<input  type="text" name="pgid" value=" <s:property value="pgid"/> " style="display: none;">
			<input type="submit" value="show" >
			</td>
		</tr>
	</table>
</form>

</s:iterator>
	
	
	
	
</div>
</font>
</body>
</html>