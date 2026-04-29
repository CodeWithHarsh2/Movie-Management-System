
#  Movie & Actor Management System

This project is a simple web application built using Spring Boot to manage movies and their actors. The goal was to create a practical system where users can add movies, assign actors to them, view stored data, and update it when needed.

Instead of using very common examples like students or books, this project focuses on movies and actors to make it more interesting and relatable.

---

##  Features

- Add new movies  
- Add actors linked to a movie  
- View list of all movies  
- Update existing movie details  
- Display actors along with their movies (using an inner join query)  

---

##  Tech Stack

- Java  
- Spring Boot  
- Spring Data JPA (Hibernate)  
- MySQL  
- JSP (Java Server Pages)  
- JSTL  
- Maven  

---

##  Database Design

The application uses two main entities:

### Movie
- id  
- title  
- genre  
- releaseYear  

### Actor
- id  
- name  
- age  
- movie (foreign key)

### Relationship
- One Movie → Many Actors  
- One Actor → One Movie  

---

##  How to Run the Project

1. Clone the repository:
```bash
git clone https://github.com/YOUR_USERNAME/movie-management-system.git
````

2. Open the project in IntelliJ / Eclipse

3. Create a MySQL database:

```sql
CREATE DATABASE movie_db;
```

4. Update `application.properties`:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/movie_db
spring.datasource.username=root
spring.datasource.password=yourpassword
```

5. Run the application

6. Open in browser:

```
http://localhost:8080/addMovie
```

---

##  Project Structure

```
src/
 ├── main/
 │    ├── java/com/harsh/movieapp/
 │    │    ├── controller/
 │    │    ├── entity/
 │    │    ├── repository/
 │    │    └── service/
 │    ├── resources/
 │    └── webapp/WEB-INF/jsp/
 │
 └── test/
      └── java/com/harsh/movieapp/
```

---

##  Testing

Basic unit testing is implemented using JUnit to verify that movie data is saved correctly.

---

##  Learning Outcome

Through this project, I learned:

* How to build a full-stack application using Spring Boot
* How to design and manage entity relationships
* How to connect backend logic with JSP-based UI
* How CRUD operations work in real applications
* How to debug and fix real-world issues during development

