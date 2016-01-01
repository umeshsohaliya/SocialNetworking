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
<font style="font-family: Algerian;font-style: Algerian">
	<br/><br/><br/><br/>
	
		
		<s:form action="savepage.action" enctype="multipart/form-data">
		<div align="center">
			<input type="text"  value=" page name is : <s:property value="name"/>" disabled="disabled">
			<input type="text"  value=" page type is : <s:property value="t"/>" disabled="disabled">   
			
			<input type="text" name="pn" value="  <s:property value="name"/>"  style="display: none;">
			<input type="text" name="pt" value="  <s:property value="t"/>" style="display: none;" >   
			<input type="text" name="category" value="<s:property value="category"/>"  style="display: none;">
			
			<div><img border="2" src="imagefile" height="100px" width="100px"/>
			<input type="file" name="imagefile"/>
			</div>
			
			
			<div>
				
				<div>
				
					<textarea cols="80" placeholder=" description of your page" name="desc" rows="5"></textarea>
				</div>
				<br/>
				<div>
				
				<textarea cols="80" name="link" placeholder="another link "></textarea>
				</div>
				<br/>
				<div>
				<a>	<input type="submit" value="save"></a>
				</div>
			</div>
			
			
			
			
			<div>
			</div>
		
		
		</div>
		</s:form>
	</font>
</body>
</html>