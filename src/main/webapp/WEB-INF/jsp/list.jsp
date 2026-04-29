<link rel="stylesheet" href="/css/style.css">

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!-- NAVBAR -->
<div class="navbar">
    <a href="/addMovie">Add Movie</a>
    <a href="/addActor">Add Actor</a>
    <a href="/list">Movies</a>
</div>

<!-- ================= MOVIES TABLE ================= -->
<div class="table-container">
    <h2>Movies List</h2>

    <table>
        <tr>
            <th>Title</th>
            <th>Genre</th>
            <th>Year</th>
            <th>Action</th>
        </tr>

        <c:forEach items="${movies}" var="m">
            <tr>
                <td>${m.title}</td>
                <td>${m.genre}</td>
                <td>${m.releaseYear}</td>
                <td>
                    <a href="/editMovie/${m.id}">Edit</a>
                </td>
            </tr>
        </c:forEach>
    </table>
</div>


<!-- ================= JOIN TABLE ================= -->
<div class="table-container">
    <h2>Actors and Their Movies</h2>

    <table class="join-table">
        <tr>
            <th>Actor Name</th>
            <th>Movie Title</th>
        </tr>

        <c:forEach items="${joinData}" var="row">
            <tr>
                <td>${row[0]}</td>
                <td>${row[1]}</td>
            </tr>
        </c:forEach>
    </table>
</div>