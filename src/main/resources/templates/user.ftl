<html>
    <head>
        <title>user.ftl</title>
    </head>
    <body>
        <h1>start</h1>
        <table>
            <tr>
                <th>姓名</th>
                <th>年龄</th>
            </tr>
            <#list userList as user>
                <td>${user.nickname!}</td>
                <td>${user.age!}</td>
            </#list>
        </table>
    </body>
</html>