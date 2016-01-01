<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="/struts-tags" prefix="s"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<br/><br/><br/>
<font style="font-family: Algerian;font-style: Algerian">
<div align="center">
	<form action="findpoll.action">
	
		<table align="center">
			
			<tr>
				<td>polltype</td>
				<td> <select name="ptype">
							<option selected="selected" value="0">any</option>
							<option value="1">programing language</option>
							<option value="2"> entertainment</option>
							<option value="3">math</option>
							<option value="4">technology</option>
					</select> </td>
			</tr>
			<tr>
				<td>difficulty level</td>
				<td>    <select name="difficulty">
						<option selected="selected" value="0">any </option>
						<option value="1">easy</option>
						<option value="2">medium</option>
						<option value="3">hard</option>
					</select>  </td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="find" style=" background-image:/image/lhs/search.png "> </td>
			</tr>
		</table>
		
	</form>
	<div style="margin-top: 50px;"></div>
	<s:iterator value="list">
	<form action="playpoll">
	<table  align="center">
		<tr>
			 <td> <input type="text" name="pid" value="<s:property value="poll_id"/>" style=" display: none;"> <s:property value="poll_name"/>  </td> 
		</tr>
		
		<tr>
			<td> <input type="submit" value="play" >
		</tr>
		<tr>
			<td> </td>
		</tr>
	</table>
	</form>
	</s:iterator>
</div>	
</font>
</body>
</html>