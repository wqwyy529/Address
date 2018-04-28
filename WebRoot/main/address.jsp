<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'Adress.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<script type="text/javascript" src="<%=basePath%>js/jquery-1.6.min.js"></script>
	<script type="text/javascript">
		function getCityList(){
			if($("#provid").val() != "nullSelect"){
				$.getJSON("GetCitySvl",{province:$("#provid").val},function callback(data){
				$("#cityid").empty;
				$(data.each(function(i){
					$("<option value=" + date[i].id + ">" + date[i].name + "</option>").appendTo("#cityid");
				});
				#("#cityid").change();			//触发#shiID的onChange事件。必须要在callBack中调用，即市填充完成后再填充区县
				
				});
			}
		}
		
		function getQvList(){	
			//获得市的选中的文本值
			var s = document.form1.citySelect.options[document.form1.shiSelect.selectedIndex].text;			
			var shi = document.getElementById("cityNameSpan");
			shi.innerHTML = "<font color=\"red\">" + s + "</font>";		
			
			$.getJSON("GetQvSvl",{shi:$("#shiID").val(),sheng:$("#shengID").val()}, function callback(data) {
	         $("#qvID").empty();
	         $(data).each( function(i){           
	           $("<option value=" + data[i].id + ">" + data[i].name +"</option>").appendTo("#qvID");;
	            	 }); 
	         $("#qvID").click();
	     	});	     
			
	}

	function getQvName(){
	var s = document.form1.qvSelect.options[document.form1.qvSelect.selectedIndex].text;
	var qv = document.getElementById("qvNameSpan");	
	qv.innerHTML = 	"<font color=\"red\">" + s + "</font>";
	}

	function getShengName(){
	        //获得省的选中的文本值
			var s = document.form1.shengSelect.options[document.form1.shengSelect.selectedIndex].text;			
			
			var sheng = document.getElementById("provinceNameSpan");		
			
			sheng.innerHTML = "<font color=\"red\">" + s + "</font>";
	}
	
	</script>

  </head>
  
  <body>
    <form action="" method="post" name="form1">
    	<table border="1">
    		<tr>
    			<td>省级：</td>
    			<td>
    				<select name="provinceSelect" onChange="getCityList()" id="provid" onClick="getProvName()">
    					<option value="nullSelet">--请选择--</option>
    					<c:forEach var="prov" items="${allProv}">
    					<option value="${prov.id}">${prov.name}</option>
    					</c:forEach>
    				</select>   			
    			</td>
    			
    			<td>
    				<select name="citySelect" onChange="getCountryList()" id="cityid" onClick="getCityName()">
    					<option value="nullSelet">--请选择--</option>
    					<c:forEach var="city" items="${arrCity}">
    					<option value="${city.id}">${city.name}</option>
    					</c:forEach>
    				</select>
    			</td>
    			
    			<td>
    				<select name="countrySelect" id="countryid" onClick="getCountryName()">
    					<option value="nullSelet">--请选择--</option>
    					<c:forEach var="country" items="${arrCountry}">
    					<option value="${country.id}">${country.name}</option>
    					</c:forEach>
    				</select>
    			</td>
    		</tr>
    	
    	</table>
    
    </form>
  </body>
</html>
