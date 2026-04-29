<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<link rel="stylesheet" href="/css/style.css">
<div class="navbar">
    <a href="/addMovie">Add Movie</a>
    <a href="/addActor">Add Actor</a>
    <a href="/list">Movies</a>
</div>

<div class="container">
    <h2>Add Actor</h2>

    <form action="saveActor" method="post">
        <input type="text" name="name" placeholder="Actor Name" required>
        <input type="number" name="age" placeholder="Age" required>

        <select name="movie.id">
            <c:forEach items="${movies}" var="m">
                <option value="${m.id}">${m.title}</option>
            </c:forEach>
        </select>

        <button type="submit">Save Actor</button>
    </form>
</div>