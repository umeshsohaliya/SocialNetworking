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
    $("#b1").slideUp('fast');
    $("#b2").slideUp('fast');
    $("#b3").slideUp('fast');  
    $("#b4").slideUp('fast');
    $("#b5").slideUp('fast');
    $("#b6").slideUp('fast');
    $("#noti").slideUp('fast');
    $("#c").slideUp('fast');
   
		}
	
	</script>
    
    <style type="text/css">
    	#a6, #a1, #a2 ,#a3 ,#a4 ,#a5   {
    		height: 360px;
    		width: 250px;
    		background-color: purple;
    		float: left;
    		border-radius: 20px;
    		margin: 5px;
    		font-size:large;
    		font-family: monospace;
    	}
    	#b6, #b1, #b2 ,#b3 ,#b4 ,#b5 {
    		height: 360px;
    		width: 250px;
    		background-color:#6B4325;
    		float: left;
    		border-radius: 20px;
    		margin: 5px;
    		font-size:large;
    		font-family: monospace;
    	}
    	
    	.info , .table1 , .table2 , .table3 , .table4 , .table5{
    		margin-top: 170px;
    	}
    	
    	
    </style>
</head>
<body onload="showhide()">
<font style="font-family: Algerian;font-style: Algerian">
createpage.jsp
	<br/> <br/><br/>
