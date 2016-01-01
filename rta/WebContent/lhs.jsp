<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="/struts-tags" prefix="s"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
		<!--    for on mouse hover slide image start -->
		 <link rel="stylesheet" type="text/css" media="all" href="css/lhs/main.css">
  
 
 <script type="text/javascript" src="jquery/lhs/jquery-1.3.1.js"></script>
  <script type="text/javascript">$(document).ready(function(){
		$('.boxgrid.slideright').hover(function(){
			$(".cover", this).stop().animate({left:'325px'},{queue:false,duration:300});
		}, function() {
			$(".cover", this).stop().animate({left:'0px'},{queue:false,duration:300});
		});
	});
</script> 
		
		<!--   on mouse hover slide image end -->
</head>
<body >
<div style="background-image: none;background-color: white;height: 100%;width: 100%;">
<font style="font-family: Algerian;font-style: Algerian">
<table  style="border-right:0px ;border-right-style: dashed;" bordercolor="#6B4325" height="100%" width="100% ">
	<tr height="100%" ><td width="100%">
		<br/><br/><br/>
		
		
			<div >
			
				<table align="center" border="0px" style="border-spacing: 0px;">
				
					<tr><td ><img style="height:180px;width: 180px; " alt="image" src="image/userprofile/<% out.print(session.getAttribute("i").toString()); %>"/><!-- your image here --></td></tr>
					<tr><td><% out.print(session.getAttribute("un").toString()); %></td></tr>
					<tr><td><% out.print(session.getAttribute("cl").toString()); %> </td></tr>
					<tr><td><% out.print(session.getAttribute("uni").toString()); %></td></tr>
					<tr><td></td></tr>
					<s:iterator value="polllist">
					<tr style="background-color: #9A3240;margin: 0px;"><td><s:property value="nm"  /></td></tr>
					</s:iterator>
					
					<s:iterator value="pglist">
					
					<tr><td>   <img alt="" src="image/page/<s:property value="ip"   />" style=" height: 30px; width: 40px">   </td> <td  align="left"> <form action="show.action"><input type="text" name="pgid" value="<s:property value="fi"/>" style="display: none;">  <s:property value="nm"/> <input type="submit" value="show"> </form>  </td></tr>
					</s:iterator>
				</table>
			</div>
	</td></tr>
	<tr ><td>
	
			<div id="wrapper"><div id="header">
				<div class="boxgrid slideright ">
					<img class="cover" src="image/lhs/poll.jpg" alt="poll" width="215" height="130" style="left: 0px;" title="">
						<div><a href="Reqpoll">
						<table background="image/lhs/createpoll.jpg" height="65px" width="215"> <tr><td></td></tr></table></a>
					
					</div>
					<div><a href="aaa.action">
					<table background="image/lhs/play poll.jpg" height="65px" width="215" ></table></a>
					</div>
				</div>
			</div></div>
			
	</td></tr>
	<tr ><td>
	
			<div id="wrapper"><div id="header">
				<div class="boxgrid slideright ">
					<img class="cover" src="image/lhs/page.jpg" alt="page" width="215" height="130" style="left: 0px;" title="">
						<div>
								<a href="createpage.action"> 
						<table background="image/lhs/create page.jpg" height="65px" width="215" ></table>
						    </a>
					
					</div>
					<div>
						<a href="findpage.action">  <table background="image/lhs/find page.jpg" height="65px" width="215" ></table>    </a>
					</div>
				</div>
			</div></div>
	
			
	</td></tr>
	
</table>

</font>
</div>
</body>
</html>