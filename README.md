# Journal App

The **Journal App** is a backend application designed to facilitate secure management of journal entries. Built using **Spring Boot** and **MongoDB**, it allows users to create, read, update, and delete their journal entries while ensuring data security through **JWT** and **OAuth** authentication. The application also integrates **Redis** for improved performance.

## Table of Contents
1. [Description](#description)
2. [Technologies Used](#technologies-used)
3. [Installation](#installation)
4. [API Endpoints](#api-endpoints)
5. [Usage](#usage)
6. [Contact](#contact)

## Description

This project enables users to manage their journal entries securely. Users can register, log in, and perform CRUD operations on their journal entries. The application ensures that only authenticated users can access their data, leveraging JWT for secure authentication and OAuth for third-party login options.

- **Backend**: Built with **Spring Boot**, providing RESTful API endpoints for processing and handling journal data.
- **Database**: Utilizes **MongoDB** for flexible and scalable data storage.
- **Caching**: Integrated **Redis** to enhance performance and reduce database load.

## Technologies Used

- **Backend**: Spring Boot
- **Database**: MongoDB
- **Authentication**: JWT (JSON Web Token) and OAuth
- **Caching**: Redis

## Installation

### 1. Clone the Repository
First, clone the repository to your local machine:

```bash
git clone https://github.com/Sonali2109/journalApp.git
```

### 2. Setup Backend (SpringBoot)
Navigate to the backend directory and run the SpringBoot application:
The backend will be running on http://localhost:8080/

```bash
mvn spring-boot:run
```
### API Endpoints
 - User Registration: POST /api/auth/register
 - User Login: POST /api/auth/login
 - Create Journal Entry: POST /api/journal
 - Get All Journal Entries: GET /api/journal
 - Update Journal Entry: PUT /api/journal/{id}
 - Delete Journal Entry: DELETE /api/journal/{id}

### Usage
  - Use a tool like Postman or cURL to interact with the API endpoints.
  - Register a new user and log in to obtain a JWT token.
  - Use the token to authenticate requests for creating, reading, updating, or deleting journal entries.
      
### Contact
For any inquiries, feel free to reach out:

- Author: Sonali Chaudhari
- Linkedin Profile: https://www.linkedin.com/in/sonali-chaudhari-08a84620b/