<div align="center" style="margin: 0px;">
	
	<form action="coipage.action">
	
	<div id="a1" >
		<table class="info">
			<tr>
				<td align="center">
					<font >	company ,organization and institution </font>
				</td>
			</tr>
		</table>
	</div>
	
	<div id="b1">
	<input type="text" name="t" value="company ,organization and institution"  style="display: none;">
		company ,organization and institution
		Join your supporters on realtouch<br/><br/>
		<select name="category">
			<option  value="0">Choose a category</option>
			<option value="2244">Aerospace/Defense</option>
			<option value="2240">Automobiles and Parts</option>
			<option value="2234">Bank/Financial Institution</option>
			<option value="2254">Biotechnology</option>
			<option value="2606">Cause</option>
			<option value="2247">Chemicals</option>
			<option value="2264">Church/Religious Organization</option>
			<option value="2260">Community Organization</option>
			<option value="2200">Company</option>
			<option value="2255">Computers/Technology</option>
			<option value="2248">Consulting/Business Services</option>
			<option value="2250">Education</option>
			<option value="2238">Energy/Utility</option>
			<option value="2251">Engineering/Construction</option>
			<option value="2246">Farming/Agriculture</option>
			<option value="2252">Food/Beverages</option>
			<option value="2604">Government Organization</option>
			<option value="2214">Health/Beauty</option>
			<option value="2243">Health/Medical/Pharmaceuticals</option>
			<option value="2241">Industrials</option>
			<option value="2236">Insurance Company</option>
			<option value="2256">Internet/Software</option>
			<option value="2249">Legal/Law</option>
			<option value="2233">Media/News/Publishing</option>
			<option value="2245">Mining/Materials</option>
			<option value="2235">Non-Governmental Organization (NGO)</option>
			<option value="2603">Non-Profit Organization</option>
			<option value="2600">Organization</option>
			<option value="2261">Political Organization</option>
			<option value="2618">Political Party</option>
			<option value="2239">Retail and Consumer Merchandise</option>
			<option value="2601">School</option>
			<option value="2237">Small Business</option>
			<option value="2253">Telecommunication</option>
			<option value="2242">Transport/Freight</option>
			<option value="2258">Travel/Leisure</option>
			<option value="2602">University</option></select> <br/><br/>
		<input type="text"  placeholder="company Name" name="name"/><br/><br/>
	<input type="checkbox"> I agree to <a href="pageterm.action">     realtouch page terms and condition</a><br/><br/>
	<a href="coipage.action">
	<input type="submit" value=" get started"/>
	</a>
	</div>
	
	</form>
	
	<form action="coipage.action">
	<div id="a2" >
			<table class="table1" >
			<tr>
				<td>
					Entertainment
				</td>
			</tr>
		</table>
	</div>
		
	
	
	<div id="b2">
	Entertainment
	<input type="text" name="t" value="Entertainment"  style="display: none;">
	Join your community on realtouch
	<br/><br/>
	<select class="old_ui_selector" id="category" name="category"><option selected="selected" value="0">Choose a category</option><option value="1200">Album</option><option value="1803">Amateur Sports Team</option><option value="1300">Book</option><option value="1305">Book Store</option><option value="1208">Concert Tour</option><option value="1209">Concert Venue</option><option value="1113">Fictional Character</option><option value="1306">Library</option><option value="1307">Magazine</option><option value="1105">Movie</option><option value="1111">Movie Theater</option><option value="1212">Music Award</option><option value="1213">Music Chart</option><option value="1207">Music Video</option><option value="1801">Professional Sports Team</option><option value="1210">Radio Station</option><option value="1211">Record Label</option><option value="1804">School Sports Team</option><option value="1201">Song</option><option value="1800">Sports League</option><option value="2507">Sports Venue</option><option value="1110">Studio</option><option value="1404">TV Channel</option><option value="1402">TV Network</option><option value="1400">TV Show</option><option value="1112">TV/Movie Award</option></select> <br/><br/>
	
	<input type="text"  placeholder="Name" name="name"/><br/><br/>
	<input type="checkbox"> I agree to <a href="pageterm.action">     realtouch page terms and condition</a><br/><br/>
	
	<input type="submit" value=" get started"/>
	
	</div>
	</form>
	
	
	<form action="coipage.action">
	<div id="a3" >
			<table class="table2" >
			<tr>
				<td>
					Brand or Product
				</td>
			</tr>
		</table>
	</div>
		
	<div id="b3">
		Brand or Product
		<input type="text" name="t" value="Brand or Product"  style="display: none;">
	<br/>
	<select class="old_ui_selector" id="category" name="category"><option selected="selected" value="0">Choose a category</option><option value="2301">App Page</option><option value="2215">Appliances</option><option value="2232">Baby Goods/Kids Goods</option><option value="2206">Bags/Luggage</option><option value="2216">Building Materials</option><option value="2208">Camera/Photo</option><option value="2205">Cars</option><option value="2209">Clothing</option><option value="2217">Commercial Equipment</option><option value="2210">Computers</option><option value="2263">Drugs</option><option value="2213">Electronics</option><option value="2252">Food/Beverages</option><option value="2219">Furniture</option><option value="2300">Games/Toys</option><option value="2214">Health/Beauty</option><option value="2218">Home Decor</option><option value="2220">Household Supplies</option><option value="2226">Jewelry/Watches</option><option value="2221">Kitchen/Cooking</option><option value="2227">Movies/Music</option><option value="2212">Office Supplies</option><option value="2231">Outdoor Gear/Sporting Goods</option><option value="2222">Patio/Garden</option><option value="2230">Pet Supplies</option><option value="2201">Product/Service</option><option value="2211">Software</option><option value="2223">Tools/Equipment</option><option value="2262">Vitamins/Supplements</option><option value="2202">Website</option><option value="2224">Wine/Spirits</option></select> <br/><br/>
	<input type="text"  placeholder="Brand or ProductName" name="name"/><br/><br/>
	<input type="checkbox"> I agree to <a href="pageterm.action">     realtouch page terms and condition</a>
	<a href="boppage">
	<input type="submit" value=" get started"/>
	</a>
	</div>
		
		</form>
		
		<form action="coipage.action">
	<div id="a4" >
			<table class="table3" >
			<tr>
				<td>
					Cause or Community
				</td>
			</tr>
		</table>
	</div>
		
	<div id="b4">
	Cause or Community
		<input type="text" name="t" value="Cause or Community"  style="display: none;">
	<br/>create your community on realtouch
	<br/><br>
		<input placeholder="Cause or Community"   type="text" name="name"><br/><br/>
		
		<input  type="checkbox">I agree to  <a href="pageterm.action">     realtouch page terms and condition</a>
		<a href="lboppage">
		<input type="submit" value=" get started"/>
		</a>
	
	</div>
	
	</form>
	
	<form action="coipage.action">
	<div id="a5" >
			<table class="table4" >
			<tr>
				<td>
					Local Business or Place
				</td>
			</tr>
		</table>
	</div>
	
	<div id="b5">
		Local Business or Place
		<input type="text" name="t" value="Local Business or Place"  style="display: none;">
		Join your customers on realtouch
		<select>
		<option selected="selected" value="0">Choose a category</option><option value="2506">Airport</option><option value="2508">Arts/Entertainment/Nightlife</option><option value="2523">Attractions/Things to Do</option><option value="2509">Automotive</option><option value="2512">Bank/Financial Services</option><option value="2100">Bar</option><option value="1305">Book Store</option><option value="2518">Business Services</option><option value="2264">Church/Religious Organization</option><option value="2101">Club</option><option value="2519">Community/Government</option><option value="1209">Concert Venue</option><option value="2250">Education</option><option value="2511">Event Planning/Event Services</option><option value="2513">Food/Grocery</option><option value="2514">Health/Medical/Pharmacy</option><option value="2515">Home Improvement</option><option value="2527">Hospital/Clinic</option><option value="2501">Hotel</option><option value="2503">Landmark</option><option value="1306">Library</option><option value="2500">Local Business</option><option value="1111">Movie Theater</option><option value="2528">Museum/Art Gallery</option><option value="2231">Outdoor Gear/Sporting Goods</option><option value="2516">Pet Services</option><option value="2517">Professional Services</option><option value="2522">Public Places</option><option value="2520">Real Estate</option><option value="1900">Restaurant/Cafe</option><option value="2601">School</option><option value="2521">Shopping/Retail</option><option value="2510">Spas/Beauty/Personal Care</option><option value="2507">Sports Venue</option><option value="2524">Sports/Recreation/Activities</option><option value="2525">Tours/Sightseeing</option><option value="2526">Transportation</option><option value="2602">University</option></select>
		<br/><br>
		<input placeholder="Business or Place Name"   type="text" name="name"><br/><br/>
		
		<input  type="checkbox">I agree to  <a href="pageterm.action">     realtouch page terms and condition</a>
		<a href="lboppage">
		<input type="submit" value=" get started"/>
		</a>
	</div>
	
		</form>
		
	<form action="coipage.action">
	<div id="a6" >
			<table class="table5" >
			<tr>
				<td>
					Artist, Band or Public Figure
				</td>
			</tr>
		</table>
	</div>
	<div id="b6" align="center">
	<input type="text" name="t" value="Artist, Band or Public Figure"  style="display: none;">
	Artist, Band or Public Figure<br/>
	<br/>
	Have a profile? Learn more about letting people follow your public updates.<br/><br/>
	<select class="old_ui_selector" id="category" name="category"><br/>
	<option selected="selected" value="0">Choose a category...</option><option value="1103">Actor/Director</option><option value="1601">Artist</option><option value="1600">Athlete</option><option value="1301">Author</option><option value="1609">Business Person</option><option value="1606">Chef</option><option value="1802">Coach</option><option value="1610">Comedian</option><option value="1614">Dancer</option><option value="1608">Doctor</option><option value="1308">Editor</option><option value="1611">Entertainer</option><option value="1113">Fictional Character</option><option value="1701">Government Official</option><option value="1604">Journalist</option><option value="1607">Lawyer</option><option value="1612">Monarch</option><option value="1202">Musician/Band</option><option value="1605">News Personality</option><option value="1700">Politician</option><option value="1108">Producer</option><option value="1602">Public Figure</option><option value="1613">Teacher</option><option value="1109">Writer</option></select><br/><br/>
	  
	   <input type="text"  placeholder="Name" name="name"/>	<br/><br/>
	<input  type="checkbox">I agree to  <a href="pageterm.action">     realtouch page terms and condition</a><br/><br/>
	<a href="aboppage">
		<input type="submit" value=" get started"/><br/>
		</a>
	</div>
	
		</form>
