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
	height: 530px;
	/* margin: 114px; */
	margin-left: 400px;
	border-radius: 20px;
	margin-top: 50px;
	background-color: #f1f1f1;
}
</style>
</head>
<body style='background: linear-gradient(#e66465, #9198e5)'>

	<h1 align="center" style="color: white">Registration New Student</h1>
	<hr>
	<br>
	<form action="addStudent">
		<div class="box" style="text-align: -webkit-center;">
			<table style="margin-top: 60px">
				<tr>
					<td>FullName:-</td>
					<td><input type="text" placeholder="Enter your full name"
						name="fullname" required style="background: transparent;"></td>
				</tr>
				<tr>
					<td>Select Gender:-</td>
					<td><input type="radio" name="gender" value="Male" />Male <input
						type="radio" name="gender" value="Female" />Female <input
						type="radio" name="gender" value="other" />Other</td>
				</tr>
				<tr>
					<td>EmailID:-</td>
					<td><input type="text" placeholder="Enter EmailID"
						name="email" required style="background: transparent;"
						oninvalid="this.setCustomValidity('Please Enter valid email')"></td>
				</tr>
				<tr>
					<td>Date of Birth:-</td>
					<td><input type="date" placeholder="Enter date" name="DOB"
						required style="background: transparent;"></td>
				</tr>
				<tr>
					<td>Contact:-</td>
					<td><input type="number" placeholder="Enter your Number"
						name="contact" required style="background: transparent;"></td>
				</tr>
				<tr>
					<td>City:-</td>
					<td><input type="text" placeholder="Enter your city"
						name="city" required style="background: transparent;"></td>
				</tr>

				<tr>
					<td colspan="2" align="center"><input type="submit"
						value="Submit"></td>
				</tr>

			</table>
	</form>


	<form action="getAll" style="text-align: -webkit-center;">
		<input type="submit" Value="Show Student">
	</form>

	</div>
</body>
</html>
