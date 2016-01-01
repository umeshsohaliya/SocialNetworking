<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="/struts-tags" prefix="s"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<script src="jquery/createpoll/jquery-latest.js"></script>

<script type="text/javascript">
 function showhide() {
    $("#q1").slideUp('fast');
    $("#q2").slideUp('fast');
    $("#q3").slideUp('fast');  
    $("#q4").slideUp('fast');
    $("#q5").slideUp('fast');
    $("#q6").slideUp('fast');
    $("#q7").slideUp('fast');
    $("#q8").slideUp('fast');  
    $("#q9").slideUp('fast');
    $("#q10").slideUp('fast');
    $("#q11").slideUp('fast');
    
    $("#noti").slideUp('fast');
    $("#c").slideUp('fast');
  }

</script>

<style type="text/css">
	.table1 , .table2 ,  .table3 , .table4 , .table5 , .table6 , .table7 , .table8 , .table9 ,.table10 , .table11{
		height: 400px;
		 width: 600px;
		 background-color:#FFFFCC;
		 
	}
	.info  {
		height: 300px;
		 width: 600px;
		 background-color:#FFFFCC;
	}
	#inf , #q1 , #q2 ,#q3 ,#q4 ,#q5 ,#q6 ,#q7 ,#q8 ,#q9 , #q10 , #q11{
		border-color: red;
		border-width: 2px;
		border-style:solid;
		background-color: #A3A3A3;
		border-radius:20px;
		
	}
