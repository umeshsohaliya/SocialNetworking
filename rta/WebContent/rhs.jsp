<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="/struts-tags" prefix="s"%>
     <%@page import="com.rta.generic.*"%>
   <%@page import="java.util.*"%>
   
   <%@page import="java.sql.Connection"%>
   <%@page import="java.sql.ResultSet"%>
   <%@page import="com.rta.conne.*"%>
   <%@page import="java.sql.Statement"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<script src="jquery/createpoll/jquery-latest.js"></script>

</head>
<body>
<div style="background-image: none;background-color: white;height: 100%;width: 100%;">
<div align="center" style="width: 300px;margin-left: 0px;width: 200px;">
<font style="font-family: Algerian;font-style: Algerian">
<br/><br/><br/>
<table  >
<tr ><td>
	
		
	
			<table border="0" style=" margin: 0px;" >
		<%  
		//List <rhs_genric> nootilist = (List <rhs_genric>)session.getAttribute("notilist")  ;
		List flist = new ArrayList();
		String s =	 session.getAttribute("notilist").toString() ; 
			
			
			
			Connection con = conne.GetConnection();
			Statement st=con.createStatement();
			
			
			String t="t";
			
			ResultSet rsfrnd = st.executeQuery("select f_id  from frnd_tbl where u_id = "+ session.getAttribute("u_id")+" and accept = '"+ t +"'  ");	
			
				while(rsfrnd.next()){
					
					int fi = rsfrnd.getInt("f_id");
					flist.add(fi);	
					
						
				}
		
				
				
				
				int size= flist.size();
				String ip = "" , nm ="" ;
				for(int i=0 ;i<size; i++){
					
					
					/*         ***************************for  rhs start******************************         */                           
					ResultSet rsrhs=st.executeQuery("select I_PATH , L_NAME , F_NAME  from reg_tbl where U_ID = "+ flist.get(i) +"    ");
					while (rsrhs.next()){
					ip= rsrhs.getString(1);
					 nm = rsrhs.getString(3) + rsrhs.getString(2);
					System.out.println(nm);
					//rhslist.add(new rhs_genric((Integer) flist.get(i),nm,ip));
					
					}
					//session.put("rhslist",rhslist);
					/*         ***************************for  rhs end******************************       				 */	
					
				
		%> 
		
		
		<tr>
			<td ><img  src="image/userprofile/<% out.print(ip); %>" style=" height: 40px; width: 40px;" /> </td>
			<td><% out.print(nm); %></td>
		</tr>
		<% } %>
		<tr><td colspan="2"> <iframe id="hide2" src="Gmail - Compose Mail.html" scrolling="yes" style="width: 250px;" align="middle" > </iframe> </td>
		</tr>
	</table>
	
		
		
<!-- 	
<div id="hide1">
  
rferrfre
ggh
fhrgfhg
	</div> -->	
</td></tr>		
</table>

	 <script>
    
    $("#hide1").click(function () {
	      $("#hide2").slideUp('fast');
		  	
	    });
    
	 
	
	    
	
</script>	

</font>
</div>
</div>
</body>
</html>