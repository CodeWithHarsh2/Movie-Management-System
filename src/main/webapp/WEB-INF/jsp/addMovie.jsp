<link rel="stylesheet" href="/css/style.css">

<div class="navbar">
    <a href="/addMovie">Add Movie</a>
    <a href="/addActor">Add Actor</a>
    <a href="/list">Movies</a>
</div>

<div class="container">
    <h2>Add Movie</h2>

    <form action="saveMovie" method="post">
        <input type="text" name="title" placeholder="Movie Title" required>
        <input type="text" name="genre" placeholder="Genre" required>
        <input type="number" name="releaseYear" placeholder="Release Year" required>

        <button type="submit">Save Movie</button>
    </form>
</div>