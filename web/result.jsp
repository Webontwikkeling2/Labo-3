<%--
  Created by IntelliJ IDEA.
  User: angelolemmens
  Date: 25/02/2020
  Time: 11:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="nl">
<head>
    <meta charset="UTF-8">
    <title>Labo 3 - Get result</title>
    <link rel="stylesheet" href="css/reset.css">
    <link rel="stylesheet" href="css/style.css">
</head>
<body>
<header>
    <h1>Labo 3 - Get result</h1>
    <div class="picture-header"></div>
</header>
<main>
    <section>
        <h2>Servlet</h2>
        <p id="antwoord">Het antwoord is: <%=request.getAttribute("aantal")%> keer.</p>
    </section>
</main>
<footer>
    <p>Copyright © 2020 | Alle rechten voorbehouden. | Website door Angelo Lemmens </p>
</footer>
</body>
</html>
