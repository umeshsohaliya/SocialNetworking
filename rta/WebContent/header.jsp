<%@page import="com.lowagie.tools.concat_pdf"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@page import="com.rta.generic.*"%>
   <%@page import="java.util.List"%>
   
   <%@page import="java.sql.Connection"%>
   <%@page import="java.sql.ResultSet"%>
   <%@page import="com.rta.conne.*"%>
   <%@page import="java.sql.Statement"%>
   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
 <%@ taglib uri="/struts-tags" prefix="s"%>
 <%@ page autoFlush="true"   %>
 
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<script src="jquery/createpoll/jquery-latest.js"></script>


<script type="text/javascript">
 function showhide() {
    $("#noti").slideUp('fast');
    $("#c").slideUp('fast');
  }

</script>



</head>
<body onload="showhide()">

	<div style="position:fixed ; background-color:silver; ; height:59px;width:100%; float:left ; margin: 0;">
		<font color="#86259E" style="font-family: Algerian;font-style: Algerian; font-size:xx-large;float: left;"> Real-touch </font>
		
		<form action="abc.action"style="float: left;" method="post">
		
		<table style="margin-left: 80px; margin-top:10px; width: 100px;float: left;" >
			<tr>
				<td><input type="text"  size="50" title="search here" name="fsearch" style="border-radius:15px;"/>	</td>
				<td >
				
					<input type="submit" value="search"  style="border-radius:15px; background-image:image/lhs/search.png "/>
				
				</td>
				</tr>
		</table>
		</form><div >
		
		<font   style=" font-family: Algerian;font-style: Algerian; font-size:large" color="#86259E">welcome:&nbsp;  <% out.print(  session.getAttribute("un").toString()); %>    </font>
		<font style="font-family: Algerian;font-style: Algerian">
		<a href="log">home</a>
		<a href="viewprofile">profile</a>
		<a href= "logout" >  logout </a>
		</font>
	</div>
	<img  id="c" alt="noti" src="image/icon/close.GIF">
	<img  id="n" alt="noti" src="image/icon/noti.GIF">
	<div id="noti" style=" width: 200px; margin-left:650px; margin-top: 25px;">
		
		<font style="font-family: Algerian;font-style: Algerian">
		<%  
		List <rhs_genric> nootilist = (List <rhs_genric>)session.getAttribute("notilist") ; 
		String s =	 session.getAttribute("notilist").toString() ; 
			
			
			
			Connection con=conne.GetConnection();
			Statement st=con.createStatement();
			ResultSet rsnoti = st.executeQuery("select * from noti_tbl where u_id = "+ session.getAttribute("u_id") +"    ");
			while (rsnoti.next()){
				int id = rsnoti.getInt("p_id");
				String t =rsnoti.getString("text");
				String v =rsnoti.getString("value");
		%> 
		
		<form action="noti.action" method="post" enctype="application/x-www-form-urlencoded">
		<table>
			<tr>
				<td> <input type="text" name="id" value="<% out.print(id); %>" style=" display: none;"> 
					<input type="text" name="tt" value="<% out.print(t); %>" style=" display: none;">
					<input type="text" name="vv" value="<% out.print(v); %>" style=" display: none;">
				    <s:property value="nm" /><% out.print(t);%>	</td>
				<td><input type="submit" value="<% out.print(v); %>" >	</td>
			</tr>
		</table>
		</form>
		</font>
		<%} %>
		</div>
		
		<font style="font-family: Algerian;font-style: Algerian">
		<s:iterator value="#notilist">
		<form action="noti.action">
		<table>
			<tr>
				<td> <s:property value="#nm" />	</td>
				<td><input type="submit" value="<s:property value="#ip"/> " >	</td>
			</tr>
		</table>
		</form>
		</s:iterator>
		
		
		</font>
	</div>
	
<!-- 	<div  style=" background-color: red; position: fixed;  margin-top: 10px;" >
			<div>
				<table style=" height:190px; width: 100px;">
					<tr >
						<td>asdfg
						<s:property value="#message"/>
						<hr>
						ddf
						</td>
					</tr>
				</table>
			</div>
	</div>  -->
	
	 <script>
    
    $("#n").click(function () {
	      $("#n").slideUp('fast');
		  	 $("#noti").slideDown('fast').show();
		  	$("#c").slideDown('fast').show();
	    });
    
	 $("#c").click(function () {
      $("#c").slideUp('slow');
      $("#noti").slideUp('slow');
	  	 $("#n").slideDown('fast').show();
    });
	
	
	    
	
</script>	
	
	
</body>
</html>