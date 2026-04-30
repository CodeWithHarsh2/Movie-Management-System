🎬 Movie & Actor Management System

This project is a simple web application built using Spring Boot to manage movies and their actors. The idea was to create something practical where a user can add movies, assign actors to them, view the data, and update it when needed.

Instead of going with common examples like students or books, I chose movies and actors to make the project a bit more interesting and relatable.

🚀 What this project can do

Add a new movie
Add actors and link them to a movie
View all movies in a list
Update movie details
See actors along with their respective movies (using a join query)

🧱 Tech Stack
Java
Spring Boot
Spring Data JPA
MySQL
JSP + JSTL
Maven

🗄️ How the data is structured

There are two main parts:

Movie

id
title
genre
releaseYear

Actor

id
name
age
movie (linked to Movie)
Relationship:

One movie can have multiple actors, but each actor belongs to only one movie.

⚙️ How to run the project
Clone the repository:
git clone https://github.com/YOUR_USERNAME/movie-management-system.git
Open it in IntelliJ or any IDE
Create a MySQL database:
CREATE DATABASE movie_db;
Update your application.properties file with your MySQL username and password
Run the application
Open in browser:
http://localhost:8080/addMovie

📌 Project structure (basic idea)
Controller → handles requests
Service → contains logic
Repository → interacts with database
Entity → defines tables
JSP → user interface

🧪 Testing

A simple JUnit test is included to check whether movie data is getting saved correctly.

💭 What I learned

While working on this, I understood how different layers in a Spring Boot application connect with each other. I also got hands-on experience with database relationships, handling forms in JSP, and debugging issues when things didn’t work as expected.

