
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<link rel="stylesheet" href="/css/style.css">

<div class="navbar">
    <a href="/addMovie">Add Movie</a>
    <a href="/addActor">Add Actor</a>
    <a href="/list">Movies</a>
</div>

<div class="container neon-card">
    <h2>✏️ Update Actor</h2>

    <form action="/updateActor" method="post">
        <input type="hidden" name="id" value="${actor.id}"/>

        <label>Name</label>
        <input type="text" name="name" value="${actor.name}" required>

        <label>Age</label>
        <input type="number" name="age" value="${actor.age}" required>

        <label>Movie</label>
        <select name="movie.id">
            <c:forEach items="${movies}" var="m">
                <option value="${m.id}" ${m.id == actor.movie.id ? 'selected' : ''}>
                        ${m.title}
                </option>
            </c:forEach>
        </select>

        <button type="submit">Update Actor</button>
    </form>
</div>