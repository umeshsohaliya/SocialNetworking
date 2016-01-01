<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div align="center">
<font style="font-family: Algerian;font-style: Algerian">
<br/><br/><br/>
<!-- 	search.jsp<s:property value="fsearch" /> -->
	<form action="abc.action?abc">
		<input type="text" name="fsearch">
		
		<s:property value="#fsearch" />
		<input type="submit">
		
</form>



<s:iterator value="list">
	

	<div >
	<table border="0" width="250px">
		<tr>
			<td rowspan="2"><img style="height: 80px; 80px;"  src="image/userprofile/<s:property value="ipath"/> "  /></td>
			<td><s:property value="fname"/><s:property value="lname"/></td>
		</tr>
		<tr>
			<td><s:property value="work"/></td>
			
		</tr>
		<tr>
			<td colspan="3">
			<form action="add" >
			<input  type="text" name="p_id" value=" <s:property value="p_id"/> " style="display: none;">
			
			<input type="submit" value="add friend" >
			</form>
			<form action="userpro">
			<input  type="text" name="p_id" value=" <s:property value="p_id"/> " style="display: none;">
			<input type="submit" value="viewprofile" />
			</form>
			</td>
		</tr>
	</table>
	</div>


</s:iterator>
	
	


</font>
</div>
</body>
</html>
