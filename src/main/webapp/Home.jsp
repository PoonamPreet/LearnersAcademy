<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
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

table, th, td {
	border: 2px solid black;
	text-align: center;
	width: 50%;
	text-align: center;
	margin-left: 25%;
	border-radius: 5px 5px;
	border-left-width: 20%;
	column-rule-width: 60%;
	color: #F0FFF0;
	background-color: #C6CE00;
}
</style>

<body>
	<h1 style="background-color: #C6CE00; font-size: 200%; color: #F0FFF0">Home</h1>
	<h2 style=" font-size: 200%; color: #F0FFF0">Welcome to Learners Academy</h2>
	<ul>
		<li><a href="Home.jsp">Home</a></li>
		<li><a href="AddStudent.jsp">Student</a></li>
		<li><a href="AddTeacher.jsp">Teachers</a></li>
		<li><a href="AddSubjects.jsp">Subjects</a></li>
		<li><a href="ClassReport.jsp">Classes</a></li>
		<li><a href="Login.jsp">Logout</a></li>
	</ul>
	<br />

</body>
</html>