<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style type="text/css">

#thumbContainter {
	color:white;
    background: url("images/bg.png") repeat scroll left top transparent;
    bottom: 0;
    box-shadow: -2px 0 10px #000000 inset;
    left: 0;
    margin: 0;
    padding: 0 10px;
    position: fixed;
    bottom:20px;
    width: 130px;
    height: 70px;
    border-radius:20px;
}
* {
    margin: 0;
    padding: 0;
}

</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title><tiles:insertAttribute name="pageTitle"></tiles:insertAttribute></title>
</head>
<body marginheight="0">
<table  width="100%">
	<tr >
		<td colspan="3" width="100R%" > <tiles:insertAttribute name="header"></tiles:insertAttribute> </td>
	</tr>
	<tr height="100%">
		<td width="20%" > <tiles:insertAttribute name="lhs" ></tiles:insertAttribute> </td>
		<td width="60%"><tiles:insertAttribute name="content"></tiles:insertAttribute>  </td>
		<td width="20%"> <tiles:insertAttribute name="rhs"></tiles:insertAttribute> </td>
	</tr>
	
	<tr height="60px" ><td colspan="3"> <tiles:insertAttribute name="footer"></tiles:insertAttribute> </td></tr>


</table>
</body>
</html>

 