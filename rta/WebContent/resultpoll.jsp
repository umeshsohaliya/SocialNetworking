<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
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
    
    $("#aq1").slideUp('fast');
    $("#aq2").slideUp('fast');
    $("#aq3").slideUp('fast');  
    $("#aq4").slideUp('fast');
    $("#aq5").slideUp('fast');
    $("#aq6").slideUp('fast');
    $("#aq7").slideUp('fast');
    $("#aq8").slideUp('fast');  
    $("#aq9").slideUp('fast');
    $("#aq10").slideUp('fast');
    $("#aq11").slideUp('fast');
    
    
    $("#noti").slideUp('fast');
    $("#c").slideUp('fast');
  }

</script>

<style type="text/css">
	.atable1 , .atable2 ,  .atable3 , .atable4 , .atable5 , .atable6 , .atable7 , .atable8 , .atable9 ,.atable10 , .atable11{
		height: 400px;
		 width: 600px;
		 background-color:#6B4325;
		 border-color: red;
		 
	}
	.info  {
		height: 300px;
		 width: 600px;
		 background-color:#6B4325;
	}
	#inf , #aq1 , #aq2 ,#aq3 ,#aq4 ,#aq5 ,#aq6 ,#aq7 ,#aq8 ,#aq9 , #aq10 , #aq11{
		border-color: white;
		border-width: 2px;
		border-style:solid;
		background-color: purple;
		border-radius:35px;
		border-color: red;
		width: 605px;
		height: 411px
		
	}
</style>
</head>
<body onload="showhide()">
<font style="font-family: Algerian;font-style: Algerian">
		<br/> <br/> <br/> <br/>
	
		
		<div   >
			<table  >
				<tr>
					<td colspan="1">result is:</td>
				</tr>
				<tr><td>
						thanks for playing poll your score is : <s:property value="atrue" />
				</td></tr>
				<tr> <td> <a  href="main.action"> <input type="button" id="qus11" name="qus11" value="submit"/> </a> </td>  </tr>
			</table>	
	</div>

<!-- 
  <script>
    $("p").click(function () {
      $(this).slideUp('slow');
    });
	
    $("#info").click(function () {
	      $("#inf").slideUp('slow');
		  	 $("#q1").slideDown('medium').show();
	    });
    	//  question 1 start
	 $("#qus1").click(function () {
      $(".table1").slideUp('slow');
	  	 $("#aq1").slideDown('medium').show();
    });
	
			 $("#aqus1").click(function () {
	     		 $(".atable1").slideUp('slow');
		  			 $("#q2").slideDown('medium').show();
	   		 });
	 // question 2 start
	 
	 $("#qus2").click(function () {
	      $(".table2").slideUp('slow');
		  	 $("#aq2").slideDown('medium').show();
	    });
				 $("#aqus2").click(function () {
 					 $(".atable2").slideUp('slow');
  						 $("#q3").slideDown('medium').show();
		 		});
	 // question 3 start
	 $("#qus3").click(function () {
	      $(".table3").slideUp('slow');
		  	 $("#aq3").slideDown('medium').show();
	    });
	 				$("#aqus3").click(function () {
						 $(".atable3").slideUp('slow');
				 			$("#q4").slideDown('medium').show();
					});
	 // question 4 start
	 
	 $("#qus4").click(function () {
	      $(".table4").slideUp('slow');
		  	 $("#aq4").slideDown('medium').show();
	    });
				 $("#aqus4").click(function () {
		 			$(".atable4").slideUp('slow');
 						$("#q5").slideDown('medium').show();
				});
				 
	 // question 5 start
	 
	 $("#qus5").click(function () {
	      $(".table5").slideUp('slow');
		  	 $("#aq5").slideDown('medium').show();
	    });
				 $("#aqus5").click(function () {
					 $(".atable5").slideUp('slow');
 						$("#q6").slideDown('medium').show();
				});
				 
	 //question 6 start
	 
	 $("#qus6").click(function () {
	      $(".table6").slideUp('slow');
		  	 $("#aq6").slideDown('medium').show();
	    });
				 $("#aqus6").click(function () {
		 			$(".atable6").slideUp('slow');
 						$("#q7").slideDown('medium').show();
				});
				 
	 //qustion 7 start
	 
	 $("#qus7").click(function () {
	      $(".table7").slideUp('slow');
		  	 $("#aq7").slideDown('medium').show();
	    });
				 $("#aqus7").click(function () {
					 $(".atable7").slideUp('slow');
 						$("#q8").slideDown('medium').show();
				});
				 
	 //question 8 start
	 
	 $("#qus8").click(function () {
	      $(".table8").slideUp('slow');
		  	 $("#aq8").slideDown('medium').show();
	    });
				 $("#aqus8").click(function () {
					 $(".atable8").slideUp('slow');
 						$("#q9").slideDown('medium').show();
				});
				 
	 // question 9 start
	 
	 $("#qus9").click(function () {
	      $(".table9").slideUp('slow');
		  	 $("#aq9").slideDown('medium').show();
	    });
	 				$("#aqus9").click(function () {
						 $(".atable9").slideUp('slow');
 							$("#q10").slideDown('medium').show();
					});
	 // question 10 start
	 
	 $("#qus10").click(function () {
	      $(".table10").slideUp('slow');
		  	 $("#aq10").slideDown('medium').show();
	    });
					 $("#aqus10").click(function () {
						 $(".atable10").slideUp('slow');
 							$("#q11").slideDown('medium').show();
	});
</script>

   only for ans not question in click  -->
  
  <script>
    $("p").click(function () {
      $(this).slideUp('slow');
    });
	
    $("#info").click(function () {
	      $("#inf").slideUp('slow');
		  	 $("#aq1").slideDown('medium').show();
	    });
    
	 $("#aqus1").click(function () {
      $("#aq1").slideUp('slow');
	  	 $("#aq2").slideDown('medium').show();
    });
	
	 $("#aqus2").click(function () {
	      $("#aq2").slideUp('slow');
		  	 $("#aq3").slideDown('medium').show();
	    });
	
	 $("#aqus3").click(function () {
	      $("#aq3").slideUp('slow');
		  	 $("#aq4").slideDown('medium').show();
	    });
	 $("#aqus4").click(function () {
	      $("#aq4").slideUp('slow');
		  	 $("#aq5").slideDown('medium').show();
	    });
	
	 
	 $("#aqus5").click(function () {
	      $("#aq5").slideUp('slow');
		  	 $("#aq6").slideDown('medium').show();
	    });
	
	 
	 $("#aqus6").click(function () {
	      $("#aq6").slideUp('slow');
		  	 $("#aq7").slideDown('medium').show();
	    });
	
	 
	 $("#aqus7").click(function () {
	      $("#aq7").slideUp('slow');
		  	 $("#aq8").slideDown('medium').show();
	    });
	
	 
	 $("#aqus8").click(function () {
	      $("#aq8").slideUp('slow');
		  	 $("#aq9").slideDown('medium').show();
	    });
	
	 
	 $("#aqus9").click(function () {
	      $("#aq9").slideUp('slow');
		  	 $("#aq10").slideDown('medium').show();
	    });
	
	 $("#aqus10").click(function () {
	      $("#aq10").slideUp('slow');
		  	 $("#aq11").slideDown('medium').show();
	    });
	
</script>	
</font>	 
</body>
</html>