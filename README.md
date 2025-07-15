## * Internship Lecture & Feedback Managment System *

The **Internship Lecture & Feedback Managment System** is a console-based Java application built using Maven
**JPA**, **Hibernate 7.x**, and **PostgreSQL**. It allows colleges or institutions to keep track of internship lectures attended by students,
storing information like student details, lecture topics, dates, and mentor data.

---

##  Features

-  Add student details
-  Add internship lectures
-  Assign mentors to lectures
-  Track attendance of students per session
-  View all lectures and participants
-  Simple menu-driven interface via the Java console

---

##  Technologies Used

-  **Java (JDK 17+)**
-  **JPA (Jakarta Persistence API 3.2)**
-  **Hibernate ORM 7.0.1.Final**
-  **PostgreSQL 15+**
-  **Maven (for dependency management)**
-  **Eclipse IDE / IntelliJ / VS Code**

---

##  Project Structure

   InternshipLectureSystem/
   
    ├── src/

    │ ├── app/

    │ │ └── MainApp.java

    │ ├── dao/

    │ │ └── LectureService.java

    │ └── entity/

    │ ├── Student.java

    │ ├── Lecture.java

    │ └── Mentor.java

    ├── pom.xml

     └── persistence.xml

---


---

##  Prerequisites

-  Java 17 or higher  
-  PostgreSQL 15+  
-  pgAdmin (for database management)  
-  Maven  
-  Eclipse / IntelliJ / VS Code IDE

---

##  Database Setup

Create the necessary tables in PostgreSQL:

```sql
CREATE TABLE student (
    id SERIAL PRIMARY KEY,
    name VARCHAR(100),
    email VARCHAR(100),
    phone VARCHAR(15)
);

CREATE TABLE mentor (
    id SERIAL PRIMARY KEY,
    name VARCHAR(100),
    department VARCHAR(100)
);

CREATE TABLE lecture (
    id SERIAL PRIMARY KEY,
    topic VARCHAR(200),
    date DATE,
    student_id INT REFERENCES student(id),
    mentor_id INT REFERENCES mentor(id)
);

```
---

Contact

 Name: Arundhati Anand Patil

 Email: patilarundhati44@gmail.com

 GitHub: @patilarundhati44



