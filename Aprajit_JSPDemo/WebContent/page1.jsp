<%@page import="p1.Student" %>
<%@page import="p1.Demo"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<% String name = "Aprajit"; // fetch from database %>
	<h1> Welcome <%=name%> Portal Auckland </h1>
	
	Choose your course Category 
	<select>
		<option>Technical</option>
		<option>Data Science</option>
		<option>Management</option>
		<option>Language</option>
		<option>DBMS</option>
		<option>Programming</option>
		<option>CRM</option>
		<option>Networking</option>
	</select>
	<br/>
	<% 
		int sum = 0;
		for(int i = 0;i<10;i++)
		{
			sum = sum + i;
		%>	
			<input type="text" value="<%=i%>"><br/>	
	<%	}
		out.print("SUM "+sum);
	%>
	<hr/>
	<b><i>Sum of first 9 number is <%=sum%></i></b>
	
	<%
			Demo d1 = new Demo();
			Student student = d1.caller();
	%>
	Way 1 <%=student%> <br/>
	Way 2 <%=student.getName()%> & <%=student.getCourse()%>     <br/>
	
	Way 4 <%=d1.caller()%> <br/>
	Way 5 <%=(150+85)%> <br/>
	
	<hr/>
	<b>Student Name</b> 
	${student.getName()}
	

</body>
</html>









