-- Create database
CREATE DATABASE HotelManagement;

-- Use the database
USE HotelManagement;

-- Create the Users table
CREATE TABLE Users (
    user_id INT GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    email VARCHAR(100) UNIQUE NOT NULL,
    password VARCHAR(255) NOT NULL,
    user_type VARCHAR(10) NOT NULL CHECK (user_type IN ('Admin', 'User'))
);


-- Create the Rooms table
CREATE TABLE Rooms (
    room_id INT GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
    type VARCHAR(20) NOT NULL,
    total_rooms INT NOT NULL DEFAULT 20,
    available_rooms INT NOT NULL DEFAULT 20
);


-- Create the Bookings table
CREATE TABLE Bookings (
    booking_id INT GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
    user_id INT NOT NULL,
    room_id INT NOT NULL,
    booking_date DATE NOT NULL,
    status VARCHAR(10) NOT NULL CHECK (status IN ('Confirmed', 'Pending', 'Cancelled')),
    FOREIGN KEY (user_id) REFERENCES Users(user_id),
    FOREIGN KEY (room_id) REFERENCES Rooms(room_id)
);

-- Create the Reviews table
CREATE TABLE Reviews (
    review_id INT GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
    user_id INT NOT NULL,
    room_id INT NOT NULL,
    comment VARCHAR(500) NOT NULL,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (user_id) REFERENCES Users(user_id),
    FOREIGN KEY (room_id) REFERENCES Rooms(room_id)
);

-- Create the Support_Tickets table
CREATE TABLE Support_Tickets (
    ticket_id INT GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    email VARCHAR(100) NOT NULL,
    title VARCHAR(255) NOT NULL,
    status VARCHAR(20) DEFAULT 'Open'
);

CREATE TABLE Admin_Logs (
    log_id INT GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
    admin_id INT NOT NULL,
    action VARCHAR(255) NOT NULL,
    timestamp TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (admin_id) REFERENCES Users(user_id)
);


--Truncate and Inserting sample data into Users table
TRUNCATE TABLE Users;
INSERT INTO Users (name, email, password, user_type)
VALUES 
    ('John Doe', 'john.doe@example.com', 'password123', 'User'),
    ('Admin', 'admin@example.com', 'adminpassword', 'Admin'),
    ('Akshith', 'akshith@example.com', 'akshith', 'User');

TRUNCATE TABLE Akshith.Rooms;
INSERT INTO Rooms (type, total_rooms, available_rooms)
VALUES 
    ('Standard', 20, 15),
    ('Deluxe', 15, 10),
    ('Luxury', 10, 8);


-- Truncate and Inserting more sample data into Support_Tickets table
TRUNCATE TABLE Support_Tickets;
INSERT INTO Support_Tickets (name, email, title, status)
VALUES 
    ('Test User', 'test.user@example.com', 'Test Issue', 'Open'),
    ('Jane Smith', 'jane.smith@example.com', 'Room Service Issue', 'Open'),
    ('Mike Johnson', 'mike.johnson@example.com', 'Late Check-in Request', 'Open'),
    ('Emily Davis', 'emily.davis@example.com', 'Wi-Fi Connectivity Problem', 'Open');




