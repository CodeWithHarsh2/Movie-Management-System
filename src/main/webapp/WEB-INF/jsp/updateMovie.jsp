<link rel="stylesheet" href="/css/style.css">

<div class="navbar">
    <a href="/addMovie">Add Movie</a>
    <a href="/addActor">Add Actor</a>
    <a href="/list">Movies</a>
</div>

<form action="/updateMovie" method="post">

    <!-- VERY IMPORTANT -->
    <input type="hidden" name="id" value="${movie.id}">

    Title:
    <input type="text" name="title" value="${movie.title}"><br>

    Genre:
    <input type="text" name="genre" value="${movie.genre}"><br>

    Year:
    <input type="number" name="releaseYear" value="${movie.releaseYear}"><br>

    <button type="submit">Update</button>

</form>