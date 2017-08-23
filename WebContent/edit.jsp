<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>AJAX based CRUD operations using jTable in Servlet and
	JSP</title>
<!-- Include one of jTable styles. -->
<link href="jtable.css" rel="stylesheet" type="text/css" />
<link href="jquery-ui-1.10.3.custom.css" rel="stylesheet"
	type="text/css" />
<!-- Include jTable script file. -->
<script src="jquery-1.8.2.js" type="text/javascript"></script>
<script src="jquery-ui-1.10.3.custom.js" type="text/javascript"></script>
<script src="jquery.jtable.js" type="text/javascript"></script>
</head>
<body bgcolor="CCFFFF">
	<div
		style="width: 60%; margin-right: 20%; margin-left: 20%; text-align: center;">
		<h1 align="left" style="color: red;">Training</h1>
		<hr>
		<div id="center">
			<h3 align="left"">Login > Search Customer</h3>
			<div id="1">
				<table align="left">
					<tr>
						<td align="left"><h4>Wellcome</h4></td>
						<td align="right"><a href="login.jsp">Logout</a></td>
					</tr>
				</table>
			</div>
			<br> <br>
			<p style="border-top: 30px solid; color: blue; width: 100%;"></p>
			<div id="center"width="70%" height="25%" cellpadding="5" align="center"
					style="padding: 10%;font-weight:bold;">
				<table >
					<tr>
						<td>Customer Id:</td>
						<td align="left" ><b>13130005</b></td>
					</tr>
					<tr>
						<td>Customer Name:</td>
						<td><input type="text" size="42%"></td>
					</tr>
					<tr>
						<td>Sex:</td>
						<td align="left"><select >
								<option value="Male">Male</option>
								<option value="Female">Female</option>
						</select></td>
					</tr>
					<tr>
						<td>Birthday:</td>
						<td><input type="text" size="42%"></td>
					</tr>
					<tr>
						<td>Email:</td>
						<td><input type="text" size="42%"></td>
					</tr>
					<tr>
						<td>Address:</td>
						<td><input type="text" style="padding: 7%;" size="35%;"></td>
					</tr>
					<tr>
						<td></td>
						<td><input type="button" value="Save"> <input
							type="button" value="Clear"></td>
				</table>
			</div>
			<div id="footer" style="width: 100%;text-align: left;margin-top: 20%;">
				<hr>
				<label>Copy right@ 2000-2008 FUJINET, All Rights Reserved.</label>
			</div>

		</div>
</body>
</html>