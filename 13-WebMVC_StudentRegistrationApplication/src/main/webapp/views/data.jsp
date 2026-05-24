<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>

<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>View Students</title>

    <style>

        body{
            font-family: Arial, sans-serif;
            margin: 20px;
        }

        h1{
            color: #333;
        }

        table{
            width: 100%;
            border-collapse: collapse;
            margin-top: 20px;
        }

        th, td{
            border: 1px solid #ccc;
            padding: 10px;
            text-align: center;
        }

        th{
            background-color: #f2f2f2;
        }

        a{
            text-decoration: none;
            color: blue;
            font-weight: bold;
        }

    </style>

</head>

<body>

    <h1>View Students</h1>

    <a href="/">Add New Student</a>

    <table>

        <thead>

            <tr>
                <th>S.No</th>
                <th>Name</th>
                <th>Email</th>
                <th>Gender</th>
                <th>Course</th>
                <th>Timings</th>
            </tr>

        </thead>

        <tbody>

            <c:forEach items="${students}" var="student" varStatus="index">

                <tr>

                    <td>${index.count}</td>
                    <td>${student.name}</td>
                    <td>${student.email}</td>
                    <td>${student.gender}</td>
                    <td>${student.course}</td>
                    <td>${student.timings}</td>

                </tr>

            </c:forEach>

        </tbody>

    </table>

</body>

</html>