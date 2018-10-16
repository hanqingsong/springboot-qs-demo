<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<h1>Employees page</h1>

<ul>
    allCustomerss.jsp

</ul>
<ul>
    <c:forEach items="${customers}" var="item">
        <li>${item.firstName}</li>
    </c:forEach>
</ul>