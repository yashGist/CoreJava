<%@page import="in.co.rays.controller.UserRegistrationCtl"%>

<%@page import="java.util.HashMap"%>
<%@page import="in.co.rays.util.HTMLUtility"%>
<%@page import="in.co.rays.util.DataUtility"%>
<%@page import="in.co.rays.util.ServletUtility"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

</head>
<body>
	<%@ include file="Header.jsp"%>
	<jsp:useBean id="bean" class="in.co.rays.bean.UserBean" scope="request"></jsp:useBean>
	<form action="<%=ORSView.USER_REGISTRATION_CTL%>" method="post">

		<center>
			<h1>User Registration</h1>

			<H2>
				<font color="green"> <%=ServletUtility.getSuccessMessage(request)%>
				</font>
			</H2>
			<H2>
				<font color="red"> <%=ServletUtility.getErrorMessage(request)%>
				</font>
			</H2>
			<%-- <H2>
				<font color="red"> <%=ServletUtility.getErrorMessage(request)%>
				</font>
			</H2> --%>
			<input type="hidden" name="id" value="<%=bean.getId()%>"> <input
				type="hidden" name="createdBy" value="<%=bean.getCreatedBy()%>">
			<input type="hidden" name="modifiedBy"
				value="<%=bean.getModifiedBy()%>"> <input type="hidden"
				name="createdDatetime"
				value="<%=DataUtility.getTimestamp(bean.getCreatedDatetime())%>">
			<input type="hidden" name="modifiedDatetime"
				value="<%=DataUtility.getTimestamp(bean.getModifiedDatetime())%>">

			<table>
				<tr>
					<th align="left">First Name<font color="red">*</font></th>
					<td><input type="text" name="firstName"
						placeholder="Enter First Name"
						value="<%=DataUtility.getStringData(bean.getFirstName())%>"></td>
					<td style="position: fixed;"><font color="red"> <%=ServletUtility.getErrorMessage("firstName", request)%></font></td>
				</tr>
				<tr>
					<th align="left">Last Name<font color="red">*</font></th>
					<td><input type="text" name="lastName"
						placeholder="Enter Last Name"
						value="<%=DataUtility.getStringData(bean.getLastName())%>"></td>
					<td style="position: fixed;"><font color="red"> <%=ServletUtility.getErrorMessage("lastName", request)%></font></td>
				</tr>
				<tr>
					<th align="left">LoginId<font color="red">*</font></th>
					<td><input type="text" name="login"
						placeholder="Must be Email ID"
						value="<%=DataUtility.getStringData(bean.getLogin())%>"></td>
					<td style="position: fixed;"><font color="red"> <%=ServletUtility.getErrorMessage("login", request)%></font></td>
				</tr>
				<tr>
					<th align="left">Password<font color="red">*</font></th>
					<td><input type="password" name="password"
						placeholder="Enter Password"
						value="<%=DataUtility.getStringData(bean.getPassword())%>"></td>
					<td style="position: fixed;"><font color="red"> <%=ServletUtility.getErrorMessage("password", request)%></font></td>
				</tr>
				<tr>
					<th align="left">Confirm Password<font color="red">*</font></th>
					<td><input type="password" name="confirmPassword"
						placeholder="Confirm Password"
						value="<%=DataUtility.getStringData(bean.getConfirmPassword())%>"></td>
					<td style="position: fixed;"><font color="red"> <%=ServletUtility.getErrorMessage("confirmPassword", request)%></font></td>
				</tr>
				<tr>
					<th align="left">Gender<font color="red">*</font></th>
					<td>
						<%
							HashMap map = new HashMap();
							/*  map.put("s", "------select------"); */
							map.put("M", "Male");
							map.put("F", "Female");

							String htmlList = HTMLUtility.getList("gender", bean.getGender(), map);
						%> <%=htmlList%></td>
					<td style="position: fixed;"><font color="red"> <%=ServletUtility.getErrorMessage("gender", request)%></font></td>

					</td>
				</tr>

				<tr>
					<th align="left">Date Of Birth<font color="red">*</font></th>
					<td><input id="datepicker" type="text" name="dob" placeholder="Enter Date Of Birth" readonly="readonly"
						value="<%=DataUtility.getDateString(bean.getDob())%>"></td>
					<td style="position: fixed;"><font color="red"> <%=ServletUtility.getErrorMessage("dob", request)%></font></td>
				</tr>
<tr>
					<th align="left">Mobile Number<font color="red">*</font></th>
					<td><input type="password" name=mobileNo placeholder="Enter Mobile Number"
						value="<%=DataUtility.getStringData(bean.getMobileNo())%>"></td>
					<td style="position: fixed;"><font color="red"> <%=ServletUtility.getErrorMessage("mobileNo", request)%></font></td>
				</tr>
				<tr>
					<th></th>
					<td colspan="2" style="padding-left: 20px">&nbsp; 
						 <input type="submit" name="operation"
						value="<%=UserRegistrationCtl.OP_SIGN_UP%>"> 
						
						<input type="submit" name="operation"
						value="<%=UserRegistrationCtl.OP_RESET%>">
					</td>
				</tr>
			</table>
	</form>
	<%@ include file="Footer.jsp"%>
</body>
</html>