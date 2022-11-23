
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
table {
	background-color: #f1f1f1;
	border-collapse: collapse;
	border: 1px solid black;
	text-align: center;
}

td {
	height: 40px;
	width: 250px;
}

a {
	text-align: center;
}

button {
	width: 170px;
	height: 30px;
	margin: 10px;
	border-radius: 20px;
}

button:hover {
	width: 170px;
	height: 30px;
	margin: 10px;
	border-radius: 20px;
	background: linear-gradient(#e66465, #9198e5);
	color: white;
}
</style>
</head>
<body style='background: linear-gradient(#e66465, #9198e5)'>
	<h1 align="center" style="color: white">Student Data</h1>
	<hr>
	<br>
	<br>
	<div style="text-align: -webkit-center;">
		<table border="1">
			<tr>
				<th>Sr. No.</th>
				<th>Id</th>
				<th>Fullname</th>
				<th>Gender</th>
				<th>Email</th>
				<th>Date_of_Birth</th>
				<th>Contact</th>
				<th>City</th>
				<th>Delete</th>
				<th>Update</th>
			</tr>
			<c:forEach var="list" items="${studentdata}" varStatus="c">
				<tr>
					<td>${c.index+1}</td>
					<td>${list.id}</td>
					<td>${list.fullname}</td>
					<td>${list.gender}</td>
					<td>${list.email}</td>
					<td>${list.DOB}</td>
					<td>${list.contact}</td>
					<td>${list.city}</td>
					<td><a href="deletedata?id=${list.id}"
						style="padding-left: 28px">Delete</a></td>
					<td><a href="getdata?id=${list.id }"
						style="padding-left: 28px">Update</a></td>
				</tr>
			</c:forEach>
		</table>
		<div style="margin-top: 30px;">
			<a href="index.jsp"><button type="button">Go to Homepage</button></a>
		</div>
	</div>
</body>
</html>