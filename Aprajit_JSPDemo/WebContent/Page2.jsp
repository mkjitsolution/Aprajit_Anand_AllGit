<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="p1.DatabaseClass"%>
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
		String name = "Aprajit"; // fetch from database

	DatabaseClass dbclass = new DatabaseClass();
	List<String> list = new ArrayList();

	try {
		list = dbclass.getCourse();
	} catch (Exception e) {
		out.print(e);
	}
	%>
	<h1>
		Welcome
		<%=name%>
		Portal Auckland
	</h1>
	<form action="CategoryServlet" method="post">
		Choose your course <br/>
		
				<select>
			<%
				for (String course : list) {
			%>
			<option>
				<%=course%>
			</option>
			<%
				}
			%>
		</select>
		<br />
		<input type="submit" value="Get Trainers">
	</form>
</body>
</html>