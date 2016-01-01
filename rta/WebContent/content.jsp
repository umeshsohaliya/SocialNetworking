<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="/struts-tags" prefix="s"%>
    
     <%@page import="com.rta.generic.*"%>
   <%@page import="java.util.List"%>
   <%@page import="java.sql.*"%>
   <%@page import="java.sql.Connection"%>
   <%@page import="java.sql.ResultSet"%>
   <%@page import="com.rta.conne.*"%>
   <%@page import="java.sql.Statement"%>
   <%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">

div{
	margin: 0px;
}
</style>

</head>
<body  >
<div   style="background-image:image/userprofile/<s:property value="ubi"/>;"  >
<font style="font-family: Algerian; font-style: Algerian; color: silver;">
<br/><br/><br/>
<!-- 
<s:property value="ubi"/>:<% out.print(  session.getAttribute("ubi").toString()); %>
 -->
<!-- 	<input type="submit" style="cursor:pointer; border-radius:20px; border: thin ;color:white; background-color:green; text-shadow:gray; font-weight: bold;" value="Submit" /> -->
	<div align="center"  >
		<div>
			<s:form action="umain.action"  enctype="multipart/form-data" >
				<img src="image/SC.jpg" style="height: 190PX;width: 100%;" />
				
				<input type="file" name="i" placeholder="uploadphotos" style="margin-left: 8px"/>
				<input type="submit" value="upload"/>
			</s:form>
		</div>

<table>	

<%

Connection con=com.rta.conne.conne.GetConnection();
%>
<%!


public void plesure() throws Exception {
	
	try{
		Connection con=com.rta.conne.conne.GetConnection();
		conne.GetConnection();
		
		
		
		
		
	}
	finally{
		
	}
}


	
%>
	<s:iterator value="upldlist">
 <tr>
 	<td>
 	<br/>
 		<s:property value="type"/><!-- ....<s:property value="pgname" />....<s:property value="pgid" />   -->
 	</td>
 </tr>
 <tr>
 	<td>
 		<img style=" height: 400px;width: 400px;" src="image/upload/<s:property value="pictur" />" alt="upload" />
 	</td>
 </tr>
<!--  <tr>
 		<td>
 			<input type="submit" value="plesure" onclick="plesure()" />
 		</td>
 </tr> -->
	
 </s:iterator>
</table>
	
 

 
<bgsound loop="infinite" src="E:/ENTERTAINMANT/KAHIN PYAAR NA HO JAAYE.mp3" >
<audio src="E:/ENTERTAINMANT/KAHIN PYAAR NA HO JAAYE.mp3" autoplay="true" />
	<audio controls>
   <source src="E:/ENTERTAINMANT/KAHIN PYAAR NA HO JAAYE.mp3" type="audio/mp3">
   Your browser does not support the audio tag.
 </audio>
 	
	</div>
	</font>
	</div>
</body>
</html>