<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
  	<%
  		String courseName = request.getParameter("course");
  		List<String> trainerNames = (List<String>)request.getAttribute("trainers");
  		
  		// 1000 line 
  		
  		String trainerName = "ashish"; // list<name>
  	%>
  	
  	<jsp:include page="Header.jsp"/>
  	
  	<center><h2><u>Trainer for <%=courseName%> are</u></h2></center>
  	<ol>
  		<%
  			for(String name:trainerNames)
  			{
  				%>
  				<li><%=name%></li>
  				<%
  			}
  		%>
  		
  	</ol> 
  	
  	
</body>
</html>