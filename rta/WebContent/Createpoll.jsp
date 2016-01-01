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
<font style="font-family: Algerian;font-style: Algerian">
<form action="createpoll.action" method="post">
<br/><br/><br/>


<div align="center" style=" height: 100% ; width: 100%">

	<div id="inf">  
		<table class="info">
			<tr>
				<td>	enter name of poll		</td>
				<td > <input type="text" name="pname"/>
			</tr>
			
			<tr>
				<td>	select type of poll		</td>
				<td > <select name="ptype">
							<option selected="selected">select type</option>
							<option value="1">programing language</option>
							<option value="2"> entertainment</option>
							<option value="3">math</option>
							<option value="4">technology</option>
					</select>
				</td>				
			</tr>
			<tr>
				<td>
					difficulty level
				</td>
				<td>
					<select name="difficulty">
						<option selected="selected">select difficulty level</option>
						<option value="1">easy</option>
						<option value="2">medium</option>
						<option value="3">hard</option>
					</select>
			</tr>
			<tr  ><td colspan="2"> <input type="button" id="info" value="ok">
		</table>
	</div>
	
	<div id="q1" >
			<table class="table1" >
				<tr>
					<td colspan="1">enter question -1</td>
				</tr>
				<tr>
					<td colspan="2"> <textarea rows="2" cols="60" name="q1"></textarea></td>
				</tr>
				<tr>
					<td> A <input type="text" name="aa"></td>
					<td>B <input type="text" name="ab"></td>
				</tr>
				
				<tr>
					<td> C <input type="text" name="ac"></td>
					<td>D <input type="text" name="ad"></td>
				</tr> 
				<tr>
					<td> select ans  <select name="aans">
										<option selected="selected"> select answare </option>
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
					<td colspan="1">enter question -2</td>
				</tr>
				<tr>
					<td colspan="2"> <textarea rows="2" cols="60" name="q2"></textarea></td>
				</tr>
				<tr>
					<td> A <input type="text" name="ba"></td>
					<td>B <input type="text" name="bb"></td>
				</tr>
				
				<tr>
					<td> C <input type="text" name="bc"></td>
					<td>D <input type="text" name="bd"></td>
				</tr> 
				<tr>
					<td> select ans  <select name="bans">
										<option selected="selected"> select answare </option>
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
					<td colspan="2"> <textarea rows="2" cols="60" name="q3"></textarea></td>
				</tr>
				<tr>
					<td> A <input type="text" name="ca"></td>
					<td>B <input type="text" name="cb"></td>
				</tr>
				
				<tr>
					<td> C <input type="text" name="cc"></td>
					<td>D <input type="text" name="cd"></td>
				</tr> 
				<tr>
					<td> select ans  <select name="cans">
										<option selected="selected"> select answare </option>
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
					<td colspan="2"> <textarea rows="2" cols="60" name="q4"></textarea></td>
				</tr>
				<tr>
					<td> A <input type="text" name="da"></td>
					<td>B <input type="text" name="db"></td>
				</tr>
				
				<tr>
					<td> C <input type="text" name="dc"></td>
					<td>D <input type="text" name="dd"></td>
				</tr> 
				<tr>
					<td> select ans  <select name="dans">
										<option selected="selected"> select answare </option>
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
					<td colspan="1">enter question -5</td>
				</tr>
				<tr>
					<td colspan="2"> <textarea rows="2" cols="60" name="q5"></textarea></td>
				</tr>
				<tr>
					<td> A <input type="text" name="ea"></td>
					<td>B <input type="text" name="eb"></td>
				</tr>
				
				<tr>
					<td> C <input type="text" name="ec"></td>
					<td>D <input type="text" name="ed"></td>
				</tr> 
				<tr>
					<td> select ans  <select name="eans">
										<option selected="selected"> select answare </option>
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
					<td colspan="2"> <textarea rows="2" cols="60" name="q6"></textarea></td>
				</tr>
				<tr>
					<td> A <input type="text" name="fa"></td>
					<td>B <input type="text" name="fb"></td>
				</tr>
				
				<tr>
					<td> C <input type="text" name="fc"></td>
					<td>D <input type="text" name="fd"></td>
				</tr> 
				<tr>
					<td> select ans  <select name="fans">
										<option selected="selected"> select answare </option>
										<option value="1">A</option>
										<option value="2">B</option>
										<option value="3">C</option>
										<option value="4">D</option>
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
					<td colspan="2"> <textarea rows="2" cols="60" name="q7"></textarea></td>
				</tr>
				<tr>
					<td> A <input type="text" name="ga"></td>
					<td>B <input type="text" name="gb"></td>
				</tr>
				
				<tr>
					<td> C <input type="text" name="gc"></td>
					<td>D <input type="text" name="gd"></td>
				</tr> 
				<tr>
					<td> select ans  <select name="gans">
										<option selected="selected"> select answare </option>
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
					<td colspan="2"> <textarea rows="2" cols="60" name="q8"></textarea></td>
				</tr>
				<tr>
					<td> A <input type="text" name="ha"></td>
					<td>B <input type="text" name="hb"></td>
				</tr>
				
				<tr>
					<td> C <input type="text" name="hc"></td>
					<td>D <input type="text" name="hd"></td>
				</tr> 
				<tr>
					<td> select ans  <select name="hans">
										<option selected="selected"> select answare </option>
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
					<td colspan="2"> <textarea rows="2" cols="60" name="q9" ></textarea></td>
				</tr>
				<tr>
					<td> A <input type="text" name="ia"></td>
					<td>B <input type="text" name="ib"></td>
				</tr>
				
				<tr>
					<td> C <input type="text" name="ic"></td>
					<td>D <input type="text" name="id"></td>
				</tr> 
				<tr>
					<td> select ans  <select name="ians">
										<option selected="selected"> select answare </option>
										<option value="1">A</option>
										<option value="2">B</option>
										<option value="3">C</option>
										<option value="4">D</option>
									</select> 
					 </td>
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
					<td colspan="2"> <textarea rows="2" cols="60" name="q10"></textarea></td>
				</tr>
				<tr>
					<td> A <input type="text" name="ja"></td>
					<td>B <input type="text" name="jb"></td>
				</tr>
				
				<tr>
					<td> C <input type="text" name="jc"></td>
					<td>D <input type="text" name="jd"></td>
				</tr> 
				<tr>
					<td> select ans  <select name="jans">
										<option selected="selected"> select answare </option>
										<option value="1">A</option>
										<option value="2">B</option>
										<option value="3">C</option>
										<option value="4">D</option>
									</select> 
					 </td>
					 </td>
				</tr>
				<tr> <td> <input type="submit" id="qus10" name="qus10" value="submit"/></td>  </tr>
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
	
	 
	
	
</script>
</form>
</font>
</body>
</html>