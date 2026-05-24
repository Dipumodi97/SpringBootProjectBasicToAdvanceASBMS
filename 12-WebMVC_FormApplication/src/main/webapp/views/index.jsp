<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>

    <font color="Blue" >${msg}</font>
    <h2>USER FORM </h2>
    <form action="user" method="POST">

        <table>
            <tr>
                <td>Name : </td>
                <td><input type = "text" name ="name" /></td>
            </tr>

             <tr>
                <td>Phone : </td>
                <td><input type = "number" name ="phoneNumber" /></td>
            </tr>

             <tr>
                <td>Email : </td>
                <td><input type = "email" name ="email" /></td>
            </tr>

             <tr>
                <td></td>
                <td><input type = "submit" name ="Submit" /></td>
            </tr>
        </table>

    </form>

    
    
</body>
</html>