</style>
</head>
<body onload="showhide()">
	<form action="resultpoll.action">
	<font style="font-family: Algerian;font-style: Algerian">
		<br/></br><br/>
	<div align="center" style=" height: 100% ; width: 100%">
		<input type="text" value="<% out.print( session.getAttribute("creter_id").toString()); %>" style=" display: none;" name= "creater_id">
		<input type="text" value="<% out.print( session.getAttribute("poll_id").toString()); %>" style=" display: none;" name="poll_id">
	<div id="inf"> 
		<table class="info">
			<tr>
				<td> <input type="text" name= "pname" value="<% out.print( session.getAttribute("pname").toString()); %>" style="display: none;">are you paly : <% out.print( session.getAttribute("pname").toString()); %>  	</td>
			</tr>
			<!--
			<tr>
				<td>	 type of poll is : 		</td>
				<td > <% out.print( session.getAttribute("ptype")); %>
				</td>				
			</tr>
			<tr>
				<td>
					difficulty level of poll
				</td>
				<td>
					<% out.print( session.getAttribute("diff_level")); %>
				</td>					
			</tr>  -->
			<tr  ><td colspan="2"> <input type="button" id="info" value="play">
		</table>
	</div>
	
	<div id="q1" >
			<table class="table1" >
				<tr>
					<td colspan="1"> question -1 </td>
				</tr>
				<tr>
					<td colspan="2"> <% out.print( session.getAttribute("qa")); %></td>
				</tr>
				<tr>
					<td> A  <% out.print( session.getAttribute("o_aa")); %></td>
					<td>B <% out.print( session.getAttribute("o_ab")); %></td>
				</tr>
				
				<tr>
					<td> C <% out.print( session.getAttribute("o_ac")); %></td>
					<td>D <% out.print( session.getAttribute("o_ad")); %></td>
				</tr> 
				<tr>
					<td> select ans  <select  name="aa">
										<option value="1">A</option>
										<option value="2">B</option>
										<option value="3">C</option>
										<option value="4">D</option>
									</select> 
					 </td>
				</tr>
				<tr> <td> <input type="button" id="qus1" name="qus1" value="submit"/></td>  </tr>
			</table>	
	</div>
	
	
	
	
	
		<div id="q2"  >
			<table class="table2" >
				<tr>
					<td colspan="1"> question -2</td>
				</tr>
				<tr>
					<td colspan="2"> <% out.print( session.getAttribute("qb")); %></td>
				</tr>
				<tr>
					<td> A  <% out.print( session.getAttribute("o_ba")); %></td>
					<td>B <% out.print( session.getAttribute("o_bb")); %></td>
				</tr>
				
				<tr>
					<td> C <% out.print( session.getAttribute("o_bc")); %></td>
					<td>D <% out.print( session.getAttribute("o_bd")); %></td>
				</tr> 
				<tr>
					<td> select ans  <select name="ab" >
										<option value="1">A</option>
										<option value="2">B</option>
										<option value="3">C</option>
										<option value="4">D</option>
									</select> 
					 </td>
				</tr>
				<tr> <td> <input type="button" id="qus2" name="qus2" value="submit"/></td>  </tr>
			</table>	
	</div>
	
	
	<div id="q3"  >
			<table class="table3" >
				<tr>
					<td colspan="1">enter question -3</td>
				</tr>
				<tr>
					<td colspan="2"> <% out.print( session.getAttribute("qc")); %></td>
				</tr>
				<tr>
					<td> A  <% out.print( session.getAttribute("o_ca")); %></td>
					<td>B <% out.print( session.getAttribute("o_cb")); %></td>
				</tr>
				
				<tr>
					<td> C <% out.print( session.getAttribute("o_cc")); %></td>
					<td>D <% out.print( session.getAttribute("o_cd")); %></td>
				</tr> 
				<tr>
					<td> select ans  <select name="ac">
										<option value="1">A</option>
										<option value="2">B</option>
										<option value="3">C</option>
										<option value="4">D</option>
									</select> 
					 </td>
				</tr>
				<tr> <td> <input type="button" id="qus3" name="qus3" value="submit"/></td>  </tr>
			</table>	
	</div>
	
	
		<div id="q4"  >
			<table class="table4" >
				<tr>
					<td colspan="1">enter question -4</td>
				</tr>
				<tr>
					<td colspan="2"> <% out.print( session.getAttribute("qd")); %></td>
				</tr>
				<tr>
					<td> A <% out.print( session.getAttribute("o_da")); %></td>
					<td>B <% out.print( session.getAttribute("o_db")); %></td>
				</tr>
				
				<tr>
					<td> C <% out.print( session.getAttribute("o_dc")); %></td>
					<td>D <% out.print( session.getAttribute("o_dd")); %></td>
				</tr> 
				<tr>
					<td> select ans  <select name="ad">
										<option value="1">A</option>
										<option value="2">B</option>
										<option value="3">C</option>
										<option value="4">D</option>
									</select> 
					 </td>
				</tr>
				<tr> <td> <input type="button" id="qus4" name="qus4" value="submit"/></td>  </tr>
			</table>	
	</div>
	
	
			<div id="q5"  >
			<table class="table5" >
				<tr>
					<td colspan="1">question -5</td>
				</tr>
				<tr>
					<td colspan="2"> <% out.print( session.getAttribute("qe")); %></td>
				</tr>
				<tr>
					<td> A  <% out.print( session.getAttribute("o_ea")); %></td>
					<td>B <% out.print( session.getAttribute("o_eb")); %></td>
				</tr>
				
				<tr>
					<td> C <% out.print( session.getAttribute("o_ec")); %></td>
					<td>D <% out.print( session.getAttribute("o_ed")); %></td>
				</tr> 
				<tr>
					<td> select ans  <select name="ae">
										<option value="1">A</option>
										<option value="2">B</option>
										<option value="3">C</option>
										<option value="4">D</option>
									</select> 
					 </td>
				</tr>
				<tr> <td> <input type="button" id="qus5" name="qus5" value="submit"/></td>  </tr>
			</table>	
	</div>		
	
	
	<div id="q6"  >
			<table class="table6" >
				<tr>
					<td colspan="1">enter question -6</td>
				</tr>
				<tr>
					<td colspan="2"> <% out.print( session.getAttribute("qf")); %></td>
				</tr>
				<tr>
					<td> A  <% out.print( session.getAttribute("o_fa")); %></td>
					<td>B <% out.print( session.getAttribute("o_fb")); %></td>
				</tr>
				
				<tr>
					<td> C <% out.print( session.getAttribute("o_fc")); %></td>
					<td>D <% out.print( session.getAttribute("o_fd")); %></td>
				</tr> 
				<tr>
					<td> select ans  <select name="af">
										<option value="">A</option>
										<option value="">B</option>
										<option value="">C</option>
										<option value="">D</option>
									</select> 
					 </td>
				</tr>
				<tr> <td> <input type="button" id="qus6" name="qus6" value="submit"/></td>  </tr>
			</table>	
	</div>		
	
	
	<div id="q7"  >
			<table class="table7" >
				<tr>
					<td colspan="1">enter question -7</td>
				</tr>
				<tr>
					<td colspan="2"> <% out.print( session.getAttribute("qg")); %></td>
				</tr>
				<tr>
					<td> A <% out.print( session.getAttribute("o_ga")); %></td>
					<td>B <% out.print( session.getAttribute("o_gb")); %></td>
				</tr>
				
				<tr>
					<td> C <% out.print( session.getAttribute("o_gc")); %></td>
					<td>D <% out.print( session.getAttribute("o_gd")); %></td>
				</tr> 
				<tr>
					<td> select ans  <select name="ag">
										<option value="1">A</option>
										<option value="2">B</option>
										<option value="3">C</option>
										<option value="4">D</option>
									</select> 
					 </td>
				</tr>
				<tr> <td> <input type="button" id="qus7" name="qus7" value="submit"/></td>  </tr>
			</table>	
	</div>	
	
	
	<div id="q8"  >
			<table class="table8" >
				<tr>
					<td colspan="1">enter question -8</td>
				</tr>
				<tr>
					<td colspan="2"> <% out.print( session.getAttribute("qh")); %></td>
				</tr>
				<tr>
					<td> A  <% out.print( session.getAttribute("o_ha")); %></td>
					<td>B <% out.print( session.getAttribute("o_hb")); %></td>
				</tr>
				
				<tr>
					<td> C <% out.print( session.getAttribute("o_hc")); %></td>
					<td>D <% out.print( session.getAttribute("o_hd")); %></td>
				</tr> 
				<tr>
					<td> select ans  <select name="ah">
										<option value="1">A</option>
										<option value="2">B</option>
										<option value="3">C</option>
										<option value="4">D</option>
									</select> 
					 </td>
				</tr>
				<tr> <td> <input type="button" id="qus8" name="qus8" value="submit"/></td>  </tr>
			</table>	
	</div>		
	
	<div id="q9"  >
			<table class="table9" >
				<tr>
					<td colspan="1">enter question -9</td>
				</tr>
				<tr>
					<td colspan="2"> <% out.print( session.getAttribute("qi")); %></td>
				</tr>
				<tr>
					<td> A  <% out.print( session.getAttribute("o_ia")); %></td>
					<td>B <% out.print( session.getAttribute("o_ib")); %></td>
				</tr>
				
				<tr>
					<td> C <% out.print( session.getAttribute("o_ic")); %></td>
					<td>D <% out.print( session.getAttribute("o_id")); %></td>
				</tr> 
				<tr>
					<td> select ans  <select name="ai">
										<option value="1">A</option>
										<option value="2">B</option>
										<option value="3">C</option>
										<option value="4">D</option>
									</select> 
					 </td>
				</tr>
				<tr> <td> <input type="button" id="qus9" name="qus9" value="submit"/></td>  </tr>
			</table>	
	</div>		
	
	
	
	
	<div id="q10"  >
			<table class="table10" >
				<tr>
					<td colspan="1">enter question -10</td>
				</tr>
				<tr>
					<td colspan="2"> <% out.print( session.getAttribute("qj")); %></td>
				</tr>
				<tr>
					<td> A  <% out.print( session.getAttribute("o_ja")); %></td>
					<td>B <% out.print( session.getAttribute("o_jb")); %></td>
				</tr>
				
				<tr>
					<td> C <% out.print( session.getAttribute("o_jc")); %></td>
					<td>D <% out.print( session.getAttribute("o_jd")); %></td>
				</tr> 
				<tr>
					<td> select ans  <select name="aj">
										<option value="1">A</option>
										<option value="2">B</option>
										<option value="3">C</option>
										<option value="4">D</option>
									</select> 
					 </td>
				</tr>
				<tr> <td> <input type="submit" id="qus10" name="qus10" value="submit"/></td>  </tr>
			</table>	
	</div>
	</font>
		</form>
		
		<div id="q11"  >
			<table class="table11" >
				<tr>
					<td colspan="1">result is:</td>
				</tr>
				
				<tr> <td> <a  href="resultpoll.action"> <input type="button" id="qus11" name="qus11" value="submit"/> </a> </td>  </tr>
			</table>	
	</div>
		
	
  <script>
    $("p").click(function () {
      $(this).slideUp('slow');
    });
	
    $("#info").click(function () {
	      $("#inf").slideUp('slow');
		  	 $("#q1").slideDown('medium').show();
	    });
    
	 $("#qus1").click(function () {
      $("#q1").slideUp('slow');
	  	 $("#q2").slideDown('medium').show();
    });
	
	 $("#qus2").click(function () {
	      $("#q2").slideUp('slow');
		  	 $("#q3").slideDown('medium').show();
	    });
	
	 $("#qus3").click(function () {
	      $("#q3").slideUp('slow');
		  	 $("#q4").slideDown('medium').show();
	    });
	 $("#qus4").click(function () {
	      $("#q4").slideUp('slow');
		  	 $("#q5").slideDown('medium').show();
	    });
	
	 
	 $("#qus5").click(function () {
	      $("#q5").slideUp('slow');
		  	 $("#q6").slideDown('medium').show();
	    });
	
	 
	 $("#qus6").click(function () {
	      $("#q6").slideUp('slow');
		  	 $("#q7").slideDown('medium').show();
	    });
	
	 
	 $("#qus7").click(function () {
	      $("#q7").slideUp('slow');
		  	 $("#q8").slideDown('medium').show();
	    });
	
	 
	 $("#qus8").click(function () {
	      $("#q8").slideUp('slow');
		  	 $("#q9").slideDown('medium').show();
	    });
	
	 
	 $("#qus9").click(function () {
	      $("#q9").slideUp('slow');
		  	 $("#q10").slideDown('medium').show();
	    });
	
	 $("#qus10").click(function () {
	      $("#q10").slideUp('slow');
		  	 $("#q11").slideDown('medium').show();
	    });
	
</script>
</body>
</html>