<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<font style="font-family: Algerian;font-style: Algerian">	
<table style="margin-top: 0px">

	<tr>
		<td > <img alt="page image" src="image/page/<% out.print( session.getAttribute("pgpict").toString()); %>" style=" height: 140px;width: 140px;"> </td>
		<td style="margin-left: 50px;"> <% out.print( session.getAttribute("pgnm").toString()); %><br/>
		<% out.print( session.getAttribute("pgtype").toString()); %><br/>
		<a href="www.<% out.print( session.getAttribute("pgurl").toString()); %>" > <% out.print( session.getAttribute("pgurl").toString()); %> </a>
			
		</td>
	</tr>
	
</table>

</div>
<!-- 
<% out.print( session.getAttribute("cid").toString()); %>
<% out.print( session.getAttribute("pgid").toString()); %>
 -->
	
</font>	
</body>
</html>