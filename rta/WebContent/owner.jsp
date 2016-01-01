<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
	<%@ taglib uri="/struts-tags" prefix="s"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title><% out.print( session.getAttribute("pgnm").toString()); %></title>
</head>
<body>
<div align="center">
<font style="font-family: Algerian;font-style: Algerian">
<br/><br/><br/>
<div>
<table style="margin-top: 0px">

	<tr height="150px">
		<td width="140px"> <img alt="page image" src="image/page/<% out.print( session.getAttribute("pgpict").toString()); %>" style=" height: 140px;width: 140px;"> </td>
		<td style="margin-left: 50px;" align="left"> <% out.print( session.getAttribute("pgnm").toString()); %><br/>
		<% out.print( session.getAttribute("pgtype").toString()); %><br/>
		<% out.print( session.getAttribute("pgabout").toString()); %><br/>
		<a href="www.<% out.print( session.getAttribute("pgurl").toString()); %>" > <% out.print( session.getAttribute("pgurl").toString()); %> </a>
		</td>
	</tr>
	
</table>


</div>
<!--
<% out.print( session.getAttribute("cid").toString()); %>
<% out.print( session.getAttribute("pgid").toString()); %>
-->


	<s:form action="upg.action"  enctype="multipart/form-data" >
				
				
				<input type="file" name="i" placeholder="uploadphotos" style="margin-left: 8px"/>
				<input type="submit" value="upload"/>
			</s:form>
			
			<div align="center" width="400px">
			<s:iterator value="upldlist">
		<!--	<s:property value="fi"   /> -->
			<img alt="" src="image/pgupld/<s:property value="nm"   />" style=" height: 400px;width: 500px; " />
		<!--	<s:property value="nm"/> -->
			</s:iterator>
			</div>
	</font>
</div>
</body>
</html>