<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="java.sql.*"%>
<%@page language="java"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title></title>
</head>
<style>
body {
	background-color: #008B8B;
	align-content: center;
	text-align: center;
}

#main {
	width: 100%;
	height: 300px;
	display: flex;
	flex-wrap: wrap;
	align-content: center;
	text-align: center;
	position: relative;
}

#main div {
	width: 100%;
	height: 40px;
	text-align: center;
}

input[type=text] {
	width: 30%;
	padding: 12px 20px;
	margin: 8px 0;
	box-sizing: border-box;
}

input[type=button], input[type=submit], input[type=reset] {
	background-color: #C6CE00;
	border: none;
	color: white;
	width: 12%;
	padding: 16px 32px;
	text-decoration: none;
	margin: 4px 2px;
	cursor: pointer;
}

ul {
	list-style-type: none;
	margin: 0;
	padding: 0;
	width: 10%;
	background-color: #f1f1f1;
	position: fixed;
	height: 36%;
	overflow: auto;
	font-size: x-large;
}

li a {
	display: block;
	color: #000;
	padding: 8px 16px;
	text-decoration: none;
}

li a.active {
	background-color: #125105;
	color: white;
}

li a:hover:not(.active) {
	background-color: #125105;
	color: white;
}

select {
	height: 50%;
	width: 30%;
	padding: 12px 20px;
	margin: 8px 0;
	box-sizing: border-box;
	text-align: center;
}
</style>
<script>
	function sh() {
		document.getElementById("tab").style.visibility = "visible";
	}
</script>

<body>
	<form action="Teacher" method="post">
		<h1 style="background-color: #C6CE00; font-size: 200%; color: #F0FFF0">Add
			Teacher</h1>
		<ul>
			<li><a href="Home.jsp">Home</a></li>
		<li><a href="AddStudent.jsp">Student</a></li>
		<li><a href="AddTeacher.jsp">Teachers</a></li>
		<li><a href="AddSubjects.jsp">Subjects</a></li>
		<li><a href="ClassReport.jsp">Classes</a></li>
		<li><a href="Login.jsp">Logout</a></li>
		</ul>
		<br /> <input name="t_name" type="text"
			placeholder="Enter TeacherName" style="text-align: center;"/> <br /> <select name="t_sub">
			<option name="t_sub">Subject</option>
			<%
			try {
				String Query = "select Sub_name from subjects";
				Class.forName("com.mysql.jdbc.Driver").newInstance();
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/learnersacademy?useSSL=false", "root",
				"Poonam@8989");
				Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery(Query);
				while (rs.next()) {
			%>
			<option name="t_sub" value="<%=rs.getString("Sub_name")%>"><%=rs.getString("Sub_name")%></option>
			<%
			System.out.println(rs.getString("Sub_name"));
			}

			} catch (Exception ex) {
			ex.printStackTrace();
			System.out.println(ex.getMessage());
			}
			%>
		</select> <br /> <br /> <select name="t_class">
			<option value="t_class" name="t_class">Class</option>

			<%
			try {
				String Query = "select classname from classes";
				Class.forName("com.mysql.jdbc.Driver").newInstance();
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/learnersacademy?useSSL=false", "root",
				"Poonam@8989");
				Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery(Query);
				while (rs.next()) {
			%>
			<option name="t_class" value="<%=rs.getString("classname")%>"><%=rs.getString("classname")%></option>
			<%
			System.out.println(rs.getString("classname"));
			}

			} catch (Exception ex) {
			ex.printStackTrace();
			System.out.println(ex.getMessage());
			}
			%>

		</select> <Br />  <input
			style="width: 120; font-family: sans-serif; font-size: medium;"
			type="submit" value="submit" /> <input type="button" value="Show"
			onclick="sh()" name="show"
			; style="width: 120; font-family: sans-serif; font-size: medium;">
		<br>
		<table border="1" id="tab"
			style="visibility: hidden; color: #F0FFF0; background-color: #C6CE00; width: 80%; margin-left: 15%;">
			<tr>

				<th>Id</th>
				<th>Name</th>
				<th>Sub Name</th>
				<th>Class</th>
				<th>Delete</th>
			</tr>
			<%
			try {
				Class.forName("com.mysql.jdbc.Driver").newInstance();
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/learnersacademy?useSSL=false", "root",
				"Poonam@8989");
				String query = "select * from teachers";
				Statement st = con.createStatement();
				ResultSet rs = st.executeQuery(query);
				while (rs.next()) {
			%>

			<tr>
				<td><input type="text" name="t_id"
					value="<%=rs.getString("t_id")%>"></td>
				<td><input type="text" name="t_name"
					value="<%=rs.getString("t_name")%>"></td>
				<td><input type="text" name="t_sub"
					value="<%=rs.getString("t_sub")%>"></td>
				<td><input type="text" name="t_class"
					value="<%=rs.getString("t_class")%>"></td>
				<td><input type="button" name="delete" value="DEL"
					style="width: 60; font-family: sans-serif; font-size: medium; text-align: left; color: #FF0000"></td>

			</tr>
			<%
			}
			} catch (Exception e) {
			System.out.println(e.getMessage());
			}
			%>
		</table>
	</form>
</body>
</html>