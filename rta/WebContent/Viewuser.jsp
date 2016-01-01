<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.sql.Connection"%>
   <%@page import="java.sql.ResultSet"%>
   <%@page import="com.rta.conne.*"%>
   <%@page import="java.sql.Statement"%>
   <%@page import="java.util.Map"%>
   <%@page import="com.opensymphony.xwork2.ActionContext" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div align="center">
	<font style="font-family: Algerian;font-style: Algerian">
	
	<%
	Connection con=conne.GetConnection();
	Statement st=con.createStatement();
	
	
	int pid = (Integer) session.getAttribute("p_id");
	//out.print("pid = "+pid);
	ResultSet rs = st.executeQuery("select *  from reg_tbl where u_id= "+pid+" ");
	
	while(rs.next()){
		
	
	%>
	
	
	<div align="center">
	<br/><br/><br/>
	<table  >
			<tr id="tra"><td colspan="2">   &nbsp; &nbsp; &nbsp;<font size="24"> <b> profile details </b></font> </td></tr>
			<tr><td><img style="height: 250px; width: 250px;"  src="image/userprofile/<%=rs.getString("I_PATH")  %>" /></td></tr>
			<tr><td>     first name</td><td><%=rs.getString("F_NAME")  %></td></tr>
			<tr><td>      last name</td><td><%=rs.getString("L_NAME")  %></td></tr>
			
			
			
			<tr><td>  birth date</td><td> <%=rs.getString("DOB")  %></td></tr>

			
	<!-- 	</table>
		
		
		<table>	 -->
		<tr id="tra"><td colspan=21"> --- address portion-------------------------------------			</td></tr>
			<tr><td>  country </td><td><%=rs.getString("COUN")  %> </td></tr>
			<tr><td> state  </td><td><%=rs.getString("STAT")  %> </td></tr>
			<tr><td>  district  </td><td><%=rs.getString("DIST")  %> </td></tr>
			<tr><td> city</td> <td><%=rs.getString("CITY")  %></td>   </tr>
			<tr><td> address  </td><td><%=rs.getString("ADDR")  %> </td></tr>
			<tr><td>  pincode </td><td><%=rs.getString("P_CODE")  %> </td></tr>
	<!-- 	</table>
			
		<table>    -->
		<tr  id="tra"><td colspan=21"> --- education  portion-------------------------</td></tr>
			<tr><td> school name  </td><td><%=rs.getString("SCHOOL")  %> </td></tr>
			<tr><td>  collage name </td><td><%=rs.getString("COLLAGE")  %> </td></tr>
			<tr><td> univercity name </td><td><%=rs.getString("UNIVER")  %> </td></tr>
			<tr><td>  are you work AT </td><td><%=rs.getString("WORK")  %> </td></tr>
			<tr><td> language know </td><td><%=rs.getString("LANG")  %> </td></tr>
	<!-- 	</table>
			
		<table>   -->
		<tr id="tra" ><td colspan=21"> ---  favorite-------------------------------</td></tr>
			<tr><td> game </td><td><%=rs.getString("GAME")  %> </td></tr>
			<tr><td> movie  </td><td><%=rs.getString("F_MV")  %> </td></tr>
			<tr><td>  singer </td><td><%=rs.getString("F_SNG")  %> </td></tr>
			<tr><td> book </td><td><%=rs.getString("F_BOOK")  %> </td></tr>
			<tr><td> sentence </td><td><%=rs.getString("SENTENCE")  %> </td></tr>
			<tr><td> idle  </td><td><%=rs.getString("IDLE")  %> </td></tr>
	<!-- 	</table>
			
		<table>   -->
		
		</table>
	
	</div>
	
	<form action="add" >
		<div style="display: none;">
			<input  type="text" name="p_id" value=" <s:property value="p_id"/> " style="display: none;">
		</div>
			
			<input type="submit" value="add friend" >
	</form>
	
	<% } %>

	
	
	</font>
</div>
</body>
</html>