
<!-- Form Tag Library -->
<%@ taglib  uri="http://www.springframework.org/tags/form" prefix="form" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <h2>Student Registration Form</h2>
    <font color="green">${msg}</font>

    <form:form action="save" modelAttribute ="student" method="POST">

    <table>
        <tr>
            <td>Name :: </td>
            <td><form:input path="name" /></td>
        </tr>
        <tr>
            <td>Email :: </td>
            <td><form:input path="email" /></td>
        </tr>
        <tr>
            <td>Gender :</td>
            <td>
               <form:radiobutton path="gender" value="Male"/> Male
               <form:radiobutton path="gender" value="Female"/> Female
               <form:radiobutton path="gender" value="other"/> Other
            </td>
        </tr>

        <tr>
            <td>Courses :: </td>
            <td><form:select path ="course">
                <form:option value="">-Select-</form:option>
                <form:options items="${courses}" />
            </form:select> 
            
            </td>
        </tr>
         <tr>
            <td>Timings :: </td>
            <td>
                <form:checkboxes items = "${timing}" path ="timings" />
            
            </td>
        </tr>
        <tr>
            <td></td>
            <td>
                
                <input type="submit" value="Save" />
            
            </td>
        </tr>
    </table>

    </form:form>
    
    <a href="viewStudents" >View Students</a>
</body>
</html>