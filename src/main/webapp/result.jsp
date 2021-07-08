<%@ page import ="java.util.*" %>
<!DOCTYPE html>
<html>
    <head>
        <style>
            ul{
                display: inline-block;
            }
        </style>
    </head>
<body>
<center>
<h1>
    Available Games
</h1>
<%
List result= (List) request.getAttribute("brands");
Iterator it = result.iterator();
out.println("<br>We have <br><br>");
out.println("<ul>");
while(it.hasNext()){
    out.println("<li>"+it.next()+"</li>");
}
out.println("</ul>");
%>
</center>
</body>
</html>