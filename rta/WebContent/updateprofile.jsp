<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
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
</head>
<body>
<div align="center">
<br/><br/><br/>
<form action="savepro.action" method="post" enctype="multipart/form-data">
<font style="font-family: Algerian;font-style: Algerian">
		<%    
	Connection con=conne.GetConnection();
	Statement st=con.createStatement();
	
	
	int uid = (Integer) session.getAttribute("u_id");
	//out.print(uid);
	
	ResultSet rs=st.executeQuery("select * from reg_tbl where U_ID = '"+ uid +"' ");
	
	while(rs.next()){
		//out.print(rs.getString("F_NAME")  );
	
	
	%>
	<div>
	<table  >
			<tr id="tra"><td colspan="2">   &nbsp; &nbsp; &nbsp;<font size="24"> <b>update profile details </b></font> </td></tr>
			
			<tr><td>     first name</td><td><input type="text" name="firstname" value="<%=rs.getString("F_NAME")  %>"></td></tr>
			<tr><td>      last name</td><td><input type="text" name="lastname" value="<%=rs.getString("L_NAME")  %>"></td></tr>
			<tr><td>      maid-id </td><td><input type="text" name="emailusr" value="<%=rs.getString("E_ID")  %>"> </td></tr>
			<tr><td>  phone no. </td><td><input type="text" name="phonenumber" value="<%=rs.getString("PH") %>"> </td></tr>
			
			<tr><td>  birth date</td><td><input type="text" name="dob" value="<%=rs.getString("DOB")  %>"></td></tr>

			<tr height="40px"><td> your-photo  </td>
			<td>
					<img style="height:180px;width: 180px; "  src="image/userprofile/<%=rs.getString("I_PATH")  %>"/>
				 	<s:file name="imagefile"  	/>
			</td></tr>
	<!-- 	</table>
		
		<table>  -->
		<tr id="tra" ><td colspan="2"> --- security portion-----------------------------------</td></tr>
			<tr><td>  password </td><td><input name="passwordusr" type="text" value="<%=rs.getString("PASS")  %>"></td></tr>
			
			
	<!-- 	</table>
		
		<table>	 -->
		<tr id="tra"><td colspan=21"> --- address portion-------------------------------------			</td></tr>
			<tr><td>  country </td><td><input name="country" type="text" value="<%=rs.getString("COUN")  %>"></td></tr>
			<tr><td> state  </td><td><input name="state" type="text" value="<%=rs.getString("STAT")  %>"> </td></tr>
			<tr><td>  district  </td><td><input name="dist" type="text" value="<%=rs.getString("DIST")  %>"> </td></tr>
			<tr><td> city</td> <td><input name="city" type="text" value="<%=rs.getString("CITY")  %>">   </tr>
			<tr><td> address  </td><td><input name="address" type="text" value="<%=rs.getString("ADDR")  %>"> </td></tr>
			<tr><td>  pincode </td><td><input type="text" name="postcode" value="<%=rs.getString("P_CODE")  %>"> </td></tr>
	<!-- 	</table>
			
		<table>    -->
		<tr  id="tra"><td colspan=21"> --- education portion portion-------------------------</td></tr>
			<tr><td> school name  </td><td><input type="text" name="school" value="<%=rs.getString("SCHOOL")  %>"> </td></tr>
			<tr><td>  collage name </td><td><input type="text" name="collage" value="<%=rs.getString("COLLAGE")  %>"> </td></tr>
			<tr><td> univercity name </td><td><input type="text" name="uni" value="<%=rs.getString("UNIVER")  %>"> </td></tr>
			<tr><td>  are you work AT </td><td><input type="text" name="work"  value="<%=rs.getString("WORK")  %>"> </td></tr>
			<tr><td> language know </td><td><input type="text" name="lang" value="<%=rs.getString("LANG")  %>"> </td></tr>
	<!-- 	</table>
			
		<table>   -->
		<tr id="tra" ><td colspan=21"> --- who is your favorite-------------------------------</td></tr>
			<tr><td> game </td><td><input type="text" name="gm" value="<%=rs.getString("GAME")  %>"> </td></tr>
			<tr><td> movie  </td><td><input type="text" name="mv" value="<%=rs.getString("F_MV")  %>"> </td></tr>
			<tr><td>  singer </td><td><input type="text" name="sng" value="<%=rs.getString("F_SNG")  %>"> </td></tr>
			<tr><td> book </td><td><input type="text" name="book" value="<%=rs.getString("F_BOOK")  %>"> </td></tr>
			<tr><td> sentence </td><td><input type="text" name="sent" value="<%=rs.getString("SENTENCE")  %>"> </td></tr>
			<tr><td> idle  </td><td><input type="text" name="idl" value="<%=rs.getString("IDLE")  %>"> </td></tr>
	<!-- 	</table>
			
		<table>   -->
		<tr id="tra"><td colspan=21"> --- personalize ---------------------------------------</td></tr>
			<tr><td> select background image  </td><td><input style="height:180px;width: 180px; " type="text" value="<%=rs.getString("B_IMG")  %>"> </td></tr>
			<tr><td> select background sound </td><td><input type="text" value="<%=rs.getString("B_SOUND")  %>"> </td></tr>
		</table>
	
	</div>
	
	<% } %>
	
	<input type="submit" value="save">
	</font>
	</form>
	<form action="log"><input type="submit" value="cancel" /></form>
	</div>
</body>
</html>