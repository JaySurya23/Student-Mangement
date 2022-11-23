
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<style type="text/css">
input[type=text], [type=date], [type=number] {
	width: 327px;
	height: 40px;
	margin: 10px;
	border-radius: 5px;
}

input[type="radio"] {
	margin: 10px;
}

input[type="submit"] {
	width: 170px;
	height: 30px;
	margin: 10px;
	border-radius: 20px;
}

input[type="submit"]:hover {
	width: 170px;
	height: 30px;
	margin: 10px;
	border-radius: 20px;
	background: linear-gradient(#e66465, #9198e5);
	color: white;
}

td {
	font-size: 20px;
}

.box {
	border: 1px solid;
	width: 700px;
	height: 570px;
	/* margin: 114px; */
	margin-left: 400px;
	border-radius: 20px;
	margin-top: 36px;
	background-color: #f1f1f1;
}
</style>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body style='background: linear-gradient(#e66465, #9198e5)'>

	<h1 align="center" style="color: white">Student data update</h1>
	<hr>
	<br>
	<form action="updatedata">
		<div class="box" style="text-align: -webkit-center;">
			<table style="margin-top: 60px">
				<tr>
					<td>Id:-</td>
					<td><input type="text" placeholder="Enter your full name"
						name="id" value="${data.id }" readonly></td>
				</tr>
				<tr>
					<td>Full Name:-</td>
					<td><input type="text" placeholder="Enter your full name"
						name="fullname" value="${data.fullname }" required></td>
				</tr>
				<tr>
					<td>Select Gender:-</td>
					<td><input type="radio" name="gender" value="Male"
						value="${data.gender }" />Male <input type="radio" name="gender"
						value="Female" value="${data.gender }" />Female <input
						type="radio" name="gender" value="other" value="${data.gender }" />Other</td>
				</tr>
				<tr>
					<td>EmailID:-</td>
					<td><input type="text" placeholder="Enter EmailID"
						name="email" value="${data.email }" required></td>
				</tr>
				<tr>
					<td>Date of Birth:-</td>
					<td><input type="date" placeholder="Enter date of birth"
						name="DOB" value="${data.DOB }" required></td>
				</tr>
				<tr>
					<td>Contact:-</td>
					<td><input type="number" placeholder="Enter your Number"
						name="contact" value="${data.contact }" required></td>
				</tr>
				<tr>
					<td>City:-</td>
					<td><input type="text" placeholder="Enter your city"
						name="city" value="${data.city }" required></td>
				</tr>

				<tr>
					<td colspan="2" style="text-align: -webkit-center;"><input
						type="submit" value="Update Data"></td>
				</tr>

			</table>

		</div>
	</form>
</body>
</html>