</div>



  <script>
    $("p").click(function () {
      $(this).slideUp('slow');
    });
	
    $("#a1").click(function () {
	      $("#a1").slideUp('slow');
	      $("#b2").slideUp('slow');
	      $("#b3").slideUp('slow');
	      $("#b4").slideUp('slow');
	      $("#b5").slideUp('slow');
	      $("#b6").slideUp('slow');
	     	 $("#b1").slideDown('medium').show();
		  	 $("#a2").slideDown('medium').show();
		  	 $("#a3").slideDown('medium').show();
		  	 $("#a4").slideDown('medium').show();
		  	 $("#a5").slideDown('medium').show();
		  	 $("#a6").slideDown('medium').show();
	    });
    
    $("#a2").click(function () {
	      $("#a2").slideUp('slow');
	      $("#b1").slideUp('slow');
	      $("#b3").slideUp('slow');
	      $("#b4").slideUp('slow');
	      $("#b5").slideUp('slow');
	      $("#b6").slideUp('slow');
	      	$("#b2").slideDown('medium').show();
		  	$("#a1").slideDown('medium').show();
		  	$("#a3").slideDown('medium').show();
		  	$("#a4").slideDown('medium').show();
		  	$("#a5").slideDown('medium').show();
		  	$("#a6").slideDown('medium').show();
	    });
    
    $("#a3").click(function () {
	      $("#a3").slideUp('slow');
	      $("#b2").slideUp('slow');
	      $("#b1").slideUp('slow');
	      $("#b4").slideUp('slow');
	      $("#b5").slideUp('slow');
	      $("#b6").slideUp('slow');
	     	 $("#b3").slideDown('medium').show();
		  	 $("#a2").slideDown('medium').show();
		  	 $("#a1").slideDown('medium').show();
		  	 $("#a4").slideDown('medium').show();
		  	 $("#a5").slideDown('medium').show();
		   	 $("#a6").slideDown('medium').show();
	    });
    
    $("#a4").click(function () {
	      $("#a4").slideUp('slow');
	      $("#b2").slideUp('slow');
	      $("#b3").slideUp('slow');
	      $("#b1").slideUp('slow');
	      $("#b5").slideUp('slow');
	      $("#b6").slideUp('slow');
	      	$("#b4").slideDown('medium').show();
		  	$("#a2").slideDown('medium').show();
		  	$("#a3").slideDown('medium').show();
		  	$("#a1").slideDown('medium').show();
		  	$("#a5").slideDown('medium').show();
		  	$("#a6").slideDown('medium').show();
	    });
  
    $("#a5").click(function () {
	      $("#a5").slideUp('slow');
	      $("#b2").slideUp('slow');
	      $("#b3").slideUp('slow');
	      $("#b4").slideUp('slow');
	      $("#b1").slideUp('slow');
	      $("#b6").slideUp('slow');
	      	$("#b5").slideDown('medium').show();
		  	$("#a2").slideDown('medium').show();
		  	$("#a3").slideDown('medium').show();
		  	$("#a4").slideDown('medium').show();
		  	$("#a1").slideDown('medium').show();
		  	$("#a6").slideDown('medium').show();
	    });
  
    $("#a6").click(function () {
	      $("#a6").slideUp('slow');
	      $("#b2").slideUp('slow');
	      $("#b3").slideUp('slow');
	      $("#b4").slideUp('slow');
	      $("#b5").slideUp('slow');
	      $("#b1").slideUp('slow');
	      	$("#b6").slideDown('medium').show();
		  	$("#a2").slideDown('medium').show();
		  	$("#a3").slideDown('medium').show();
		  	$("#a4").slideDown('medium').show();
		  	$("#a5").slideDown('medium').show();
		  	$("#a1").slideDown('medium').show();
	    });
  
  
    
	
</script>
</font>
</body>
</html>