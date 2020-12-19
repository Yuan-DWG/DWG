<!DOCTYPE html>
<html lang="en" xmlns="http://www.w3.org/1999/html">
<head>
    <meta charset="UTF-8">
    <title>林风剑豪</title>
</head>
<body>
        <#list emps as emp>
            <h1>${emp.empno}</h1></br>
            <h1>${emp.ename}</h1></br>
            <h1>${emp.salary}</h1></br>
            <h1>${emp.hiredate}</h1></br>
        </#list>
</body>
</html>