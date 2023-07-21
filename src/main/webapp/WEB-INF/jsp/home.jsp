<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Login</title>
    <style>
        .error {
            color: red;
            font-weight: bold;
        }
    </style>
</head>
<body>
<h1>Add New Employee</h1>
<form:form method="post" modelAttribute="sample" action="save">
    <table>
        <tr>
            <td>Name :</td>
            <td><form:input path="sampleName"/></td>
            <td><form:errors path="sampleName" cssClass="error"/></td>
        </tr>
        <tr>
            <td>Age :</td>
            <td><form:input path="sampleSize"/></td>
            <td><form:errors path="sampleSize" cssClass="error"/></td>
        </tr>
        <tr>
            <td>Email :</td>
            <td><form:input path="sampleDate" id="sampleDate"/></td>
            <td><form:errors path="sampleDate" cssClass="error"/></td>
        </tr>
        <tr>
            <td>Gender :</td>
            <td><form:input path="sampleLength"/></td>
            <td><form:errors path="sampleLength" cssClass="error"/></td>
        </tr>
        <tr>
            <td>Gender :</td>
            <td><form:input path="isSampleVerified"/></td>
            <td><form:errors path="isSampleVerified" cssClass="error"/></td>
        </tr>
        <tr>
            <td>Gender :</td>
            <td><form:input path="sampleDistance"/></td>
            <td><form:errors path="sampleDistance" cssClass="error"/></td>
        </tr>
        <tr>
            <td></td>
            <td><input type="submit" value="Save"/></td>
        </tr>
    </table>
</form:form>
</body>
</html>
