<%@page import="org.apache.commons.beanutils.converters.SqlTimestampConverter"%>
<%@page import="java.sql.SQLClientInfoException"%>
<%@page import="com.sun.xml.internal.ws.wsdl.writer.document.xsd.Import"%>
<%@page import="java.sql.*"    %>
<%@page import="com.rta.conne.*"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="shortcut icon" href="image/icon/icon.jpg"> 
<title>Insert title here</title>

<script type="text/javascript" src="./jquery/jquery.js"></script>
<script type="text/javascript" src="./javascript/cycle.js"></script>

<!-- for purpose f image rotate id=rotetimg -->
<script type="text/javascript">
	<!--
	// Cycle
		$(function() {
			$('#fW_Content').cycle({ 
			fx:    'fade',
			pager: '#fW_Controls'
 			});
		});
	//-->
</script>
<!-- close rotetimg -->

<link href="./css/stylesheet.css" rel="stylesheet" type="text/css">

</head>
<body>
<form action="log" method="post">


	<div   style="position:fixed ;   background-color:#6B4325 ; height:59px;width:100%;background-attachment:fixed; float:left ; visibility:visible">
			<div style="float:left">
				<font color="#86259E" style="font-family:Vrinda; font-size:xx-large"> Real-touch </font>
			</div> 
	

		<table  style="float: right;	">
		<tr ><td>
		<font color="#000066"><b>e-mail id</b></font>
		</td><td >
		<input type="text" style= size="40" title="email" name="e_id"/>
		</td><td rowspan="2">
		<font color="#000066">	<b>	<input type="submit" style="cursor:pointer; border-radius:20px; border: thin ;color:#000066; background-color:purple; text-shadow:gray; font-weight: bold;" value="LOGIN" /></font>
		</td></tr>
		<tr><td>
		<font color="#000066"><b>password</b></font>
		</td><td>
		<input type="text" style= size="40" title="pass-word" name="pass"/>
		</td></tr>
		</table>
		
		
	</div>
	
	<br/><br/><br/>
	<div style=" width: 100%"></div>
	
	<div align="right" dir="rtl"> are you not member?<a href="/rta/registration.jsp"> click here to sign-up</a> </div>





	
<div >
<!--contentarea start-->
<div class="middlearea">
<!--middlearea start-->
<div >
<!--banner start-->
 <br/><br/><br/><br/>
     <div id="fW_Content" style="position: relative;">                              
        <img src="image/loginpage/sculpting-thoughts.jpg" alt="Software Development Company" style="position: absolute; top: 0px; left: 0px; display: none; z-index: 5; opacity: 0;">
        <img src="image/loginpage/software-development.jpg" alt="Software Development" style="position: absolute; top: 0px; left: 0px; display: none; z-index: 4; opacity: 0;">
        <img src="image/loginpage/technology.jpg" alt="Software Technologies" style="position: absolute; top: 0px; left: 0px; display: none; z-index: 3; opacity: 0;"> 
        <img src="image/loginpage/mobile-technology.jpg" alt="Mobile Application Development" style="position: absolute; top: 0px; left: 0px; display: block; z-index: 2; opacity: 1;"> 
        <img src="image/loginpage/industry.jpg" alt="Industry" style="position: absolute; top: 0px; left: 0px; display: none; z-index: 1; opacity: 0;">                              
		<img src="image/loginpage/1.jpg" alt="Industry" style="position: absolute; top: 0px; left: 0px; display: none; z-index: 1; opacity: 0;">                              
      </div>
<!--banner end-->
</div>
</div>




</form>
</body>
</html>